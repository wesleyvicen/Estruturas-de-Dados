package grafos;

import java.util.Iterator;
import java.util.List;

public interface Grafo<T> {
	
	boolean existeAresta(Vertice<T> v1,Vertice<T> v2);
	
	void inserirVertice(Vertice<T> vertice);
	
	void inserirAresta(Vertice<T> v1,Vertice<T> v2);
	
	void removerVertice(Vertice<T> vertice);
	
	void removerAresta(Vertice<T> v1,Vertice<T> v2);
	
	int grau(Vertice<T> vertice);
	
}
