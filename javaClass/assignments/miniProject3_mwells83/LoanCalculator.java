
import javax.swing.*;
import java.awt.event.*;

public class LoanCalculator implements ActionListener{
  // Main Frame of APP
  JFrame mainFrame = new JFrame("Loan Calculator");


  // Labels
  JLabel interestLabel   = new JLabel("Annual Interest Rate:");
  JLabel yearsLabel      = new JLabel("Number of Years:");
  JLabel amountLabel     = new JLabel("Loan Amount:");
  JLabel monthlyPayLabel = new JLabel("Monthly Payment:");
  JLabel totalPayLabel   = new JLabel("Total Paymemt:");

  // Text Fields
  JTextField interestField   = new JTextField();
  JTextField yearsField      = new JTextField();
  JTextField amountField     = new JTextField();
  JTextField monthlyPayField = new JTextField();
  JTextField totalPayField   = new JTextField();

  // Calculate Button
  JButton calcBtn = new JButton("Calculate");


  public static void main(String[] args){
    new LoanCalculator();
  }

  public LoanCalculator(){


    // LABELS --------------------------------------

    // Lable Bounds
    interestLabel.setBounds(50,50,150,30);
    yearsLabel.setBounds(50,100,150,30);
    amountLabel.setBounds(50, 150, 150, 30);
    monthlyPayLabel.setBounds(50,200,150,30);
    totalPayLabel.setBounds(50,250,150,30);

    // Add Labels
    mainFrame.add(interestLabel);
    mainFrame.add(yearsLabel);
    mainFrame.add(amountLabel);
    mainFrame.add(monthlyPayLabel);
    mainFrame.add(totalPayLabel);


    // Text Fields  -------------------------------------

    // Text Fields Bounds
    interestField.setBounds(250,50,150,30);
    yearsField.setBounds(250,100,150,30);
    amountField.setBounds(250, 150, 150, 30);
    monthlyPayField.setBounds(250,200,150,30);
    totalPayField.setBounds(250,250,150,30);

    // Add Text Fields
    mainFrame.add(interestField);
    mainFrame.add(yearsField);
    mainFrame.add(amountField);
    mainFrame.add(monthlyPayField);
    mainFrame.add(totalPayField);

    // Set output fields to uneditable
    monthlyPayField.setEditable(false);
    totalPayField.setEditable(false);



    // Calc Button  -------------------------------------

    // Bounds
    calcBtn.setBounds(300,300,100,30);
    // Add to frame
    mainFrame.add(calcBtn);
    // Add ActionListener
    calcBtn.addActionListener(this);



    // Frame attributes
    mainFrame.setSize(500,500);
    mainFrame.setResizable(true);
    mainFrame.setLayout(null);
    mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
    mainFrame.setVisible(true);

  }

  public void actionPerformed(ActionEvent e){
    // Get Tex from intput
    String interestString = interestField.getText();
    String yearsString = yearsField.getText();
    String amountString = amountField.getText();

    // Convert to INTEGER

    double interest  = Double.parseDouble(interestString);
    int years     = Integer.parseInt(yearsString);
    int amount    = Integer.parseInt(amountString);

    int months    = 12;
    double monthsPay =  0;
    double totalPay  =  0;

    double i = interest/months;
    int n  =  years * months;

    // NEED TO TEST
    monthsPay = (i * amount) / (1-Math.pow(((1+i)),(-n)));
    totalPay = monthsPay * n;


    String totalPayString = String.valueOf(totalPay);
    String monthsPayString = String.valueOf(monthsPay);

    monthlyPayField.setText(monthsPayString);
    totalPayField.setText(totalPayString);







  }






}
