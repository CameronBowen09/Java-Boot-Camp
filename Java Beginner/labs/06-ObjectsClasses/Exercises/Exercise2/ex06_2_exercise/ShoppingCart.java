
package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
          // Declare and initialize 2 Item objects
          Item item01 = new Item();
          Item item02 = new Item();

          // Print both item descriptions and run code.
          item01.desc = "Shirt";
          item02.desc = "Pants";
          System.out.println("Item 1: " + item01.desc);
          System.out.println("Item 2: " + item02.desc);

          // Assign one item to another and run it again.
          item01.desc = item02.desc;
          System.out.println("New Item 1 Description: ");
          System.out.println("Item 1: " + item01.desc);

     }
}
