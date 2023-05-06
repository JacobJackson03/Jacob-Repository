package weekSeven;
import java.util.Scanner
public class ArrayDemo {
        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);

            //Declaring arrays with a size of 5
            // using the new keyword --> similar to Scanner class

            // The data type in front of the [] --> shows what data type the array will hold.
            // The name of the array will be after the square brackets [].
            // initilizing the size of the array -->  new String[5]; placing the size you want the array.
            // here the size is 5.

            String[] firstNames = new String[5];
            String[] lastNames = new String[5];
            int[] ages = new int[5];

            //using the for loop to add the users input inside of the arrays.
            for (int i = 0; i < 5; i++)
            {
                System.out.println("First name: ");
                firstNames[i] = console.nextLine();
                System.out.println("Last name: ");
                lastNames[i] = console.nextLine();
                System.out.println("Age: ");
                ages[i] = Integer.parseInt(console.nextLine());
                System.out.println();
            }

            System.out.printf("%-14s %s\n", "Name", "Age");

            for (int i = 0; i < firstNames.length; i++)
            {
                System.out.printf("%-14s %d\n",
                        firstNames[i] + " " +lastNames[i], ages[i]);
            }
            console.close();

      /*
      * ----------------- THIS IS ANOTHER WAY TO DO WHAT IS ABOVE --------
      *
      * //Another way to assign values to a String array for firstNames and lastNames
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
      * */
        }
}
