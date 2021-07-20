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
	
	public void dequeue() {
		if (size == 0) {
			System.out.println("Queue is Empty so cant delete the element");
		} else {
			front++;
			if (front == capacity - 1) {
				int DeletedElement = array[front - 1];
				System.out.println("Deleted Element :" + DeletedElement);
				front = 0;
			} else {
				int DeletedElement = array[front - 1];
				System.out.println("Deleted Element :" + DeletedElement);
			}

			size--;
			rear--;
		}

	}

	public boolean isFull() {
		if (size == capacity) {
			return true;
		}
		return false;
	}
}
