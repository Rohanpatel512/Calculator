
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
public class ButtonClicked extends ProgramCalculator {

    ButtonClicked(JButton[] buttons, JTextField numbers) {
        
        // Loop through all the buttons 
        for(int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   
                    // Get action command from button and store in variable 
                    String digit = e.getActionCommand();
                   
                    
                    // Output the number to user 
                    numbers.setText(numberOne);
                    
                    // Loop through the operator array 
                    for(int j = 0; j < operators.length; j++) {
                        // Check if any operators is clicked 
                        if(digit.equals(operators[j])) {
                            // Assign value of number one to number two 
                            numberTwo = numberOne;
                            numberOne = "";
                            
                            // Assign the value of operator to variable 
                            operator = digit;
                            digit = "";
                            
                            // Recreate numberOne variable
                            numberOne = "";
                             
                            // Empty out the text box 
                            numbers.setText("");
                             
                            // Output the operator to user 
                            numbers.setText(operator);
                        }
                    }
                    
                    // Check if equals button hasn't been pressed yet 
                    if(digit.equals("=") == false && digit.equals("C") == false) {
                        // Call method to store digits inside string
                       inputNumber = storeDigits(digit);
                       
                       // Output the number to user 
                       numbers.setText(inputNumber);
                    }
                    
                    // Check if equals button is clicked 
                    if(digit.equals("=")) {
                        
                        // Call method to sum up the total 
                        String total = calculateTotal(operator);
                        
                        // Output the total to user 
                        numbers.setText(total);
                        
                    } else if(digit.equals("C")) {                
                        
                        // Call method to delete last digit 
                        inputNumber = deleteLastDigit();
                        
                        // Output the current number to user 
                        numbers.setText(inputNumber);
                    }
                }
            });
        }
    }
    
}
