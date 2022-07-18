package ex12_3_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item item = new Shirt(25.99, 'M', 'G');

        // Test for non-Shirt object type
        //  Item item = new Item();
        
        // call the display method on the object, then the getColor method
        item.display();
        if (item instanceof Shirt) {
            String color = ((Shirt) item).getColor();
            System.out.println("Color: " + color);
        }else System.out.println("Item is not a Shirt.");
    }
}
