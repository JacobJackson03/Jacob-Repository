package weekTen;

public class FactorialRecursive {
    public static int factorial(int n) {
        if (n == 0) {   // base case
            return 1;
        } else {
            return n * factorial(n - 1); // recursive case
        }
    }
}
