public class Animal extends Objects
{
  // Name attribute
  public String name;

  // Default constructor
  public Animal()
  {
    name = "No Name";
  }

  // from Sounds interface
  public void playSounds()
  {
    System.out.println("Animal Sound");
  }
  // From Resizeable interface
  public void resizeObject()
  {
    System.out.println("Resizing an Animal");
  }
  // from Rotatable interface
  public void rotateObject()
  {
    System.out.println("Rotating an Animal");
  }
  // from Drawable interface
  public void drawObject()
  {
    System.out.println("Drawing an Animal");
  }
  // sets name to input string
  public void setName(String name)
  {
    this.name = name;
  }
  // returns name 
  public String getName()
  {
    return name;
  }

}
