package testes.grafos;

import grafos.Grafo;
import grafos.GrafoPLA;
import grafos.GrafoPonderado;
import grafos.Vertice;

public class TesteGrafoPLA {
	public static void main(String[] args) {
		GrafoPonderado<String> gpla = new GrafoPLA<String>();

		Vertice<String> v1 = new Vertice<String>("A");
		Vertice<String> v2 = new Vertice<String>("B");
		Vertice<String> v3 = new Vertice<String>("C");
		Vertice<String> v4 = new Vertice<String>("D");
		Vertice<String> v5 = new Vertice<String>("E");

		gpla.inserirVertice(v1);
		gpla.inserirVertice(v2);
		gpla.inserirVertice(v3);
		gpla.inserirVertice(v4);
		gpla.inserirVertice(v5);

		gpla.inserirAresta(v1, v2);
		gpla.inserirAresta(v3, v2);
		gpla.inserirAresta(v2, v4);
		gpla.inserirAresta(v3, v5);
		gpla.inserirAresta(v4, v5);
		gpla.inserirAresta(v2, v3);
		
		System.out.println(gpla);
		
		System.out.println(gpla.breadthSearch(v1, v3));
		System.out.println(gpla.breadthSearch(v1, v5));

		
	}
}
