/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcart;

/**
 *
 * @author User
 */
public class Shirt extends Item{
    
    private char colorCode;
    private char size;
    
    public Shirt(double price, char colorCode, char size) {
        super("Shirt", price);
        this.setSize(size);
        this.setColorCode(colorCode);
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