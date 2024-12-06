
class CLL {

    Node head;
    Node tail;

    //insert
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = head;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

	// delete
	public void delete(int val){
		Node node=head;
		if(val==head.val){
			tail=head;
			head=head.next;
		}
		while(node.next.val!=val){
			node=node.next;
		}
		node.next=node.next.next;
	}

	// display
    public void displayCC() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " => ");
                node = node.next;
            } while (node != head);
        }
    
    }

    private class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
}
