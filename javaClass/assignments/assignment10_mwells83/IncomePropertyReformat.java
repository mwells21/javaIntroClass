//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 10
//    08/04/19
//

import java.io.*;
import java.util.*;

public class IncomePropertyReformat
{
  public static void main( String [] args ) throws Exception
  {

    String line = null;
    BufferedReader in = null;

    int fileLength = 13486;
    String[] stateArray = new String[fileLength];
    int[] populationArray = new int[fileLength];
    int[] childPopulationArray = new int[fileLength];
    int[] povertyArray = new int[fileLength];
    int i = 0;


    final String fileName = "/home/mwe11s/github/javaIntroClass/javaClass/assignments/assignment10_mwells83/SmallAreaIncomePovertyEstData.txt";
    final String outFileName = "/home/mwe11s/github/javaIntroClass/javaClass/assignments/assignment10_mwells83/test.dat";


    try
    {
      in = new BufferedReader(new FileReader(fileName));
      while(( line = in.readLine()) != null)
      {
        String state = line.substring(0,2);

        String populationString = line.substring(83,90);
        int population = Integer.parseInt(populationString.trim());

        String childPopulationString = line.substring(92,99);
        int childPopulation = Integer.parseInt(childPopulationString.trim());

        String povertyString = line.substring(101,108);
        int poverty = Integer.parseInt(povertyString.trim());



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






    /*

    char buffer[] = new char[130];
    FileReader inFile = new FileReader(fileName);
    inFile.read(buffer);

    String test = new String(buffer);
    System.out.println(test.substring(0,2));
    System.out.println(test.substring(83,90));
    System.out.println(test.substring(92,99));



    System.out.println(buffer[0]);

    for(char dataByte:buffer)
    {
      System.out.print(dataByte);
    }
    */
    //Scanner sc = new Scanner(inFile);

    //while(sc.hasNextLine())
    //  System.out.println(sc.nextLine());


  }
}
