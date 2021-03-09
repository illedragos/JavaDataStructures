
public class QueueUsingArray {
	
	private int capacity;
	int queue[];
	int front;
	int rear;
	int size;
	
	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		front=0;
		rear=-1;
		size=0;
		queue = new int[capacity];
	}
	
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue Full");
		}
		else {
			rear=(rear+1)%capacity;
			queue[rear] = data;
			size++;		
		}

	}
	
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue empty");
		}
		else {
			front=(front+1)%capacity;
			size--;
		}
		
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue empty");
			   System.exit(1);
		}
		return queue[0];
		
	}
	
	public boolean isFull() {
		if(size == capacity) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printQueue() {
		for(int i=0; i<size;i++) {
			System.out.println(queue[(front+i)%capacity]);
		}
	}

}
