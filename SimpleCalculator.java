import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {

    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");;
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonDivide = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDelete = new JButton("C");

    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);

    SimpleCalculator(){

        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        windowContent.add("North", displayField);
        JPanel p1 = new JPanel();
        GridLayout g1 = new GridLayout(4,3);
        p1.setLayout(g1);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        windowContent.add("Center", p1);

        JPanel p2 = new JPanel();
        GridLayout g2 = new GridLayout(5,1);
        p2.setLayout(g2);
        p2.add(buttonDelete);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonDivide);
        p2.add(buttonMultiply);

        windowContent.add("East", p2);

        JFrame frame = new JFrame("Simple Calculator");
        frame.setContentPane(windowContent);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        frame.setIconImage(getImage());

        CalculatorEngine calculatorEngine = new CalculatorEngine(this);
        button0.addActionListener(calculatorEngine);
        button1.addActionListener(calculatorEngine);
        button2.addActionListener(calculatorEngine);
        button3.addActionListener(calculatorEngine);
        button4.addActionListener(calculatorEngine);
        button5.addActionListener(calculatorEngine);
        button6.addActionListener(calculatorEngine);
        button7.addActionListener(calculatorEngine);
        button8.addActionListener(calculatorEngine);
        button9.addActionListener(calculatorEngine);
        buttonPoint.addActionListener(calculatorEngine);
        buttonPlus.addActionListener(calculatorEngine);
        buttonMinus.addActionListener(calculatorEngine);
        buttonDivide.addActionListener(calculatorEngine);
        buttonMultiply.addActionListener(calculatorEngine);
        buttonDelete.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);

    }
    private Image getImage(){
        ImageIcon icon = new ImageIcon("calculator.png");
        return icon.getImage();
    }
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
    }
}