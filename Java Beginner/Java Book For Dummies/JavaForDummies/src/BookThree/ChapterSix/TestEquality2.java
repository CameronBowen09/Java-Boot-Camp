/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterSix;

/**
 *
 * @author User
 */
public class TestEquality2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee( //→5
                "Martinez", "Anthony");
        Employee emp2 = new Employee( //→7
                "Martinez", "Anthony");
        if (emp1.equals(emp2)) //→9
        {
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }
    }
}

class Employee //→18
{

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean equals(Object obj) //→39
    {
// an object must equal itself
        if (this == obj) //→42
        {
            return true;
        }
// no object equals null
        if (this == null) //→46
        {
            return false;
        }
// objects of different types are never equal
        if (this.getClass() != obj.getClass()) //→50
        {
            return false;
        }
// cast to an Employee, then compare the fields
        Employee emp = (Employee) obj; //→54
        return this.lastName.equals(emp.getLastName()) //→55
                && this.firstName.equals(emp.getFirstName());
    }
}

/*→5 Creates an Employee object with the name Anthony Martinez.
→7 Creates another Employee object with the name Anthony Martinez.
→9 Compares the two Employee objects by using the equals method.
→18 The Employee class.
→39 The overridden equals method.
→42 Returns true if the same object instances are being compared. This
meets the first equality test: that an object must always be equal to
itself.
→46 Returns false if the object being compared is null. This meets the last
equality test: that nothing is equal to null.
→50 Returns false if the object being compared isn’t of the correct type.
This helps ensure the symmetry test: that if x equals y, y must equal x.
→54 Having slid through the other tests, you can assume that you’re
comparing two different Employee objects, so the next step is to cast
the other object to an Employee.
→55 Having cast the other object to an Employee, the two fields (last
Name and firstName) are compared, and the result of the compound
comparison is returned.*/
