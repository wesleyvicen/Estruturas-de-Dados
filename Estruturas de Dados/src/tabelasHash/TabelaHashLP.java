package tabelasHash;

import java.math.BigInteger;

import tads.TabelaHash;

public class TabelaHashLP<K, V> implements TabelaHash<K, V> {

	private Object[] dados;
	private int size;

	public TabelaHashLP() {
		dados = new Object[7];
		size = 0;
	}

	@Override
	public void adicionar(K chave, V valor) {
		if (size < dados.length) {
			int index = chave.hashCode() % dados.length;
			while (dados[index] != null)
				index++;

		}
	}

	@Override
	public boolean remover(K chave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K chave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reHash() {
		BigInteger aux = BigInteger.valueOf(dados.length);
		Object[] novo = new Object[aux.nextProbablePrime().intValue()];
		// ???
	}
}
