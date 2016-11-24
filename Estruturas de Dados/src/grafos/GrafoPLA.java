package grafos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class GrafoPLA<T> implements GrafoPonderado<T> {

	private HashMap<Vertice<T>, List<ParVerticePeso<T>>> vertices;

	public GrafoPLA() {
		vertices = new HashMap<Vertice<T>, List<ParVerticePeso<T>>>();
	}

	@Override
	public int numeroVertices() {
		return vertices.keySet().size();
	}

	@Override
	public int grauNegativo(Vertice<T> vertice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int grauPositivo(Vertice<T> vertice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void inserirVertice(Vertice<T> vertice) {
		vertices.put(vertice, new ArrayList<ParVerticePeso<T>>());
	}

	@Override
	public void inserirAresta(Vertice<T> origem, Vertice<T> destino, double peso) {
		if (!vertices.containsKey(origem))
			inserirVertice(origem);
		if (!vertices.containsKey(destino))
			inserirVertice(destino);
		vertices.get(origem).add(new ParVerticePeso<T>(peso, destino));
	}

	@Override
	public void inserirAresta(Vertice<T> origem, Vertice<T> destino) {
		if (!vertices.containsKey(origem))
			inserirVertice(origem);
		if (!vertices.containsKey(destino))
			inserirVertice(destino);
		vertices.get(origem).add(new ParVerticePeso<T>(0, destino));
	}

	@Override
	public boolean removerVertice(Vertice<T> vertice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removerAresta(Vertice<T> origem, Vertice<T> destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existeAresta(Vertice<T> origem, Vertice<T> destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ParVerticePeso<T>> adjacentes(Vertice<T> origem) {
		return vertices.get(origem);
	}

	@Override
	public List<ParVerticePeso<T>> incidentes(Vertice<T> destino) {
		return null;
	}

	@Override
	public int numeroArestas() {
		Collection<List<ParVerticePeso<T>>> listas = vertices.values();
		int numeroArestas = 0;
		for (List<ParVerticePeso<T>> list : listas) {
			if (list != null)
				numeroArestas += list.size();
		}
		return numeroArestas;
	}

}
