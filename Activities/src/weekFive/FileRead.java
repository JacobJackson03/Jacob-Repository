package weekFive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead{

        public static void main(String[] args) throws FileNotFoundException {
    // file on desktop
    // Instance of the file class inputFile1
    //File inputFile1 = new File("C:\\Users\\ladelle.augustine\\Desktop\\0_Spring2023\\0_SP23_CS121\\Github ClassSpring\\SpringCS121-TestingCode\\CS121 Spring Code");
    // file in project folder
    File inputFile1 = new File("aboutme.txt");

    try {
        // reading the file we use the scanner class.
        Scanner input = new Scanner(inputFile1);

        // read the header and print it to console
        String header = input.nextLine();
        System.out.println(header);
        // read the values
        //.hasNextLine() -> method of scanner class that returns true if there is another line in the input of
        // the input.
        // Notes: The method could block while waiting for input. The scanner does not move past any input.
        //  .next() vs .nextLine()
        //  - next() can read the input only till the space. It can't read two words separated by space.
        //    Also, next() places the cursor in the same line after reading the input.
        //  - nextLine() reads input including space between the words (that is, it reads till the end of line \n).
        while (input.hasNextLine()) {
            //variables
            //String course, int credits, int score

            String name = input.next();
            String animal = input.next();
            String hobby = input.next();
            System.out.printf("%-7s %3s %7s\n",
                    name, animal, hobby);
        }
        input.close();
    } catch(FileNotFoundException e) {
        System.err.println("File not found.");
    }
}
}
