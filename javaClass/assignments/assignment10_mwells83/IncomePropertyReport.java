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
    int states = 56;


    // arrays for the summary outputs
    String[] stateOut = new String[states];
    int[] popOut = new int[states];
    int[] childPopOut = new int[states];
    int[] povOut = new int[states];
    float[] povRatioOut = new float[states];

    // arrays to store data
    String[] stateArray = new String[fileLength];
    int[] populationArray = new int[fileLength];
    int[] childPopulationArray = new int[fileLength];
    int[] povertyArray = new int[fileLength];


    try
    {
      in = new DataInputStream( new BufferedInputStream( new FileInputStream(fileName)));


      // iterator
      int i = 0;
      while( in.available() > 0)
      {
        // Reconstruct Data
        stateArray[i] = in.readUTF();
        populationArray[i] = in.readInt();
        childPopulationArray[i] = in.readInt();
        povertyArray[i] = in.readInt();


        i = i + 1;
      }

    }

    catch( Exception e )
      {
      System.out.println(e + "Error" );
      }

      String currentState = "01";
      int totalPop = 0;
      int totalChild = 0;
      int totalPov = 0;

      int record = 0;
      int lastLine = fileLength - 1;

      for(int j = 0; j < fileLength; j++){
        if(Objects.equals(currentState, stateArray[j])){
          totalPop = totalPop + populationArray[j];
          totalChild = totalChild + childPopulationArray[j];
          totalPov = totalPov + povertyArray[j];

        } else {
          stateOut[record] = currentState;
          popOut[record] = totalPop;
          childPopOut[record] = totalChild;
          povOut[record] = totalPov;
          povRatioOut[record] = totalPov / totalChild ;

          System.out.println("State:" + stateOut[record]);
          System.out.println("Pop:" + popOut[record]);
          System.out.println("Child:" + childPopOut[record] );
          System.out.println("Pov:" + povOut[record]);
          System.out.println("Ratio:" + povRatioOut[record]);

          currentState = stateArray[j];
          totalPop = populationArray[j];
          totalChild = childPopulationArray[j];
          totalPov = povertyArray[j];


          record = record + 1 ;
        }
        if(j == lastLine){
          stateOut[record] = currentState;
          popOut[record] = totalPop;
          childPopOut[record] = totalChild;
          povOut[record] = totalPov;
          povRatioOut[record] = totalPov / totalChild ;

          System.out.println("State:" + stateOut[record]);
          System.out.println("Pop:" + popOut[record]);
          System.out.println("Child:" + childPopOut[record] );
          System.out.println("Pov:" + povOut[record]);
          System.out.println("Ratio:" + povRatioOut[record]);

        }

      }



      // Print Summary




  }
}
