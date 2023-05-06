package weekNine;
import java.util.Scanner;
public class MergeSortTest {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Declare an array of size 5
    int [] intArray = new int [6];

    // Asking user to enter in numbers
    for (int i = 0; i < intArray.length; i++) {
        System.out.printf("Enter integer %d: \n", i + 1);
        intArray[i] = Integer.parseInt(scanner.nextLine());
    }
    // Call the mergeSort function to sort the array
    mergeSort(intArray, 0, intArray.length - 1);

    // Print the sorted array
    System.out.println("Sorted array:");
    for (int i = 0; i < intArray.length; i++) {
        System.out.println(intArray[i]);
    }

}
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    //HELPER FUNCTION --> TAKES THE ELEMENTS AND PUT THEM BACK IN THE SAME ARRAY.
    //START AT LEFT then going to right.
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of leftArr if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        // Copy remaining elements of rightArr if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

}
}
