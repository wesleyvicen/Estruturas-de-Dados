package ArvoreBinaria;

public class ArvoreBinaria {
	No root;

	protected void balanceia(No atual) {
		No aux = new No();
		No aux2 = new No();
		if ((atual != null) && (atual.direita != null) && (atual.direita.direita != null)
				&& (fatorBalanceamento(atual) == -2) && (fatorBalanceamento(atual.direita) == -1)
				&& (fatorBalanceamento(atual.direita.direita) == -1)) {
			if (localizaPai(atual.chave).direita == atual) {
				localizaPai(atual.chave).direita = atual.direita;
			} else {
				localizaPai(atual.chave).esquerda = atual.direita;
			}
			;
			aux = atual;
			atual = atual.direita;
			aux.direita = atual.esquerda;
			atual.esquerda = aux;
		} else if ((atual != null) && (atual.esquerda != null) && (atual.esquerda.esquerda != null)
				&& (fatorBalanceamento(atual) == 2) && (fatorBalanceamento(atual.esquerda) == 1)
				&& (fatorBalanceamento(atual.esquerda.esquerda) == 1)) {
			if (localizaPai(atual.chave).direita == atual) {
				localizaPai(atual.chave).direita = atual.esquerda;
			} else {
				localizaPai(atual.chave).esquerda = atual.esquerda;
			}
			;
			aux = atual;
			atual = atual.esquerda;
			aux.esquerda = atual.direita;
			atual.direita = aux;
		} else if ((atual != null) && (atual.esquerda != null) && (atual.esquerda.direita != null)
				&& (fatorBalanceamento(atual) == 2) && (fatorBalanceamento(atual.esquerda) == -1)
				&& (fatorBalanceamento(atual.esquerda.direita) == 1)) {
			if (localizaPai(atual.chave).direita == atual) {
				localizaPai(atual.chave).direita = atual.esquerda.direita;
			} else {
				localizaPai(atual.chave).esquerda = atual.esquerda.direita;
			}
			;
			aux = atual;
			aux2 = atual.esquerda;
			atual = atual.esquerda.direita;
			aux2.direita = atual.esquerda;
			aux.esquerda = atual.direita;
			atual.direita = aux;
			atual.esquerda = aux2;
		} else if ((atual != null) && (atual.direita != null) && (atual.direita.esquerda != null)
				&& (fatorBalanceamento(atual) == -2) && (fatorBalanceamento(atual.direita) == 1)
				&& (fatorBalanceamento(atual.direita.esquerda) == -1)) {
			if (localizaPai(atual.chave).direita == atual) {
				localizaPai(atual.chave).direita = atual.direita.esquerda;
			} else {
				localizaPai(atual.chave).esquerda = atual.direita.esquerda;
			}
			;
			aux = atual;
			aux2 = atual.direita;
			atual = atual.direita.esquerda;
			aux.direita.esquerda = atual.direita;
			aux.direita = atual.esquerda;
			atual.direita = aux;
			atual.esquerda = aux2;
		}
	}

	public No localizaPai(int chave) {
		No atual = root;
		No pai = new No();
		while (atual.chave != chave) {
			if (chave < atual.chave) {
				pai = atual;
				atual = atual.esquerda;
			} else {
				pai = atual;
				atual = atual.direita;
			}
			if (atual == null)
				return null;
		}
		return pai;
	}

	protected int fatorBalanceamento(No atual) {
		int fatorbalanceamento = 0;
		if ((atual.esquerda != null) && (atual.direita != null)) {
			fatorbalanceamento = atual.altura(atual.esquerda) - atual.altura(atual.direita);
		} else if ((atual.esquerda == null) && (atual.direita != null)) {
			fatorbalanceamento = -1 - atual.altura(atual.direita);
		} else if ((atual.esquerda != null) && (atual.direita == null)) {
			fatorbalanceamento = atual.altura(atual.esquerda) + 1;
		}
		return fatorbalanceamento;
	}

	public boolean ehInteiro(String s) {
		char[] c = s.toCharArray();
		boolean d = true;
		for (int i = 0; i < c.length; i++)
			if (!Character.isDigit(c[i])) {
				d = false;
				break;
			}
		return d;
	}

	public void inserir(char value) {
		inserir(this.root, value);
	}

	private void inserir(No node, char value) {
		if (ehInteiro("" + value)) {
			System.err.println("Apenas Letras, Amigo(A).");
			return;
		}
		if (this.root == null)
			this.root = new No(value);
		else if (node.valor > value) {
			if (node.esquerda != null)
				inserir(node.esquerda, value);
			else {
				System.out.println("  Inserindo " + value + " a esquerda de " + node.valor);
				node.esquerda = new No(value);
				balanceia(node);
			}
		} else {
			if (node.direita != null)
				inserir(node.direita, value);
			else {
				System.out.println("  Inserindo " + value + " a direita de " + node.valor);
				node.direita = new No(value);
				balanceia(node);
			}
		}
	}

	public void remove(char value) {
		remover(this.root, value);
	}

	private No remover(No node, char value) {
		System.out.println("  Corendo No " + node.valor);
		if (this.root.valor == value && this.root.esquerda == null && this.root.direita == null)
			this.root = null;
		else if (node.valor > value)
			node.esquerda = remover(node.esquerda, value);
		else if (node.valor < value)
			node.direita = remover(node.direita, value);
		else if (node.esquerda != null && node.direita != null) {
			System.out.println("  Removeu No " + node.valor);
			node.valor = encontraMinimo(node.direita).valor;
			node.direita = removeMinimo(node.direita);
		} else {
			System.out.println("  Removeu No " + node.valor);
			node = (node.esquerda == null) ? node.esquerda : node.direita;
		}
		return node;
	}

	public No removeMinimo(No node) {
		if (node == null) {
			System.out.println("  ERRO ");
		} else if (node.esquerda != null) {
			node.esquerda = removeMinimo(node.esquerda);
			return node;
		} else {
			return node.direita;
		}
		return null;
	}

	public No encontraMinimo(No node) {
		if (node != null) {
			while (node.esquerda != null) {
				node = node.esquerda;
			}
		}
		return node;
	}

	public void exibir(No no) {
		if (no != null) {
			System.out.print(no.valor + " ");
			exibir(no.esquerda);
			exibir(no.direita);
		}
	}

}
