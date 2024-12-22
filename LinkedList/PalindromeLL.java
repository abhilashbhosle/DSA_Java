
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

public class PalindromeLL {

    public boolean isPalindrome(Node head) {
        Node temp = head;
        return checkPalindrome(head, temp);
    }

    boolean checkPalindrome(Node head, Node temp) {
        if (temp == null || temp.next == null) {
            return false;
        }
        checkPalindrome(head, temp.next);
		printLinkedList(head);
		printLinkedList(temp.next);
        // if (head != temp.next) {
        //     return false;
        // } else {
        //     head = head.next;
        // }
        // if (head == temp) {
        //     return true;
        // }
        return true;
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
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
    }
}
