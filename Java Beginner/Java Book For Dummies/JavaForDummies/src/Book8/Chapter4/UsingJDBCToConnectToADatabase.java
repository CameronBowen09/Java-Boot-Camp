/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book8.Chapter4;

/**
 *
 * @author User
 */
public class UsingJDBCToConnectToADatabase {
    
}

/*
JDBC — Java Database Connectivity — is a Java feature that lets you connect to
almost any relational database system, execute SQL commands, and process
the results, all from within a Java program.
Setting Up a Driver
Before you can write a Java program to access a database via JDBC, you must
first install a driver that links Java’s database API classes to an actual database.
*/

/*
Connecting to a Database
Before you can use JDBC to access a SQL database, you must first establish a
connection
to the database. The first step to establishing a connection involves
registering the driver class so the class is available. To do that, use the forName
method of the Class class, specifying the package and class name of the driver.
To register the MySQL connector, use this statement:
Class.forName("com.mysql.jdbc.Driver");
To register the standard ODBC driver, use this statement instead:
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Note that the forName method throws ClassNotFoundException, so you have to
enclose this statement in a try/catch block that catches ClassNotFoundException.
After you register the driver class, you can call the static getConnection method of
the DriverManager class to open the connection. This method takes three String
parameters: the database URL, the username, and a password. Here’s an example:
String url = "jdbc:mysql://localhost/Movies";
String user = "root";
String pw = "pw";
con = DriverManager.getConnection(url, user, pw);
The URL parameter has the following syntax:
jdbc:subprotocol:subname
where subprotocol is mysql for a MySQL database and odbc for an ODBC driver.
The subname is the database name. For a MySQL database, this can be a complete
URL, but for a database on your own computer, just specify //localhost/ plus the
name of the database.
For ODBC, you use the name you used when you created the data source. For
example:
String url = "jdbc:odbc:Movies";
The user and password parameters must also be valid for the database server
you’re using. For testing purposes on a MySQL database, you can use root and the
password you created when you installed MySQL.
*/
