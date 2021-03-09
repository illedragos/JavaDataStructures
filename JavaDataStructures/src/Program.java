public class Program {

	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(6);
		q.enQueue(6);
		q.enQueue(5);
		q.enQueue(4);
		q.enQueue(3);
		q.enQueue(2);
		q.enQueue(1);
			
		q.deQueue();
		q.deQueue();
		
		q.enQueue(0);
		
		q.printQueue();
		


	}

}
