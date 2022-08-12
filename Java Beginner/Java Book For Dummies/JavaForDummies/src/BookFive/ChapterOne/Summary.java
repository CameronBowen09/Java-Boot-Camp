/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
public class Summary {
    public static void main(String[] args) {
        System.out.println("Threads are used to run multiple tasks at once");
        System.out.println("");
        System.out.println("»»Web browsers can download files while letting you view web pages. When you\n" +
"download a file in a web browser, the browser starts a separate thread to\n" +
"handle the download.\n" +
"»»Email programs don’t make you wait for all your messages to download\n" +
"before you can read the first message. Instead, these programs use separate\n" +
"threads to display and download messages.\n" +
"»»Word processors can print long documents in the background while you\n" +
"continue to work. These programs start a separate thread to handle print\n" +
"jobs.\n" +
"»»Word processors can also check your spelling as you type. Depending on how\n" +
"the word processor is written, it may run the spell check in a separate thread.\n" +
"»»Game programs commonly use several threads to handle different parts of\n" +
"the game to improve the overall responsiveness of the game.\n" +
"»»All GUI-based programs use at least two threads — one thread to run the\n" +
"application’s main logic and another thread to monitor mouse and keyboard\n" +
"events. You find out about creating GUI programs in Java in Book 6.\n" +
"»»Indeed, the Java Virtual Machine itself uses threading for some of its housekeeping\n" +
"chores. The garbage collector, for example, runs as a separate thread\n" +
"so it can constantly monitor the state of the VM’s memory and decide when it\n" +
"needs to create some free memory by removing objects that are no longer\n" +
"being used.");
    }
}
