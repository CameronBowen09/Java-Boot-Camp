/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        RunnableClass rc = new RunnableClass();
        Thread t = new Thread(rc);
        t.start();

        /*Thread t = new Thread(new RunnableClass());
        t.start();*/
        
        /*or even just this:
        new Thread(new RunnableClass()).start();*/
    }
}
