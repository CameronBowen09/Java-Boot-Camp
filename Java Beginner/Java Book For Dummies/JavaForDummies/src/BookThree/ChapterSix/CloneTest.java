/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterSix;

/**
 *
 * @author User
 */
public class CloneTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee( //→5
                "Martinez", "Anthony");
        emp1.setSalary(40000.0); //→7
        Employee emp2 = (Employee) emp1.clone(); //→8
        emp1.setLastName("Smith"); //→9
        System.out.println(emp1); //→10
        System.out.println(emp2); //→11
    }
}

class Employee //→15
{

    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName,
            String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Object clone() //→57
    {
        Employee emp;
        emp = new Employee( //→60
                this.lastName, this.firstName);
        emp.setSalary(this.salary); //→62
        return emp; //→63
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}

/*→5 Creates the first Employee object for an employee named Anthony
Martinez.
→7 Sets Mr. Martinez’s salary.
→8 Creates a clone of the Employee object for Mr. Martinez. Notice that the
return value must be cast to an Employee, because the return value of
the clone method is Object.
→9 Changes the last name for the second Employee object.
→10 Prints the first Employee object.
→11 Prints the second Employee object.
→15 The Employee class. This class defines private fields to store the last
name, first name, and salary, as well as getter and setter methods for
each field.
→57 Overrides the clone method. Notice that its return type is Object, not
Employee.
→60 Creates a new Employee object, using the last name and first name
from the current object.
→62 Sets the new employee’s salary to the current object’s salary.
→63 Returns the cloned Employee object.*/
