
package ex07_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        
        long long1 = 99_000_000_000L;
        float flt1 = 13.5F;
        char ch1 = 'U';
        
	// Print the long variable.
	System.out.println("long1: "+long1);

        // Assign the long to the int and print the int variable.
        int1 = (int) long1; 
        System.out.println("Long assigned to int var: " + int1);
    }
}
