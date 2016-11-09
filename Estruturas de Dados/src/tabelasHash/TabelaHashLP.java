package tabelasHash;

import java.math.BigInteger;

import tads.TabelaHash;

public class TabelaHashLP<K, V> implements TabelaHash<K, V> {

	private static final ParChaveValor REMOVIDO = new ParChaveValor(null, null);
	private ParChaveValor<K, V>[] dados;
	private int size;

	@SuppressWarnings("unchecked")
	public TabelaHashLP() {
		dados = new ParChaveValor[7];
		size = 0;
	}

	@Override
	public void adicionar(K chave, V valor) {
		try {
			int index = getIndex(chave);
			while (dados[index] != null && dados[index].getChave() != null && !dados[index].getChave().equals(chave))
				index++;
			dados[index] = new ParChaveValor<K, V>(chave, valor);
			size++;
		} catch (ArrayIndexOutOfBoundsException e) {
			reHash();
			adicionar(chave, valor);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean remover(K chave) {
		try {
			int index = getIndex(chave);
			while (!dados[index].getChave().equals(chave))
				index++;
			dados[index] = REMOVIDO;
			size--;
			return true;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}

	@Override
	public V get(K chave) {
		try {
			int index = getIndex(chave);
			while (true) {
				if (dados[index] != null && dados[index].getChave() != null)
					if (dados[index].getChave().equals(chave))
						return dados[index].getValor();
				index++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	private int getIndex(K chave) {
		return chave.hashCode() % dados.length;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void reHash() {
		BigInteger tmp = BigInteger.valueOf(dados.length);
		ParChaveValor<K, V>[] novo = new ParChaveValor[tmp.nextProbablePrime().intValue()];
		ParChaveValor<K, V>[] aux = dados;
		dados = novo;
		for (ParChaveValor<K, V> par : aux) {
			if (par != null)
				adicionar(par.getChave(), par.getValor());
		}
	}

	@Override
	public boolean contem(K chave) {
		if (get(chave) != null)
			return true;
		else
			return false;
	}
}
