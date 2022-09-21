/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookFour.ChapterSix;

/**
 *
 * @author User
 */
public class Notes {
    
     /*
Using Bulk Data Operations with Collections
    you can use a foreach loop to evaluate the data in your collection 
    In Java, foreach loops are easy to create and can be very powerful
    As a result, a foreach loop must be executed sequentially within a single tread
    
    
Looking At a Basic Bulk Data Operation
    
    Suppose you have a list of spells used by a wizard, the spells are held in a class
    public class Spell {//has a public class field and reprisents spells 
    public String name; // and description, as well as a constructor that 
    public SpellType type;//lets you specify the name, type, and description for the spell.
    public String description;
    public enum SpellType {
        SPELL, CHARM, CURSE
    }
    public Spell(String spellName, SpellType spellType,
            String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }
    public String toString() {
        return name;
    }
}
Then you can add a arrayList of spells using 
    ArrayList<Spell> spells = new ArrayList<>();
    spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
    "Makes invisible ink appear."));
    spells.add(new Spell("Avis", Spell.SpellType.SPELL,
    "Launches birds from your wand."));
Now To print the spells out
    for (Spell spell : spells)
    System.out.println(spell.name);   
The same code using the streams looks like this:
    spells.stream().forEach(s -> System.out.println(s));    
 Here wefirst use the stream method of the ArrayList class to convert the ArrayList to a stream.  
 You can do this with an arrayList, linkedList and a stack 
we then use the streams forEach method to iterate the stream, passing a lambda 
expression that calls System.out.println for each item in the stream. The 
forEach method processes the entire stream, writing each element to the console
you can also use a filter to single out one element in the array
    
Looking Closer at the Stream Interface
The Stream interface defines about 40 methods. In addition, three related 
interfaces — DoubleStream, IntStream, and LongStream — extend the Stream
interface to define operations that are specific to a single date type: double, int, 
and long    
The filter method is one of the most commonly used stream methods. It’s argument, 
called a predicate, is a function that returns a boolean value   
The easiest way to implement a filter predicate is to use a lambda expression that 
specifies a conditional expression. For example, the following lambda expression 
inspects the name field of the stream element and returns true if it begins with 
the letter a (upper- or lowercase):
    s -> s.name.toLowerCase().startsWith("a")    
The other methods in the first group let you limit the number of elements in a 
stream or sort the elements of the stream    
The mapping function, which you must pass as a parameter, 
is responsible for converting the data from the first type to the second.    
One common use for mapping methods is to convert a stream of complex types 
to a stream of simple numeric values of type double, int, or long    
To calculate the average price of something  yo would need to, 
have to convert the stream of <ObjectName> objects to a stream of doubles    
To do that, 
you use the mapToDouble method. The mapping function would simply return the 
price field:
    .mapToDouble(s -> s.price)     
Aggregate methods perform a calculation on all of the elements in the stream, 
then return the result. Of the aggregate methods, count is straightforward:    
simply returns the number of elements in the stream.
An optional data type is an object that might contain a value, or it might not.
For example, the average method calculates the average value of a stream of integers, 
longs, or doubles and returns the result as an OptionalDouble. If the stream 
was empty, the average is undefined, so the OptionalDouble contains no value    
Here’s an example that calculates the average price of spells:
  OptionalDouble avg = spells.stream()
  .mapToDouble(s -> s.price)
  .average();
Here is how you would write the average price to the console:
 if (avg.isPresent())
 {
  System.out.println("Average = "
  + avg.getAsDouble());
 }
   
    
    
Using Parallel Streams
Streams come in two basic flavors: sequential and parallel    
 
Sequential - Elements in a sequential 
              stream are produced by the stream method and create streams that are processed 
              one element after the next. Streams are by Default equential    
Parallel - This breaks down streams and puts them in diffrent ones and 
           at the end the come back and create a final stream. 
           Creating a paralel stream is easy Just use 
           the parallelStream method instead of the stream method at the beginning of 
           the pipeline.
           For example, to print all of HP’s spells using a parallel stream, use this code:
            spells.parallelStream()
             .forEach(s -> System.out.println(s));
           Note that when you use a parallel stream, you can’t predict the order in which 
         S  each element of the stream is processed
    */
    
}
