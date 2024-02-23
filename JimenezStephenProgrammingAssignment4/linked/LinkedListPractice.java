package linked;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
/**
 * Creates a linked list of integers based on user input then sorts and prints it.
 * @author Stephen Jimenez
 * @version 1.0
 * @since week 4 of CSC6301
 */
public class LinkedListPractice {
    /**
     * Main method of the class.
     * @param args default parameter of main method, not used
     * @since week 4 of CSC6301
     */
    public static void main(String[] args) {
        // create empty linked list
        LinkedList<Integer> linked = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        // prompt user for the length of the linked list
        System.out.print("Enter an integer that will be the length of the linked list: ");
        int lengthOfList = sc.nextInt();
        // integers entered by user added to the linked list
        for (int i = 0; i < lengthOfList; i ++) {
            System.out.print("Enter an integer to add to the list: ");
            linked.add(sc.nextInt());
        }
        sc.close();
        // sort into ascending order and print
        Collections.sort(linked);
        System.out.println(linked);

    }
}
