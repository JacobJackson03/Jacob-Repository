package weekFive;
import java.util.Scanner;
public class Method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printName("John");

        printStudentInfo("John", 19, 3.8);

        System.out.println("Enter a fahrenheit temperature");
        int fahrenheit = Integer.parseInt(scanner.nextLine());
        System.out.printf("Celsius: %.1f\n", convertToCelsius(fahrenheit));

        System.out.println("Enter a celsius temperature");
        double celsius = Double.parseDouble(scanner.nextLine());
        System.out.printf("Fahrenheit: %d\n", convertToFahrenheit(celsius));

        int number = 10;
        incrementNumber(number);
        System.out.printf("Number value in main: %d\n", number);
    }
    public static void incrementNumber(int number) {
        number++;
        System.out.printf("Number value in method: %d\n", number);
    }
    public static Double convertToCelsius(int f_temp) {
        double celsius = (f_temp - 32) * 5.0/9;
        return celsius;
    }
    public static int convertToFahrenheit(double c_temp) {
        double fahrenheit = (9/5 * c_temp )+ 32;
        return (int)fahrenheit; // casting double to int
    }
    public static void printStudentInfo(String name, int age, double gpa) {
        System.out.printf("Name: %s\nAge: %d\nGPA: %.1f\n", name, age, gpa);
    }
    public static void printName(String name) {
        System.out.println(name);
    }
}
