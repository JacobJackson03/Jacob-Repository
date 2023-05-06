package weekSeven;

public class ArrayDemo4 {public static void main(String[] args)
{
    //Declaring a String array called names and assigning the size of the array as 5.
    // using the keyword new --> similar to the scanner class
    String[] names = new String[5];

    //assigning each element of the array to a String name.
    names[0] = "Mary";
    names[1] = "Tom";
    names[2] = "John";
    names[3] = "Jane";
    names[4] = "Lisa";

    System.out.printf("There are %d names in the names array\n", names.length);
    System.out.println("The name at index 0 is " + names[0]);
    System.out.printf("The name at index 1 is %s\n", names[1]);
    System.out.printf("The name at index 2 is %s\n", names[2]);
    System.out.printf("The name at index 3 is %s\n", names[3]);
    System.out.printf("The name at index 4 is %s\n", names[4]);

    //Declaring an integer array called scores and assigning the size of the array as 5.
    int[] scores = new int[5];

    //assigning each element of the array to a integer value that are scores.
    scores[0] = 88;
    scores[1] = 100;
    scores[2] = 95;
    scores[3] = 100;
    scores[4] = 85;

    //Another way to assign values to a String array for firstNames and lastNames
    String[] firstNames = {"Mary", "Tom", "John", "Jane", "Lisa"};
    String[] lastNames = {"Johnson", "Jones", "Doe", "Smith", "Allen"};

    //Another way to assign values to an (int) integer array for ages.
    int[] ages = {19, 21, 20, 19 , 18};

    // print the header: -14 is for 14 characters (including blank spaces) left justified
    System.out.printf("%-14s %s\n", "Name", "Age");

    //prints out the values in the first name, last name  and ages.
    for (int i = 0; i < firstNames.length; i++)
    {
        System.out.printf("%-14s %d\n", firstNames[i] + " " +lastNames[i], ages[i]);
    }
}
}
}
