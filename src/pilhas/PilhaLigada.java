package pilhas;

import nodes.SimpleNode;
import testes.pilhas.Pilha;

public class PilhaLigada<T> implements Pilha<T> {

	private SimpleNode<T> topo;

	@Override
	public void push(T elemento) {
		SimpleNode<T> novo = new SimpleNode<T>(elemento);
		if (topo == null) {
			topo = novo;
		} else {
			novo.setNext(topo);
			topo = novo;
		}
	}

	@Override
	public T pop() {
		if (topo == null) {
			return null;
		} else {
			T retorno = topo.getInfo();
			topo = topo.getNext();
			return retorno;
		}
	}

	@Override
	public String toString() {
		String retorno = "";
		SimpleNode<T> aux = topo;
		while (aux != null) {
			retorno += "\n" + aux.getInfo().toString();
			aux = aux.getNext();
		}
		return retorno;
	}

}
