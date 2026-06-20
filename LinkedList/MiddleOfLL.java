// LeetCode 876 - Middle of the Linked List

// Time complexity: O(n)
// Space complexity: O(1)

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

public class MiddleOfLL {
    public ListNode middleNode(ListNode head) {

        // Tortoise-Hare Method

        ListNode fast = head; // hare node
        ListNode slow = head; // tortoise node

        // since, hare moves two steps at a time and tortoise moves one step at a time,
        // hence on reaching the end of the list, tortoise will only cover half of the
        // distance covered by hare

        // traverse till hare reaches end of the list
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // move hare two steps
            slow = slow.next; // move tortoise one step
        }

        return slow; // middle node of the list
    }
}
