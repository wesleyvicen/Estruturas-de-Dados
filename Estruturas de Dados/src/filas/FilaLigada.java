package filas;

import nodes.SimpleNode;
import tads.Fila;

public class FilaLigada<T> implements Fila<T> {

	private SimpleNode<T> inicio;
	private SimpleNode<T> fim;
	private int size = 0;

	@Override
	public void enqueue(T elemento) {
		SimpleNode<T> novo = new SimpleNode<>(elemento);
		if (fim == null) {
			fim = novo;
			inicio = novo;
		} else {
			fim.setNext(novo);
			fim = novo;
		}
		size++;
	}

	@Override
	public T dequeue() {
		if (inicio != fim) {
			T retorno = inicio.getInfo();
			inicio = inicio.getNext();
			size--;
			return retorno;
		} else if (inicio != null) {
			T retorno = inicio.getInfo();
			inicio = null;
			fim = null;
			size--;
			return retorno;
		}
		return null;
	}

	@Override
	public String toString() {
		String retorno = "|";
		SimpleNode<T> aux = inicio;
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
	public boolean isEmpty() {
		return size > 0 ? true : false;
	}

}
