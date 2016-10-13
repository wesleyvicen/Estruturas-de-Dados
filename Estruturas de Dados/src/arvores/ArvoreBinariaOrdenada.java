package arvores;

import nodes.TreeBinaryNode;
import tads.Arvore;

public class ArvoreBinariaOrdenada<T extends Comparable<T>> implements Arvore<T> {

	public static final int EM_ORDEM = 1;
	public static final int PRE_ORDEM = 2;
	public static final int POS_ORDEM = 3;

	private TreeBinaryNode<T> raiz;
	int numeroElementos = 0;

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
						numeroElementos++;
						break;
					}
					aux = aux.getRight();
				} else if (elemento.compareTo(aux.getInfo()) < 0) {
					if (aux.getLeft() == null) {
						aux.setLeft(novo);
						numeroElementos++;
						break;
					}
					aux = aux.getLeft();
				}
			}
		}

	}

	public void imprimir(int modo) {
		switch (modo) {
		case EM_ORDEM:
			imprimirEmOrdem(raiz);
			break;
		case PRE_ORDEM:
			imprimirPreOrdem(raiz);
			break;
		case POS_ORDEM:
			imprimirPosOrdem(raiz);
			break;
		default:
			System.out.println("modo invalido");
			break;
		}
	}

	private void imprimirEmOrdem(TreeBinaryNode<T> inicio) {
		if (inicio != null) {
			imprimirEmOrdem(inicio.getLeft());
			System.out.println(inicio.getInfo());
			imprimirEmOrdem(inicio.getRight());
		}
	}

	private void imprimirPreOrdem(TreeBinaryNode<T> inicio) {
		if (inicio != null) {
			System.out.println(inicio.getInfo());
			imprimirPreOrdem(inicio.getLeft());
			imprimirPreOrdem(inicio.getRight());
		}
	}

	private void imprimirPosOrdem(TreeBinaryNode<T> inicio) {
		if (inicio != null) {
			imprimirPosOrdem(inicio.getLeft());
			imprimirPosOrdem(inicio.getRight());
			System.out.println(inicio.getInfo());
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
