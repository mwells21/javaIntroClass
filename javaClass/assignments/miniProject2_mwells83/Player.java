public class Player extends Actor
{
  private int money;
  private int wager;


  public Player(int money, int wager)
  {
    super();
    this.money = money;
    this.wager = wager;

  }

  public int getMoney()
  {
    return money;
  }

  public int getWager()
  {
    return wager;
  }

  public void setMoney(int money)
  {
    this.money = money;
  }

  public void setWager(int wager)
  {
    this.wager = wager;

  }

  public void getMoneyString()
  {
    System.out.println("You have $"+ money + "...");
  }

  public boolean allowWager(int bet)
  {
    if(bet <= money & bet > 0){
      return true;
    } else{
      return false;
    }

  }


  public void winsWager()
  {
      money = money + wager;
  }

  public void loosesWager()
  {
     money = money - wager;
  }






}
