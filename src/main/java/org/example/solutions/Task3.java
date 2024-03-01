public class Task3 {
/*
   Time Complexity: O(n)
   Space Complexity: O(1)
*/
    public static ListNode reverseList(ListNode head) {

        // if list is empty or has one node return head
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        // iterate through the list and revers the node pointers
        while (current != null) {
            next = current.next;    // store the next node
            current.next = prev;    // reverse the current node's pointer
            prev = current; // move the previous pointer forward
            current = next; // move the current pointer forward
        }

        return prev;
    }
}

