package grafos;

public class Vertice<T> {
	private T info;
	private boolean visitado = false;

	public Vertice() {
	}

	public Vertice(T info) {
		setInfo(info);
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vertice) {
			return info.equals(((Vertice) obj).getInfo());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return info.hashCode();
	}

	@Override
	public String toString() {
		return info.toString();
	}

}
