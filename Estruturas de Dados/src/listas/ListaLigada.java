package listas;

import tads.Lista;

public class ListaLigada<T extends Comparable<T>> implements Lista<T> {

	private Node<T> primeiro;

	@Override
	public void adicionar(T elemento) {

		Node<T> novo = new Node<T>(elemento);

		if (vazia()) {
			primeiro = novo;
		} else if (primeiro.getInfo().compareTo(elemento) > 0) {
			novo.setNext(primeiro);
			primeiro = novo;
		} else {
			Node<T> aux = primeiro;
			while (aux.getNext() != null) {
				if (aux.getNext().getInfo().compareTo(elemento) > 0) {
					break;
				}
				aux = aux.getNext();
			}
			novo.setNext(aux.getNext());
			aux.setNext(novo);
		}
	}

	@Override
	public boolean remover(T elemento) {
		if (!vazia()) {
			Node<T> aux = primeiro;
			while (aux.getNext() != null) {
				if (aux.getNext().getInfo().equals(elemento)) {
					aux.setNext(aux.getNext().getNext());
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
	public void get(T elemento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void indexOf(T elemento) {
		// TODO Auto-generated method stub

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
		Node<T> aux = primeiro;
		while (aux != null) {
			retorno += " -> " + aux.getInfo().toString();
			aux = aux.getNext();
		}
		return retorno;
	}

}
