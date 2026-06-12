// GFG - Reverse a Doubly Linked List

// Time Complexity: O(n)
// Space Complexity: O(1)

package LinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseDoublyLL {
    public Node reverse(Node head) {
        // code here

        Node curr = head; // curr node of list
        Node newHead = head; // new head after reversal

        // traverse list
        while (curr != null) {

            // swap prev and next ptr of curr node
            Node temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            newHead = curr; // update new head
            curr = curr.prev; // move curr ptr to next position which is prev ptr after reversal
        }

        return newHead; // new head
    }
}
