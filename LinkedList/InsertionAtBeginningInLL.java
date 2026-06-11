// GFG - Linked List Insertion At Beginning

// Time Complexity: O(1)
// Space Complexity: O(1)

package LinkedList;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertionAtBeginningInLL {
    public Node insertAtFront(Node head, int x) {
        // code here
        
        Node newHead = new Node(x);     // creation of new head of LL
        newHead.next = head;     // assigning old head to the next pointer of new head
        
        return newHead;     // new head
    }
}
