package weekTen;
import java.util.Stack;
public class FactorialStack {public static int factorial(int n) {
    //instance of the stack class
    Stack<Integer> stack = new Stack<Integer>();

    //pushing 1 onto the stack
    stack.push(1);

    // uses a for loop to iterate
    //starting i at 2 because we know after 1 * 2
    // we will push onto the stack
    // the stack.peek() * i
    // stack.peek() will initially be 1
    // 1* 2 -->
    for (int i = 2; i <= n; i++) {
        stack.push(stack.peek() * i);
    }

    return stack.pop();

}



}
}
