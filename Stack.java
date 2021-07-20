public class Stack{
	
	int capacity;//10 size of array
	int [] array; //defining array
	//T[]array;
	int top; //-1
	
	public Stack(int size) {             //parametorized constructor
		array = new int [size];
		this.capacity=size;
		this.top=-1;
	}
	
	public void push (int element){
		
		if(isFull()) {
			System.out.println("stack is full and can't insert element");
			System.exit(1);
		}
		
		System.out.println("Inserting "+element+" to the stack");
		array[++top]=element;              //preincrement 
	} 
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty and no space");
			System.exit(1);
		}
		System.out.println("removing the value: "+array[top--]);
		return array[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.exit(1);
		}else {
			return array[top];
		}
		return -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull () {
		
		return top== capacity-1;
	}
	
	

}
