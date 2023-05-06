package weekNine;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SimpleSetandIterator { public static void main(String[] args) {
    // Creates a Set
    Set<String> mySet = new HashSet<String>();

    // Adds 3 elements to the Set
    mySet.add("apple");
    mySet.add("banana");
    mySet.add("orange");

    // Creates an Iterator for the Set
    Iterator<String> iterator = mySet.iterator();

    // Iterates through the Set and prints each element
    while (iterator.hasNext()) {
        String element = iterator.next();
        System.out.println(element);
    }
}
}
}
