package weekFive;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class FileWriting {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("aboutme.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String Jacob;
        String PolarBear;
        String Basketball;

        // write a header for the file with spaces between each
        output.printf("%s %s %s\n", "Enter Your name", "Enter Your favorite animal", "Enter Your hobby");
        // ask user for info for 3 people
        for (int i = 1; i <= 3; i++) {
            Jacob = JOptionPane.showInputDialog(String.format("Enter Your name %d", i));
            PolarBear = JOptionPane.showInputDialog("Enter Your favorite animal");
            Basketball = JOptionPane.showInputDialog("Enter Your hobby");
            // print info on one line with spaces between
            output.printf("%s %s %s\n", Jacob, PolarBear, Basketball);
        }
        output.close();
    }
}
