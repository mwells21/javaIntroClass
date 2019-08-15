/**
  * @author Michael Wells
  * @version 1.0
*/

import java.util.*;
import java.io.*;

public class Contacts
{
  public static void main( String [] args )
  {
    //String fileName = "/home/mwe11s/github/javaIntroClass/javaClass/assignments/assignment11_mwells83/contacts.txt";


    Scanner input = new Scanner(System.in); // init scaner
    System.out.print("Location of Contacts:"); // Prompt user for file location of contacts
    String fileName = input.nextLine(); // take in the next line
    TreeMap<String, Contact > contacts = new TreeMap<String, Contact>(); // Create Contact Tree map



    // Read in and Construct contact list
    DataInputStream in = null;
    try
    {
      in = new DataInputStream( new BufferedInputStream( new FileInputStream(fileName))); // data input stream
      // iterator
      int i = 0;
      while( in.available() > 0)
      {
        // Read in and Reconstruct Data
        String lastName = in.readUTF();
        String firstName = in.readUTF();
        String number = in.readUTF();
        String address = in.readUTF();

        Contact c = new Contact(lastName, firstName, number, address);  // Create Contact
        contacts.put(c.getContactLastName(), c);                        // put the Contact in the tree
        i = i + 1;
      }

    }
    catch( Exception e )
    {
      System.out.println("No file found .. maybe the filename is wrong.. " );
    }


    // loop start and end points
    int actions = 1;
    int done = 0;
    // possible action strings
    String add = "add";
    String del = "del";
    String show = "show";
    String quit = "quit";


    while(actions != done){
      System.out.println();
      System.out.println("Enter (add) to add new contact");
      System.out.println("Enter (del) to delete an existing contact");
      System.out.println("Enter (show) to show contacts");
      System.out.println("Enter (quit) to exit program:");
      String action = input.next();


      // ADD --------------------------------------------------------------------
      if(action.equalsIgnoreCase(add)){
        System.out.println();
        System.out.println("Add new contact...");

        Contact newContact = addContact();                                  // Add contact with addContact method
        contacts.put(newContact.getContactLastName(),newContact);           // Put the new contact in the treeMap


        DataOutputStream out = null;
        // Write the tree to a byte file
        try
        {
          out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
          for(Map.Entry contact : contacts.entrySet())
          {
            Contact c = contacts.get(contact.getKey());
            out.writeUTF(c.getContactLastName());
            out.writeUTF(c.getContactFirstName());
            out.writeUTF(c.getContactNumber());
            out.writeUTF(c.getContactAddress());

          }
          out.close();

        }

        catch(Exception e)
        {
          System.out.println( "Error writing to file" );
        }
      }


      // DELETE --------------------------------------------------------------------------
      if(action.equalsIgnoreCase(del)){
        System.out.println();
        System.out.println("delete an existing contact...");
        System.out.print("Last Name of Contact to remove:");
        String key2remove = input.next();
        contacts.remove(key2remove);
        System.out.println("Contact "+ key2remove + " removed...");



        // Write the new Contact List

        DataOutputStream out = null;
        // Write the tree to a byte file
        try
        {
          out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
          for(Map.Entry contact : contacts.entrySet())
          {
            Contact c = contacts.get(contact.getKey());
            out.writeUTF(c.getContactLastName());
            out.writeUTF(c.getContactFirstName());
            out.writeUTF(c.getContactNumber());
            out.writeUTF(c.getContactAddress());

          }
          out.close();

        }

        catch(Exception e)
        {
          System.out.println( "Error writing to file" );
        }






      }


      // SHOW ----------------------------------------------------------------------------
      if(action.equalsIgnoreCase(show)){
        System.out.println();
        for(Map.Entry contact : contacts.entrySet())
        {
          Contact c = contacts.get(contact.getKey());
          System.out.println(c.getContactSummary());
        }
      }


      // QUIT  -----------------------------------------------------------------------------
      if(action.equalsIgnoreCase(quit)){
        System.out.println();
        System.out.println("Goodbye");
        actions = done;

      }



    }



  }






  public static Contact addContact()
  {
    Scanner input = new Scanner(System.in); // init scaner
    System.out.println("Last Name:");
    String lastName = input.next();

    System.out.println("First Name:");
    String firstName = input.next();

    System.out.println("Number:");
    String number = input.next();

    System.out.println("Address:");
    input.nextLine();
    String address = input.nextLine();

    Contact newContact = new Contact(lastName,firstName,number,address);

    return(newContact);

  }











}
