//    Michael Wells
//    EN.605.201.83.SU19
//    Assignment 7
//    07/14/19
//

import java.util.Scanner;

public class Assignment7
{
  public static void main( String [] args )
  {
    Scanner input = new Scanner(System.in); // init scaner

    // Declare employee info
    int num = 1;
    int empHireDay = 1;
    int empHireMonth = 1;
    int empHireYear = 2000;
    String empFirstName = "Michael";
    String empLastName = "Wells";
    String empStreet = "Hello";
    String empCity = "world";
    String empState = "MI";
    int empZip = 48168;

    // Salary info
    int annualSalary = 100000;

    // hourly info
    double payRate = 10;
    double hours1 = 20;
    double hours2 = 50;


    // Create Date, Name, and Address object
    Date d1 = new Date(empHireDay,empHireMonth,empHireYear);
    Name n1 = new Name(empFirstName,empLastName);
    Address addy1 = new Address(empStreet,empCity,empState,empZip);

    // Emp object create to use the num of the salary object just to test how it would work
    Employee emp1 = new Employee(num,n1,addy1,d1);

    // Create SalariedEmployee object
    SalariedEmployee salEmp = new SalariedEmployee(emp1.getEmployeeNumber(), n1, addy1, d1, annualSalary);
    System.out.println( "___________________________________________");
    salEmp.getSalariedEmployeeSummary(); // Print summary
    System.out.println( "___________________________________________");
    // Create HourlyEmployee object
    HourlyEmployee hourEmp1 = new HourlyEmployee(num, n1, addy1, d1, payRate, hours1);
    hourEmp1.getHourlyEmployeeSummary(); // Print summary
    System.out.println( "___________________________________________");
    // Create HourlyEmployee object with overtime
    HourlyEmployee hourEmp2 = new HourlyEmployee(num, n1, addy1, d1, payRate, hours2);
    hourEmp2.getHourlyEmployeeSummary(); // Print summary




    /*    System.out.println( "Salary Employee");
        System.out.println( "___________________________________________");
        System.out.println( "Annual Salary:");
        int annualSalary = input.nextInt();
    */



    /*    System.out.println( "Hourly Employee");
        System.out.println( "___________________________________________");
        System.out.println( "Pay Rate:");
        int payRate = input.nextInt();
        System.out.println( "Hours:");
        int hours = input.nextInt();
        System.out.println( "Earnings:");
        int earnings = input.nextInt();
        System.out.println( "___________________________________________");
    */









  }






  public static Employee addEmployee()
  {
    Scanner input = new Scanner(System.in); // init scaner
    System.out.println( "___________________________________________");
    System.out.println( "Add Employee");
    System.out.println( "");
    System.out.println( "Employee Number:");
    int empNumber = input.nextInt();
    System.out.println( "Employee Name:");
    System.out.println( "___________________________________________");
    System.out.println( "Employee First Name:");
    input.nextLine(); // Had to add this or it would skip the next input
    String empFirstName = input.nextLine();
    System.out.println( "Employee Last Name:");
    String empLastName = input.nextLine();

    System.out.println( "Hire Date");
    System.out.println( "___________________________________________");
    System.out.println( "Hire Day:");
    int empHireDay = input.nextInt();
    System.out.println( "Hire Month:");
    int empHireMonth = input.nextInt();
    System.out.println( "Hire Year:");
    int empHireYear = input.nextInt();

    System.out.println( "Employee Address");
    System.out.println( "___________________________________________");
    System.out.println( "Street:");
    input.nextLine();// Had to add this or it would skip the next input
    String empStreet = input.nextLine();
    System.out.println( "City:");
    String empCity = input.nextLine();
    System.out.println( "State (2 Letter abbr):");
    String empState = input.nextLine();
    System.out.println( "Zip (5 digits)");
    int empZip = input.nextInt();

    Date d1 = new Date(empHireDay,empHireMonth,empHireYear);
    Name n1 = new Name(empFirstName,empLastName);
    Address addy1 = new Address(empStreet,empCity,empState,empZip);
    Employee emp1 = new Employee(empNumber,n1,addy1,d1);

    return(emp1);





  }



}
