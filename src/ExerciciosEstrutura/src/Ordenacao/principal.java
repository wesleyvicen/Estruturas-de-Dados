package Ordenacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal extends algoritmosOrdenacao {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("\n\n SELECIONE UM ALGORITMO DE ORDENAÇÃO!\n\n1.Bubble Sort\n2.Insertion Sort."
					+ "\n3.Selection Sort.\n4.Merge Sort.\n5.Quick Sort.\n6.Exit.");
			ch = Integer.parseInt(br.readLine());
			if (ch == 6)
				return;
			System.out.print("\n Entre com a quantidade de Números Inteiros:");
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(br.readLine());
			}
			switch (ch) {
			case 1:
				bubbleSort(a, n);
				break;
			case 2:
				InsertionSort(a, n);
				break;
			case 3:
				SelectionSort(a, n);
				break;
			case 4:
				MergeSort(a, n);
				print(a, n);

				break;
			case 5:
				int start = 0;
				int end = n - 1;
				QuickSort(a, start, end);
				print(a, n);
				break;
			}

		} while (ch != 6);
	}
}
