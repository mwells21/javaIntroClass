//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 10
//    08/04/19
//

import java.io.*;
import java.util.*;


public class IncomePropertyReport
{
  public static void main( String [] args )
  {
    //define input stream
    DataInputStream in = null;

    final String fileName = "/home/mwe11s/github/javaIntroClass/javaClass/assignments/assignment10_mwells83/test.dat";
    int fileLength = 13486;

    // arrays for the summary outputs
    String[] stateOut = new String[56];
    int[] popOut = new int[56];
    int[] childPopOut = new int[56];
    int[] povOut = new int[56];

    // arrays to store data
    String[] stateArray = new String[fileLength];
    int[] populationArray = new int[fileLength];
    int[] childPopulationArray = new int[fileLength];
    int[] povertyArray = new int[fileLength];


    try
    {
      in = new DataInputStream( new BufferedInputStream( new FileInputStream(fileName)));

      //String state = "";

      // iterator
      int i = 0;
      while( in.available() > 0)
      {
        //for( int j = 0; j < 1; j++ ){
        //  state += in.readChar();
        //}



        stateArray[i] = in.readUTF();
        populationArray[i] = in.readInt();
        childPopulationArray[i] = in.readInt();
        povertyArray[i] = in.readInt();




        /*

        String state = in.readUTF();
        System.out.println("State:" + state);

        int pop = 0;
        pop = in.readInt();
        System.out.println("Pop:" + pop);

        int childPop = 0;
        childPop = in.readInt();
        System.out.println("Child Pop:"+ childPop);

        int pov = 0;
        pov = in.readInt();
        System.out.println("Pov:" + pov);
        */
        i = i + 1;
      }

    }

    catch( Exception e )
      {
      System.out.println(e + "Error" );
      }

  }
}
