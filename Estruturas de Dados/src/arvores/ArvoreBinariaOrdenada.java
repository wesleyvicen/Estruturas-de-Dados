package arvores;

import nodes.TreeBinaryNode;
import tads.Arvore;

public class ArvoreBinariaOrdenada<T extends Comparable<T>> implements Arvore<T> {

	TreeBinaryNode<T> raiz;

	@Override
	public void adicionar(T elemento) {
		TreeBinaryNode<T> novo = new TreeBinaryNode<T>(elemento);
		if (raiz == null) {
			raiz = novo;
		} else {
			TreeBinaryNode<T> aux = raiz;
			while (true) {
				if (elemento.compareTo(aux.getInfo()) == 0) {
					break;
				} else if (elemento.compareTo(aux.getInfo()) > 0) {
					if (aux.getRight() == null) {
						aux.setRight(novo);
						break;
					}
					aux = aux.getRight();
				} else if (elemento.compareTo(aux.getInfo()) < 0) {
					if (aux.getLeft() == null) {
						aux.setLeft(novo);
						break;
					}
					aux = aux.getLeft();
				}
			}
		}

	}

	@Override
	public boolean remover(T elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existe(T elemento) {
		// TODO Auto-generated method stub
		return false;
	}

}
