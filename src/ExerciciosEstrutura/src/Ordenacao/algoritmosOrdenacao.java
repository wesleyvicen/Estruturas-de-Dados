//Implemente os seguintes algoritmos de ordenação:
//	a) Insertion Sort
//	b) Selection Sort
//	c) Merge Sort
//	d) Quick Sort
package Ordenacao;

public class algoritmosOrdenacao {

	/* INICIO BUBBLE SORT */
	public static void bubbleSort(int array[], int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j] > array[(j + 1)]) {
					temp = array[j];
					array[j] = array[(j + 1)];
					array[(j + 1)] = temp;
				}
			}
		}
		print(array, n);
	}
	/* FIM BUBBLE SORT */

	/* INSERT SORT */
	public static void InsertionSort(int a[], int n) {
		for (int i = 1; i < n; i++) {
			int val = a[i];
			int hole = i;
			while (hole > 0 && a[hole - 1] > val) {
				a[hole] = a[hole - 1];
				hole = hole - 1;
			}
			a[hole] = val;
		}
		print(a, n);
	}
	/* FIM INSERT SORT */

	/* INICIO SELECTION SORT */
	public static void SelectionSort(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			int imin = i;
			int temp;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[imin])
					imin = j;
			}
			temp = a[i];
			a[i] = a[imin];
			a[imin] = temp;
		}
		print(a, n);
	}
	/* FIM SELECTION SORT */

	/* INICIO MERGE SORT */

	public static void MergeSort(int a[], int n) {

		if (n <= 1)
			return;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = a[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = a[i];
		MergeSort(left, mid);
		MergeSort(right, n - mid);
		Merge(left, right, a);

	}

	public static void Merge(int left[], int right[], int a[]) {
		int nL = left.length;
		int nR = right.length;
		int i, j, k;
		i = j = k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				a[k] = left[i];
				i++;
				k++;
			} else {
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < nL) {
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
	/* FIM MERGE SORT */

	/* INICIO QUICK SORT */
	public static void QuickSort(int a[], int start, int end) {
		if (start < end) {
			int pIndex = QuickPartition(a, start, end);
			QuickSort(a, start, pIndex - 1);
			QuickSort(a, pIndex + 1, end);
		} else
			return;

	}

	public static int QuickPartition(int a[], int start, int end) {
		int temp;
		int pivot = a[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (a[i] <= pivot) {
				// swap a[i],apindex
				temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
			}
		}
		temp = a[pIndex];
		a[pIndex] = a[end];
		a[end] = temp;
		return pIndex;
	}
	/* FIM QUICK SORT */

	public static void print(int a[], int n) {
		System.out.println();
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + "\t");
	}
}
