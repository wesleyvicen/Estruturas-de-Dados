package grafos;

import java.util.List;

public interface GrafoPonderado<T> extends Grafo<T> {
	void inserirAresta(Vertice<T> origem, Vertice<T> destino, double peso);

	List<ParVerticePeso<T>> adjacentes(Vertice<T> origem);

	List<ParVerticePeso<T>> incidentes(Vertice<T> destino);

	List<ParVerticePeso<T>> breadthSearch(Vertice<T> origem, Vertice<T> destino);

}
