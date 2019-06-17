/*
    Michael Wells
    EN.605.201.83.SU19
    Assignment 3
    Problem 2
    06/16/19



*/

import java.util.Scanner;

public class Problem2
{
  public static void main( String [] args )
  {
    Scanner input = new Scanner( System.in );

    int randomNumber = 0;
    int maxNumber = 0;
    int maxGuess = 0;
    int guess = 0;
    int i = 0;
    int time = 1;
    int restart = 1;

    while(time == 1){
      System.out.println("GUESS THE SECRET NUMBER");
      System.out.println("\n");
      System.out.print("Enter the maxium possible number:");
      maxNumber = input.nextInt();
      System.out.print("Enter the maxium number of guesses:");
      maxGuess = input.nextInt();

      randomNumber = (int) (maxNumber * Math.random() ) + 1;
      System.out.println(randomNumber);

      for(i = 1;i <= maxGuess;i++){
        System.out.print("Enter Guess number "+ i +":");
        guess = input.nextInt();

        if(guess == randomNumber){
          System.out.println("YOU ARE CORRECT");
          i = 11;
        }
        if(guess < randomNumber){
          System.out.println("Too Low");
        }
        if(guess > randomNumber){
          System.out.println("Too High");
        }
      }

      System.out.println("\n");
      System.out.println("Would you like to play again? Yes(1) No(0)");
      restart = input.nextInt();
      if(restart == 0){
        System.out.println("Goodbye");
        time = 0;

      }

    }







  }
}
