public class Stack{
	
	int capacity;
	int [] array; 
	int top; 
	
	public Stack(int size) {             
		this.capacity=size;
		this.top=-1;
	}
	
	public void push (int element){
		
		if(isFull()) {
			System.out.println("stack is full and can't insert element");
			System.exit(1);
		}
		
		System.out.println("Inserting "+element+" to the stack");
		array[++top]=element;              
	
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull () {
		
		return top== capacity-1;
	}
	
	

}
