
public class Queue {

    int[] data;
    static final int DEFAULT_SIZE = 5;
    int end = 0;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data=new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

	public boolean insert(int item){
		if(isFull()){
			System.out.println("Queue is full");
			return false;
		}
		data[end]=item;
		end++;
		return true;
	}

	public int remove() throws QueueException{
		if(isEmpty()){
			throw new QueueException("Stack is empty, nothing to remove");
		}
		int removed=data[0];

		for(int i=1; i<end; i++){
			data[i-1]=data[i];
		}
		end--;
		return removed;
	}

	public int front() throws QueueException{
		if(isEmpty()){
			throw new QueueException("Nothing in queue");
		}
		return data[0];
	}


}
