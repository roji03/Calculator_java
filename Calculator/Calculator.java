import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
  String valueone, SubV, MulV, DivV;
  Boolean OpClicked = false;
  JLabel displaylabel;
  JButton sevenb;
  JButton eightb;
  JButton nineb;
  JButton fourb;
  JButton fiveb;
  JButton sixb;
  JButton oneb;
  JButton twob;
  JButton threeb;
  JButton zerob;
  JButton dotb;
  JButton equalb;
  JButton divb;
  JButton mulb;
  JButton subb;
  JButton addb;
  JButton perb;
  JButton clearb;
  int a;

  public Calculator() {
    JFrame jf = new JFrame("Calculator");
    jf.setLayout(null);

    displaylabel = new JLabel();
    displaylabel.setBounds(30, 50, 450, 50);
    displaylabel.setBackground(Color.white);
    displaylabel.setOpaque(true);
    displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displaylabel.setForeground(Color.black);
    jf.add(displaylabel);

    sevenb = new JButton("7");
    sevenb.setBounds(30, 120, 80, 80);
    sevenb.setBackground(Color.white);
    sevenb.setOpaque(true);
    sevenb.addActionListener(this);
    jf.add(sevenb);

    eightb = new JButton("8");
    eightb.setBounds(130, 120, 80, 80);
    eightb.setBackground(Color.white);
    eightb.setOpaque(true);
    eightb.addActionListener(this);
    jf.add(eightb);

    nineb = new JButton("9");
    nineb.setBounds(230, 120, 80, 80);
    nineb.setBackground(Color.white);
    nineb.setOpaque(true);
    nineb.addActionListener(this);
    jf.add(nineb);

    fourb = new JButton("4");
    fourb.setBounds(30, 220, 80, 80);
    fourb.setBackground(Color.white);
    fourb.setOpaque(true);
    fourb.addActionListener(this);
    jf.add(fourb);

    fiveb = new JButton("5");
    fiveb.setBounds(130, 220, 80, 80);
    fiveb.setBackground(Color.white);
    fiveb.setOpaque(true);
    fiveb.addActionListener(this);
    jf.add(fiveb);

    sixb = new JButton("6");
    sixb.setBounds(230, 220, 80, 80);
    sixb.setBackground(Color.white);
    sixb.setOpaque(true);
    sixb.addActionListener(this);
    jf.add(sixb);

    oneb = new JButton("1");
    oneb.setBounds(30, 320, 80, 80);
    oneb.setBackground(Color.white);
    oneb.setOpaque(true);
    oneb.addActionListener(this);
    jf.add(oneb);

    twob = new JButton("2");
    twob.setBounds(130, 320, 80, 80);
    twob.setBackground(Color.white);
    twob.setOpaque(true);
    twob.addActionListener(this);
    jf.add(twob);

    threeb = new JButton("3");
    threeb.setBounds(230, 320, 80, 80);
    threeb.setBackground(Color.white);
    threeb.setOpaque(true);
    threeb.addActionListener(this);
    jf.add(threeb);

    zerob = new JButton("0");
    zerob.setBounds(30, 420, 80, 80);
    zerob.setBackground(Color.white);
    zerob.setOpaque(true);
    zerob.addActionListener(this);
    jf.add(zerob);

    dotb = new JButton(".");
    dotb.setBounds(130, 420, 80, 80);
    dotb.setBackground(Color.white);
    dotb.setOpaque(true);
    dotb.addActionListener(this);
    dotb.setFont(new Font("Arial", Font.PLAIN, 40));
    jf.add(dotb);

    equalb = new JButton("=");
    equalb.setBounds(230, 420, 80, 80);
    equalb.setBackground(Color.yellow);
    equalb.setOpaque(true);
    equalb.addActionListener(this);
    jf.add(equalb);

    divb = new JButton("/");
    divb.setBounds(330, 120, 80, 80);
    divb.setBackground(Color.white);
    divb.setOpaque(true);
    divb.addActionListener(this);
    jf.add(divb);

    mulb = new JButton("x");
    mulb.setBounds(330, 220, 80, 80);
    mulb.setBackground(Color.white);
    mulb.setOpaque(true);
    mulb.addActionListener(this);
    jf.add(mulb);

    subb = new JButton("-");
    subb.setBounds(330, 320, 80, 80);
    subb.setBackground(Color.white);
    subb.setOpaque(true);
    subb.addActionListener(this);
    jf.add(subb);

    addb = new JButton("+");
    addb.setBounds(330, 420, 80, 80);
    addb.setBackground(Color.white);
    addb.setOpaque(true);
    addb.addActionListener(this);
    jf.add(addb);

    clearb = new JButton("AC");
    clearb.setBounds(420, 320, 50, 180);
    clearb.setBackground(Color.yellow);
    clearb.setOpaque(true);
    clearb.addActionListener(this);
    jf.add(clearb);

    jf.setSize(500, 550);
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
    if (e.getSource() == sevenb) {
      if (OpClicked == true) {
        displaylabel.setText("7");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "7");
      }

    } else if (e.getSource() == eightb) {
      if (OpClicked == true) {
        displaylabel.setText("8");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "8");
      }

    } else if (e.getSource() == nineb) {
      if (OpClicked == true) {
        displaylabel.setText("9");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "9");
      }
    } else if (e.getSource() == fourb) {
      if (OpClicked == true) {
        displaylabel.setText("4");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "4");
      }
    } else if (e.getSource() == fiveb) {
      if (OpClicked == true) {
        displaylabel.setText("5");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "5");
      }
    } else if (e.getSource() == sixb) {
      if (OpClicked == true) {
        displaylabel.setText("6");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "6");
      }
    } else if (e.getSource() == oneb) {
      if (OpClicked == true) {
        displaylabel.setText("1");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "1");
      }
    } else if (e.getSource() == twob) {
      if (OpClicked == true) {
        displaylabel.setText("2");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "2");
      }
    } else if (e.getSource() == threeb) {
      if (OpClicked == true) {
        displaylabel.setText("3");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "3");
      }
    } else if (e.getSource() == zerob) {
      if (OpClicked == true) {
        displaylabel.setText("0");
        OpClicked = false;
      } else {
        displaylabel.setText(displaylabel.getText() + "0");
      }
    } else if (e.getSource() == dotb) {
      displaylabel.setText(displaylabel.getText() + ".");
    } else if (e.getSource() == clearb) {
      displaylabel.setText("");
    } else if (e.getSource() == addb) {
      a = '+';

      OpClicked = true;
      valueone = displaylabel.getText();
    } else if (e.getSource() == subb) {
      a = '-';
      OpClicked = true;
      SubV = displaylabel.getText();

    } else if (e.getSource() == mulb) {
      a = 'x';
      OpClicked = true;
      MulV = displaylabel.getText();

    } else if (e.getSource() == divb) {
      a = 'd';
      OpClicked = true;
      DivV = displaylabel.getText();
    } else if (e.getSource() == equalb) {
      if (a == '+') {
        String valuetwo = displaylabel.getText();
        Float valueoneM = Float.parseFloat(valueone);
        Float valuetwoM = Float.parseFloat(valuetwo);
        Float ResultAdd = valueoneM + valuetwoM;
        displaylabel.setText(ResultAdd + "");
      } else if (a == '-') {
        String SvTwo = displaylabel.getText();
        Float SubVM = Float.parseFloat(SubV);
        Float SvTwoM = Float.parseFloat(SvTwo);
        Float ResultSub = SubVM - SvTwoM;
        displaylabel.setText(ResultSub + "");

      } else if (a == 'x') {
        String MvTwo = displaylabel.getText();
        Float MuvM = Float.parseFloat(MulV);
        Float MvtwoM = Float.parseFloat(MvTwo);
        Float ResultMul = MuvM * MvtwoM;
        displaylabel.setText(ResultMul + "");
      } else if (a == 'd') {
        String DvTwo = displaylabel.getText();
        Float DvM = Float.parseFloat(DivV);
        Float DvtwoM = Float.parseFloat(DvTwo);
        Float ResultDiv = DvM / DvtwoM;
        displaylabel.setText(ResultDiv + "");
      }
    }

  }
}