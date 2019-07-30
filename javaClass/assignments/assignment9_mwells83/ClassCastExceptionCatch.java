//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 9
//    07/28/19
//


public class ClassCastExceptionCatch
{
  public static void main( String [] args )
  {
    // create integer
    Object value = new Integer(0);

    // try to cast value to a string
    // this should throw an ClassCastException
    try
    {
      System.out.println((String)value);
    }

    // Catch the exception and print info of the exception
    catch(ClassCastException exception)
    {
      System.out.println(exception + "ERROR: this is invalid casting ");
    }

  }
}
