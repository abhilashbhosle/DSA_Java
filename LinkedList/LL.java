
class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // insert at head 
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // insert at tail
    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // insert at position
    public void insertAtPosition(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size) {
            insertLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node hold = temp.next;
        Node node = new Node(val);
        temp.next = node;
        node.next = hold;
        size++;
    }

    // insert recursively at index
    public void insertRec(int index, int val) {
        head = insertRec(index, val, head);
    }

    private Node insertRec(int index, int val, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }
        node.next = insertRec(index - 1, val, node.next);
        return node;
    }

    // delete first
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return val;
    }
    // delete last

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    // get node at any point
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // delete a particular index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void removeDuplicates() {
        head = removeDuplicates(head);
        Node current=head;
       while (current != null) {
        System.out.print(current.value);
        if (current.next != null) {
            System.out.print(" => ");
        }
        current = current.next;
    }
    }

    //remove duplicates
    public Node removeDuplicates(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        if (node.value == node.next.value) {
            node.next = removeDuplicates(node.next.next);
        } else {
            node.next = removeDuplicates(node.next);
        }

        return node;
    }
    // mergetwo list
  

   
    // display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
    }

    // creating the node
    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
 


}
