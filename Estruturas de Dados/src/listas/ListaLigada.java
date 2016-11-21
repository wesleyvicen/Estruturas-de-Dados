package listas;

import nodes.SimpleNode;
import testes.listas.Lista;

public class ListaLigada<T extends Comparable<T>> implements Lista<T> {

	private SimpleNode<T> primeiro;
	private int size = 0;

	public ListaLigada() {
	}

	public ListaLigada(T[] lista) {
		for (T t : lista) {
			adicionar(t);
		}
	}

	@Override
	public void adicionar(T elemento) {

		SimpleNode<T> novo = new SimpleNode<T>(elemento);

		if (vazia()) {
			primeiro = novo;
		} else if (primeiro.getInfo().compareTo(elemento) > 0) {
			novo.setNext(primeiro);
			primeiro = novo;
		} else {
			SimpleNode<T> aux = primeiro;
			while (aux.getNext() != null) {
				if (aux.getNext().getInfo().compareTo(elemento) > 0) {
					break;
				}
				aux = aux.getNext();
			}
			novo.setNext(aux.getNext());
			aux.setNext(novo);
		}
		size++;
	}

	@Override
	public boolean remover(T elemento) {
		if (!vazia()) {
			SimpleNode<T> aux = primeiro;
			while (aux.getNext() != null) {
				if (aux.getNext().getInfo().equals(elemento)) {
					aux.setNext(aux.getNext().getNext());
					size--;
					return true;
				}
				aux = aux.getNext();
			}
			return false;
		} else {
			return false;
		}
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		SimpleNode<T> aux = primeiro;
		for (int i = 0; i < index; i++) {
			aux = aux.getNext();
		}
		if (aux != null)
			return aux.getInfo();
		else {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public int indexOf(T elemento) {
		int index = 0;
		SimpleNode<T> aux = primeiro;
		while (aux != null) {
			if (aux.getInfo().equals(elemento)) {
				return index;
			}
			index++;
			aux = aux.getNext();
		}
		return -1;
	}

	private boolean vazia() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String retorno = "|";
		SimpleNode<T> aux = primeiro;
		while (aux != null) {
			retorno += " -> " + aux.getInfo().toString();
			aux = aux.getNext();
		}
		return retorno;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean remover(int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
