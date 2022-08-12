/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFour.ChapterTwo;

/**
 *
 * @author User
 */
public class BoboAndTheLockers {

    public static void main(String[] args) {
// true = open; false = closed
        boolean[] lockers = new boolean[1001]; //→6
// close all the lockers
        for (int i = 1; i <= 1000; i++) //→9
        {
            lockers[i] = false;
        }
        for (int skip = 1; skip <= 1000; skip++) //→12
        {
            System.out.println("Bobo is changing every "
                    + skip + " lockers.");
            for (int locker = skip; locker < 1000; //→16
                    locker += skip) {
                lockers[locker] = !lockers[locker]; //→18
            }
        }
        System.out.println("Bobo is bored"
                + " now so he's going home.");
// count and list the open lockers
        String list = "";
        int openCount = 0;
        for (int i = 1; i <= 1000; i++) //→27
        {
            if (lockers[i]) {
                openCount++;
                list += i + " ";
            }
        }
        System.out.println("Bobo left " + openCount
                + " lockers open.");
        System.out.println("The open lockers are: "
                + list);
    }
}

/*→6 This line sets up an array of booleans with 1,001 elements. I created one
more element than I needed so I could ignore element 0.
→9 This for loop closes all the lockers. This step isn’t really necessary
because booleans initialize to false, but being explicit about initialization
is good.
→12 Every iteration of this loop represents one complete trip through the
hallways opening and closing lockers. The skip variable represents how
many lockers Bobo skips on each trip. First he does every locker, then
every second locker, and then every third locker. So this loop simply
counts from 1 to 1,000.
→16 Every iteration of this loop represents one stop at a locker on a trip
through the hallways. This third expression in the for statement (on the
next line) adds the skip variable to the index variable so that Bobo can
access every nth locker on each trip through the hallways.
→18 This statement uses the not operator (!) to reverse the setting of each
locker. Thus, if the locker is open (true), it’s set to closed (false), and
vice versa.
→27 Yet another for loop spins through all the lockers and counts the ones
that are open. It also adds the locker number for each open locker to the
end of a string so that all the open lockers can be printed.*/
