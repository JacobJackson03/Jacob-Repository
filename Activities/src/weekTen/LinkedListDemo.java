package weekTen
import java.util.LinkedList;
public class LinkedListDemo {public static void main(String[] args)
{
    // INITIALIZE A LINKEDLIST
    LinkedList<String> names = new LinkedList<>();

    names.add("Alice");
    names.add("Bob");
    names.add("Carol");
    names.add("Winston");
    names.add("Jess");
    names.add("Kyle");

    //DISPLAY NAMES
    System.out.printf("Names list: %s%n", names);

    // add first and last elements
    //HEAD OR TAIL
    names.addFirst("John");
    // inserting an element to the end of the list.....
    // involves "traversing" moving through the list  and then creating a new node
    // and adjusting the previous node's address for the next node.
    // Time taken will be proportional to the size of the list  so
    // Big O(n)
    names.addLast("Rhonda");

    System.out.printf("Names list: %s%n", names);

    // get values in a LinkedList
    Object firstElement = names.getFirst();
    Object lastElement = names.getLast();
    Object firstItem = names.get(0);
    Object lastItem = names.get(4);
    System.out.printf("First element is %s and last element is %s%n",
            firstElement, lastElement);
    System.out.printf("First item is %s and last item is %s%n",
            firstItem, lastItem);

    // set values and add to a position in a LinkedList
    names.set(0, "Tom");
    System.out.printf("Names list: %s%n", names);
    names.add(0, "Clark");
    System.out.printf("Names list: %s%n", names);

    // remove elements from a list
    names.remove(0);
    System.out.printf("Names list: %s%n", names);
    names.removeFirst();
    System.out.printf("Names list: %s%n", names);
    names.removeLast();
    System.out.printf("Names list: %s%n", names);
}
}
}
