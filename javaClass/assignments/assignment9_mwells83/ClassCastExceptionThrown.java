//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 9
//    07/28/19
//


public class ClassCastExceptionThrown
{
  public static void main( String [] args )
  {
    // create integer
    Object value = new Integer(0);

    // try to cast value to a string 
    // this should throw an ClassCastException
    System.out.println((String)value);

  }
}
