
class DLL {

    Node head;
    Node tail;

    // inserting at head
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
    }

    // insert at tail/last
    public void insertLast(int val) {
        Node node = new Node(val);
        node.prev = tail;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = tail;
        }
    }

    // insert at index
    public void insertAtIndex(int index, int val) {
        Node value = new Node(val);
        if (index == 0) {
            insertFirst(val);
            return;
        }
        int size = 1;
        Node node = head;
        while (size < index) {
            if (node.next != null) {
                node = node.next;
            }
            size += 1;
        }
        Node hold = node.next;
        node.next = value;
        value.prev = node;
        value.next = hold;
    }

    // delete head
    public void deleteFirst() {
        head = head.next;
        head.prev = null;
        if (head == null) {
            tail = null;
        }
    }

    // delete tail
    public void deleteLast() {
        if (tail == null) {
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    // displaying the list
    public void display() {
        Node temp = head;
        Node last = null;
        // print start
        while (temp != null) {
            System.out.print(temp.val + " => ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("");
        // print reverse
        while (last != null) {
            // System.out.print(last.val + " => ");
            last = last.prev;
        }
    }

    private class Node {

        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
