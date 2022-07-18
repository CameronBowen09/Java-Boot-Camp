/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookTwo.ChapterTwo;

/**
 *
 * @author User
 */
public class ShadowApp {
    
    static int x;

    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = "
                + ShadowApp.x);
    }
    
    /*The class variable x is declared in line 4. Its scope is the entire class
body, from line 2 to line 17.
 The class variable x is assigned a value of 5 in line 8. Then this value is
printed to the console in line 9.
In line 10, a local variable named x is declared. The local variable shadows
the class variable x, so any reference to x through the end of this method
in line 15 refers to the local variable rather than the class variable.
The local variable x is initialized in line 11. At that point, the local variable x
comes into scope and remains in scope until the end of the method in line 15.
The System.out.println statement in line 12 prints the value of the
local variable x. Note that this statement is identical to the statement in
line 9, which printed the class variable x because the class variable had
not yet been shadowed.
While a class variable is shadowed, you can access it by specifying the class
name as shown in line 14. Here ShadowApp.x refers to the class variable.
When the main method ends in line 15, the class variable x is no longer
shadowed. */
    
}
