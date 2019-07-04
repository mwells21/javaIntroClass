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
    char hare = 'H';
    char tort = 'T';

    System.out.println();
    System.out.println("AND THEY'RE OFF!!");
    System.out.println();


    while(finishLine == 0){
      harePosition = newPosition(harePosition, hare);
      tortPosition = newPosition(tortPosition, tort);
      System.out.println("###################################################");
      for(int space = 0; space <= harePosition;space++){
              System.out.print(" ");
      }
      System.out.print("H");
      System.out.println();
      for(int space = 0; space <= tortPosition;space++){
              System.out.print(" ");
      }
      System.out.print("T");
      System.out.println();
      System.out.println("###################################################");
      finishLine = finishRace(harePosition, tortPosition);
    }

  }


public static int finishRace(int harePosition, int tortPosition){
  int raceDescion = 0;
  if(harePosition == tortPosition ){
    System.out.println("OUCH!!");
  }

  if(harePosition >=50 & tortPosition >=50){
      raceDescion = 1;
      System.out.println("ITS A TIE");
  }else {
    if(harePosition >=50){
      raceDescion = 1;
      System.out.println("HARE WINS!!");
    }
    if(tortPosition >=50){
      raceDescion = 1;
      System.out.println("TORTOISE WINS");
    }
  }

  return(raceDescion);


}


public static int newPosition(int oldPosition, char racer){
  int outputPostion = 0;
  if(racer == 'H'){
    int[] hareMoveArray;
    hareMoveArray = hareMove();
    if(hareMoveArray[1] == 1){
      outputPostion = oldPosition + hareMoveArray[0];
    }else{
      if(hareMoveArray[0] > oldPosition){
        outputPostion = 0;
      }else{
        outputPostion = oldPosition - hareMoveArray[0];
      }
    }
  }

  if(racer == 'T'){
    int[] tortMoveArray;
    tortMoveArray = tortMove();
    if(tortMoveArray[1] == 1){
      outputPostion = oldPosition + tortMoveArray[0];
    }else{
      if(tortMoveArray[0] > oldPosition){
        outputPostion = 0;
      }else{
        outputPostion = oldPosition - tortMoveArray[0];
      }
    }


  }

  return(outputPostion);
}




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
