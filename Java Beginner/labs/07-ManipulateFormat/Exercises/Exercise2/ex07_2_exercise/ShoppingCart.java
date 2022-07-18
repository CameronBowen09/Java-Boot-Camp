
package ex07_2_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;

        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        // System.out.println(firstName);

        // Instantiate and initialize sb to firstName.
        StringBuilder ab = new StringBuilder(firstName);
        System.out.println("First Name: ");
        System.out.println(ab);

        // Put the full name back together, using StringBuilder append method.
        String lastName = custName.substring(spaceIdx + 1, custName.length());
        StringBuilder ac = new StringBuilder(lastName);
        StringBuilder fullName = ab.append(" " + lastName);

        // Check if it got the last name.
        System.out.println("\nLast Name: ");
        System.out.println(lastName);

        // Print the full name.
        System.out.println("\nFull Name: ");
        System.out.println(fullName);
    }
}
