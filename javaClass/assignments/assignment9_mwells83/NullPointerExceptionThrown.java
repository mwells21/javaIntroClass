//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 9
//    07/28/19
//


public class NullPointerExceptionThrown
{
  public static void main( String [] args )
  {
    // Define value as a NULL string
    String value = null;
    // try to convert null value to a string
    // We know in theory if value is not null jvm should have no issue converting a string to a string
    value.toString();


  }
}
