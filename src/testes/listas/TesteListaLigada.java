package testes.listas;

import listas.ListaLigada;

public class TesteListaLigada {
	public static void main(String[] args) {
		
		Integer[] a = new Integer[]{2,34,1,566,123};
		
		ListaLigada<String> ll = new ListaLigada<>(new String[]{"oi","aaa","zzz","palavra","string"});
		System.out.println(ll);
		ll.remover("palavra");
		ll.adicionar("abc");
		System.out.println(ll);
		ListaLigada<Integer> llint = new ListaLigada<>(a);
		llint.remover(2);
		System.out.println(llint);
		
	}
}
