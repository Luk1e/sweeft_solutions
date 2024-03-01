package org.example.solutions;

import org.example.dataStructures.ListNode;

/**
 * Task3: Reverse Linked List
 * <p>
 * This class provides a method to reverse a singly linked list.
 * <p>
 * Time Complexity: O(n), where n is the number of nodes in the linked list.
 * Space Complexity: O(1)
 */
public class Task3 {

    /**
     * Reverse a singly linked list.
     *
     * @param head The head of the linked list to reverse.
     * @return The head of the reversed linked list.
     */
    public static ListNode reverseList(ListNode head) {

        // if list is empty or has one node return head
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        // iterate through the list and reverse the node pointers
        while (current != null) {
            next = current.next;    // store the next node
            current.next = prev;    // reverse the current node's pointer
            prev = current; // move the previous pointer forward
            current = next; // move the current pointer forward
        }

        return prev; // return the new head of the reversed list
    }
}