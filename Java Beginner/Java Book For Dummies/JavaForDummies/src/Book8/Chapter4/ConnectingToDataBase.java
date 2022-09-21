/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book8.Chapter4;

/**
 *
 * @author User
 */
public class ConnectingToDataBase {
    
}

/*
Putting it all together, here’s a method that returns a Connection object that
connects to the movies database in MySQL:
private static Connection getConnection()
{
Connection con = null;
try
{
Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost/Movies";
String user = "root";
String pw = "PassWord";
con = DriverManager.getConnection(url, user, pw);
}
catch (ClassNotFoundException e)
{
System.out.println(e.getMessage());
System.exit(0);
}
catch (SQLException e)
{
System.out.println(e.getMessage());
System.exit(0);
}
return con;
}
You can find these classes — and the other classes for working with SQL
databases
— in the java.sql package. As a result, you have to include an import
statement that specifies this package in any program that uses JDBC.
*/
