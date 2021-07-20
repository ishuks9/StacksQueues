public class QueueImp {
	public static void main(String[] args) {
		Queue queue = new Queue(3);
	
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.dequeue();
		
	}
}
