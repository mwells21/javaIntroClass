public class Dealer extends Actor
{

  //private int randomNumber;
  private String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};


  public Dealer()
  {
    super();
    //this.randomNumber = 0;

  }

  public String drawCard()
  {
    int randomNumber = (int) (11 * Math.random() ) + 1;
    String card = cards[randomNumber];
    return card;

  }


}
