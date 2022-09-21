/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book8.Chapter2;

/**
 *
 * @author User
 */
import java.io.*; //→1
import java.text.NumberFormat;

public class ReadFile
{
    public static void main(String[] args)
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        BufferedReader in = getReader("movies2.txt"); //→8
        Movie movie = readMovie(in); //→9
        while (movie != null) //→10
        {
            String msg = Integer.toString(movie.year);
            msg += ": " + movie.title;
            msg += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }
    } //→18
    private static BufferedReader getReader(String name) //→19
    {
        BufferedReader in = null;
        try
        {
            File file = new File(name);
            in = new BufferedReader(
                    new FileReader(file) );
        }
        catch (FileNotFoundException e)
        {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }
    private static Movie readMovie(BufferedReader in) //→36
    {
        String title;
        int year;
        double price;
        String line = "";
        String[] data;
        try
        {
            line = in.readLine();
        }
        catch (IOException e)
        {
            System.out.println("I/O Error");
            System.exit(0);
        }
        if (line == null)
            return null;
        else
        {
            data = line.split("\t");
            title = data[0];
            year = Integer.parseInt(data[1]);
            price = Double.parseDouble(data[2]);
            return new Movie(title, year, price);
        }
    }
    private static class Movie //→63
    {
        public String title;
        public int year;
        public double price;
public Movie(String title, int year, double price)
        {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}

/*
→1 The program begins with import java.io.* to import all the Java I/O
classes used by the program.
→8 The program uses a method named getReader to create a Buffered
Reader object that can read the file. The name of the file is passed to this
method as a parameter. Note that in a real program, you’d probably get this
filename from the user via a JFileChooser dialog box or some other
means. In any event, the BufferedReader object returned by the getReader
method is saved in a variable named in.
→9 Another method, named readMovie, is used to read each movie from the
file. This method returns a Movie object. (Movie is a private class that’s
defined later in the program.) If the end of the file has been reached, this
method returns null.
→10 A while loop is used to process each movie. This loop simply builds a
message string from the Movie object, displays it on the console, and then
calls readMovie to read the next movie in the file.
→18 The program ends without closing the file. That’s okay, though, because the
file is closed automatically when the program that opened it ends. If the
program were to go on with other processing after it finished with the file,
you’d want to close the file first.
→19 The getReader method creates a BufferedReader object for the filename
passed as a parameter. If any exceptions are thrown during creation of the
BufferedReader object, the program exits.
→36 The readMovie method reads a line from the reader passed as a parameter,
parses the data in the line, creates a Movie object from the data, and returns
the Movie object. If the end of the file is reached, this method returns null.
The statement that reads the line from the file is enclosed in a try/catch
block that exits the program if an I/O error occurs.
→63 The Movie class is a private inner class that defines the movie objects. To
keep the class simple, it uses public fields and a single constructor that
initializes the fields.
 */
