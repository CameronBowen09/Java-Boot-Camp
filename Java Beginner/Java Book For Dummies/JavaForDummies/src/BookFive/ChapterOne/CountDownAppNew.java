/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterOne;

/**
 *
 * @author User
 */
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class CountDownAppNew {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor pool
                = new ScheduledThreadPoolExecutor(25);
        Runnable flood, ignition, liftoff;
        flood = new LaunchEventNew("Flood the pad!");
        ignition = new LaunchEventNew("Start engines!");
        liftoff = new LaunchEventNew("Liftoff!");
        for (int t = 20; t >= 0; t--) {
            pool.schedule(new CountDownClockNew(t),
                    (long) (20 - t), TimeUnit.SECONDS);
        }
        pool.schedule(flood, 3L, TimeUnit.SECONDS);
        pool.schedule(ignition, 13L, TimeUnit.SECONDS);
        pool.schedule(liftoff, 19L, TimeUnit.SECONDS);
        pool.shutdown();
    }
}

/*»»Scheduled: Using this class, you can schedule a run of code for some
future time.
»»ThreadPool: This class typically creates several threads (a pool of threads) at
the same time. When you want to run some code, you grab an available
thread from the pool and use that thread to run your code.
»»Executor: An Executor executes something. No big surprise here!
*/
