package Grafos;

public class ParVerticePeso<T> {
	private Vertice<T> vertice;
	private double peso;

	public ParVerticePeso(double peso, Vertice<T> vertice) {
		setPeso(peso);
		setVertice(vertice);
	}

	public Vertice<T> getVertice() {
		return vertice;
	}

	public void setVertice(Vertice<T> vertice) {
		this.vertice = vertice;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isVisitado() {
		return vertice.isVisitado();
	}

	public void setVisitado(boolean visitado) {
		vertice.setVisitado(visitado);
	}

	@Override
	public String toString() {
		return "(" + peso + "/" + vertice + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ParVerticePeso)
			return vertice.equals(((ParVerticePeso) obj).getVertice());
		return false;
	}

}