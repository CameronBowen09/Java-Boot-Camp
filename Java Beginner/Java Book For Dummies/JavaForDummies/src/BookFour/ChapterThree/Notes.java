/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFour.ChapterThree;

/**
 *
 * @author User
 */
public class Notes {
    
/*
Using the ArrayList Class
ava’s collection classes are designed to simplify the programming for applications 
that have to keep track of groups of objects.
Understanding the ArrayList Class
An array list is the most basic type of Java collection.    
An array list automatically resizes itself whenever necessary. 
An array list lets you insert elements into the middle of the collection
An array list lets you delete items.
The ArrayList class has several constructors and a ton of methods
  
    
Creating an ArrayList Object
To create an array list, you first declare an ArrayList variable and then call the 
ArrayList constructor to instantiate an ArrayList object and assign it to the 
variable. You can do this on separate lines:
        ArrayList signs;
        signs = new ArrayList();    
The ArrayList class is in the java.util package, so your program must 
import either java.util.ArrayList or java.util.*.
Unlike an array, an array list doesn’t make you specify a capacity   
    
    
Adding Elements
After you create an array list, you can use the add method to add objects to the 
array list. Here’s code that adds strings to an array list:
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
You can insert an object at a specific position in the list by listing the position in 
the add method. Consider these statements:
    ArrayList<String> nums = new ArrayList<String>();
            nums.add("One");
            nums.add("Two");
            nums.add("Three");
            nums.add("Four");
            nums.add(2, "Two and a half");
 Like arrays, array lists are indexed starting with zero. Keep this in mind when 
you use the version of the add method that accepts an index number
You can have a capacity input of the arrayList yousing the ensureCapacity method    
Accessing Elements
To access a specific element in an array list, you can use the get method, which 
specifies the index value of the element you want to retrieve
You can use a for loop to get the elemnts you want eg;
    for (int i = 0; i < nums.size(); i++)
    System.out.println(nums.get(i));
The size method is used to set the limit of the for loop’s index variable
If you need to know the index number of a particular object in an array list, and you 
have a reference to the object, you can use the indexOf method
    for (String s : nums)
    {
     int i = nums.indexOf(s);
     System.out.println("Item " + i + ": " + s);
    }
 
    
Printing an ArrayList
The toString method of the ArrayList class is designed to make it easy to quickly print out the contents of the list.    
Consider these statements:
    ArrayList<String> nums = new ArrayList<String>();
    nums.add("One");
    nums.add("Two");
    nums.add("Three");
    nums.add("Four");
    System.out.println(nums);
When you run these statements, the following is displayed on the console:
    [One, Two, Three, Four]    
    
    
    
Using an Iterator
Another way to access all the elements in an array list is to use an iterator.
An iterator is a special type of object whose sole purpose 
in life is to let you step through the elements of a collection 
An iterator object implements the Iterator interface, which is defined as part 
of the java.util package.
To use an iterator, you first call the array list’s iterator method to get the iterator. Then you use the iterator’s hasNext and next methods to retrieve each item in 
the collection. The normal way to do that is with a while loop. Here’s an example:
    ArrayList<String> nums = new ArrayList<String>();
    nums.add("One");
    nums.add("Two");
    nums.add("Three");
hasNext: Returns a boolean value that indicates whether another item is 
available.
next: Returns the next item.
 
    
Updating Elements
You can use the set method to replace an existing object with another object.    
ArrayList<Employee> emps = new ArrayList<Employee>();
// add employees to array list
emps.add(new Employee("Addams", "Gomez"));
emps.add(new Employee("Taylor", "Andy"));
emps.add(new Employee("Kirk", "James"));
// print array list
System.out.println(emps);
// change one of the employee's names
Employee e = emps.get(1);
e.changeName("Petrie", "Robert");
// print the array list ag    
    
in the code above you are changiing one persons name and so you are, 
replacung index 1 with a new name using the changeName method for the arrayList 
Deleting Elements
The ArrayList class provides several methods that let you remove elements from 
the collection. To remove all the elements, use the clear method, like this:
    emps.clear();
To remove a spacific elemnt you can show it with the index number eg;
        emps.clear(1);
Or you can remove the object by reverencing the object itself eg;
    remove one of the employees
    emps.remove(emp2);
this removes the second employee of the eployees array 
The clear and remove methods don’t actually delete objects; they simply 
remove the references to the objects from the array list.    
You can remove more than one element at the same time by using the 
removeRange method eg;
    removeRange(5, 8)
or you can use removeAll to remove all the objects in one 
collection from another collection. A similar method, retainAll, removes all 
the objects that are not in another collection       
    
    */
    
}
