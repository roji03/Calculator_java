import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
  JLabel displaylabel;
  String valueOne = "";
  String operator = "";
  boolean opClicked = false;

  public Calculator() {
    JFrame jf = new JFrame("Calculator");
    jf.setLayout(null);

    displaylabel = new JLabel();
    displaylabel.setBounds(30, 50, 420, 50);
    displaylabel.setOpaque(true);
    displaylabel.setBackground(Color.white);
    displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displaylabel.setFont(new Font("Arial", Font.BOLD, 24));
    jf.add(displaylabel);

    // Digits and operations in a loop
    String[] buttonLabels = {
      "7", "8", "9", "/", 
      "4", "5", "6", "x", 
      "1", "2", "3", "-", 
      "0", ".", "=", "+" 
    };

    int x = 30, y = 120;
    for (int i = 0; i < buttonLabels.length; i++) {
      JButton btn = new JButton(buttonLabels[i]);
      btn.setBounds(x, y, 80, 80);
      btn.setFont(new Font("Arial", Font.BOLD, 24));
      btn.setBackground(Color.white);
      btn.addActionListener(this);
      jf.add(btn);

      x += 100;
      if ((i + 1) % 4 == 0) {
        x = 30;
        y += 100;
      }
    }

    JButton clearb = new JButton("AC");
    clearb.setBounds(430, 120, 50, 280);
    clearb.setFont(new Font("Arial", Font.BOLD, 18));
    clearb.setBackground(Color.YELLOW);
    clearb.addActionListener(this);
    jf.add(clearb);

    jf.setSize(530, 550);
    jf.setLocation(450, 130);
    jf.getContentPane().setBackground(Color.black);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Calculator();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String command = ((JButton) e.getSource()).getText();

    if (command.matches("[0-9]")) {
      if (opClicked) {
        displaylabel.setText(command);
        opClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + command);
      }
    } else if (command.equals(".")) {
      if (!displaylabel.getText().contains(".")) {
        displaylabel.setText(displaylabel.getText() + ".");
      }
    } else if (command.equals("AC")) {
      displaylabel.setText("");
      valueOne = "";
      operator = "";
      opClicked = false;
    } else if (command.equals("=")) {
      if (!valueOne.isEmpty() && !operator.isEmpty()) {
        try {
          double num1 = Double.parseDouble(valueOne);
          double num2 = Double.parseDouble(displaylabel.getText());
          double result = 0;

          switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "x": result = num1 * num2; break;
            case "/":
              if (num2 == 0) {
                displaylabel.setText("Error");
                return;
              } else {
                result = num1 / num2;
              }
              break;
          }

          displaylabel.setText(String.valueOf(result));
          valueOne = "";
          operator = "";
        } catch (NumberFormatException ex) {
          displaylabel.setText("Invalid");
        }
      }
    } else {
      // operator button
      valueOne = displaylabel.getText();
      operator = command;
      opClicked = true;
    }
  }
}
