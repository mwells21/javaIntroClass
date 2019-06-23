//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 4
//    Problem 2
//    06/02/19
//


import java.util.Scanner;

public class Problem2
{
  public static void main( String [] args )
  {
    Scanner input = new Scanner( System.in );

    int month = 1;
    int year  = 2012;

    System.out.print( "Please enter a Year:" );  // promt for Year
    year = input.nextInt();

    for(month = 1; month <= 12;month++){
          printMonthCalender(month, year);
    }



  }




  public static void printMonthCalender(int month, int year)
  {

    printMonthHeader(month, year);
    printMonthBody(month, year);
    System.out.println();


  }




  public static void printMonthHeader(int month, int year)
  {

      String monthName = getMonthName(month);
      System.out.print("\t"+ monthName + "  " + year + "\n" );
      System.out.println("-----------------------------");
      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");


  }


  public static void printMonthBody(int month, int year)
  {
    int NumDaysInMonth = getNumDaysInMonth(month, year);
    int day = 1;

    for(day = 1; day <= NumDaysInMonth; day++){
      int dayLocation = getStartDay(month, year, day);

      if(day == 1){
        switch(dayLocation){
          case 1:
          System.out.print("       " + day);
          break;

          case 2:
          System.out.print("           " + day);
          break;

          case 3:
          System.out.print("               " + day);
          break;

          case 4:
          System.out.print("                   " + day);
          break;

          case 5:
          System.out.print("                       " + day);
          break;

          case 6:
          System.out.println("                           " + day);
          break;

          case 7:
          System.out.print("   " + day);
          break;
        }

      }

      else if(dayLocation == 6){
        if(day < 10){
          System.out.println("   " + day);
        }
        else{
          System.out.println("  " + day);
        }
      }

      else{
        if(day < 10){
          System.out.print("   " + day);
        }
        else{
          System.out.print("  " + day);
        }
      }


    }
  }



  public static int getNumDaysInMonth(int month, int year)
  {
    int daysInMonth = 0;

    switch(month){
      case 1:
      daysInMonth = 31;
      break;

      case 2:
      daysInMonth = 28;
      break;

      case 3:
      daysInMonth = 31;
      break;

      case 4:
      daysInMonth = 30;
      break;

      case 5:
      daysInMonth = 31;
      break;

      case 6:
      daysInMonth = 30;
      break;

      case 7:
      daysInMonth = 31;
      break;

      case 8:
      daysInMonth = 31;
      break;

      case 9:
      daysInMonth = 30;
      break;

      case 10:
      daysInMonth = 31;
      break;

      case 11:
      daysInMonth = 30;
      break;

      case 12:
      daysInMonth = 31;
      break;
    }


    boolean leapYear = isLeapYear(year);
    if(leapYear && daysInMonth == 28){
      daysInMonth = 29;
    }


    return(daysInMonth);

  }


  public static boolean isLeapYear(int year)
  {
      boolean  leapYearBool = false;

      if(year % 400 == 0 ){
        leapYearBool = true;
      }

      else if(year % 100 == 0){
        leapYearBool = false;
      }

      else if(year % 4 == 0){
        leapYearBool = true;
      }

      return(leapYearBool);

  }




  public static String getMonthName(int month)
  {
    String monthName = "month";

    switch(month){
      case 1:
      monthName = "January";
      break;

      case 2:
      monthName = "February";
      break;

      case 3:
      monthName = "March";
      break;

      case 4:
      monthName = "April";
      break;

      case 5:
      monthName = "May";
      break;

      case 6:
      monthName = "June";
      break;

      case 7:
      monthName = "July";
      break;

      case 8:
      monthName = "August";
      break;

      case 9:
      monthName = "September";
      break;

      case 10:
      monthName = "October";
      break;

      case 11:
      monthName = "November";
      break;

      case 12:
      monthName = "December";
      break;
    }


     return monthName;
  }






  // getStartDay
  //
  // The method getStartDay() implements Zeller's Algorithm for determining the
  // day of the week the first day of a month is. The method adjusts Zeller's
  // numbering scheme for day of week ( 0=Saturday, ..., 6=Friday ) to conform to
  // a day of week number that corresponds to ISO conventions (i.e., 1=Monday,
  // ..., 7=Sunday)
  //
  // Pre-Conditions: The month value, m, is 1-12 The day value, d, is 1-31, or
  // 1-28, 1-29 for February The year value, y, is the full year (e.g., 2012)
  //
  // Post-Conditions: A value of 1-7 is returned, representing the first day of
  // the month 1 = Monday, ..., 7 = Sunday
  //
  public static int getStartDay(int month, int year, int day)
  {

     if (month < 3)                   // Adjust month number & year to fit Zeller's numbering system
     {
        month += 12;
        year -= 1;
     }

     int centuryYear = year % 100;    // Calculate year within century
     int centuryTerm = year / 100;    // Calculate century term
     int firstDayinMonth = 0;         // Day number of first day in month 'm'

     firstDayinMonth = (day + (13 * (month + 1) / 5) + centuryYear + (centuryYear / 4) + (centuryTerm / 4) + (5 * centuryTerm)) % 7;

     // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
     int dayNum = ((firstDayinMonth + 5) % 7) + 1;

     return dayNum;
  }



}
