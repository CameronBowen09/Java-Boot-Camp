/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookThree.ChapterOne;

/**
 *
 * @author User
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Every object in an object-oriented program has an identity. In other words, every\n"
                + "occurrence of a particular type of object — called an instance — can be distinguished\n"
                + "from every other occurrence of the same type of object.\n");
        System.out.println("object-oriented programming lets you assign\n"
                + "names to the different kinds of objects in a program. In Java, types are defined by\n"
                + "classes. So when you create an object from a type, you’re saying that the object\n"
                + "is of the type specified by the class.\n");
        System.out.println("The type of an object determines what attributes the object has. Thus all objects\n"
                + "of a particular type have the same attributes. They don’t necessarily have the\n"
                + "same values for those attributes, however.\n");
        System.out.println("The combination of the values for all the attributes of an object is called the object’s\n"
                + "state. Unlike its identity, an object’s state can — and usually does — change over its\n"
                + "lifetime.\n");
        System.out.println("Another way to say that objects have behavior is to say that they provide services\n"
                + "that can be used by other objects.\n");
        System.out.println("What is Object oriented Programming");
        System.out.println("In Java, the behavior of an object is provided by its methods. Thus the format\n"
                + "method of the NumberFormat class is what provides the formatting behavior for\n"
                + "NumberFormat objects.\n");
        System.out.println("Inheritance is an object-oriented programming technique that lets you use one\n"
                + "class as the basis for another. The existing class is called the base class, superclass,\n"
                + "or parent class; the new class that’s derived from it is called the derived class, subclass,\n"
                + "or child class.\n");
        System.out.println("An interface is a set of methods and fields that a class must provide to implement\n"
                + "the interface. The interface itself is simply a set of public method and field declarations\n"
                + "that are given a name.\n");
        System.out.println("An object-oriented program usually isn’t just a single object. Instead, it’s a group\n"
                + "of objects that work together to get a job done. The most important part of developing\n"
                + "an object-oriented program is designing the classes that are used to create\n"
                + "the program’s objects. The basic idea is to break a large problem into a set of\n"
                + "classes, each of which is manageable in size and complexity.\n");
        System.out.println("Diagrams\n");
        System.out.println("The basic element in a class diagram is a class. In UML, each class is drawn as a\n"
                + "rectangle. At minimum, the rectangle must include the class name.\n+ Public\n"
                + "– Private\n"
                + "# Protected");
        System.out.println("A solid line with a hollow closed arrow at one end represents inheritance:\n"
                + "The arrow points to the base class. A dashed line with a hollow closed arrow at one\n"
                + "end indicates that a class implements an interface:\n"
                + "The arrow points to the interface. A solid line with an open arrow indicates an\n"
                + "association:\n"
                + "An association simply indicates that two classes work together. It may be that one\n"
                + "of the classes creates objects of the other class or that one class requires an object\n"
                + "of the other class to perform its work. Or perhaps instances of one class contain\n"
                + "instances of the other class.\n"
                + "You can add a name to an association arrow to indicate its purpose. If an association\n"
                + "arrow indicates that instances of one class create objects of another class, you\n"
                + "can place the word Creates next to the arrow.");
    }
}
