public class StackMain{
	public static void main(String[] args)  throws StackException{
		// Stack stack= new Stack();
		// stack.push(20);
		// stack.push(30);
		// stack.push(40);
		// stack.push(50);
		// stack.push(60);
		// System.err.println(stack.peek());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());
		// System.out.println(stack.pop());

		DynamicStack stack=new DynamicStack(5);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(60);
		// System.err.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}