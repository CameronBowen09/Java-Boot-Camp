/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
public class CountDownClock extends Thread //→1
{

    public void run() //→3
    {
        for (int t = 20; t >= 0; t--) //→5
        {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000); //→10
            } catch (InterruptedException e) {
            }
        }
    }
}
/*→1 The CountDownClock class extends the Thread class. Thread is defined
in the java.language package, so you don’t have to provide an import
statement to use it.
→3 The CountDownClock class has a single method, named run. This
method is called by Java when the clock thread has been started. All the
processing done by the thread must either be in the run method or in
some other method called by the run method.
→5 The run method includes a for loop that counts down from 20 to 0.
→10 The CountDownClock class uses the sleep method to pause for 1
second. Because the sleep method throws Interrupted Exception, a
try/catch statement handles this exception. If the exception is caught, it
is simply ignored.*/
