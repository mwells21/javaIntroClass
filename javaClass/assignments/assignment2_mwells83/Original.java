import java.util.Scanner;

public class Original
{
  public static void main( String [] args )
  {
    // Define and initialize variables for values to be input
    int v1 = 0;      // First value to be input
    int v2 = 0;      // Second value to be input
    int v3 = 0;      // Third value to be input
    int v4 = 0;      // Fourth value to be input
    int v5 = 0;      // Fifth value to be input
    int v6 = 0;      // Sixth value to be input

    int a1 = 0;      // First addition result
    int a2 = 0;      // Second addition result
    int a3 = 0;      // Third addition result
    int a4 = 0;      // Fourth addition result
    int a5 = 0;      // Fifth addition result
    int a6 = 0;      // Sixth addition result



    // Use a Scanner to input integer values
    Scanner input = new Scanner( System.in );
    System.out.println( "\n\n" );
    System.out.print( "Enter 6 integers separated by a blank space:" );
    v1 = input.nextInt();     // Input first value
    v2 = input.nextInt();     // Input second value
    v3 = input.nextInt();     // Input third value
    v4 = input.nextInt();     // Input fourth value
    v5 = input.nextInt();     // Input fifth value
    v6 = input.nextInt();     // Input sixth value


    a1 = v1 + v2;       // add first and second inputs
    a2 = v3 + v4;       // add third and forth inputs
    a3 = v5 + v6;       // add fifth and sixths inputs

    a4 = v1 + v3 + v5;  // add column 1 numbers
    a5 = v2 + v4 + v6;  // add column 2 numbers

    a6 = a4 + a5; // add together both totals
                  // you could also add together a1, a2, and a3 but this should be faster with only 2 variables

    // Output using System.out.println()
    System.out.println( "\n\n" );
    System.out.println( "\t" + "Value" + "\t" + "Value" + "\t" + "Total");
    System.out.println( "\t" + v1 + "\t" + v2 + "\t" + a1);
    System.out.println( "\t" + v3 + "\t" + v4 + "\t" + a2);
    System.out.println( "\t" + v5 + "\t" + v6 + "\t" + a3);
    System.out.println( "\t" + "----" + "\t" + "----" + "\t" + "----" );
    System.out.println( "Total" + "\t"+ a4 + "\t" + a5 + "\t" + a6);
    System.out.println( "\n\n" );
  }
}
