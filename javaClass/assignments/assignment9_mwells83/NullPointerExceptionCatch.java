//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 9
//    07/28/19
//


public class NullPointerExceptionCatch
{
  public static void main( String [] args )
  {
    // Define value as a NULL string
    String value = null;

    // Try to change
    try
    {
      value.toString();
    }

    // catch exception and print error message 
    catch(NullPointerException exception)
    {
      System.out.println(exception + ": value can not be null");
    }


  }
}
