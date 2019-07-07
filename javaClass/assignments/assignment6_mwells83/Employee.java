public class Employee
{
  private int number;
  private Name name;
  private Date date;
  private Address address;


  public Employee(int num, Name employeeName, Address employeeAddress, Date hireDate)
  {
    number = num;
    name = employeeName;
    address = employeeAddress;
    date = hireDate;
  }

  public String getEmployeeSummary()
  {
      return "Number:" + number + "\nName:" + name.getFullName() + "\nAddress:" + address.getAddressString() + "\nHired Date:" + date.getDateString();
  }




}
