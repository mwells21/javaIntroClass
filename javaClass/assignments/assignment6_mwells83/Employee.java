public class Employee
{
  protected int number;
  public Name name;
  protected Date date;
  protected Address address;

  //  constructor
  public Employee(int num, Name employeeName, Address employeeAddress, Date hireDate)
  {
    number = num;
    name = employeeName;
    address = employeeAddress;
    date = hireDate;
  }

  // Default constructor
  public Employee()
  {
    number = 9999;
    name = new Name();
    address = new Address("NO","Address","NO",99999);
    date = new Date(99,99,9999);

  }


  public int getEmployeeNumber()
  {
    return number;
  }



  public String getEmployeeSummary()
  {
      return "Number:" + number + "\nName:" + name.getFullName() + "\nAddress:" + address.getAddressString() + "\nHired Date:" + date.getDateString();
  }






}
