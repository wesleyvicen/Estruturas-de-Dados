package tabelasHash;

import java.util.HashMap;

public interface TabelaHash<K, V> {

	public void adicionar(K chave, V valor);

	public boolean remover(K chave);

	public V get(K chave);

	public void reHash();

	public boolean contem(K chave);

}
