/**
 * The Contact Class contains a lastName, firstName, number, and address
 *
 * @author Michael Wells
 * @version 1.0

*/


public class Contact
{
  private String lastName;
  private String firstName;
  private String number;
  private String address;

  /**
    *Constructor
    * -lastName
    * -firstName
    * -number
    * -address
  */
  public Contact(String lastName, String firstName, String number, String address)
  {
    this.lastName = lastName;
    this.firstName = firstName;
    this.number = number;
    this.address = address;

  }

  /**
    * Default Constructor
    * -lastName
    * -firstName
    * -number
    * -address
  */
  public Contact()
  {
    this.lastName = "lastName";
    this.firstName = "firstName";
    this.number = "number";
    this.address = "address";
  }

  /**
  * Returns the last Name of the Contact
  *@return lastName: the current last name
  */
  public String getContactLastName()
  {
    return lastName;
  }

  /**
  * Returns the First Name of the Contact
  *@return firstName: the current first name
  */
  public String getContactFirstName()
  {
    return firstName;
  }


  /**
  * Returns the Number of the Contact
  *@return number: the current phone number
  */
  public String getContactNumber()
  {
    return number;
  }

  /**
  * Returns the address of the Contact
  *@return address: the current address
  */
  public String getContactAddress()
  {
    return address;
  }

  /**
  * Returns the Summary of the Contact
  *@return a string of all the information of the contact
  */
  public String getContactSummary()
  {
    return lastName + ", " + firstName + " -- Number: " + number + " -- Address: " + address;
  }




}
