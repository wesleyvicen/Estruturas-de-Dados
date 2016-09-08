package testes.pilhas;

import pilhas.PilhaLigada;

public class TestePilhaLigada {
	public static void main(String[] args) {
		PilhaLigada<String> pl = new PilhaLigada<String>();
		pl.push("aaa1");
		pl.push("aaa2");
		pl.push("aaa3");
		pl.push("123");
		pl.push("456");
		pl.push("789");
		pl.push("001");
		pl.push("abc");
		pl.push("xyz");
		
		System.err.println(pl.pop());
		System.err.println(pl.pop());
		System.err.println(pl.pop());
		System.err.println(pl.pop());
		System.out.println(pl);
	}
}
