package arvores;

import java.util.ArrayList;
import java.util.List;

public class NodeDinamico<T> {

	private List<NodeDinamico<T>> listaDeFilhos = new ArrayList<NodeDinamico<T>>();
	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public List<NodeDinamico<T>> getListaDeFilhos() {
		return listaDeFilhos;
	}

	public void setListaDeFilhos(List<NodeDinamico<T>> listaDeFilhos) {
		this.listaDeFilhos = listaDeFilhos;
	}

}
