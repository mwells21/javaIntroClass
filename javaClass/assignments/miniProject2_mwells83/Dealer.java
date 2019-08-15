/**
 * The Dealer Class extends The Actor Class
 * It deales the cards to actors
 * @author Michael Wells
 * @version 1.0

*/


public class Dealer extends Actor
{

  private String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};


  public Dealer()
  {
    super();

  }

  /**
  * Randomly chooses a card from the cards array using the random number generator
  *@return card a string of the card that was randomly drawn form cards
  */
  public String drawCard()
  {
    int randomNumber = (int) (12 * Math.random() ) + 1;
    String card = cards[randomNumber];
    return card;

  }


}
