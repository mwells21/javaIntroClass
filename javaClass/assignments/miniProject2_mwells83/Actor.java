public class Actor
{

  public String myCards;
  public int myScore;
  public int numberOfCards;


  // constructor
  public Actor()
  {
    myCards = "";
    myScore = 0;
    numberOfCards = 0;
  }

  public void addCard(String card )
  {
    myCards = myCards + card + " ";
    numberOfCards = numberOfCards + 1;
  }

  public void showCards()
  {
    System.out.println(myCards);
  }

  public void showFirstCard()
  {
    String myCardsTrim = myCards.trim();
    // Then split up each card by the space in between
    String[] myCardsArray = myCardsTrim.split(" ",0);
    String dealerCard = myCardsArray[0];
    System.out.println(dealerCard + " *");
  }

  public void resetCards()
  {
    myCards = "";
    myScore = 0;
  }


  public int getScore()
  {
    return myScore;
  }



  public boolean catch21()
  {
    if(myScore == 21){
      return true ;
    } else {
      return false;
    }
  }

  public boolean catchBust()
  {
    if(myScore > 21){
      return true ;
    } else {
      return false;
    }
  }

  public boolean catch17()
  {
    if(myScore > 17){
      return true;
    } else {
       return false;
    }
  }







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
