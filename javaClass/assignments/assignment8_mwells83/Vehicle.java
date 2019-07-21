public class Vehicle extends Objects
{
  // Name and age attribute
  public String name;
  public int age;

  // Default constructor
  public Vehicle()
  {
    name = "No Name";
    age  = 0;
  }
  // from Sounds interface
  public void playSounds()
  {
    System.out.println("Vehicle Sound");
  }
  // From Resizeable interface
  public void resizeObject()
  {
    System.out.println("Resizing a Vehicle");
  }
  // from Rotatable interface
  public void rotateObject()
  {
    System.out.println("Rotating a Vehicle");
  }
  // from Drawable interface
  public void drawObject()
  {
    System.out.println("Drawing a Vehicle");
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

  // sets age to input int
  public void setAge(int age)
  {
    this.age = age;
  }
  // returns age
  public int getAge()
  {
    return age;
  }


}
