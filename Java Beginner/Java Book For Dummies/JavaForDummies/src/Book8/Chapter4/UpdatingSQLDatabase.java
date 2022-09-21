/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book8.Chapter4;

/**
 *
 * @author User
 */
public class UpdatingSQLDatabase {
    
}

/*
Besides executing select statements, you can also use a Statement object
to execute
insert, update, or delete statements as well. To do that, call the
executeUpdate method instead of the executeQuery method. This method
returns an int value that indicates how many rows were updated. You can test the
return value to determine whether the data was properly updated.
Here’s a method that accepts a movie ID, a last name, and a first name, and then
inserts a row into the friend table:
private static void loanMovie(int id, String lastName,
String firstName)
{
    Connection con = getConnection();
    try
    {
        Statement stmt = con.createStatement();
        String insert = "insert into friend "
        + "(lastname, firstname, movieid) "
        + "values ("
        + "\"" + lastName + "\", \""
        + firstName + "\", " +
        + id + ")";
        int i = stmt.executeUpdate(insert);
        if (i == 1)
            System.out.println("Loan recorded.");
        else
            System.out.println("Loan not recorded.");
    }
    catch (SQLException e)
    {
        System.out.println(e.getMessage());
        System.exit(0);
    }
}
*/

/*
The getConnection method called at the start of this method is the same get
Connection method in Listing 4-1. After a connection is created, a Statement
object is created, and an insert statement is constructed using the values passed
via the parameters. For example, if you pass id 3, last name Haskell, and first
name Eddie, the following insert statement is built:
Insert into friend (lastname, firstname, movieid)
Values ("Haskell", "Eddie", 3)
Then the executeUpdate method is called to execute the insert statement. An if
statement is used to determine whether the row is inserted.
You can execute update or delete statements in the same manner.
While you’re testing database code that executes SQL statements constructed from
strings like this, throw in a System.out.println call to print the statement to the
console. That way, you can verify that the statement is being created properly.
*/
