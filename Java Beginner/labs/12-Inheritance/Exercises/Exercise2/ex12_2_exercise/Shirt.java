package ex12_2_exercise;

public class Shirt extends Item{
    
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    
    // Override display() in the superclass to also show size and colorCode.
    //   Avoid duplicating code.
    public void display(){
        super.display();
        System.out.println("Size : " + getSize());
        System.out.println("Color Code: " + getColorCode());
    }
    
    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
