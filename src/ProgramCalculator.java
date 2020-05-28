
public class ProgramCalculator {
    
    // Class Variables     
    static int firstNumber = 0;
    static int secondNumber = 0;
    static int total = 0;
    
    static String numberOne = "";
    static String numberTwo = "";
    static String values = "789/456X123-0C=+";
    static String[] buttonValues = values.split("");
    static String[] operators = {"+", "-", "X", "/"};
    static String operator = "";
    static String answer = "";
    static String inputNumber = "";
    
    public static void main(String[] args) {
        
        CalculatorLayout app = new CalculatorLayout();
        
        app.createWindow();
        app.createComponents();     
    }
    
    public static String calculateTotal(String operator) {
        
        // Turn both strings into integers and store in variable 
        firstNumber = Integer.parseInt(numberOne);
        secondNumber = Integer.parseInt(numberTwo);
        
        // Check what operator has been clicked 
        switch(operator) {
            case "+":
                total = secondNumber + firstNumber;
            break;
            case "-":
                total = secondNumber - firstNumber;
            break;
            case "X":
                total = secondNumber * firstNumber;
            break;
            case "/":
                total = secondNumber / firstNumber;
            break;
            default:
        }
        
        // Turn integer into string and store in variable 
       answer = String.valueOf(total);
       
       // Return the answer back to method 
       return answer;
    }
    
    public static String storeDigits(String digit) {
        // Store each digit inside string
        numberOne += digit;
        
        // Return string back to method
        return numberOne;
    }
    
    public static String deleteLastDigit() {
        
        // Get the length of the string 
        int length = numberOne.length();
        
        // Delete the last digit and store in variable 
        numberOne = numberOne.substring(0, length - 1);
        
        // Return the new number back to method 
        return numberOne;
        
    }
    
    
}
