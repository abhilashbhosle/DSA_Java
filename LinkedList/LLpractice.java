
class list{
	private Node head;
	private Node tail;
	private int size;

	public  list() {
        this.size = 0;
    }

	private class Node{
		private int value;
		private Node next;
		public Node(int value){
			this.value=value;
		}
		public Node(int value, Node next){
			this.value=value;
			this.next=next;
		}
	}

	// Insert first
	public void insertFirst(int val){
		Node node=new Node(val);
		node.next=head;
		head=node;
		if(tail==null){
			this.tail=head;
		}
		size++;
	}

	// Insert last
	public void insertLast(int val){
		Node node=new Node(val);
		if(tail==null){
			insertFirst(val);
		}
		tail.next=node;
		tail=node;
		size++;
	}

	// Insert at position
	public void insertAtIndex(int val, int index){
		if(index==0){
			insertFirst(val);
		}
		if(index==size){
			insertLast(val);
		}
		Node temp=head;
		for(int i=0;i<index;i++){
			temp=temp.next;
		}
		Node node=new Node(val);
		Node hold=temp.next;
		temp.next=node;
		node.next=hold;
		size++;
	}

	// delete first
	public int deleteFirst(){
		int value=head.value;
		head=head.next;
		if(head==null){
			tail=head;
		}
		size--;
		return value;
	}

	// delete last
	public int deleteLast(){
		if(size<=1){
			deleteFirst();
		}
		int value=tail.value;
		Node temp=get(size-2);
		tail=temp;
		tail.next=null;
		return value;
	}

	// get node at any point
	public Node get(int index){
		Node node=head;
		for(int i=0;i<index;i++){
			node=node.next;
		}
		return node;
	}
}
public class LLpractice{
	public static void main(String[] args) {
		
	}
}