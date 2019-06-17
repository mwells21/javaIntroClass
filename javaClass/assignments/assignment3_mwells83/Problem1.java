/*
    Michael Wells
    EN.605.201.83.SU19
    Assignment 3
    Problem 1
    06/16/19



*/

import java.util.Scanner;

public class Problem1
{
  public static void main( String [] args )
  {

    Scanner input = new Scanner( System.in );



    /*
      -Declare Variables
      -Get max number of asterisks
      -Get pattern direction
      -Output asterisks pattern
    */



    int maxAster = 0;  // declare max asterisks
    int direction = 0; // declare direction
    int i;             // declare line iterator
    int j = 1;         // declare amount per line iterator


    // Get max number of asterisks
    System.out.print( "Please enter the maximun number of Asterisks:" );  // promt for weight
    maxAster = input.nextInt();                  // Input max asterisks

    // Get pattern direction
    System.out.print( "Please Enter 1 for ascending pattern or 2 for descending pattern:" );  // promt for weight
    direction = input.nextInt();                  // Input direction



    // Output ascending asterisks pattern
    if(direction == 1 ){
      for(i = 1; i <= maxAster;i++){
        while(j <= i ){
          System.out.print("*");
          j = j + 1;
        }
        System.out.println();
        j = 1;
      }
    }


    // Output descending asterisks pattern
    if(direction == 2){
      for(i = maxAster; i >= 1 ;i--){
        while(j <= i ){
          System.out.print("*");
          j = j + 1;
        }
        System.out.println();
        j = 1;
      }
    }


  }
}
