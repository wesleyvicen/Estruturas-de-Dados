package tads;

public interface Lista <T extends Comparable<T>>{
	
	public void adicionar(T elemento);
	public boolean remover(T elemento);
	public T get(int index);
	public int indexOf(T elemento);
	public int size();
	
	
}
