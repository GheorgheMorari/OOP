//Morari Gheorghe LAB2 Basic+Advanced

public class Main
{
  public static void main (String[]args)
  {
    Box unu = new Box ();
    Box doi = new Box (2);
    Box trei = new Box (1, 2, 3);
    Queue queue = new Queue ();
      queue.push (unu);
      queue.push (doi);
      queue.push (trei);

    Queue limited_queue = new Queue (2);
      limited_queue.push (unu);
      limited_queue.push (doi);
      limited_queue.push (trei);

      System.out.printf ("UnlimitedQueue(Q1) full? %b\n", queue.full ());
      System.out.printf ("LmitedQueue(Q2) full? %b\n", limited_queue.full ());


    int size = queue.getSize ();
    for (int i = 0; i < size; i++)
      {
	Box popped = queue.pop ();
	  System.out.
	  printf
	  ("Q1 Box %f, %f, %f Volume: %f, Area: %f. Queue: empty?: %b\n",
	   popped.height, popped.width, popped.depth, popped.getVolume (),
	   popped.getSurface (), queue.empty ());

      }

    int lim_size = limited_queue.getSize ();
    for (int i = 0; i < lim_size; i++)
      {
	Box popped = limited_queue.pop ();
	System.out.
	  printf
	  ("Q2 Box %f, %f, %f Volume: %f, Area: %f. Queue empty?: %b\n",
	   popped.height, popped.width, popped.depth, popped.getVolume (),
	   popped.getSurface (), limited_queue.empty ());

      }
  }
}
