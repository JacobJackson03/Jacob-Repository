package weekNine;

public class QuickSort {public static void main(String[] args) 	{
    //int[] array = {1, 12, 5, 26, 7, 14, 3, 10, 7, 2};
    int[] array = {7,4,11,9,8,1};
    // int[] array = {6, 1, 4, 3, 5, 7, 9, 2, 8, 0};
    for (int num : array) {
        System.out.print(num + " ");
    }
    System.out.println();
    quickSort(array, 0, array.length - 1);
}

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;
        // System.out.println(j);
        int temp;
        int pivot = array[(left + right) / 2];     // pivot is middle index element
        System.out.println(pivot);
        System.out.printf("pivot: %d%n", pivot);
        while (i <= j) {                           // divide into two parts
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {                        // swap elements at indices i and j if true
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                System.out.printf("swap %d and %d%n",
                        array[i], array[j]);
                i++;                           // move i to next position
                j--;                           // move j to previous position
            } else {
                System.out.println("no swap");
            }
            for (int num : array) {
                System.out.println();
                // print current array order
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return i;
    }

    private static void quickSort(int[] array, int left, int right) {
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
