package grafos;

import java.util.List;

public interface Grafo<T> {

	int numeroVertices();

	int grauNegativo(Vertice<T> vertice);

	int grauPositivo(Vertice<T> vertice);

	void inserirVertice(Vertice<T> vertice);

	void inserirAresta(Vertice<T> origem, Vertice<T> destino);

	boolean removerVertice(Vertice<T> vertice);

	boolean removerAresta(Vertice<T> origem, Vertice<T> destino);

	boolean existeAresta(Vertice<T> origem, Vertice<T> destino);

	List<Vertice<T>> adjacentes(Vertice<T> origem);

	List<Vertice<T>> incidentes(Vertice<T> destino);
}
