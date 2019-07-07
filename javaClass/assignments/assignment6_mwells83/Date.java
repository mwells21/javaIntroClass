public class Date
{
  private int month;
  private int day;
  private int year;

  public Date( int m, int d, int y)
  {
    month = m;
    day = d;
    year = y;
  }

  public String getDateString()
  {
    return month + "/" + day + "/" + year;

  }




}
