
package ex07_1_exercise;

public class ShoppingCart {
    
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        System.out.println("Index of the space: ");
        spaceIdx = custName.indexOf(" ");
        System.out.println(spaceIdx);
        
        // Use the substring method parse out the first name and print it.
        System.out.println("\nThe first name in the string:  ");
        firstName = custName.substring(0,spaceIdx);
        System.out.println(firstName);
    }
}
