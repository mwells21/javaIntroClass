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
    int repeat = 1;
    int response = 0;
    Scanner input = new Scanner(System.in); // init scaner

    while(repeat == 1 ){
      System.out.println( "___________________________________________");
      System.out.println( "Enter (1) to add Employee");
      System.out.println( "Enter (2) to see List of Employees");
      System.out.println( "Enter (3) to quit");
      response = inout.nextInt();
      if(response == 1 ){

      }

      if(response == 2 ){

      }

      if(response == 3 ){
        System.out.println( "--Goodbye--");
        repeat = 0;
      }




    }




    Date d1 = new Date(6,25,1996);
    //System.out.println(d1.getDateString());

    Name n1 = new Name("Michael","Wells");
    //System.out.println(n1.getFirstName());
    //System.out.println(n1.getLastName());
    //System.out.println(n1.getFullName());

    Address addy1 = new Address("Curtis Rd","Northville","MI",48168);
    //System.out.println(addy1.getAddressString());

    Employee[] employeeArray = new Employee[10];

    Employee emp1 = new Employee(1,n1,addy1,d1);
    employeeArray[0] = emp1;
    System.out.println(employeeArray[0].getEmployeeSummary());

  }
}
