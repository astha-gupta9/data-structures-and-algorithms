// LeetCode 206 - Reverse Linked List

// Time Complexity: O(n)
// Space Complexity: O(1)

package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head; // current ptr
        ListNode prev = null; // current's prev node ptr

        // iterate list
        while (curr != null) {
            ListNode next = curr.next;

            // reverse the sequence
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; // new head after complete reversal
    }
}