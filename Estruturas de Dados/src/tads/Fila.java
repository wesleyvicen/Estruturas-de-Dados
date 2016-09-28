package tads;

public interface Fila<T> {
	
	public void enqueue(T elemento);
	public T dequeue();
	public boolean isEmpty();
	public int size();
	
}
