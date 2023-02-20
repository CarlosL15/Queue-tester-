
public class QueueRef<T> implements Queue<T> {

	private QueueNode<T> front;
	private QueueNode<T> rear;
	
	public boolean empty() {
		return front == null;
	}
	public boolean full() {
		return false; 
	}
	public boolean enqueue(T el) {
		if(empty()) {
			QueueNode<T> node = new QueueNode<T>(el, null);
			front = node;
			rear = node;
			//rear.setNext(node);
			return true;
		}
		else{
			QueueNode<T> node = new QueueNode<T>(el, null);
			rear.setNext(node);
			rear = node;
			return true;
		}
		
	}
	public T dequeue() {
		if(empty()) {
			return null;
		}
		if(front == rear) {
			T el = front.getData();
			front = null;
			rear = null;
			return el;
		}
		T el = front.getData();
		front = front.getNext();
		return el;
	}
	public void display() {
		QueueNode<T> cur;
		System.out.println("[");
		cur = front;
//		cur.getData();
//		cur.getNext();
		
		while(cur != null) {
			System.out.print(cur.getData());
			cur = cur.getNext();
		}
		System.out.println("]");
	}

	}
	
	
	
	



