package grafos;

public class Aresta<T> {
	private Vertice<T> origem;
	private Vertice<T> destino;
	private double peso;
	private boolean deDescoberta;
	
	public Aresta() {
	}

	public Aresta(Vertice<T> origem, Vertice<T> destino, double peso) {
		setOrigem(origem);
		setDestino(destino);
		setPeso(peso);
	}

	public Aresta(Vertice<T> origem, Vertice<T> destino) {
		setOrigem(origem);
		setDestino(destino);
	}

	public Vertice<T> getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice<T> origem) {
		this.origem = origem;
	}

	public Vertice<T> getDestino() {
		return destino;
	}

	public void setDestino(Vertice<T> destino) {
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isDeDescoberta() {
		return deDescoberta;
	}

	public void setDeDescoberta(boolean deDescoberta) {
		this.deDescoberta = deDescoberta;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Aresta) {
			Aresta aux = (Aresta) obj;
			return origem.equals(aux.getOrigem()) && destino.equals(aux.getDestino()) && peso == aux.getPeso();
		}
		return false;
	}

}
