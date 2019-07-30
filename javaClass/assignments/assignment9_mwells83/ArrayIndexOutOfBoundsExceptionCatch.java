//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 9
//    07/28/19
//


public class ArrayIndexOutOfBoundsExceptionCatch
{
  public static void main( String [] args )
  {
    // Define value as an array of integers from 1-4
    int[] value = {1,2,3,4};

    // Try to loop from an index of 0 to 4
    try
    {
      for(int i=0; i<=value.length;i++){
        System.out.println(value[i]);
      }
    }

    //catch error and output message
    catch(ArrayIndexOutOfBoundsException exception)
    {
      System.out.println(exception + "Error: Array Index does not exist");
    }



  }
}
