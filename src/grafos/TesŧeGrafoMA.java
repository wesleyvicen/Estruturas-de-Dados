package grafos;

public class TesŧeGrafoMA {
	public static void main(String[] args) {
		GrafoMA<String> gma = new GrafoMA<String>();

		Vertice<String> v1 = new Vertice<String>("Aaa");
		Vertice<String> v2 = new Vertice<String>("Bbbb");
		Vertice<String> v3 = new Vertice<String>("C");
		Vertice<String> v4 = new Vertice<String>("Ddddd");
		Vertice<String> v5 = new Vertice<String>("E");
		Vertice<String> v6 = new Vertice<String>("F");
		Vertice<String> v7 = new Vertice<String>("G");
		Vertice<String> v8 = new Vertice<String>("H");
		Vertice<String> v9 = new Vertice<String>("I");
		Vertice<String> v10 = new Vertice<String>("J");
		Vertice<String> v11 = new Vertice<String>("K");
		Vertice<String> v12 = new Vertice<String>("L");

		gma.inserirVertice(v1);
		gma.inserirVertice(v2);
		gma.inserirVertice(v3);
		gma.inserirVertice(v4);
		gma.inserirVertice(v5);
		gma.inserirVertice(v6);
		gma.inserirVertice(v7);
		gma.inserirVertice(v8);
		gma.inserirVertice(v9);
		gma.inserirVertice(v10);
		gma.inserirVertice(v11);
		gma.inserirVertice(v12);

		gma.inserirAresta(v1, v2);
		gma.inserirAresta(v1, v3);
		gma.inserirAresta(v1, v9);

		gma.inserirAresta(v2, v3);
		gma.inserirAresta(v2, v4);

		gma.inserirAresta(v3, v5);
		gma.inserirAresta(v3, v9);

		gma.inserirAresta(v5, v6);
		gma.inserirAresta(v5, v7);

		gma.inserirAresta(v6, v7);
		gma.inserirAresta(v6, v12);

		gma.inserirAresta(v7, v8);

		gma.inserirAresta(v8, v9);
		
		System.out.println(gma);
		
	}
}
