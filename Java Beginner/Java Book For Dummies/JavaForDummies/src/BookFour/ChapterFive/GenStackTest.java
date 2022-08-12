/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFour.ChapterFive;

/**
 *
 * @author User
 */
public class GenStackTest {

    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<String>();
        System.out.println(
                "Pushing four items onto the stack.");
        gs.push("One");
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");
        System.out.println("There are "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
        System.out.println("There are still "
                + gs.size() + " items in the stack.\n");
        System.out.println("Popping everything:");
        while (gs.hasItems()) {
            System.out.println(gs.pop());
        }
        System.out.println("There are now "
                + gs.size() + " items in the stack.\n");
        System.out.println("The top item is: "
                + gs.peek() + "\n");
    }
}

/*  Output
Pushing four items onto the stack.
There are 4 items in the stack.
The top item is: Four
There are still 4 items in the stack.
Popping everything:
Four
Three
Two
One
There are now 0 items in the stack.
The top item is: null
*/
