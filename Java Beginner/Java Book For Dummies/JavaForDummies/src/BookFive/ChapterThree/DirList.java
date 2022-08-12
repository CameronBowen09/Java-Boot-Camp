/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFive.ChapterThree;

/**
 *
 * @author User
 */
import java.io.File; //→1
import java.util.Scanner;

public class DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(
                "Welcome to the Directory Lister");
        do {
            System.out.print("\nEnter a path: ");
            String path = sc.nextLine();
            File dir = new File(path); //→17
            if (!dir.exists() || !dir.isDirectory()) //→18
            {
                System.out.println(
                        "\nThat directory doesn't exist.");
            } else {
                System.out.println(
                        "\nListing directory tree of:");
                System.out.println(dir.getPath()); //→25
                listDirectories(dir, " "); //→26
            }
        } while (askAgain()); //→28
    }

    private static void listDirectories( //→31
            File dir, String indent) {
        File[] dirs = dir.listFiles(); //→34
        for (File f : dirs) //→35
        {
            if (f.isDirectory()) //→37
            {
                System.out.println(
                        indent + f.getName()); //→40
                listDirectories(f, indent + " "); //→41
            }
        }
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
/*→1 This import statement is required to use the File class.
→15 A Scanner object is used to get the pathname from the user.
→17 The pathname is passed to the File class constructor to create a new
File object for the directory entered by the user.
→18 The exists and isDirectory methods are called to make sure that the
path entered by the user exists and points to a directory rather than a file.
→25 If the user entered a good path, the getPath method is called to display
the name of the path represented by the File object. (I could just as
easily have displayed the path variable here.)
→26 The listDirectories method is called to list all the subdirectories in
the directory specified by the user.
→28 The user is asked whether he wants to list another directory, and the
loop repeats if the user answers Y.
→31 This line is the start of the listDirectories method. This method takes
two parameters: a File object representing the directory to be listed
and a String object that provides the spaces used to indent each line of
the listing. When this method is first called from the main method, the
indentation is set to two spaces by a string literal.
→34 The listFiles method is called to get an array of all the File objects in
this directory.
→35 An enhanced for loop is used to process all the File objects in the array.
→37 This if statement checks to see whether a file is a directory rather than a file.
→40 If the File object is a directory, the indentation string is printed, followed
by the name of the directory as returned by the getName method.
→41 Next, the listDirectories method is called recursively to list the
contents of the f directory. Two spaces are added to the indentation
string, however, so that any directories in the f directory are indented
two spaces to the right of the current directory.*/
