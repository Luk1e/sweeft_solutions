package org.example;


import org.example.solutions.*;
import org.example.dataStructures.*;


import java.util.Arrays;
import java.util.List;


/**
 * Main: Main class to test solutions
 * <p>
 * This class contains the main method to test the solutions provided in the org.example.solutions package.
 */
public class Main {
    public static void main(String[] args) {
        // test 1
        System.out.println("Test 1");
        System.out.println("Expression: 5+20-8+5 | Expected: 22 | Result: " + Task1.evaluateExpression("5+20-8+5"));

        // test 2
        List<String> strings = Arrays.asList("abbcc", "abc", "abcabc", "cabcbb");

        System.out.println("\nTest 2");
        System.out.println("Input list: " + strings);
        System.out.println("Number of happy strings: " + Task2.numberOfHappyStrings(strings));

        // test 3
        LinkedList list = new LinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(5);

        System.out.println("\nTest 3");
        System.out.println("Original List:");
        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }

        System.out.println("\nreversed List:");
        current = Task3.reverseList(list.head);
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }

        // test 4
        int[] nums1 = {1, 2, 3, 3, 4, 5};
        int[] nums2 = {3, 4, 4, 5, 6, 7};

        System.out.println("\n\nTest 4");
        System.out.println("Input lists: " + Arrays.toString(nums1) + ", " + Arrays.toString(nums2));
        System.out.println("Intersection: " + Arrays.toString(Task4.findIntersection(nums1, nums2)));

        // test 5
        int[] inputArray = {6, 2, 2, 3, 4, 1};
        int k = 8;

        System.out.println("\nTest 5");
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Input k : " + k);
        System.out.println("Maximum length: " + Task5.lenOfLongSubarr(inputArray, k));

        // test 6
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        System.out.println("\nTest 6");
        System.out.println("Input array: " + Arrays.toString(array));
        System.out.println("Input sequence: " + Arrays.toString(sequence));
        System.out.println("Is valid sequence: " + Task6.isValidSequence(array, sequence));
    }
}