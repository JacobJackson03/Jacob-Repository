package weekNine;

public class QuickSortString {public static void main(String[] args) 	{
    String[] array = {"Wilma", "Rob", "Josh", "Ben", "Cali", "Sofie"};
    for (String name : array) {
        System.out.print(name + " ");
    }
    System.out.println();
    quickSort(array, 0, array.length - 1);
}
    /* Partitioning refers to the process of rearranging the elements of the array around the pivot
           are moved to the left of the pivot and all the elements greater than the pivot are moved to
           the right of the pivot.

        * */
    private static int partition(String[] array, int left, int right) {
        int i = left;
        int j = right;

        String temp;
        String pivot = array[(left + right) / 2];     // pivot is middle index element
        System.out.printf("pivot: %s%n", pivot);
        while (i <= j) {   //0 is less than 5                        // divide into two parts
            while (array[i].compareTo(pivot) < 0) { // is Wilma less than or equal to Josh
                i++;
                System.out.println("i");
                System.out.println(i);
            }
            while (array[j].compareTo(pivot) > 0) {
                j--;
                System.out.println("j");
                System.out.println(j);
            }
            if (i <= j) {                        // swap elements at indices i and j if true
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                System.out.printf("swap %s and %s%n",
                        array[i], array[j]);
                i++;                           // move i to next position
                j--;                           // move j to previous position
                System.out.println("j");
                System.out.println(j);
            } else {
                System.out.println("no swap");
            }
            for (String name : array) {
                // print current array order
                System.out.print(name + " ");
            }
            System.out.println();
        }
        System.out.println("Checking");
        return i;
    }

    /* Quick Sort calls the partition function*/
    private static void quickSort(String[] array, int left, int right) {
        int i = partition(array, left, right);       // call partition method to divide the array
        if (left < i - 1) {
            quickSort(array, left, i - 1);      // call quicksort recursively
        }
        if (i < right) {
            quickSort(array, i, right);              // call quicksort recursively
        }
    }
}
}
