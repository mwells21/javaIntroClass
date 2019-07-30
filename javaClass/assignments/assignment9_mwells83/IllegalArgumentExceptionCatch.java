//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 9
//    07/28/19
//


public class IllegalArgumentExceptionCatch
{
  public static void main( String [] args )
  {
    // try to input a number that should throw an exception
    try
    {
      percent(110);
    }
    // catch exception
    catch(IllegalArgumentException exception)
    {
      System.out.println(exception + "... Percents cant be more than 100 ");
    }

  }

// percent method - create just to demonstrate IllegalArgumentException
// input: an integer called number
// output: will just print the number if it is less than 100
// if it is less than 100 it will throw an exception
//
  public static void percent(int number){
    if(number > 100){
      // Throw exception
      throw new IllegalArgumentException("int number must be less than 100 ");
    } else {
      // Print number
      System.out.println(number);
    }
  }

}
