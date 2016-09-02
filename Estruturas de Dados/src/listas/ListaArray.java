package listas;

import tads.Lista;

public class ListaArray<T extends Comparable<T>> implements Lista<T> {

	T[] array;
	int ultimo = -1;

	@SuppressWarnings("unchecked")
	public ListaArray() {
		array = (T[]) new Comparable[10];
	}

	@Override
	public void adicionar(T elemento) {
		if (ultimo + 1 >= array.length) {
			redimensionar(array.length * 2);
		}
		if (ultimo == -1) {
			ultimo++;
			array[ultimo] = elemento;
		} else {
			ultimo++;
			int aux = ultimo;
			while (aux > 0) {
				if (array[aux - 1].compareTo(elemento) < 0) {
					break;
				} else {
					array[aux] = array[aux - 1];
					aux--;
				}
			}
			array[aux] = elemento;
		}
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
		return ultimo + 1;
	}

	private void redimensionar(int novoTamanho) {
		@SuppressWarnings("unchecked")
		T[] novoArray = (T[]) new Comparable[novoTamanho];
		for (int i = 0; i <= ultimo && i < novoTamanho; i++) {
			novoArray[i] = array[i];
		}
		array = novoArray;
	}

	@Override
	public String toString() {
		String retorno = "[ ";
		for (int i = 0; i < ultimo; i++) {
			retorno += array[i] + ", ";
		}
		retorno += array[ultimo];
		return retorno + " ]";
	}

}
