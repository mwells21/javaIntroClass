public class SalariedEmployee extends Employee
{
  private int annualSalary;


  // constructor
  public SalariedEmployee(int num, Name employeeName, Address employeeAddress, Date hireDate, int salary){
    super(num, employeeName, employeeAddress, hireDate);
    annualSalary = salary;
  }

  // Print summary
  public void getSalariedEmployeeSummary()
  {
    System.out.println(super.getEmployeeSummary());
    System.out.println("Salary:"+annualSalary);
  }



}
