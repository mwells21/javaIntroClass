public class Date
{
  private int month;
  private int day;
  private int year;

  // constructor
  public Date( int m, int d, int y)
  {
    month = m;
    day = d;
    year = y;
  }

  // default constructor
  public Date()
  {
    month = 1;
    day = 1;
    year = 1900;

  }

  public String getDateString()
  {
    return month + "/" + day + "/" + year;

  }




}
