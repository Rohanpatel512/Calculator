import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorLayout extends ProgramCalculator {
    
    // Class Variables 
    private JFrame window = new JFrame();
    
    private JPanel programPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    
    private JTextField numbers = new JTextField();
    
    private JButton[] buttons = new JButton[16];

    
    
    // Use method to create the window
    public void createWindow() {
        
        // Create the window 
        window.setTitle("Calculator");
        window.setSize(350, 450);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
    }
    
    public void createComponents() {
                
        // Set layout to all panels 
        programPanel.setLayout(new BorderLayout());
        buttonPanel.setLayout(new GridLayout(4, 4));
       
        
        // Create an instance of color and font object, then store in variable
        Color operatorColor = new Color(232, 129, 56);
        Font buttonFont = new Font("Sans Serif", Font.BOLD, 20);
        Font fontType = new Font("Sans Serif", Font.PLAIN, 60);
        
        // Set font, size, font color, background color of text box 
        numbers.setFont(fontType);
        numbers.setForeground(Color.white);
        numbers.setBackground(Color.black);
        numbers.setColumns(360);
        
              
        // Loop through the values array 
        for(int i = 0; i < buttons.length; i++) {

            // Create a new button and store in variable 
            buttons[i] = new JButton();
                
            // Set the value of the button and command 
            buttons[i].setText(buttonValues[i]);
            buttons[i].setActionCommand(buttonValues[i]);
            buttons[i].setForeground(Color.white);
            buttons[i].setBorderPainted(false);
            buttons[i].setFont(buttonFont);
            
                
            // Check if value is an operator 
            if(buttonValues[i].equals("+") || buttonValues[i].equals("-")) {
                // Set the background color of operators to orange 
                buttons[i].setBackground(operatorColor);
                
            } else if(buttonValues[i].equals("/") || buttonValues[i].equals("X")) {
                // Set background color of operators to orange 
                buttons[i].setBackground(operatorColor);
                
            } else {
                // Set backgruond color of other buttons to gray 
                buttons[i].setBackground(Color.gray);
            }
            
            // Add all buttons inside button panel      
            buttonPanel.add(buttons[i]);
        }

        // Add button panel inside a frame 
        programPanel.add(numbers, BorderLayout.NORTH);
        programPanel.add(buttonPanel, BorderLayout.CENTER);
        
        // Add the main frame into the window 
        window.add(programPanel);
        
        // Create an instance of a class to check for any button clicks 
        ButtonClicked numbersClicked = new ButtonClicked(buttons, numbers);
    }
    
   
    
           
 }

