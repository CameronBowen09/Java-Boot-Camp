/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
public class LaunchEvent implements Runnable //→1
{

    private int start;
    private String message;

    public LaunchEvent(int start, String message) //→6
    {
        this.start = start;
        this.message = message;
    }

    public void run() {
        try {
            Thread.sleep(20000 - (start * 1000)); //→16
        } catch (InterruptedException e) {
        }
        System.out.println(message); //→20
    }
}
/*→1 This class implements the Runnable interface.
→6 The constructor accepts two parameters: an integer representing the
start time (in seconds) and a string message that’s displayed when the
time arrives. The constructor simply stores these parameter values in
private fields.
→16 In the run method, the Thread.sleep method is called to put the thread
to sleep until the desired countdown time arrives. The length of time that
the thread should sleep is calculated by the expression 20000 - (start
* 1000). The countdown clock starts at 20 seconds, which is 20,000
milliseconds. This expression simply subtracts the number of milliseconds
that corresponds to the desired start time from 20,000. Thus, if the
desired start time is 6 seconds, the sleep method sleeps for 14,000
milliseconds — that is, 14 seconds.
→20 When the thread wakes up, it displays the message passed via its
constructor on the console.*/
