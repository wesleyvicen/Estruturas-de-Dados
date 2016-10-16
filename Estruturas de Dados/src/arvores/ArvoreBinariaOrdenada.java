package arvores;

import java.security.InvalidParameterException;

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
			throw new InvalidParameterException("modo invalido");
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

	private boolean remover(TreeBinaryNode<T> node, TreeBinaryNode<T> nodeParent) {
		if (node == null) {
			return false;
		} else if (node.getRight() == null) {
			if (nodeParent != null) {
				if (node.getInfo().compareTo(nodeParent.getInfo()) > 0) {
					nodeParent.setRight(node.getLeft());
					return true;
				} else {
					nodeParent.setLeft(node.getLeft());
					return true;
				}
			} else {
				raiz = node.getLeft();
				return true;
			}
		} else if (node.getLeft() == null) {
			if (nodeParent != null) {
				if (node.getInfo().compareTo(nodeParent.getInfo()) > 0) {
					nodeParent.setRight(node.getRight());
					return true;
				} else {
					nodeParent.setLeft(node.getRight());
					return true;
				}
			} else {
				raiz = node.getRight();
				return true;
			}
		} else {
			TreeBinaryNode<T> aux = node.getRight();
			TreeBinaryNode<T> auxParent = node;
			while (aux.getLeft() != null) {
				auxParent = aux;
				aux = aux.getLeft();
			}
			boolean retorno = remover(aux, auxParent);
			node.setInfo(aux.getInfo());
			return retorno;
		}
	}

	@Override
	public boolean remover(T elemento) {

		TreeBinaryNode<T> parent = null;
		TreeBinaryNode<T> aux = raiz;

		while (aux != null) {
			if (elemento.compareTo(aux.getInfo()) == 0) {
				break;
			} else if (elemento.compareTo(aux.getInfo()) > 0) {
				parent = aux;
				aux = aux.getRight();
			} else if (elemento.compareTo(aux.getInfo()) < 0) {
				parent = aux;
				aux = aux.getLeft();
			}
		}
		return remover(aux, parent);
	}

	@Override
	public boolean existe(T elemento) {
		// TODO Auto-generated method stub
		return false;
	}

}
