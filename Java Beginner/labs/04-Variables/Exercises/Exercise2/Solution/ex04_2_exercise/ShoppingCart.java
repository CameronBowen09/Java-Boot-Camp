
package ex04_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total
        // Do not initialize total.
        double price = 29.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        
        // Modify message to include quantity.
        message = custName+" wants to purchase "+quantity+ " "+itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost.
        total = quantity * price * tax;
        
        System.out.println("Total cost with tax: "+total);
    }
    
}
