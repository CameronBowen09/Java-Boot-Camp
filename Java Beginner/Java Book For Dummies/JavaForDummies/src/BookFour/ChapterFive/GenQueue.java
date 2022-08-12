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

public class GenQueue<E> //→3
{

    private LinkedList<E> list = new LinkedList<E>(); //→5

    public void enqueue(E item) //→7
    {
        list.addLast(item);
    }

    public E dequeue() //→12
    {
        return list.poll();
    }

    public boolean hasItems() //→a17
    {
        return !list.isEmpty();
    }

    public int size() //→a22
    {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q) //→a27
    {
        while (q.hasItems()) {
            list.addLast(q.dequeue());
        }
    }
}

/*→3 The class declaration specifies the formal type parameter <E>. Thus,
users of this class can specify the type for the elements of the queue.
→5 Like the GenStack class, this class uses a private LinkedList object list
to keep its items.
→7 The enqueue method accepts a parameter of type E. It uses the linked
list’s addLast method to add the item to the end of the queue.
→12 The dequeue method returns a value of type E. Like the pop method of
the GenStack class, this method uses the linked list’s poll method to
return the first item in the list.
→17 The hasItems method returns the opposite of the linked list’s isEmpty
method.
→22 The size method returns the result of the linked list’s size method.
→27 The addItems method accepts a parameter that must be another
GenQueue object whose element type is either the same type as this
GenQueue object’s elements or a subtype of this GenQueue object’s
element type. This method uses a while loop to remove all the items
from the q parameter and add them to this queue.*/
