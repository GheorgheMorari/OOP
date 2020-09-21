class Queue
{
  int size;
  int limit;
  Element head;
  Element tail;

    Queue ()
  {
    size = 0;
    limit = -1;
    head = null;
    tail = null;
  }
  
  Queue(int limit){
      this.limit = limit;
      size = 0;
      head = null;
      tail = null;
  }

  void push (Box box)
  {

    if (size == limit)
      {
	    return;
      }

    if (size == 0)
      {
	Element element = new Element (box, null, null);
	head = element;
	tail = element;
	size++;
      }
    else
      {
	Element element = new Element (box, tail, null);
	tail.next = element;
	tail = element;
	size++;
      }
  }

  Box pop ()
  {
    if (size > 0)
      {
	size--;
	Box ret = tail.data;
	tail = tail.prev;
	return ret;
      }
    return null;
  }

  int getSize ()
  {
    return size;
  }
  boolean empty(){
      return (size == 0);
  }
  boolean full(){
      return (size == limit);
  }
}

class Element
{
  public Box data;
  public Element prev;
  public Element next;
    Element (Box data, Element prev, Element next)
  {
    this.data = data;
    this.prev = prev;
    this.next = next;
  }
}
