package listas;

public class Node<T> {

	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	private Node<T> next;

	public Node(T elemento) {
		info = elemento;
	}

	public Node(T elemento, Node<T> Proximo) {
		info = elemento;
		next = Proximo;
	}

	public Node() {
	}

}
