package pilhas;

import tads.Pilha;

public class PilhaLigada<T> implements Pilha<T> {

	private Node<T> topo;

	@Override
	public void push(T elemento) {
		Node<T> novo = new Node<T>(elemento);
		if (topo == null) {
			topo = novo;
		} else {
			novo.setBelow(topo);
			topo = novo;
		}
	}

	@Override
	public T pop() {
		if (topo == null) {
			return null;
		} else {
			T retorno = topo.getInfo();
			topo = topo.getBelow();
			return retorno;
		}
	}

	@Override
	public String toString() {
		String retorno = "";
		Node<T> aux = topo;
		while (aux != null) {
			retorno += "\n" + aux.getInfo().toString();
			aux = aux.getBelow();
		}
		return retorno;
	}

}
