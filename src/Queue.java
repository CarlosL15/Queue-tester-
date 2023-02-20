
public interface Queue<T> {

	public boolean empty();
	public boolean full();
	public boolean enqueue(T el);
	public T dequeue();
	public void display();
}
