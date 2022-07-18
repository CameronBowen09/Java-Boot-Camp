package ex08_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {

        Item item1 = new Item();

        // Call the setColor method on item1. Print the new color value from
        // item1 if the method returns true.  Otherwise print an "invalid color"
        // message.
        if (item1.setColor('B')) {
            System.out.println("Is a valid color!");
        } else {
            System.out.println("Is not a valid color!");
        }

        // Test the class, using both valid and invalid colors.
        // Tested both valid and invalid and it works
    }
}
