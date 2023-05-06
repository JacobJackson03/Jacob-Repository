package weekThree;
import javax.swing.*;
public class Login {

    public static void main(String[] args) {

        String userName = "JJ";
        String password = "word";
        String name;
        String pw;
        String message;

        name = JOptionPane.showInputDialog("enter user name ");
        pw = JOptionPane.showInputDialog("enter password");
        if (userName.equals(name) && password.equals(pw))
        {
            message = "Welcome to CS121";
        } else if (userName.equals(name) && !password.equals(pw)){
            message = "Password is incorrect";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
