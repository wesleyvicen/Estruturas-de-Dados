package tabelasHash;

public class ParChaveValor<K, V> {

	private K chave;
	private V valor;

	public ParChaveValor() {
	}

	public ParChaveValor(K chave, V valor) {
		setChave(chave);
		setValor(valor);
	}

	public K getChave() {
		return chave;
	}

	public void setChave(K chave) {
		this.chave = chave;
	}

	public V getValor() {
		return valor;
	}

	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "< "+chave+", "+valor+" >";
	}

	@Override
	public boolean equals(Object obj) {
		ParChaveValor aux = (ParChaveValor) obj;
		if (chave.equals(aux.chave) && valor.equals(aux.valor)) {
			return true;
		}
		return false;
	}

}
