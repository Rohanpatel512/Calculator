import javax.swing.*;
import java.awt.*;

/**
 * Represents the window frame 
 * @author Rohan
 */
public class Window extends JFrame {
    
    // Fields 
    private JTextField inputField = new JTextField();
    private JButton[] buttons = new JButton[16];
    private JPanel buttonPanel = new JPanel();
    
    private String values = "7 8 9 / 4 5 6 x 1 2 3 - C 0 = +";
    private String operators = "/x-+";
    
    /**
     * Constructs the window 
     */
    public Window() {
        this.setTitle("Calculator");
        this.setSize(400, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.WHITE);
        
        addFrames();
        addButtons();
        addInputFields();
    }
    
    
    /**
     * Designs and adds frames to the window frame
     */
    private void addFrames() {
        
        // Set the layout of the panel 
        this.buttonPanel.setLayout(new GridLayout(4, 4));
        
        // Set the dimensions of the panel 
        this.buttonPanel.setPreferredSize(new Dimension(400, 400));
        
        // Add the frame to the window 
        this.add(this.buttonPanel, BorderLayout.PAGE_END);
    }
    
    /**
     * Design and add input fields to the window frame 
     */
    private void addInputFields() {
        
        // Make sure it is uneditable
        this.inputField.setEditable(false);
        
        // Set the font of the input field 
        this.inputField.setFont(new Font("Sans Serif", Font.PLAIN, 50));
        
        // Add the input field to the top of the window 
        this.add(this.inputField, BorderLayout.PAGE_START);
    }
    
    /**
     * Design and add buttons to the window frame
     */
    private void addButtons() {
       
        String[] valuesArray = values.split(" ");
        
        // Loop through the buttons array 
        for(int i = 0; i < this.buttons.length; i++) {
            // Create a new button 
            this.buttons[i] = new JButton();
            
            // Assign the button a value and value it returns when clicked 
            this.buttons[i].setText(valuesArray[i]);
            this.buttons[i].setActionCommand(valuesArray[i]);
             
            // Set the color of the text and size of text
            this.buttons[i].setForeground(Color.WHITE);
            this.buttons[i].setFont(new Font("Sans Serif", Font.BOLD, 30));
            
            // Check if button is an operation button 
            if(operators.contains(valuesArray[i])) {
                // Set the background of button to orange 
                this.buttons[i].setBackground(new Color(255, 153, 0));
            } else {
                // Set the background of button to dark gray 
                this.buttons[i].setBackground(new Color(51, 51, 51));
            }
            
            // Place each button inside window frame 
            this.buttonPanel.add(this.buttons[i]);
        }
    }
    
    /**
     * Access to the buttons 
     * @return buttons 
     */
    public JButton[] getButtons() {
        return this.buttons;
    }
    
    /**
     * Access to the input field 
     * @return input field 
     */
    public JTextField getInputField() {
        return this.inputField;
    }
}
