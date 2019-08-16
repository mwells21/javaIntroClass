/**
  * @author Michael Wells
  * @version 1.0
*/
import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener{

  // Main Frame of APP
  JFrame mainFrame = new JFrame("Calculator App");

  // Button
  JButton calcBtn = new JButton("Calculate");

  // Text Fields
  JTextField value1Field = new JTextField();
  JTextField value2Field = new JTextField();
  JTextField sumField    = new JTextField();

  // Labels
  JLabel value1Label = new JLabel("First Value:");
  JLabel value2Label = new JLabel("Second Value:");
  JLabel sumLabel = new JLabel("Sum is:");


  public static void main(String[] args){
    new App();
  }
  /**
    *App
    * Set Bounds for Labels.
    * Set Bounds for Value fields 
    * Set Bounds for Btn
    * Add action to Btn
    * Add components 
    * Define Frame

  */
  public App(){

    // Set Bounds for Labels 
    value1Label.setBounds(50,50,100,30);
    value2Label.setBounds(50,100,100,30);
    sumLabel.setBounds(50, 150, 100, 30);

    // Set Bounds for Value fields 
    value1Field.setBounds(150,55,100,20);
    value2Field.setBounds(150,105,100,20);
    sumField.setBounds(150,150,100,20);

    // Set Bounds for Btn
    calcBtn.setBounds(150,200,100,30);

    // Make uneditable
    sumField.setEditable(false);   
    
    // Add action to Btn
    calcBtn.addActionListener(this);


    // Add components 
    mainFrame.add(value1Label);
    mainFrame.add(value2Label);
    mainFrame.add(sumLabel);
    mainFrame.add(value1Field);
    mainFrame.add(value2Field);
    mainFrame.add(sumField);
    mainFrame.add(calcBtn);


    // APP frame 
    mainFrame.setSize(400,300);
    mainFrame.setResizable(true);
    mainFrame.setLayout(null);
    mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
    mainFrame.setVisible(true);
  }


    /**
  * Listens for event. Gets text,converts to int, adds ints, converts back to string, then sends to sumTextField
  * @param ActionEvent e 
  * 
  */

  public void actionPerformed(ActionEvent e){
    // Get text from text fields 
    String value1string = value1Field.getText();
    String value2string = value2Field.getText();

    // Convert to Integer
    int value1 = Integer.parseInt(value1string);
    int value2 = Integer.parseInt(value2string);

    // Find sum
    int sum = 0;
    sum = value1 + value2;

    // Convery Back to String
    String sumString = String.valueOf(sum);

    // Return String 
    sumField.setText(sumString);


  }






}
