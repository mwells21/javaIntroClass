//    Michael Wells
//    EN.605.201.83.SU19
//    Mini-Project 1
//    07/07/19
//


import java.util.Scanner;

public class HareVsTortoise
{
  public static void main( String [] args )
  {
    Scanner input = new Scanner( System.in );

    int finishLine = 0;
    int harePosition = 0;
    int tortPosition = 0;
    int turn = 1;
    char hare = 'H';
    char tort = 'T';

    System.out.println();
    System.out.println("AND THEY'RE OFF!!");
    System.out.println();


    while(finishLine == 0){

      // calc new postions for both the tort and hare
      harePosition = newPosition(harePosition, hare);
      tortPosition = newPosition(tortPosition, tort);


      System.out.println("###################################################");

      // Print new postion for hare
      for(int space = 0; space <= harePosition;space++){
              System.out.print(" ");
      }
      System.out.print("H");
      System.out.println();

      // Print new postion for tort
      for(int space = 0; space <= tortPosition;space++){
              System.out.print(" ");
      }
      System.out.print("T");
      System.out.println();


      System.out.println("###################################################");
      System.out.println("Turn:"+turn);
      System.out.println("--------------");
      System.out.println("Hare Postion:"+ harePosition);
      System.out.println("Tort Postion:"+ tortPosition);
      System.out.println("--------------");
      //check postions and see if a player has won
      finishLine = finishRace(harePosition, tortPosition);
      turn = turn + 1;
      System.out.println();

    }

  }


public static int finishRace(int harePosition, int tortPosition){
  int raceDescion = 0;
  if(harePosition == tortPosition ){
    System.out.println("OUCH!!");
  }

  if(harePosition >=50 & tortPosition >=50){
      raceDescion = 1;
      System.out.println("ITS A TIE!!");
  }else {
    if(harePosition >=50){
      raceDescion = 1;
      System.out.println("HARE WINS!!");
    }
    if(tortPosition >=50){
      raceDescion = 1;
      System.out.println("TORTOISE WINS!!");
    }
  }

  return(raceDescion);


}

/*
newPosition()

Input:int oldPosition, char racer
old postion and a char representing which racer to calc for

Output: return(outputPostion);
Only needs to send back the new location


-This makes sure eachpostion can only go back to 0



*/


public static int newPosition(int oldPosition, char racer){
  int outputPostion = 0;


  if(racer == 'H'){
    int[] hareMoveArray;
    hareMoveArray = hareMove();
    if(hareMoveArray[1] == 1){ // if direction is positive just add the postions
      outputPostion = oldPosition + hareMoveArray[0];
    }else{
      if(hareMoveArray[0] > oldPosition){ // if it would create a negative number the postion will be set to 0
        outputPostion = 0;
      }else{
        outputPostion = oldPosition - hareMoveArray[0]; // other wise the difference equals the postion
      }
    }
  }

  if(racer == 'T'){
    int[] tortMoveArray;
    tortMoveArray = tortMove();
    if(tortMoveArray[1] == 1){// if direction is positive just add the postions
      outputPostion = oldPosition + tortMoveArray[0];
    }else{
      if(tortMoveArray[0] > oldPosition){// if it would create a negative number the postion will be set to 0
        outputPostion = 0;
      }else{
        outputPostion = oldPosition - tortMoveArray[0];// other wise the difference equals the postion
      }
    }


  }

  return(outputPostion);
}



// Both the hareMove and the tortMove methods
// calculate a random number between 1 and 10
// then return the corrsponding postion and direction


public static int[] hareMove()
{
  int randomNumber = 0;
  int move = 0;
  int direction = 0;
  randomNumber = (int) (10 * Math.random() ) + 1;

  // move is the number of postions moved
  // direction 1 = forward
  // direction 2 = backward
  if(randomNumber<=2){
    move = 9;
    direction = 1;
  } else if(randomNumber<=5){
    move = 1;
    direction = 1;
  } else if(randomNumber==6){
    move = 12;
    direction = 2;
  } else if(randomNumber<=8){
    move = 2;
    direction = 2;
  } else{
    move = 0;
    direction = 1;
  }
  int[] moveArray = {move,direction};

  return(moveArray);
}






public static int[] tortMove()
{
  int randomNumber = 0;
  int move = 0;
  int direction = 0;
  randomNumber = (int) (10 * Math.random() ) + 1;


  // move is the number of postions moved
  // direction 1 = forward
  // direction 2 = backward
  if(randomNumber<=5){
    move = 5;
    direction = 1;
  } else if(randomNumber<=8){
    move = 1;
    direction = 1;
  } else{
    move = 6;
    direction = 2;
  }

  int[] moveArray = {move,direction};

  return(moveArray);
}





}
