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



    /*
      -Declare Variables 
      -Get max number
      -Get max number of guesses
      -Create Random Number
      -Receive Guesses
      -Output response
      -Ask the user to play again
    */


    int randomNumber = 0; // decalre random number
    int maxNumber = 0;    // decalre maxium possible random number
    int maxGuess = 0;     // decalre maxium possible guesses
    int guess = 0;        // decalre user guess
    int i = 0;            // decalre iterator for guesses
    int time = 1;         // decalre iterator for playing the game
    int restart = 1;      // declare variable for restart option



    while(time == 1){
      System.out.println("GUESS THE SECRET NUMBER");
      System.out.println("\n");

      //Get max number
      System.out.print("Enter the maxium possible number:");
      maxNumber = input.nextInt();

      //Get max number of guesses
      System.out.print("Enter the maxium number of guesses:");
      maxGuess = input.nextInt();
      //Create Random Number
      randomNumber = (int) (maxNumber * Math.random() ) + 1;

      // Receive Guess
      // Iterate until you have run out of guesses
      for(i = 1;i <= maxGuess;i++){
        System.out.print("Enter Guess number "+ i +":");
        guess = input.nextInt();

        // Answer was correct
        if(guess == randomNumber){
          System.out.println("YOU ARE CORRECT");
          i = 11;
        }
        //  Answer Was too low
        if(guess < randomNumber){
          System.out.println("Too Low");
        }
        //  Answer Was too high
        if(guess > randomNumber){
          System.out.println("Too High");
        }
      }



      // Asking the user if they want to play again

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
