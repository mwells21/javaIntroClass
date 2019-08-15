/**
  * @author Michael Wells
  * @version 1.0
*/


public class DLLtest
{
  public static void main( String [] args )
  {
    // INTEGER

    // Integers to test
    Integer testInt1 = 1;
    Integer testInt2 = 5;
    Integer testInt3 = 10;

    // Create DLL of Integers
    DLL<Integer> dllIntTest = new DLL<Integer>();
    // Add tests to DLL
    dllIntTest.append(testInt1);
    dllIntTest.append(testInt2);
    dllIntTest.append(testInt3);
    // Print test to show it works
    dllIntTest.printlist(dllIntTest.head);


    // DOUBLE

    // Double to test
    Double testDbl1 = 2.0;
    Double testDbl2 = 6.0;
    Double testDbl3 = 12.0;

    // Create DLL of Double
    DLL<Double> dllDblTest = new DLL<Double>();
    // Add tests to DLL
    dllDblTest.append(testDbl1);
    dllDblTest.append(testDbl2);
    dllDblTest.append(testDbl3);
    // Print test to show it works
    dllDblTest.printlist(dllDblTest.head);


    // STRING

    // String to test
    String testString1 = "Dog";
    String testString2 = "Cat";
    String testString3 = "Horse";

    // Create DLL of String
    DLL<String> dllStrTest = new DLL<String>();
    // Add tests to DLL
    dllStrTest.append(testString1);
    dllStrTest.append(testString2);
    dllStrTest.append(testString3);
    // Print test to show it works
    dllStrTest.printlist(dllStrTest.head);








  }
}
