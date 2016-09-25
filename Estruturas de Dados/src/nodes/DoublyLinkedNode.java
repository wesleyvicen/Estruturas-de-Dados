package nodes;

public class DoublyLinkedNode<T> {

	private DoublyLinkedNode<T> previous;
	private DoublyLinkedNode<T> next;
	private T info;

	public DoublyLinkedNode(T info) {
		this.info = info;
	}

	public DoublyLinkedNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyLinkedNode<T> previous) {
		this.previous = previous;
	}

	public DoublyLinkedNode<T> getNext() {
		return next;
	}

	public void setNext(DoublyLinkedNode<T> next) {
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
}
