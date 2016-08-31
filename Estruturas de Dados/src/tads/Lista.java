package tads;

public interface Lista <T extends Comparable<T>>{
	
	public void adicionar(T elemento);
	public boolean remover(T elemento);
	public void get(T elemento);
	public void indexOf(T elemento);
	
	
}
