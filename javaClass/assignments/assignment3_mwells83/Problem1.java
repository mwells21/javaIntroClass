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

    int maxAster = 0;
    int direction = 0;
    int i;
    int j = 1;

    System.out.print( "Please enter the maximun number of Asterisks:" );  // promt for weight
    maxAster = input.nextInt();                  // Input weight value

    System.out.print( "Please Enter 1 for ascending pattern or 2 for descending pattern:" );  // promt for weight
    direction = input.nextInt();                  // Input weight value


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
