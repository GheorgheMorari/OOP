class Box
{

  public float height;
  public float width;
  public float depth;
    Box ()
  {
    this.height = 1;
    this.width = 1;
    this.depth = 1;
  }
  Box (float AllValues)
  {
    this.height = AllValues;
    this.width = AllValues;
    this.depth = AllValues;
  }
  Box (float height, float width, float depth)
  {
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  float getSurface ()
  {
    return height * width * 2 + width * depth * 2 + height * depth * 2;
  }
  float getVolume ()
  {
    return height * width * depth;
  }
}
