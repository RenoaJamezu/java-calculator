import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalPanel extends Panel implements ActionListener {

    // Declaration of calculator buttons and text fields 
    JButton num1, num2, num3, num4 , num5 , num6, num7, num8, num9, num0, btnPlus, btnMinus, btnMulti, btnDiv, btnEqual, AC , Del, Per, point; 
    JTextField output, input;

    String total = "";          // String to store the total result
    String textinput = "";      // String to store the user input
    Double num_input;           // Variable to store the parsed numeric input
    


    // Contructs a new instance of the CalPanel class
    // Initializes the GUI components, sets their properties, and adds
    // action listeners to the buttons.
    CalPanel(){
        
        // Color definitions
        Color bgDark = new Color(24,33,42);
        Color bgPrimary = new Color(38,49,57);
        Color bgEqual = new Color(248,99,52);
        
        // Title label
        Label title = new Label("Calculator");
        title.setFont(new Font("Arial", 900, 30));
        title.setBounds(30, 30, 200, 30);

        // Input text field
        input = new JTextField();
        input.setBounds(10, 65 , 460 ,80);
        input.setFont(new Font("Arial", 700, 45));
        input.setBackground(bgPrimary);
        input.setForeground(Color.white);
        input.setBorder(null);
        input.setHorizontalAlignment(JTextField.RIGHT);
        input.setEditable(false);

        // Output text field
        output = new JTextField();
        output.setBounds(10, 150 , 460 ,80);
        output.setFont(new Font("Arial", 700, 45));
        output.setBackground(bgPrimary);
        output.setForeground(Color.white);
        output.setBorder(null);
        output.setHorizontalAlignment(JTextField.RIGHT);
        output.setEditable(false);


        // Row 1 buttons
        AC = new JButton("AC");
        AC.setFont(new Font("Arial", 700, 20));
        AC.setBounds(0,230, 125, 100);
        AC.setBackground(bgDark);
        AC.setForeground(Color.white);
        AC.setBorder(null);
        AC.setFocusable(false);

        Del = new JButton("Del");
        Del.setFont(new Font("Arial", 700, 20));
        Del.setBounds(125,230, 250, 100);
        Del.setBackground(bgDark);
        Del.setForeground(Color.white);
        Del.setBorder(null);
        Del.setFocusable(false);

        btnDiv = new JButton("/");
        btnDiv.setFont(new Font("Arial", 700, 20));
        btnDiv.setBounds(375,230, 125, 100);
        btnDiv.setBackground(Color.white);
        btnDiv.setForeground(Color.black);
        btnDiv.setBorder(null);
        btnDiv.setFocusable(false);

         // Row 2 buttons
        num7 = new JButton("7");
        num7.setFont(new Font("Arial", 700, 20));
        num7.setBounds(0,330, 125, 100);
        num7.setBackground(bgDark);
        num7.setForeground(Color.white);
        num7.setBorder(null);
        num7.setFocusable(false);
 
        num8 = new JButton("8");
        num8.setFont(new Font("Arial", 700, 20));
        num8.setBounds(125,330, 125, 100);
        num8.setBackground(bgDark);
        num8.setForeground(Color.white);
        num8.setBorder(null);
        num8.setFocusable(false);
 
        num9 = new JButton("9");
        num9.setFont(new Font("Arial", 700, 20));
        num9.setBounds(250,330, 125, 100);
        num9.setBackground(bgDark);
        num9.setForeground(Color.white);
        num9.setBorder(null);
        num9.setFocusable(false);
 
        btnMulti = new JButton("x");
        btnMulti.setFont(new Font("Arial", 700, 20));
        btnMulti.setBounds(375,330, 125, 100);
        btnMulti.setBackground(Color.white);
        btnMulti.setForeground(Color.black);
        btnMulti.setBorder(null);
        btnMulti.setFocusable(false);
        
        // Row 3 buttons
        num4 = new JButton("4");
        num4.setFont(new Font("Arial", 700, 20));
        num4.setBounds(0,430, 125, 100);
        num4.setBackground(bgDark);
        num4.setForeground(Color.white);
        num4.setBorder(null);
        num4.setFocusable(false);
 
        num5 = new JButton("5");
        num5.setFont(new Font("Arial", 700, 20));
        num5.setBounds(125,430, 125, 100);
        num5.setBackground(bgDark);
        num5.setForeground(Color.white);
        num5.setBorder(null);
        num5.setFocusable(false);
 
        num6 = new JButton("6");
        num6.setFont(new Font("Arial", 700, 20));
        num6.setBounds(250,430, 125, 100);
        num6.setBackground(bgDark);
        num6.setForeground(Color.white);
        num6.setBorder(null);
        num6.setFocusable(false);
 
        btnMinus = new JButton("-");
        btnMinus.setFont(new Font("Arial", 700, 20));
        btnMinus.setBounds(375,430, 125, 100);
        btnMinus.setBackground(Color.white);
        btnMinus.setForeground(Color.black);
        btnMinus.setBorder(null);
        btnMinus.setFocusable(false);

        // Row 4 buttons
        num1 = new JButton("1");
        num1.setFont(new Font("Arial", 700, 20));
        num1.setBounds(0,530, 125, 100);
        num1.setBackground(bgDark);
        num1.setForeground(Color.white);
        num1.setBorder(null);
        num1.setFocusable(false);
 
        num2 = new JButton("2");
        num2.setFont(new Font("Arial", 700, 20));
        num2.setBounds(125,530, 125, 100);
        num2.setBackground(bgDark);
        num2.setForeground(Color.white);
        num2.setBorder(null);
        num2.setFocusable(false);
 
        num3 = new JButton("3");
        num3.setFont(new Font("Arial", 700, 20));
        num3.setBounds(250,530, 125, 100);
        num3.setBackground(bgDark);
        num3.setForeground(Color.white);
        num3.setBorder(null);
        num3.setFocusable(false);
 
        btnPlus = new JButton("+");
        btnPlus.setFont(new Font("Arial", 700, 20));
        btnPlus.setBounds(375,530, 125, 100);
        btnPlus.setBackground(Color.white);
        btnPlus.setForeground(Color.black);
        btnPlus.setBorder(null);
        btnPlus.setFocusable(false);

        // Row 5 buttons
        num0 = new JButton("0");
        num0.setFont(new Font("Arial", 700, 20));
        num0.setBounds(0,630, 250, 100);
        num0.setBackground(bgDark);
        num0.setForeground(Color.white);
        num0.setBorder(null);
        num0.setFocusable(false);
 
        point = new JButton(".");
        point.setFont(new Font("Arial", 700, 20));
        point.setBounds(250,630, 125, 100);
        point.setBackground(bgDark);
        point.setForeground(Color.white);
        point.setBorder(null);
        point.setFocusable(false);
 
        btnEqual = new JButton("=");
        btnEqual.setFont(new Font("Arial", 700, 20));
        btnEqual.setBounds(375,630, 125, 100);
        btnEqual.setBackground(bgEqual);
        btnEqual.setForeground(Color.white);
        btnEqual.setBorder(null);
        btnEqual.setFocusable(false);



        // Action events
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        btnDiv.addActionListener(this);
        btnEqual.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMulti.addActionListener(this);
        btnPlus.addActionListener(this);
        point.addActionListener(this);
        AC.addActionListener(this);
        Del.addActionListener(this);





        this.setBackground(bgPrimary);
        this.setForeground(Color.white);

        // Adding buttons to the panel
        // top
        this.add(title);
        this.add(input);
        this.add(output);
        // Row 1
        this.add(AC);
        this.add(Del);
        this.add(btnDiv);
        // Row 2
        this.add(num9);
        this.add(num8);
        this.add(num7);
        this.add(btnMulti);
        // Row 3
        this.add(num4);
        this.add(num5);
        this.add(num6);
        this.add(btnMinus);
        // Row 4
        this.add(num1);
        this.add(num2);
        this.add(num3);
        this.add(btnPlus);
        // Row 5
        this.add(num0);
        this.add(point);
        this.add(btnEqual); 


        this.setLayout(null);
    }

    // Action performed by the buttons
    @Override
    public void actionPerformed(ActionEvent e) {

        
        String cal = e.getActionCommand();
        if(cal == "AC"){
            num_input = null;
            textinput = "";
            total = "";
            output.setText("");
        }
        if(cal == "Del"){

            if(textinput.length() != 0){
                textinput = textinput.substring(0, textinput.length()-1);
                total = "";
                output.setText("");
            }
        }
        if(cal.charAt(0) >= '0' && cal.charAt(0) <= '9' || cal.charAt(0) == '.' && textinput.charAt(textinput.length()-1) != '.'
        || cal.charAt(0) == '+' && !textinput.contains("+") && !textinput.contains("-") && !textinput.contains("/") && !textinput.contains("x")
        || cal.charAt(0) == '-' && !textinput.contains("+") && !textinput.contains("-") && !textinput.contains("/") && !textinput.contains("x")
        || cal.charAt(0) == '/' && !textinput.contains("+") && !textinput.contains("-") && !textinput.contains("/") && !textinput.contains("x")
        || cal.charAt(0) == 'x' && !textinput.contains("+") && !textinput.contains("-") && !textinput.contains("/") && !textinput.contains("x")
        ){
            textinput += cal;
        }


        if(cal == "+" || cal == "-" || cal == "x" || cal == "/"){ //check if the input is equal to the operators 
            if(!total.isEmpty()){ // check if the total is empty
                if(total.contains(".")){//check if the total contains decimal point 
                    if(total.charAt(total.length()-1) == '0'){
                        total = total.substring(0, total.length()-2);
                    }
                }
                textinput = total + cal;
                output.setText("");
            }
        }

        if(cal == "="){
            try {
                if(textinput.contains("+")){
                    String arrayOfInput[] = textinput.split("\\+");
                    num_input = (Double.parseDouble(arrayOfInput[0]) + Double.parseDouble(arrayOfInput[1]));
                    total = Double.toString(num_input);
                    output.setText(total);
                }
                if(textinput.contains("x")){
                    String arrayOfInput[] = textinput.split("x");
                    num_input = (Double.parseDouble(arrayOfInput[0]) * Double.parseDouble(arrayOfInput[1]));
                    total = Double.toString(num_input);
                    output.setText(total);
                }
                if(textinput.contains("-")){
                    String arrayOfInput[] = textinput.split("\\-");
                    num_input = (Double.parseDouble(arrayOfInput[0]) - Double.parseDouble(arrayOfInput[1]));
                    total = Double.toString(num_input);
                    output.setText(total);
                }
                if(textinput.contains("/")){
                    String arrayOfInput[] = textinput.split("\\/");
                    if(Double.parseDouble(arrayOfInput[1]) == 0){
                        output.setText("Cannot be divided by 0");
                    }else{
                    num_input = (Double.parseDouble(arrayOfInput[0]) / Double.parseDouble(arrayOfInput[1]));
                    total = Double.toString(num_input);
                    output.setText(total);
                    }
                }
            } catch (Exception q) {
                output.setText("Error");
            }
        }
    
        if(total.contains(".")){
            if(total.charAt(total.length()-1) == '0'){
                total = total.substring(0, total.length()-2);
                output.setText(total);
            }
        }      

    if(cal != "="){
        try {
            if(textinput.contains("+")){
                String arrayOfInput[] = textinput.split("\\+");
                num_input = (Double.parseDouble(arrayOfInput[0]) + Double.parseDouble(arrayOfInput[1]));
                total = Double.toString(num_input);
                input.setText(total);
            }
            if(textinput.contains("x")){
                String arrayOfInput[] = textinput.split("x");
                num_input = (Double.parseDouble(arrayOfInput[0]) * Double.parseDouble(arrayOfInput[1]));
                total = Double.toString(num_input);
                input.setText(total);
            }
            if(textinput.contains("-")){
                String arrayOfInput[] = textinput.split("\\-");
                num_input = (Double.parseDouble(arrayOfInput[0]) - Double.parseDouble(arrayOfInput[1]));
                total = Double.toString(num_input);
                input.setText(total);
            }
            if(textinput.contains("/")){
                String arrayOfInput[] = textinput.split("\\/");
                if(Double.parseDouble(arrayOfInput[1]) == 0){
                    input.setText("Cannot be divided by 0");
                }else{
                num_input = (Double.parseDouble(arrayOfInput[0]) / Double.parseDouble(arrayOfInput[1]));
                total = Double.toString(num_input);
                input.setText(total);
                }
            }
        } catch (Exception q) {
            output.setText("");
        }
    }

    input.setText(textinput);
  
}
    
}
