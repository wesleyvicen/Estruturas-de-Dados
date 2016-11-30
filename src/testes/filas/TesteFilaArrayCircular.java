package testes.filas;

import filas.FilaArrayCircular;

public class TesteFilaArrayCircular {
	public static void main(String[] args) {
		FilaArrayCircular<String> fac = new FilaArrayCircular<String>();
		fac.enqueue("aaa");
		fac.enqueue("466");
		fac.enqueue("123");
		fac.enqueue("xyz");
		fac.enqueue("789");
		
		System.out.println(fac);
		
		fac.dequeue();
		fac.dequeue();
		
		System.out.println(fac);

	}
}
