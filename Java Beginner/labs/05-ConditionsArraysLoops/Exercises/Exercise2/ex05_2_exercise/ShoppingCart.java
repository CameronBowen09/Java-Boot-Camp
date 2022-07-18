
package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        
        //Declare and initialize the items String array
        String[] items = new String[4];
        items[0] = "Shirt";
        items[1] = "Pant";
        items[2] = "Shoe";
        items[3] = "Hat";
        
        // Change message to show the number of items purchased.
        String message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);
        
        // Print an element from the items array. 
        System.out.println("The last item is: " + items[3]);
    }
}
