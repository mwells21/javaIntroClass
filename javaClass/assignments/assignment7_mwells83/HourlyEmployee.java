public class HourlyEmployee extends Employee
{
  private double payRate;
  private double hours;
  private double earnings;
  private double overhours;
  private double overRate;


  // constructor
  public HourlyEmployee(int num, Name employeeName, Address employeeAddress, Date hireDate, double payRate,double hours ){
    super(num, employeeName, employeeAddress, hireDate);
    this.payRate = payRate;
    this.hours = hours;


    // calculates earnings
    if(hours>40){
      overhours = hours - 40;
      overRate = payRate *1.5;
      earnings = (payRate * 40) + (overRate * overhours);
    } else {
      earnings = payRate * hours;
    }

  }


  // test to see if constructor worked
  public void test(){
    System.out.println(payRate);
  }

  // print summary
  public void getHourlyEmployeeSummary()
  {
    System.out.println(super.getEmployeeSummary());
    System.out.println("Pay Rate:"+payRate);
    System.out.println("Hours:"+hours);
    System.out.println("Earnings:"+earnings);

  }
}
