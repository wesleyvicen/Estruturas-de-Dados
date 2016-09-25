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
		// TODO Auto-generated method stub
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
	public int size() {
		// TODO Auto-generated method stub
		return 0;
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
