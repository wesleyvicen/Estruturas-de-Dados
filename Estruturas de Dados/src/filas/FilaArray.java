package filas;

import testes.filas.Fila;

public class FilaArray<T> implements Fila<T> {

	private Object[] array;
	private int fim = -1;

	public FilaArray() {
		array = new Object[10];
	}

	@Override
	public void enqueue(T elemento) {
		if (fim < 0) {
			array[++fim] = elemento;
		} else {
			if (fim + 1 >= array.length) {
				redimensionar(array.length * 2);
			}
			array[++fim] = elemento;
		}

	}

	@Override
	public T dequeue() {

		if (fim >= 0) {
			T retorno = (T) array[0];
			int aux = 0;
			while (aux < fim) {
				array[aux] = array[aux + 1];
				aux++;
			}
			fim--;
			return retorno;
		}

		return null;
	}

	@Override
	public int size() {
		return fim + 1;
	}

	@Override
	public String toString() {
		if (fim >= 0) {
			String retorno = "[ ";
			for (int i = 0; i < fim; i++) {
				retorno += array[i] + ", ";
			}
			retorno += array[fim];
			return retorno + " ]";
		} else {
			return "[]";
		}
	}

	@Override
	public boolean isEmpty() {
		return fim < 0 ? true : false;
	}

	private void redimensionar(int novoTamanho) {
		Object[] novoArray = (Object[]) new Object[novoTamanho];
		for (int i = 0; i <= fim && i < novoTamanho; i++) {
			novoArray[i] = array[i];
		}
		array = novoArray;
	}

}
