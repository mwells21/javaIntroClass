public class Address
{
  private String street;
  private String city;
  private String state;
  private int zip;


  public Address(String newStreet, String newCity, String newState, int newZip)
  {

    if(newState.length()!= 2){
      System.out.println("ERROR: Invalid length of State Sting. Needs to have length of 2");
    }

    if(String.valueOf(newZip).length()!=5){
      System.out.println("ERROR: Invalid Zip. Needs to be an integer with 5 digits");
    }

    street = newStreet;
    city   = newCity;
    state  = newState;
    zip    = newZip;


  }

  public String getAddressString()
  {
    return street + "," + city + "," + state + "," + zip;
  }






}
