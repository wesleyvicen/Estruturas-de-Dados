package testes.tabelasHash;

import tabelasHash.TabelaHash;
import tabelasHash.TabelaHashLP;

public class TesteTabelaHashLP {

	public static void main(String[] args) {
		TabelaHash<String, Integer> thlp = new TabelaHashLP<String, Integer>();
		thlp.adicionar("oi", 123);
		thlp.adicionar("aaa", 44);
		thlp.adicionar("k", 12);
		thlp.adicionar("v", 13);

		thlp.adicionar("a", 23);
		thlp.adicionar("a", 77);

		thlp.adicionar("xyz", 0);
		thlp.adicionar("abc", 132);
		thlp.adicionar("io", 20202);

		thlp.remover("a");
		thlp.remover("v");
		thlp.remover("k");
		thlp.remover("io");

		System.out.println(thlp.get("oi"));
		System.out.println(thlp.get("aaa"));
		System.out.println(thlp.get("k"));
		System.out.println(thlp.get("v"));
		System.out.println(thlp.get("a"));
		System.out.println(thlp.get("xyz"));
		System.out.println(thlp.get("abc"));
		System.out.println(thlp.get("io"));
	}
}
