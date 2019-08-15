
import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener{

  JFrame mainFrame = new JFrame("Calculator App");

  JPanel panel = new JPanel();
  JButton calcBtn = new JButton("Calculate");

  JTextField value1Field = new JTextField();
  JTextField value2Field = new JTextField();
  JTextField sumField    = new JTextField();

  JLabel value1Label = new JLabel("First Value:");
  JLabel value2Label = new JLabel("Second Value:");
  JLabel sumLabel = new JLabel("Sum is:");


  public static void main(String[] args){
    new App();
  }

  public App(){




    value1Label.setBounds(50,50,100,30);
    value2Label.setBounds(50,100,100,30);
    sumLabel.setBounds(50, 150, 100, 30);

    value1Field.setBounds(150,55,100,20);
    value2Field.setBounds(150,105,100,20);
    sumField.setBounds(150,150,100,20);

    calcBtn.setBounds(150,200,100,30);

    sumField.setEditable(false);
    calcBtn.addActionListener(this);



    mainFrame.add(value1Label);
    mainFrame.add(value2Label);
    mainFrame.add(sumLabel);
    mainFrame.add(value1Field);
    mainFrame.add(value2Field);
    mainFrame.add(sumField);
    mainFrame.add(calcBtn);



    mainFrame.setSize(400,300);
    mainFrame.setResizable(true);
    mainFrame.setLayout(null);
    mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
    mainFrame.setVisible(true);
  }


  public void actionPerformed(ActionEvent e){
    String value1string = value1Field.getText();
    String value2string = value2Field.getText();

    int value1 = Integer.parseInt(value1string);
    int value2 = Integer.parseInt(value2string);
    int sum = 0;

    sum = value1 + value2;
    String sumString = String.valueOf(sum);
    sumField.setText(sumString);


  }






}
