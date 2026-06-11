// LC 237 - Delete Node in a Linked List

// Time Complexity: O(n)
// Space Complexity: O(1)

package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DeleteNodeInLL {
    public void deleteNode(ListNode node) {

        // Traverse linked list from node till the end
        while (node.next != null) {

            // Assigning next node's value to current node
            node.val = node.next.val;

            if (node.next.next == null) {
                node.next = null;     // Remove last node
            } else {
                node = node.next;
            }
        }
    }
}