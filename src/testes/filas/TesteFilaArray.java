package testes.filas;

import filas.FilaArray;

public class TesteFilaArray {
	public static void main(String[] args) {
		FilaArray<String> fa = new FilaArray<String>();
		for (int i = 0; i < 30; i++) {
			if (i % 5 == 0) {
				System.out.println(fa.dequeue());
				System.out.println(fa.dequeue());
				System.out.println(fa.dequeue());
			}
			fa.enqueue("a" + i);
			System.out.println(fa);
		}
	}
}
