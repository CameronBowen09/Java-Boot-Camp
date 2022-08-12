/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
public class LaunchEventNew implements Runnable {

    private String message;

    public LaunchEventNew(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}
