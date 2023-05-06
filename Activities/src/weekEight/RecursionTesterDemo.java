package weekEight;
import java.util.Scanner;
public class RecursionTesterDemo { public static void main(String[] args)
{
    //Instance of the ResursionTester class and the Scanner Class
    RecursionTester demo = new RecursionTester();
    Scanner console = new Scanner(System.in);

    System.out.println("---------- Calculating Factorial Recursively: ----------------\n");
    System.out.println("Enter an integer: ");
    int number = Integer.parseInt(console.nextLine());

    System.out.println(demo.calcFactorial(number));
    System.out.println();

    System.out.println("---------- Counting Down Recursively: ----------------\n");
    demo.countDown(number);
    System.out.println();

    System.out.println("---------- Printing Character Backwards Recursively: ----------------\n");
    demo.printBackwards('z');
    System.out.println();

    System.out.println("---------- Greatest Common Divisor Recursively: ----------------\n");

    System.out.println("Enter an integer: ");
    int n1 = Integer.parseInt(console.nextLine());

    System.out.println("Enter an integer: ");
    int n2 = Integer.parseInt(console.nextLine());

    System.out.printf("recursive gcd: %d%n", demo.findGCDRecursively(n1, n2));
    System.out.println();



    // Prefix and Postfix --> From the Recursion Assignment
    int x = 10;
    int y = 20;
    System.out.printf("Printing result of x + 1 = %d\n", x + 1);
    System.out.printf("Printing result of y - 1 = %d\n", y - 1);
    System.out.println();
    x = 10;
    y = 20;
    System.out.printf("Printing postfix x = %d\n", x++);
    System.out.printf("Printing postfix y = %d\n", y--);
    System.out.printf("Printing x after postfix increment: %d\n", x);
    System.out.printf("Printing y after postfix decrement: %d\n", y);
    System.out.println();
    x = 10;
    y = 20;
    System.out.printf("Printing prefix x = %d\n", ++x);
    System.out.printf("Printing prefix x = %d\n", --y);
}
}
}
