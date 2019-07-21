//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 8
//    07/21/19
//


public class Manipulator
{
  public static void main( String [] args )
  {
    // create array of 2 Animals and 2 Vehicles
    Objects[] objects = {
      new Animal(),
      new Animal(),
      new Vehicle(),
      new Vehicle()
    };

    // loop through using i(iterator) and call methods from interface
    for( int i = 0; i < objects.length; i++)
    {
      objects[i].playSounds();
      objects[i].resizeObject();
      objects[i].rotateObject();
      objects[i].drawObject();

    }

  }
}
