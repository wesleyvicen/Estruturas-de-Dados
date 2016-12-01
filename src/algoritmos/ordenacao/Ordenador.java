package algoritmos.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class Ordenador<T> {

	@SuppressWarnings("unchecked")
	private static <T extends Comparable<T>> void trocar(int a, int b, List<T> lista) {
		Comparable<?> aux = lista.get(a);
		lista.set(a, lista.get(b));
		lista.set(b, (T) aux);
	}

	private static <T extends Comparable<T>> void merge(List<T> lista, int inicio, int meio, int fim) {
		List<T> aux = new ArrayList<T>();
		int inicio1 = inicio;
		int fim1 = meio;
		int inicio2 = meio;
		int fim2 = fim;
		while (inicio1 < fim1 && inicio2 <= fim2) {
			if (lista.get(inicio1).compareTo(lista.get(inicio2)) <= 0) {
				aux.add(lista.get(inicio1));
				inicio1++;
			} else {
				aux.add(lista.get(inicio2));
				inicio2++;
			}
		}
		while (inicio1 < fim1) {
			aux.add(lista.get(inicio1));
			inicio1++;
		}
		while (inicio2 < fim2) {
			aux.add(lista.get(inicio2));
			inicio2++;
		}
		for (int i = 0; i < aux.size(); i++) {
			lista.set(inicio, aux.get(i));
			inicio++;
		}
	}

	private static <T extends Comparable<T>> void mergeSort(List<T> lista, int inicio, int fim) {
		if (inicio == fim)
			return;
		int meio = (inicio + fim) / 2;
		mergeSort(lista, inicio, meio);
		mergeSort(lista, meio + 1, fim);
		merge(lista, inicio, meio + 1, fim);

	}

	public static <T extends Comparable<T>> void bubbleSort(List<T> lista) {
		for (int i = lista.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (lista.get(j).compareTo((T) lista.get(j + 1)) > 0)
					trocar(j, j + 1, lista);
			}
		}
	}

	public static <T extends Comparable<T>> void selectionSort(List<T> lista) {
	}

	public static <T extends Comparable<T>> void insertionSort(List<T> lista) {
	}

	public static <T extends Comparable<T>> void mergeSort(List<T> lista) {
		mergeSort(lista, 0, lista.size() - 1);
	}

}
