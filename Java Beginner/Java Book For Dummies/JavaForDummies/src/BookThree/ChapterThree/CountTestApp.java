/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterThree;

/**
 *
 * @author User
 */
//One common use for static variables is to keep track of how many instances of a
//class have been created.

//this app is being incremented by 1 each timne until it reaches 10.

public class CountTestApp {         //This line is the start of the CountTestApp class, which tests the CountTest class.


    public static void main(String[] args) {           //main method
        printCount();                                  //printCount method is called
        for (int i = 0; i < 10; i++) {                 // i is being incremented as long as i is smaller than 10
            CountTest c1 = new CountTest();            // This line creates an instance of the CountTest class. Because this code is
                                                       // contained in a for loop, 10 instances are created. 
            printCount();                              //This line calls the printCount method, which prints the number of
                                                       //CountTest objects that have been created so far.
        }
    }

    private static void printCount() {                  
        System.out.println("There are now "             // This line prints a message indicating how many CountTest objects have
                                                        //been created so far. It calls the static getInstanceCount method of the
                                                        //CountTest class to get the instance count. 
                + CountTest.getInstanceCount()          
                + " instances of the CountTest class.");
    }
}

class CountTest {                                       //This line is the start of the CountTest class.

    private static int instanceCount = 0;              // The static instanceCount variable stores the instance count.

    public CountTest() {                                //This line is the constructor for the CountTest class. Notice that the
                                                        //instanceCount variable is incremented within the constructor. That
                                                        //way, each time a new instance of the class is created, the instance count
                                                        //is incremented.
        instanceCount++;
    }

    public static int getInstanceCount() {              // The static getInstanceCount method simply returns the value of the
                                                        //static instanceCount field.
        return instanceCount;
    }
}
