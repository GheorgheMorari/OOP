
//Basic Morari Gheorghe
public class Basic
{
  public static void main (String[]args)
  {

    Monitor first = new Monitor ();
      first.setMonitor (0, 0, 0, 27, 1080);

    Monitor second = new Monitor ();
      second.setMonitor (0, 0, 0, 24, 1080);
      boolean is_same = second.compare (first);
      System.out.println ("is_same?:");
      System.out.println (is_same);
  }

}
class Monitor
{

  public int r;
  public int g;
  public int b;
  public int dimension;
  public int resolution;

  public void setMonitor (int r, int g, int b, int dimension, int resolution)
  {
    this.r = r;
    this.g = g;
    this.b = b;
    this.dimension = dimension;
    this.resolution = resolution;
  }

  public boolean compare (Monitor otherMonitor)
  {
    return (this.r == otherMonitor.r && this.g == otherMonitor.g
	    && this.b == otherMonitor.g
	    && this.dimension == otherMonitor.dimension
	    && this.resolution == otherMonitor.resolution);
  }
}
