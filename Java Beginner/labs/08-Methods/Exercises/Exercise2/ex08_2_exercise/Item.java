package ex08_2_exercise;

public class Item {

    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", " + colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItemFields(String description, int quantity, double price) {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemFields(String desc, int qty, double pr, char color) {

        if (color != ' ') {
            colorCode = color;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else return -1;
    }

}
