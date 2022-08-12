/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
public class CountDownApp2 {
    //Print Statement may vary a bit becuase some threads can finish task before other one

    public static void main(String[] args) {
        Thread clock = new CountDownClock(); //→5
        Runnable flood, ignition, liftoff; //→7
        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");
        clock.start(); //→12
        new Thread(flood).start(); //→14
        new Thread(ignition).start();
        new Thread(liftoff).start();        
    }
    
    // Improved Code
    /*public static void main(String[] args)
    {
        Thread clock = new CountDownClock();
        ArrayList<Runnable> events
        = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16, "Flood the pad!"));
        events.add(new LaunchEvent(6, "Start engines!"));
        events.add(new LaunchEvent(0, "Liftoff!"));
        clock.start();
        for (Runnable e : events)
        new Thread(e).start();
    }*/
    
}


/*→5 The main method starts by creating an instance of the Count DownClock
class and saving it in the clock variable.
→7 Next, it creates three LaunchEvent objects to flood the pad at 16
seconds, start the engines at 6 seconds, and lift off at 0 seconds. These
objects are assigned to variables of type Runnable named flood,
ignition, and liftoff.
→12 The clock thread is started. The countdown starts ticking.
→14 Finally, the program starts the three LaunchEvent objects as threads.
It does this by creating a new instance of the Thread class, passing the
LaunchEvent objects as parameters to the Thread constructor, and then
calling the start method to start the thread.
Note that because this program doesn’t need to do anything with these
threads after they’re started, it doesn’t bother creating variables for
them.*/
