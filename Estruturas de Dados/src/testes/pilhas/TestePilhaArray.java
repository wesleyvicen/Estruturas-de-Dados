package testes.pilhas;

import pilhas.PilhaArray;

public class TestePilhaArray {
	public static void main(String[] args) {

		PilhaArray<String> pa = new PilhaArray<String>();
		pa.push("aaa");
		pa.push("123");
		pa.push("xyz");
		pa.push("456");
		pa.push("abc");
		pa.push("789");
		pa.push("987");
		pa.push("111");

		System.err.println(pa.pop());
		System.err.println(pa.pop());
		System.err.println(pa.pop());
		System.err.println(pa.pop());
		System.out.println(pa);

	}
}
