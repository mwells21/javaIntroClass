/**
  * IncomePropertyReformat
  * Reformats a txt file that contains data on child poverty data to be used.
  * It write a .dat file that will be read later to summarize the data
  * @param fileName the name of the file where the text file is located
  * @param outFileName the name of the file where the .dat file will be written to
  * @param fileLength the number of records to read from the file
  * @author Michael Wells
  * @version 1.0
*/

import java.io.*;
import java.util.*;

public class IncomePropertyReformat
{
  public static void main( String [] args ) throws Exception
  {

    String line = null;
    BufferedReader in = null;

    // Bring in the number of records to read and get the interg value of
    String fileLengthString = args[2];
    int fileLength = Integer.valueOf(fileLengthString);

    // Define arrays that the stream will populate
    // These are the 4 records we want to extract from the text file
    String[] stateArray = new String[fileLength];
    int[] populationArray = new int[fileLength];
    int[] childPopulationArray = new int[fileLength];
    int[] povertyArray = new int[fileLength];

    // iterator
    int i = 0;

    // Bring in the name of the text file and the name of the byte file to write
    final String fileName = args[0];
    final String outFileName = args[1];

    try
    {
      in = new BufferedReader(new FileReader(fileName));
      while(( line = in.readLine()) != null)
      {
        // Parse Text file

        // Sate
        String state = line.substring(0,2);

        // Population
        String populationString = line.substring(83,90);
        int population = Integer.parseInt(populationString.trim());

        // Child Population
        String childPopulationString = line.substring(92,99);
        int childPopulation = Integer.parseInt(childPopulationString.trim());

        // Child Poverty
        String povertyString = line.substring(101,108);
        int poverty = Integer.parseInt(povertyString.trim());


        // populate there corresponding arrays
        stateArray[i] = state;
        populationArray[i] = population;
        childPopulationArray[i] = childPopulation;
        povertyArray[i] = poverty;

        //System.out.println("State:"+ stateArray[i]);
        //System.out.println("State:"+ state);
        //System.out.println("Pop:"+   populationArray[i]);
        //System.out.println("Pov:" + povertyArray[i]);
        i = i + 1;
      }
      in.close();
    }
    catch(Exception e)
    {
      System.out.println("Error");
    }



    DataOutputStream out = null;

    // Write the arrays to a byte file
    try
    {
      out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFileName)));
      for( int j = 0; j < fileLength; j++)
      {
        out.writeUTF(stateArray[j]);
        out.writeInt(populationArray[j]);
        out.writeInt(childPopulationArray[j]);
        out.writeInt(povertyArray[j]);
      }
      out.close();

    }

    catch(Exception e)
    {
      System.out.println( "Error writing to file" );
    }


  }
}
