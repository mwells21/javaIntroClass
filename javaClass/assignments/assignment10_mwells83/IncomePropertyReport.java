/**
  * IncomePropertyReport
  * Reads in reformated data about child poverty data and prints a report
  * @param fileLength the number of records to read from the file
  * @param fileName the name of the file where the text file is located
  * @author Michael Wells
  * @version 1.0
*/

import java.io.*;
import java.util.*;


public class IncomePropertyReport
{
  public static void main( String [] args )
  {
    //define input stream
    DataInputStream in = null;

    //final String fileName = "/home/mwe11s/github/javaIntroClass/javaClass/assignments/assignment10_mwells83/test.dat";
    final String fileName = args[0];
    String fileLengthString = args[1];
    int fileLength = Integer.valueOf(fileLengthString);

    //int fileLength = 13486;
    int states = 51;


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
        // Read in and Reconstruct Data
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

      float totalPovFloat = 0;
      float totalChildFloat = 0;

      int record = 0;
      int lastLine = fileLength - 1;


      // Loop throught the reformated arrays I read in
      //

      for(int j = 0; j < fileLength; j++){
        if(Objects.equals(currentState, stateArray[j])){
          // Running total for each state as it loops through
          totalPop = totalPop + populationArray[j];
          totalChild = totalChild + childPopulationArray[j];
          totalPov = totalPov + povertyArray[j];

        } else {
          // if the state has changed
          // Populate the totals to the output array
          stateOut[record] = currentState;
          popOut[record] = totalPop;
          childPopOut[record] = totalChild;
          povOut[record] = totalPov;
          // Calculate Ration - have to cast to a float to get decimal
          povRatioOut[record] = (float) totalPov / totalChild* 100 ;


          // new states starting population
          currentState = stateArray[j];
          totalPop = populationArray[j];
          totalChild = childPopulationArray[j];
          totalPov = povertyArray[j];


          record = record + 1 ;
        }
        if(j == lastLine){
          // populate array
          stateOut[record] = currentState;
          popOut[record] = totalPop;
          childPopOut[record] = totalChild;
          povOut[record] = totalPov;
          povRatioOut[record] = (float) totalPov / totalChild* 100 ;



        }

      }



      // Print Summary
      System.out.println("File:"+ fileName);
      System.out.println();
      System.out.println("State\tPopulation\tChild Population\tChild Poverty Population\t% Child Poverty");
      System.out.println("-----\t----------\t----------------\t------------------------\t -------------");
      for(int state = 0; state < states; state++ ){
          System.out.println("   "+stateOut[state]+"\t   "+popOut[state]+"\t       "+childPopOut[state]+"\t\t        "+povOut[state]+"\t                     "+povRatioOut[state]);
      }


  }
}
