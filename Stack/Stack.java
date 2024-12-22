
public class Stack {

    int[] data;
    static final int DEFAULT_SIZE = 5;
    int ptr = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full, cannot insert the item");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot remove an item from empty stak");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

	public int peek() throws StackException{
		if(isEmpty()){
			throw new StackException("No Item found in a scttack");
		}
		return data[ptr];
	}
}
