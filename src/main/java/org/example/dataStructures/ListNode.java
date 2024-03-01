package org.example.dataStructures;

/**
 * ListNode: Node for a Singly Linked List
 * <p>
 * This class represents a node for a singly linked list data structure.
 * Each node contains an integer value and a reference to the next node in the list.
 */
public class ListNode {

    /**
     * The integer data stored in the node.
     */
    public int data;

    /**
     * Reference to the next node in the list.
     */
    public ListNode next;

    /**
     * Constructs a new ListNode with the given data.
     *
     * @param data The integer value to be stored in the node.
     */
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}