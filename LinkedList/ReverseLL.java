
// node in a linked list
class Node {

    // Data stored in the node
    int data;
    // Pointer to the next
    // node in the list
    Node next;

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {
    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
