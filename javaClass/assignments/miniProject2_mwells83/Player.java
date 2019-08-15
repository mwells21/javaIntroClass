/**
 * The Player Class extends The Actor Class
 * It mostly Manages the players money and wagers
 * @author Michael Wells
 * @version 1.0

*/

public class Player extends Actor
{
  private int money;
  private int wager;

  // constructor
  public Player(int money, int wager)
  {
    super();
    this.money = money;
    this.wager = wager;

  }
  /**
    * @return the players current money (int)
  */
  public int getMoney()
  {
    return money;
  }


  /**
    * @return the players current wager (int)
  */
  public int getWager()
  {
    return wager;
  }

  /**
    * @param money int of what the players money to be set to
    *
  */
  public void setMoney(int money)
  {
    this.money = money;
  }


  /**
    * @param wager int of what the players wager to be set to
    *
  */
  public void setWager(int wager)
  {
    this.wager = wager;

  }


  /**
    * @return Prints Statement about the players current money
    *
  */
  public void getMoneyString()
  {
    System.out.println("You have $"+ money + "...");
  }


  /**
    * @param bet int that the player is trying to bet
    * @return a boolean value that is true if the bet is valid with the amount of money the player has
    *
    *
  */
  public boolean allowWager(int bet)
  {
    if(bet <= money & bet > 0){
      return true;
    } else{
      return false;
    }

  }

  /**
    * Claculates the players money if they win
    *
  */
  public void winsWager()
  {
      money = money + wager;
  }

  /**
    * Claculates the players money if they loose
    *
  */
  public void loosesWager()
  {
     money = money - wager;
  }






}
