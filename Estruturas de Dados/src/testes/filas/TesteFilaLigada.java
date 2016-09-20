package testes.filas;

import filas.FilaLigada;

public class TesteFilaLigada {
	public static void main(String[] args) {
		FilaLigada<String> fl = new FilaLigada<String>();
		
		fl.enqueue("ccc");
		fl.enqueue("aaa");
		fl.enqueue("bbb");
		fl.enqueue("ddd");
		
		System.out.println(fl);
		
		System.out.println(fl.dequeue());
		System.out.println(fl.dequeue());
		
		System.out.println(fl);
		
		fl.enqueue("123");
		System.out.println(fl.dequeue());
		fl.enqueue("xyz");
		fl.enqueue("efg");
		System.out.println(fl.dequeue());
		fl.enqueue("wvy");
		System.out.println(fl);
		for (int i = 0; i < 8; i++) {
			System.out.println(fl.dequeue());
		}
		
		
	}
}
