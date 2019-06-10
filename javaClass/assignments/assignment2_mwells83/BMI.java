/*
    Michael Wells
    EN.605.201.83.SU19
    Assignment 1
    06/02/19



*/
import java.util.Scanner;

public class BMI
{
  public static void main( String [] args )
  {

    // Use a Scanner to input integer values
    Scanner input = new Scanner( System.in );

    int weightInput = 0;      // Init weight input
    int heightInput = 0;      // Init height input

    double weightKg = 0;      // Init weight conversion
    double heightM  = 0;      // Init height conversion

    double actual  = 0;
    float bmi      = 0;      // Init calculated bmi


    System.out.println("\n\n");
    System.out.print( "Enter body weight(lbs):" );  // promt for weight
    weightInput = input.nextInt();                  // Input weight value

    System.out.print( "Enter body height(in):" );   // promt for height
    heightInput = input.nextInt();                  // Input height value

    weightKg = weightInput * .45349237 ;            // convert weight
    heightM  = heightInput * .0254 ;                // convert height

    actual = weightKg / (heightM * heightM);        // calculate BMI

    bmi = (float) actual;                           //simplify BMI

    // Output BMI and Chart
    System.out.println("\n");
    System.out.println("-------------------------------");
    System.out.println("Your Body Mass Index: " + bmi);
    System.out.println("-------------------------------");
    System.out.println("\n");
    System.out.println("-------------------------------");
    System.out.println("Underweight: less than 18.5");
    System.out.println("Normal: 18.5 – 24.9");
    System.out.println("Overweight: 25 – 29.9");
    System.out.println("Obese: 30 or greater");
    System.out.println("-------------------------------");
    System.out.println("\n\n");


  }
}
