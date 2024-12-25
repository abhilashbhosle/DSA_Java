public class QueueMain{
		public static void main(String[] args) throws Exception {
		// Queue queue=new Queue(3);
		// queue.insert(10);
		// queue.insert(20);
		// queue.insert(30);
		// System.out.println(queue.remove());
		// System.out.println(queue.remove());
		// System.out.println(queue.remove());

		// Circular queue//
		// CircularQueue queue=new CircularQueue(3);
		// queue.insert(10);
		// queue.insert(20);
		// queue.insert(30);
		// System.out.println(queue.remove());
		// // System.out.println(queue.front());
		// System.out.println(queue.remove());
		// System.out.println(queue.remove());


		DynamicQueue queue=new DynamicQueue(3);
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		System.out.println(queue.remove()); 
		// System.out.println(queue.front());
		System.out.println(queue.remove()); 
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}
}