package grafos;

import java.util.ArrayList;
import java.util.List;

public class GrafoMA<T> implements Grafo<T> {

	private List<Vertice<T>> listaVertice;
	private boolean[][] matrizAdjacencia;

	public GrafoMA() {
		matrizAdjacencia = new boolean[10][10];
		listaVertice = new ArrayList<Vertice<T>>();
	}

	@Override
	public boolean existeAresta(Vertice<T> v1, Vertice<T> v2) {
		if (listaVertice.contains(v1) && listaVertice.contains(v2)) {
			return matrizAdjacencia[listaVertice.indexOf(v1)][listaVertice.indexOf(v2)];
		}
		return false;
	}

	@Override
	public void inserirVertice(Vertice<T> vertice) {
		listaVertice.add(vertice);
		redimensionar();
	}

	@Override
	public void inserirAresta(Vertice<T> v1, Vertice<T> v2) {
		if (!listaVertice.contains(v1)) {
			inserirVertice(v1);
		}
		if (!listaVertice.contains(v2)) {
			inserirVertice(v2);
		}
		matrizAdjacencia[listaVertice.indexOf(v1)][listaVertice.indexOf(v2)] = true;
		matrizAdjacencia[listaVertice.indexOf(v2)][listaVertice.indexOf(v1)] = true;
	}

	@Override
	public void removerVertice(Vertice<T> vertice) {
		int index = listaVertice.indexOf(vertice);
		listaVertice.remove(index);
		excluiLinhasColunas(index);
	}

	@Override
	public void removerAresta(Vertice<T> v1, Vertice<T> v2) {
		if (existeAresta(v1, v2)) {
			matrizAdjacencia[listaVertice.indexOf(v1)][listaVertice.indexOf(v2)] = false;
			matrizAdjacencia[listaVertice.indexOf(v2)][listaVertice.indexOf(v1)] = false;
		}
	}

	private void redimensionar() {
		int size = listaVertice.size();
		boolean[][] aux = new boolean[size * 2][size * 2];
		if (size > 1)
			if (size >= (matrizAdjacencia.length / (size - 1))) {
				for (int i = 0; i < size - 1; i++) {
					for (int j = 0; j < size - 1; j++) {
						aux[i][j] = matrizAdjacencia[i][j];
					}
				}
			}
		matrizAdjacencia = aux;
	}

	private void excluiLinhasColunas(int index) {
		for (int i = index; i < listaVertice.size() + 1; i++) {
			for (int j = 0; j < listaVertice.size() + 1; j++) {
				matrizAdjacencia[i][j] = matrizAdjacencia[i + 1][j];
			}
		}
		for (int j = index; j < listaVertice.size() + 1; j++) {
			for (int i = 0; i < listaVertice.size() + 1; i++) {
				matrizAdjacencia[i][j] = matrizAdjacencia[i][j + 1];
			}
		}
	}

	@Override
	public int grau(Vertice<T> vertice) {
		int retorno = 0;
		for (int i = 0; i < listaVertice.size(); i++) {
			if (matrizAdjacencia[listaVertice.indexOf(vertice)][i]) {
				retorno++;
			}
		}
		return retorno;
	}

	@Override
	public String toString() {
		int maiorNomeDeVertice = 0;
		for (int i = 0; i < listaVertice.size(); i++) {
			if(maiorNomeDeVertice<listaVertice.get(i).toString().length()){
				maiorNomeDeVertice = listaVertice.get(i).toString().length();
			}
		}
		String retorno = "";
		for(int i = 0; i < maiorNomeDeVertice; i++){
			retorno+=" ";
		}
		retorno += "|";
		for (int i = 0; i < listaVertice.size(); i++) {
			retorno += listaVertice.get(i) + "|";
		}
		retorno += "\n";
		for (int i = 0; i < listaVertice.size(); i++) {
			retorno += nStrings(maiorNomeDeVertice,(listaVertice.get(i)).toString()) + "|";
			for (int j = 0; j < listaVertice.size(); j++) {
				retorno += nStrings(listaVertice.get(j).toString().length(),(matrizAdjacencia[i][j] ? 1 : 0) +"") + "|";
			}
			retorno += " \n";
		}
		return retorno;
	}
	private String nStrings(int n, String str){
		String r = "";
		for (int i = 0; i < (n-str.length())/2; i++) {
			r+=" ";
		}
		r+=str;
		for (int i = 0; i < (n-str.length())/2+(n-str.length())%2; i++) {
			r+=" ";
		}
		return r;
	}

}