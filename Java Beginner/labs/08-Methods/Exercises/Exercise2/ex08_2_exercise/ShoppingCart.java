
package ex08_2_exercise;


public class ShoppingCart {
    
    public static void main(String[] args) {
        
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Shirt", 2, 10);
        item1.displayItem();
        
        // Call the 4-arg setItemFields method, checking the return value.  
        item1.setItemFields("Shirt", 2, 10, 'B');
        item1.displayItem();

	// Test your code for both valid and invalid values
        // Tested for valid and invalid values and it works
 
        
        
    }
}
