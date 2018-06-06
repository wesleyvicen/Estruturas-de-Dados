package Grafos;

import java.util.List;

public interface GrafoDirecionado<T> {

	int numeroVertices();

	int numeroArestas();

	// numero de incidentes
	int grauPositivo(Vertice<T> vertice);

	// numero de adjacentes
	int grauNegativo(Vertice<T> vertice);

	void inserirVertice(Vertice<T> vertice);

	void inserirAresta(Vertice<T> origem, Vertice<T> destino);

	boolean removerVertice(Vertice<T> vertice);

	boolean removerAresta(Vertice<T> origem, Vertice<T> destino);

	boolean existeAresta(Vertice<T> origem, Vertice<T> destino);

	List<?> adjacentes(Vertice<T> origem);

	List<?> incidentes(Vertice<T> destino);
	
	List<?> breadthSearch(Vertice<T> origem, Vertice<T> destino);
}