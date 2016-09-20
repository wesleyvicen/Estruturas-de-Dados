package nodes;

public class SimpleNode<T> {

	private SimpleNode<T> next;
	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public SimpleNode<T> getNext() {
		return next;
	}

	public void setNext(SimpleNode<T> next) {
		this.next = next;
	}

	public SimpleNode(T elemento) {
		info = elemento;
	}

	public SimpleNode(T elemento, SimpleNode<T> Proximo) {
		info = elemento;
		next = Proximo;
	}

	public SimpleNode() {
	}

}
