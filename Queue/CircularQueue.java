public class CircularQueue{
	 int[] data;
    static final int DEFAULT_SIZE = 5;
    int front = 0;
	int end=0;
	int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data=new int[size];
    }

	 public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

	public boolean insert(int item){
		if(isFull()){
			System.out.println("Queue is full");
			return false;
		}
		data[end]=item;
		end++;
		end=end%data.length;
		size++;
		return true;
	}

	public int remove() throws QueueException{
		if(isEmpty()){
			throw new QueueException("Stack is empty, nothing to remove");
		}
		int removed=data[front];
		front++;
		front=front%data.length;
		size--;
		return removed;
	}

	public int front() throws QueueException{
		if(isEmpty()){
			throw new QueueException("Nothing in queue");
		}
		System.out.println(data[front]);
		return data[front];
	}
}