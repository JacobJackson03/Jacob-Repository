package weekNine;
import java.util.Scanner;
public class BubbleSortTest {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Declare an array of size 6
    int [] intArray = new int [6];

    // Asking user to enter in numbers
    // I used 7,4,11,9, 8, 1
    for (int i = 0; i < intArray.length; i++) {
        System.out.printf("Enter integer %d: \n", i + 1);
        intArray[i] = Integer.parseInt(scanner.nextLine());
    }
    bubbleSort(intArray);


}
    // Ascending order
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println(n);
        // Traverse through all array elements
        for (int i = 0; i < n; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n-i-1; j++) {
                // Traverse the array from 0 to n-i-1
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // Descending order --> main change is in the < symbol in the if statment.
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        // Traverse through all array elements
        for (int i = 0; i < n; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n-i-1; j++) {
                // Traverse the array from 0 to n-i-1
                // Swap if the element found is less than the next element
                if (arr[j] < arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
}
