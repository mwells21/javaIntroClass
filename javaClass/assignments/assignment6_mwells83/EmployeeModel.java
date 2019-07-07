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
    int strucIter = 0;
    int employeesAdded = 0;

    Scanner input = new Scanner(System.in); // init scaner

    // Build an Array with default Employees using the default constructor
    Employee[] employeeArray = new Employee[10];

    for(strucIter = 0; strucIter < employeeArray.length;strucIter++ ){
      Employee tmp = new Employee();
      employeeArray[strucIter] = tmp;
    }


    while(repeat == 1 ){
      System.out.println( "___________________________________________");
      System.out.println( "Enter (1) to add Employee");
      System.out.println( "Enter (2) to see List of Employees");
      System.out.println( "Enter (3) to quit");
      response = input.nextInt();


      if(response == 1 ){

        Employee emp = addEmployee();
        employeeArray[employeesAdded] = emp;
        employeesAdded = employeesAdded + 1;


      }

      if(response == 2 ){
        System.out.println( "___________________________________________");
        if(employeesAdded == 0){
          System.out.println("No Employees Added...");
        } else {
          for(int summary = 0; summary < employeesAdded; summary++){
            System.out.println( "-------------------------");
            System.out.println(employeeArray[summary].getEmployeeSummary());
            System.out.println( "-------------------------");
          }
        }
        System.out.println( "___________________________________________");

      }

      if(response == 3 ){
        System.out.println( "--Goodbye--");
        repeat = 0;
      }
    }
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
