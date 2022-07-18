package ex13_1_exercise;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        // Convert the days array into an ArrayList
        ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
        // Loop through the ArrayList, printing out "sunday" elements in 
        for (String s : dayList) {
            // upper case (use toUpperCase() method of String class)
            if (s.equalsIgnoreCase("Sunday")) {
                System.out.println(s.toUpperCase());
                // Print all other days in lower case 
            } else {
                System.out.println(s);
            }
        }
        // Print out the ArrayList  
        System.out.println(dayList);
    }
}
}
