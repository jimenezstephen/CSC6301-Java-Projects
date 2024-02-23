package stack;

import java.util.Scanner;
import java.util.Stack;
/**
 * Creates a stack of integers based on user input and prints it.
 * @author Stephen Jimenez
 * @version 1.0
 * @since week 5 of CSC6301
 */
public class StackPractice {
    /**
     * Main method of the class.
     * @param args default parameter of main method, not used
     * @since week 5 of CSC6301
     */
    public static void main(String[] args) {
        // create empty stack
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        // prompt user for the length of the stack
        System.out.print("Enter an integer that will be the length of the stack: ");
        int lengthOfStack = sc.nextInt();
        // integers entered by user pushed to stack
        for (int i = 0; i < lengthOfStack; i ++) {
            System.out.print("Enter an integer to add to the stack: ");
            st.push(sc.nextInt());
        }
        sc.close();
        // print stack
        System.out.println(st);

    }
}
