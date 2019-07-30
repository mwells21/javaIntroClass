//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 9
//    07/28/19
//


public class IllegalArgumentExceptionThrown
{
  public static void main( String [] args )
  {
    // call the percent method with an int that should throw an exception
    percent(110);

  }

  // percent method - create just to demonstrate IllegalArgumentException
  // input: an integer called number
  // output: will just print the number if it is less than 100
  // if it is less than 100 it will throw an exception
  //

  public static void percent(int number){
    if(number > 100){
      throw new IllegalArgumentException("int number must be less than 100 ");
    } else {
      System.out.println(number);
    }
  }

}
