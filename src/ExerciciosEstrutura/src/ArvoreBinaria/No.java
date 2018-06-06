package ArvoreBinaria;

public class No {

	public char valor;
	public No esquerda;
	public No direita;
	public int chave;

	public No(char valor) {
		this.valor = valor;

	}
	
	public int altura(No atual) {
		if (atual == null) {
			return -1;
		}

		if (atual.esquerda == null && atual.direita == null) {
			return 0;
		
		} else if (atual.esquerda == null) {
			return 1 + altura(atual.direita);
		
		} else if (atual.direita == null) {
			return 1 + altura(atual.esquerda);
		
		} else {
			return 1 + Math.max(altura(atual.esquerda), altura(atual.direita));
		}
	}

	public No() {
		// TODO Auto-generated constructor stub
	}
	
}