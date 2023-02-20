
public class QueueNode<T> {

	private T data;
	private QueueNode<T> next;
	
	public QueueNode(T data, QueueNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public QueueNode getNext() {
		return next;
	}

	public void setNext(QueueNode<T> next) {
		this.next = next;
	}
	
	
	
}