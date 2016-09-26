package listas;

import nodes.DoublyLinkedNode;
import nodes.SimpleNode;
import tads.Lista;

public class ListaDuplamenteLigada<T extends Comparable<T>> implements Lista<T> {

	private DoublyLinkedNode<T> inicio;
	private DoublyLinkedNode<T> fim;
	private int size = 0;

	@Override
	public void adicionar(T elemento) {
		DoublyLinkedNode<T> novo = new DoublyLinkedNode<T>(elemento);
		if (size == 0) {
			inicio = fim = novo;
		} else if (elemento.compareTo(inicio.getInfo()) <= 0) {
			novo.setNext(inicio);
			inicio.setPrevious(novo);
			inicio = novo;
		} else if (elemento.compareTo(fim.getInfo()) >= 0) {
			novo.setPrevious(fim);
			fim.setNext(novo);
			fim = novo;
		} else {
			DoublyLinkedNode<T> aux = inicio;
			while (elemento.compareTo(aux.getInfo()) > 0) {
				aux = aux.getNext();
			}
			novo.setNext(aux);
			novo.setPrevious(aux.getPrevious());
			aux.getPrevious().setNext(novo);
			aux.setPrevious(novo);
		}
		size++;
	}

	@Override
	public boolean remover(T elemento) {

		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T elemento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean remover(int index) {
		if (size > 0 && index >= 0 && index < size) {
			DoublyLinkedNode<T> aux;
			if (index <= size / 2) {
				aux = inicio;
				for (int i = 0; i < index; i++) {
					aux = aux.getNext();
				}
				if (aux != inicio) {
					aux.getPrevious().setNext(aux.getNext());
					aux.getNext().setPrevious(aux.getPrevious());
				} else {
					inicio = inicio.getNext();
					inicio.setPrevious(null);
				}
			} else {
				aux = fim;
				int n = size - index - 1;
				for (int i = 0; i < n; i++) {
					aux = aux.getPrevious();
				}
				if (aux != fim) {
					aux.getPrevious().setNext(aux.getNext());
					aux.getNext().setPrevious(aux.getPrevious());
				} else {
					fim = fim.getPrevious();
					fim.setNext(null);
				}
			}
			size--;
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		String retorno = inicio.getInfo() + " <-> ";
		DoublyLinkedNode<T> aux = inicio.getNext();
		while (aux.getNext() != null) {
			retorno += aux.getInfo() + " <-> ";
			aux = aux.getNext();
		}
		return retorno + aux.getInfo();
	}

}
