
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
         String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 12.30;
        double tax = 3.50;
        int quantity = 5;
        
        // Modify message to include quantity 
        String message1 = (custName + " wants to buy " + quantity + " " + itemDesc + "'s" + " for R" + price + " each.");
        System.out.println(message1);
        
        // Calculate total and then print the total cost
        double total = (price * quantity) + (tax * quantity);
        String message2 = ("The total is: R" + total);
        System.out.println(message2);
    }    
}
