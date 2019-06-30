//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 5
//    06/30/19
//


import java.util.Scanner;

public class MorseCodeTranslator
{
  public static void main( String [] args )
  {
    translator();


  }


  public static void translator()
  {
    Scanner input = new Scanner(System.in);

    int response = 0;

    System.out.println( "-----------MORSE CODE TRANSLATOR-----------");
    System.out.println( "___________________________________________");
    System.out.println( "To translate Morse Code --> English enter 1");
    System.out.println( "To translate English --> Morse Code enter 2");

    response = input.nextInt();

    if(response == 1 ){
      morse2english();
    }

    if(response == 2 ){
      english2morse();
    }

  }


  public static void english2morse()
  {
    Scanner input = new Scanner(System.in);

    System.out.println("_______________________");
    System.out.println("English --> Morse Code\n");
    System.out.print("Enter English:");
    String inputString = input.nextLine();

    int letterIndex = 0;
    char letter;
    for(letterIndex = 0; letterIndex < inputString.length() ; letterIndex++){
      letter = inputString.charAt(letterIndex);
      System.out.println(letter);
    }
  }


  public static void morse2english()
  {
    Scanner input = new Scanner(System.in);

    System.out.println("_______________________");
    System.out.println("Morse Code --> English\n");
    System.out.print("Enter Morse Code:");
    String inputString = input.nextLine();
    System.out.println(inputString);

  }

  public static String searchTranslationArray(char letter, String morse, int direction ){


  }



}
