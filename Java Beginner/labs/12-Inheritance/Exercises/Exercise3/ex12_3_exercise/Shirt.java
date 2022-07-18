package ex12_3_exercise;

public class Shirt extends Item{
    private char colorCode;
    private char size;

    public Shirt(double price, char colorCode, char size) {
        super("Shirt", price);
        this.setSize(size);
        this.setColorCode(colorCode);
    }

    public void display() {
        super.display();
        System.out.println("Size : " + getSize());
        System.out.println("Color Code: " + getColorCode());
    }

    // Code a public getColor method that converts the colorCode to a the color name
    // Use a switch statement.  Return the color name. 
    public String getColor() {
        
        String color = " ";
        switch (colorCode) {
            case 'R':
                color = "Red";
                break;
            case 'B':
                color = "Black";
                break;
            case 'W':
                color = "White";
                break;
            case 'G':
                color = "Green";
                break;
            default:
                color = "Invalid Color Code!";
        }
        return color;
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
