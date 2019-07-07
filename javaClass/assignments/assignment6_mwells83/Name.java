public class Name
{
  private String firstName;
  private String lastName;

  // constructor
  public Name( String first, String last )
  {
    firstName = first;
    lastName  = last;
  }


  //default constructor
  public Name()
  {
    firstName = "None";
    lastName = "None";
  }



  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

}
