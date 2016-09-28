package filas;

import tads.Fila;

public class FilaArrayCircular<T> implements Fila<T> {

	private Object[] dados;
	private int size;
	private int inicio;
	private int fim;

	public FilaArrayCircular() {
		dados = new Object[10];
		size = 0;
		inicio = 0;
		fim = -1;
	}

	@Override
	public void enqueue(T elemento) {
		if (size >= dados.length) {
			redimensionar(dados.length * 2);
		}
		fim = circularIncrement(fim, 1, dados.length);
		dados[fim] = elemento;
		size++;
	}

	@Override
	public T dequeue() {
		if (size > 0) {
			T elemento = (T) dados[inicio];
			dados[inicio] = null;
			inicio = circularIncrement(inicio, 1, dados.length);
			return elemento;
		} else {
			return null;
		}
	}

	@Override
	public int size() {
		return size;
	}

	private int circularIncrement(int index, int increment, int length) {
		index = (index + increment) % length;
		if (index >= 0) {
			return index;
		} else {
			return index = index + length;
		}
	}

	@Override
	public boolean isEmpty() {
		return size > 0 ? true : false;
	}

	private void redimensionar(int novoTamanho) {
		Object[] novoArray = new Object[novoTamanho];
		int i = inicio;
		int j = 0;
		while (i <= fim && j < novoTamanho) {
			novoArray[j] = dados[i];
			i = circularIncrement(i, 1, dados.length);
			j++;
		}
		inicio = 0;
		fim = novoTamanho - 1;
		dados = novoArray;
	}

	@Override
	public String toString() {
		String retorno = "[ ";
		for (int i = inicio; i < fim; i = circularIncrement(i, 1, dados.length)) {
			retorno += dados[i] + ", ";
		}
		return retorno + dados[fim] + " ]";
	}
}
