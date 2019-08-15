/**
 * The Actor Class contains methods used by both the dealer and the player in Blackjack
 *
 * @author Michael Wells
 * @version 1.0

*/


public class Actor
{

  public String myCards;
  public int myScore;
  public int numberOfCards;


  /**
    *Constructor
    * -myCards
    * -myScore
    * -numberOfCards
  */
  public Actor()
  {
    myCards = "";
    myScore = 0;
    numberOfCards = 0;
  }



  /**
    *Adds a Card to the actors "hand"
    *@param card String of the Card to be added ie ("10","K",etc)
    *
  */
  public void addCard(String card )
  {
    myCards = myCards + card + " ";
    numberOfCards = numberOfCards + 1;
  }

  /**
  * Prints to the console the myCards String showing the actos cards
  */
  public void showCards()
  {
    System.out.println(myCards);
  }

  /**
  * Prints to the console the first card in your hand, and a * for the second card
  * To be used by the dealer class
  */

  public void showFirstCard()
  {
    String myCardsTrim = myCards.trim();
    // Then split up each card by the space in between
    String[] myCardsArray = myCardsTrim.split(" ",0);
    String dealerCard = myCardsArray[0];
    System.out.println(dealerCard + " *");
  }

  /**
  * Resets Cards and the score of the cards
  */

  public void resetCards()
  {
    myCards = "";
    myScore = 0;
  }

  /**
  * Returns the score of the actor
  *@return myScore: the current score of the actor
  */
  public int getScore()
  {
    return myScore;
  }

  /**
  * checks if the actor has 21
  *@return a boolean value if the actor has a score of 21
  */
  public boolean catch21()
  {
    if(myScore == 21){
      return true ;
    } else {
      return false;
    }
  }

  /**
  * checks if the actor has busted
  *@return a boolean value if the actor has busted
  */
  public boolean catchBust()
  {
    if(myScore > 21){
      return true ;
    } else {
      return false;
    }
  }

  /**
  * checks if the actor has more than 17
  *@return a boolean value if the actor hhas above 17 (will be used mostly for the dealer)
  */
  public boolean catch17()
  {
    if(myScore > 17){
      return true;
    } else {
       return false;
    }
  }



  /**
  * setScore is a method that defines the actors point score based on the cards they have
  * - Defines array of possible cards and points
  * - Trims myCards
  * - Splits the myCard String into an array of each card
  * - Searchs through the index cards and find the corresponding points for the cards
  * - Adds up the total amount of points and sets it to the actors score
  */


  public void setScore()
  {
    // Reset score so it only calulates what is in the current hand
    myScore = 0;

    // Define Arrays for the cards it could be and the matching value
    String[] possibleCardsArray = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    int[] possibleValuesArray = {2,3,4,5,6,7,8,9,10,10,10,10,11};

    // define placeholders for the card and the cards value
    int value = 0;
    String card = "";

    // First trim the myCards string, there is a space at the end
    String myCardsTrim = myCards.trim();
    // Then split up each card by the space in between
    String[] myCardsArray = myCardsTrim.split(" ",0);

    // Define a value for possible card will be used to test what the card is
    String possibleCard = "";

    // loop through all myCards
    for(int i = 0; i < myCardsArray.length;i++){
      card = myCardsArray[i];
      // loop through all possible cards
      for(int cardIndex = 0; cardIndex < possibleCardsArray.length; cardIndex++ ){
        possibleCard = possibleCardsArray[cardIndex];
        // if its a match then define the value of the card
        if(possibleCard.equalsIgnoreCase(card)){
          value =  possibleValuesArray[cardIndex];
          break;
        }
      }
      myScore = myScore + value;
    }

  }



}
