package nodes;

public class TreeBinaryNode<T> {

	T info;
	TreeBinaryNode<T> left;
	TreeBinaryNode<T> right;

	public TreeBinaryNode() {
	}

	public TreeBinaryNode(T info) {
		setInfo(info);
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public TreeBinaryNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeBinaryNode<T> left) {
		this.left = left;
	}

	public TreeBinaryNode<T> getRight() {
		return right;
	}

	public void setRight(TreeBinaryNode<T> right) {
		this.right = right;
	}

}
