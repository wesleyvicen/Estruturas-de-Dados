package testes.grafos;

import java.util.Iterator;

import grafos.GrafoDirecionado;
import grafos.GrafoDPLA;
import grafos.GrafoPonderadoDirecionado;
import grafos.Vertice;

public class TesteGrafoPLA {
	public static void main(String[] args) {

		GrafoDPLA<String> gpla = new GrafoDPLA<String>();

		Vertice<String> v1 = new Vertice<String>("A");
		Vertice<String> v2 = new Vertice<String>("B");
		Vertice<String> v3 = new Vertice<String>("C");
		Vertice<String> v4 = new Vertice<String>("D");
		Vertice<String> v5 = new Vertice<String>("E");
		Vertice<String> v6 = new Vertice<String>("F");
		Vertice<String> v7 = new Vertice<String>("G");
		Vertice<String> v8 = new Vertice<String>("H");
		Vertice<String> v9 = new Vertice<String>("I");
		Vertice<String> v10 = new Vertice<String>("J");
		Vertice<String> v11 = new Vertice<String>("K");
		Vertice<String> v12 = new Vertice<String>("L");

		gpla.inserirVertice(v1);
		gpla.inserirVertice(v2);
		gpla.inserirVertice(v3);
		gpla.inserirVertice(v4);
		gpla.inserirVertice(v5);
		gpla.inserirVertice(v6);
		gpla.inserirVertice(v7);
		gpla.inserirVertice(v8);
		gpla.inserirVertice(v9);
		gpla.inserirVertice(v10);
		gpla.inserirVertice(v11);
		gpla.inserirVertice(v12);

		gpla.inserirAresta(v1, v2);
		gpla.inserirAresta(v1, v3);
		gpla.inserirAresta(v1, v9);

		gpla.inserirAresta(v2, v3);
		gpla.inserirAresta(v2, v4);

		gpla.inserirAresta(v3, v5);
		gpla.inserirAresta(v3, v9);

		gpla.inserirAresta(v5, v6);
		gpla.inserirAresta(v5, v7);

		gpla.inserirAresta(v6, v7);
		gpla.inserirAresta(v6, v12);

		gpla.inserirAresta(v7, v8);

		gpla.inserirAresta(v8, v9);

		System.out.println(gpla);

		System.out.println(gpla.breadthSearch(v1, v12));

	}
}
