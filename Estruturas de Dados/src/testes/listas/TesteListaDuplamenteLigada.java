package testes.listas;


import listas.ListaDuplamenteLigada;

public class TesteListaDuplamenteLigada {
	public static void main(String[] args) {

		ListaDuplamenteLigada<String> ldp = new ListaDuplamenteLigada<String>();
		ldp.adicionar("xyz");
		ldp.adicionar("123");
		ldp.adicionar("aaa");
		ldp.adicionar("aaa");
		ldp.adicionar("000");
		ldp.adicionar("abc");
		System.out.println(ldp);

		ldp.remover(3);
		ldp.remover(1);
		ldp.remover(2);

		System.out.println(ldp);
	}
}
