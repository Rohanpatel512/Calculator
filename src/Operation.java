/**
 * Represents all the calculations 
 * @author Rohan
 */
public class Operation {
  
    // Fields 
    private double sum;
    private double difference;
    private double product;
    private double divisor;
    
    /**
     * Construct the operation
     */
    public Operation() {
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this.divisor = divisor;
    }
    
    /**
     * Add both numbers 
     * @param the first value 
     * @param the second value 
     * @return the sum 
     */
    public double sum(String firstValue, String secondValue) {
        // Turn both string values into double 
        double firstInteger = Double.parseDouble(firstValue);
        double secondInteger = Double.parseDouble(secondValue);
        
        // Return the sum of both integers 
        return secondInteger + firstInteger;
    }
    
    /**
     * Subtract both numbers
     * @param the first value 
     * @param the second value 
     * @return the difference 
     */
    public double subtract(String firstValue, String secondValue) {
        // Turn both string values into double 
        double firstInteger = Double.parseDouble(firstValue);
        double secondInteger = Double.parseDouble(secondValue);
        
        // Return the difference of both integers 
        return secondInteger - firstInteger;
    }
    
    /**
     * Multiply both numbers
     * @param the first value
     * @param the second value 
     * @return the product 
     */
    public double multiply(String firstValue, String secondValue) {
        // Turn both string values into double 
        double firstInteger = Double.parseDouble(firstValue);
        double secondInteger = Double.parseDouble(secondValue);
        
        // Return the difference of both integers 
        return secondInteger * firstInteger;
    }
    
    /**
     * Divide both numbers 
     * @param the first value 
     * @param the second value 
     * @return the divisor 
     */
    public double divide(String firstValue, String secondValue) {
        // Turn both string values into double 
        double firstInteger = Double.parseDouble(firstValue);
        double secondInteger = Double.parseDouble(secondValue);
        
        // Return the difference of both integers 
        return secondInteger / firstInteger;
    }
    
}
