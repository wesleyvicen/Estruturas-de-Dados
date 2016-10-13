package tads;

public interface Arvore<T> {
	
	public void adicionar(T elemento);
	public boolean remover(T elemento);
	public boolean existe(T elemento);
	
}
