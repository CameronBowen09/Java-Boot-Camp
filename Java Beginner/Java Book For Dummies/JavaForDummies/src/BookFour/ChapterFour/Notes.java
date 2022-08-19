/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFour.ChapterFour;

/**
 *
 * @author User
 */
public class Notes {
    
     /*
Using the LinkedList Class
array list are good when you  need to find the index of the elements/array but 
when it comes to inserting and deleting items, a linkList class works the best 
Understanding the LinkedList Class
A linked list is a collection in which every object in the list maintains with it a 
pointer to the following object in the list and another pointer to the preceding 
object in the list
This arrangement has some compelling advantages over arrays:
     Because the ArrayList class uses an array to store list data,it freaquintly has to relocate
     when you add items to the ArrayList.
     Not so with the LinkedList class, you can keep adding items till your pc runs out of memory 
     With the arrayList class you can add items in the middle of the array but it first copys everything before the insert
     to make space for the item you are putting in but with a link list class you just change the pointer of the proceding and 
     following objects 
     To delete items/elements from an arrayList you need to copy everything after the item you want to delete,
     then delete the item, but with the linkedList you just need to change the procedeing and following pointers 
     of the objects 
      Linked lists are especially well suited for creating two common types of lists:
      Stacks: A stack is a list in which items can be added to and retrieved from 
      only the front of the list.
      Queues: A queue is a list in which items are always added to the back of the 
      list and always retrieved from the front.
Linked lists require more memory than arrays and are slower 
than arrays when it comes to simple sequential access.
Creating a LinkedList
As with any other kind of object, creating a linked list is a two-step affair. First, 
you declare a LinkedList variable; then you call one of the LinkedList constructors to create the object, as in this example:
    LinkedList officers = new LinkedList();
Then you can add only String objects to this list. If you try to add any other type 
of object, the compiler balks eg;
    LinkedList<String> officers = new LinkedList<String>();
Adding Items to a LinkedList
The LinkedList class gives you many ways to add items to the list. The most basic 
is the add method, which works pretty much the same way that it does for the 
ArrayList class
The addLast method works the same way, but the addFirst method adds items to 
the front of the list.
You can also add into the list by specifying the index of where you want to add the item in eg;
    officers.add(2, "Tuttle");
this officer will now be added to the second index of the list. 
If you specified a type for the list when you created it, the items you add must 
be of the correct type
If you specify an index that doesn’t exist, the add method throws 
    IndexOutOfBoundsException  
LinkedList also has weird methods named offer, offerFirst, and 
offerLast. The offer method adds an item to the end of the list and has a 
return type of boolean, but it always returns true  
    
    
Retrieving Items from a LinkedList
As with the ArrayList class, you can use the get method to retrieve an item based 
on its index. If you pass it an invalid index number, the get method throws the 
unchecked IndexOutOfBoundsException.
You can also use an enhanced for loop to retrieve all the items in the linked list.   
9 Mehtods can retrive data from a linkedList,
    1) getFirst: Retrieves the first item from the list
       if the list is empty it throws out the NoSuchElement-Exception
    2) element: Identical to the getFirst method
    3) peek: Similar to getFirst but doesn’t throw an exception if the list is empty. 
       Instead, it just returns null.
    4) peekFirst: Identical to peek.
    5) remove: Similar to getFirst but also removes the item from the list.
    6) removeFirst: Identical to remove. If the list is empty, it throws 
       NoSuchElementException
    7) poll: Similar to removeFirst but returns null if the list is empty
    8) pollFirst: Identical to poll
    9) pop: identical to the removeFirts method.
there are also 4 methods to retrive data;
    1) getLast: Retrieves the last item from the list but if the listis empty it throws the 
       NoSuchElement-Exception
    2) peekLast: Similar to getLast but doesn’t throw an exception if the list is empty
    3) removeLast: Similar to getLast but also removes the item. If the list is empty, 
       it throws NoSuchElementException.
    4) pollLast: Similar to removeLast but returns null if the list is empty
    
    
Updating LinkedList Items
As with the ArrayList class, you can use the set method to replace an object in 
a linked list with another object
As with an ArrayList, any changes you make to an object retrieved from a linked 
list are automatically reflected in the list.
    
    
    
Removing LinkedList Items
You’ve already seen that several of the methods that retrieve items from a linked 
list also remove the items
you can remove items by revrencing the index or the object 
    officers.remove(3);    
    officers.remove(tuttle);   
or you could clear the entire index by using the word clear
    officers.clear();
    */
    
}
