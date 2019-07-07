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
    Scanner input = new Scanner(System.in); // init scaner
    int response = 0;


    // Header
    System.out.println( "-----------MORSE CODE TRANSLATOR-----------");
    System.out.println( "___________________________________________");
    System.out.println( "To translate Morse Code --> English enter 1");
    System.out.println( "To translate English --> Morse Code enter 2");

    //Get user input
    response = input.nextInt();

    // call the right translator methods based on the user input
    if(response == 1 ){
      morse2english();
    }

    if(response == 2 ){
      english2morse();
    }

  }

  /*
  english2morse

  goal of the mehtod is to translate english to morse code
  -promts user for text to translated
  -call the 'searchTranslationArray' method for each english letter
  -binds all the translated strings together
  -prints translated morse code string

  Pre-Conditions:
  requires Nothing

  Post-Conditions:
  prints translation


  */
  public static void english2morse()
  {
    Scanner input = new Scanner(System.in);

    // header and promt
    System.out.println("_______________________");
    System.out.println("English --> Morse Code\n");
    System.out.print("English:");
    String inputString = input.nextLine();

    int letterIndex = 0;
    char letter = 'a';
    String morse = "holder";
    int direction = 2;
    String letterString = "holder";


    System.out.print("Morse Code:");
    for(letterIndex = 0; letterIndex < inputString.length() ; letterIndex++){
      letter = inputString.charAt(letterIndex);
      letterString = String.valueOf(letter);
      String translatedLetter = searchTranslationArray(letterString, morse, direction);
      if(letterIndex == 0){
        morse = translatedLetter;
      } else {
        morse = morse + " " + translatedLetter;
      }
    }
    System.out.println(morse);

  }


  /*
  morse2english

  function of the mehtod is to translate morse code to english
  -promts user for text to translated
  -splits user input into each morse code letter
  -call the 'searchTranslationArray' method for each morse code string letter
  -binds all the translated strings together
  -prints translated english string

  Pre-Conditions:
  requires Nothing

  Post-Conditions:
  prints translation


  */

  public static void morse2english()
  {
    Scanner input = new Scanner(System.in);

    System.out.println("_______________________");
    System.out.println("Morse Code --> English\n");
    System.out.print("Morse Code:");
    String inputString = input.nextLine();


    String[] inputSplit = inputString.split(" ");
    int morseIndex = 0;
    String morseLetter = "holder";
    String letter = "holder";
    int direction = 1;
    //int test = 0;
    //test = inputSplit.length;
    //System.out.println(test);


    System.out.print("English:");
    for(morseIndex = 0; morseIndex < inputSplit.length; morseIndex++){
      morseLetter =  inputSplit[morseIndex];
      String translatedLetter = searchTranslationArray(letter, morseLetter, direction);
      if(morseIndex == 0){
        letter = translatedLetter;
      } else {
        letter = letter  + translatedLetter;
      }
    }

    System.out.println(letter);

  }



  /*
  searchTranslationArray
  called by either morse2english or english2morse
  translates strings of morse code and english

  Pre-Conditions:
  string letterString (string of english )
  String morseString (string of morse code )
  int direction (1:morse=>english, 2:english=>morse)

  Post-Conditions:
  string output (translated string)


  */


  public static String searchTranslationArray(String letterString, String morseString, int direction ){

    //String alphabetString = "abcdefghijklmnopqrstuvwxyz1234567890";
    //char[] englishArray = alphabetString.toCharArray();
    //englishArray[36] = '_';
    String[] englishArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v",
    "w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
    String[] morseArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
    ".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","---.","-----"};
    String translated2Morse = "|";
    String translated2English = " ";

    int englishIndex = 0;
    int morseCodeIndex = 0;
    String letterTest = "a";
    String morseTest = ".";
    String output = "holder";

    if(direction == 1 ){

      for(morseCodeIndex = 0; morseCodeIndex < 35; morseCodeIndex++){
        morseTest = morseArray[morseCodeIndex];
        if(morseTest.equalsIgnoreCase(morseString)){
          translated2English = englishArray[morseCodeIndex];
          break;
        }
      }

      output = translated2English;


    }

    if(direction == 2 ){

      for(englishIndex = 0; englishIndex < 35; englishIndex++){
        letterTest = englishArray[englishIndex];
        if(letterTest.equalsIgnoreCase(letterString)){
          translated2Morse= morseArray[englishIndex];
          break;

        }
      }
      output = translated2Morse;
    }
      return(output);

  }




}
