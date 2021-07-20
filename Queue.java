public class Queue {
	int capacity;
	int array[];
	int front;
	int rear;
	int size = 0;

	public void Queue(int capacity) {
		this.capacity = capacity;
		front = 0;
		array = new int[capacity];

	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is  not accepting any further element");

		} else {
			System.out.println("Current Size :" + size);
			size++;
			System.out.println("Stack has :");
		}
	}

	public boolean isFull() {
		if (size == capacity) {
			return true;
		}
		return false;
	}
}
