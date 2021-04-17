import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents the application 
 * @author Rohan
 */
public class App implements ActionListener {
    
    // Fields 
    private Window frame;
    private Operation calculate;
    
    private String firstValue = "";
    private String secondValue = "";
    private String operator = "";
    private String operators = "+-x/";
    
    private double total = 0;
    
    /**
     * Constructs the application 
     */
    public App() {
        this.frame = new Window();
        this.calculate = new Operation();
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operator = operator;
        this.total = total;
        
        // Call method(s) within class 
        addClicks();
    }
    
    /**
     * Add clicks to each button 
     */
    private void addClicks() {
        // Get all the buttons
        JButton[] buttons = this.frame.getButtons();
        
        // Loop through each button 
        for(int i = 0; i < buttons.length; i++) {
            // Add an action listener to each button 
            buttons[i].addActionListener(this);
        }
    }
    
    /**
     * Checks what operator was clicked 
     */
    private void checkOperator() {
      
        // Check which operator was clicked 
        switch(operator) {
            case "+":
                // Add both values 
                this.total = this.calculate.sum(this.firstValue, this.secondValue);
                break;
            case "-":
                // Subtract both values 
                this.total = this.calculate.subtract(this.firstValue, this.secondValue);
                break;
            case "x":
                // Multiply both values 
                this.total = this.calculate.multiply(this.firstValue, this.secondValue);
                break;
            case "/":
                // Divide both values 
                this.total = this.calculate.divide(this.firstValue, this.secondValue);
                break;
            default:
        }
        
        // Display the total to user 
        displayTotal();
    }
    
    /**
     * Displays the total to user  
     */
    private void displayTotal() {
        // Turn the total into a string 
        String answer = String.valueOf(this.total);
        
        // Get the input field 
        JTextField inputField = this.frame.getInputField();
        
        // Display the answer to user 
        inputField.setText(answer);
    }
    
    /**
     * Displays the numbers being clicked
     */
    private void displayInput() {
        // Get the input field 
        JTextField inputField = this.frame.getInputField();
        
        // Display the digits and operators clicked to user 
        inputField.setText(this.firstValue);
    }
    
    /**
     * Clears up everything 
     */
    private void clear() {
        // Recreate all data type variables 
        this.firstValue = "";
        this.secondValue = "";
        this.operator = "";
        this.total = 0;
        
        // Get the input field 
        JTextField inputField = this.frame.getInputField();
        
        // Empty the input field 
        inputField.setText("");
        
    }

    /**
     * Method emitted when a button is clicked 
     * @param e 
     */
    public void actionPerformed(ActionEvent e) {
       
        // Get the buttons value 
        String value = e.getActionCommand();
        
        // Check if an operator was clicked 
        if(operators.contains(value)) {
            // Store the value inside the operator 
            this.operator = value;
            
            // Store the first value inside second 
            this.secondValue = this.firstValue;
            this.firstValue = "";
            
        } else if(!operators.contains(value) && !value.equals("=") && !value.equals("C")){
            // Keep adding values to the first value 
            this.firstValue += value;  
            
            // Display the number being inputed to user 
            displayInput();
            
        } else if(value.equals("=")) {
            // Call method to check which operator was clicked 
            checkOperator();
        } else if(value.equals("C")) {
            // Call method to clear everything 
            clear();
        }
    } 
}
