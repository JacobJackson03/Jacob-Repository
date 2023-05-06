package weekNine;
import java.util.Arrays;
public class GenricsSorting { private T[] array;

    public GenericsSortingDemo(T[] array) {
        this.array = array;
    }

    public void sort() {
        Arrays.sort(array);
    }

    public T[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        // Creates arrays of integers, strings, and characters
        Integer[] intArray = {5, 2, 9, 1, 7};
        String[] stringArray = {"apple", "banana", "orange", "grape"};
        Character[] charArray = {'c', 'a', 't', 'd', 'o', 'g'};

        // Creates an instance of the GenericsSortingDemo class with an Integer type parameter
        GenericsSortingDemo<Integer> intA = new GenericsSortingDemo<Integer>(intArray);
        System.out.println("Before sorting (Integers): " + Arrays.toString(intA.getArray()));

        // Sorts the array of integers
        intA.sort();

        // Prints the sorted array of integers
        System.out.println("After sorting (Integers): " + Arrays.toString(intA.getArray()));

        // Creates an instance of the GenericsSortingDemo class with a String type parameter
        GenericsSortingDemo<String> stringB = new GenericsSortingDemo<String>(stringArray);
        System.out.println("Before sorting (Strings): " + Arrays.toString(stringB.getArray()));

        // Sorts the array of strings
        stringB.sort();

        // Prints the sorted array of strings
        System.out.println("After sorting (Strings): " + Arrays.toString(stringB.getArray()));

        // Creates an instance of the GenericsSortingDemo class with a Character type parameter
        GenericsSortingDemo<Character> charC = new GenericsSortingDemo<Character>(charArray);
        System.out.println("Before sorting (Characters): " + Arrays.toString(charC.getArray()));

        // Sorts the array of characters
        charC.sort();

        // Prints the sorted array of characters
        System.out.println("After sorting (Characters): " + Arrays.toString(charC.getArray()));
    }
}
}
