/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book8.Chapter2;

/**
 *
 * @author User
 */
import java.io.*;

public class WriteFile
{
    public static void main(String[] args) //→4
    {
        Movie[] movies = getMovies();
        PrintWriter out = openWriter("movies2.txt");
        for (Movie m : movies)
            writeMovie(m, out);
        out.close();
    }
    private static Movie[] getMovies() //→12
    {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("It's a Wonderful Life",
                1946, 14.95);
        movies[1] = new Movie("Young Frankenstein",
                1974, 16.95);
        movies[2] = new Movie("Star Wars",
                1977, 17.95);
        movies[3] = new Movie("The Princess Bride",
                1987, 16.95);
        movies[4] = new Movie("Glory",
                1989, 14.95);
        movies[5] = new Movie("The Game",
                1997, 14.95);
        movies[6] = new Movie("Shakespeare in Love",
                1998, 19.95);
        movies[7] = new Movie("Zombieland",
                1997, 18.95);
        movies[8] = new Movie("The King's Speech",
                1997, 19.95);
        movies[9] = new Movie("Star Trek Into Darkness",
                1997, 19.95);
        return movies;
    }
    private static PrintWriter openWriter(String name) //→37
    {
        try
        {
            File file = new File(name);
            PrintWriter out =
                    new PrintWriter(
                            new BufferedWriter(
                                    new FileWriter(file) ), true );
            return out;
        }
        catch (IOException e)
        {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return null;
    }
    private static void writeMovie(Movie m, //→55
                                   PrintWriter out)
    {
        String line = m.title;
        line += "\t" + Integer.toString(m.year);
        line += "\t" + Double.toString(m.price);
        out.println(line);
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
→4 The main method begins by calling a method named getMovies, which
returns an array of Movie objects to be written to the file. (The Movie class is
defined as an inner class later in the program.) Then it calls openWriter,
which creates a PrintWriter object that the program can use to write data
to the file. Next, it uses an enhanced for loop to call the writeMovie
method for each movie in the array. This method accepts a Movie object that
contains the movie to be written and a PrintWriter object to write the
movie to. Finally, the PrintWriter is closed.
→12 The getMovies method returns an array of Movie objects that are written to
a file. In a real-life program, you’d probably do something other than
hard-code the movie information in this method. You might prompt the user
to enter the data, for example, or use a Swing frame to get the data.
→37 The openWriter method creates a PrintWriter object for the filename
passed to it as a parameter. The PrintWriter uses a buffer that’s flushed
each time println is called.
→55 The writeMovie method accepts as parameters a Movie object to be written
and the PrintWriter to which the movie should be written. It creates a
string that includes the title, a tab, the year, another tab, and the price; then it
writes the string to the file.
→63 The Movie class is an inner class that defines a movie object. This class
simply consists of three public fields (title, year, and price) and a constructor
that initializes the fields.
 */
