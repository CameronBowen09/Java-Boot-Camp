/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFour.ChapterFive;

/**
 *
 * @author User
 */
import java.util.*;

public class GenStack<E> //→3
{

    private LinkedList<E> list = new LinkedList<E>(); //→5

    public void push(E item) //→7
    {
        list.addFirst(item);
    }

    public E pop() //→12
    {
        return list.poll();
    }

    public E peek() //→17
    {
        return list.peek();
    }

    public boolean hasItems() //→22
    {
        return !list.isEmpty();
    }

    public int size() //→27
    {
        return list.size();
    }
}

/*→3 The class declaration specifies the formal type parameter <E>. Thus
users of this class can specify the type for the stack’s elements.
→5 This class uses a private LinkedList object list to keep the items stored
in the stack. The LinkedList is declared with the same type as the
GenStack class itself. Thus, if the E type parameter is Employee, the type
for this LinkedList is Employee.
→7 The push method accepts a parameter of type E. It uses the linked list’s
addFirst method to add the item to the beginning of the list.
→12 The pop method returns a value of type E. It uses the linked list’s poll
method, which removes and returns the first element in the linked list.
If the list is empty, the poll method — and therefore the pop method —
returns null.
→17 The peek method also returns a value of type E. It simply returns the
result of the linked list’s peek method.
→22 The hasItems method returns the opposite of the linked list’s isEmpty
method.
→27 The size method simply returns the result of the linked list’s size method.*/
