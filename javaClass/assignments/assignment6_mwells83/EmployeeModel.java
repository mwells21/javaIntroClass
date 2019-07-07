//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 6
//    07/07/19
//


import java.util.Scanner;

public class EmployeeModel
{
  public static void main( String [] args )
  {
    Date d1 = new Date(6,25,1996);
    System.out.println(d1.getDateString());

    Name n1 = new Name("Michael","Wells");
    System.out.println(n1.getFirstName());
    System.out.println(n1.getLastName());
    System.out.println(n1.getFullName());

    Address addy1 = new Address("Curtis Rd","Northville","MI",48168);
    System.out.println(addy1.getAddressString());

  }
}
