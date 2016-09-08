package pilhas;

public class Node<T> {

	private Node<T> below;
	private T info;

	public Node(T info) {
		setInfo(info);
	}

	public Node(T info, Node<T> below) {
		setInfo(info);
		setBelow(below);
	}

	public Node<T> getBelow() {
		return below;
	}

	public void setBelow(Node<T> below) {
		this.below = below;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
