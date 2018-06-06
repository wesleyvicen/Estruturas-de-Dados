package AVL2;

public class ArvoreAvl {
	public NoAvl root = null;

	public ArvoreAvl() {
		root = null;
	}

	/** Retorna a altura da árvore */
	private static int altura(NoAvl no) {
		return no == null ? -1 : no.altura;
	}

	/**
	 * Retorna o maior valor ente lhs e rhs.
	 */
	private static int max(int lhs, int rhs) {
		return lhs > rhs ? lhs : rhs;
	}

	/** Retorna o fator de balanceamento da árvore com raiz t */
	private int fatorBalan(NoAvl no) {
		return altura(no.esquerda) - altura(no.direita);
	}

	// INSERÇÃO
	public boolean inserir(int x) {
		root = inserir(x, root);
		return true;
	}

	private NoAvl inserir(int x, NoAvl no) {
		if (no == null) {
			no = new NoAvl(x, null, null);
		} else if (x == no.valor)
			System.out.println("elemento já presente!");
		else if (x < no.valor) {
			System.out.println("  Inserindo " + x + " a esquerda de " + no.valor);
			no.esquerda = inserir(x, no.esquerda);
		} else if (x > no.valor) {
			System.out.println("  Inserindo " + x + " a direita de " + no.valor);
			no.direita = inserir(x, no.direita);

		}
		no = balance(no);
		return no;
	}

	// REMOCAO
	public void remove(int x) {
		root = remove(x, root);
	}

	private NoAvl remove(int x, NoAvl no) {

		if (no == null) {
			System.out.println("elemento não encontrada para remoção!");
			return null;
		}
		System.out.println("  Corendo No " + no.valor);
		if (x < no.valor) {
			no.esquerda = remove(x, no.esquerda);
			return balance(no);
		} else if (x > no.valor) {
			no.direita = remove(x, no.direita);
			return balance(no);
		} else {
			NoAvl aux = no;
			if (no.esquerda == null && no.direita == null) {
				return null;
			}
			if (no.esquerda == null) {
				return no.direita;
			}
			if (no.direita == null) {
				return no.esquerda;
			}
			// Caso o nó tenha dois filhos
			else if (no.esquerda != null && no.direita != null) {
				no.valor = minDir(no.direita).valor;
				no.direita = remove(no.valor, no.direita);
			} else {
				no = (no.esquerda != null) ? no.esquerda : no.direita;
			}
			return balance(no);
		}
	}

	// Metodo auxiliar para o metodo da remocao. Acha o no de menor elemento
	// ao lado direito do no dado
	protected NoAvl minDir(NoAvl no) {
		if (no.esquerda == null) {
			return no;
		} else {
			no = no.esquerda;
			return minDir(no);
		}
	}

	// Busca maior
	public int buscaMaior(NoAvl maior) {
		while (maior.direita != null) {
			maior = maior.direita;
		}
		System.out.print("Maior elemento: " + maior.valor);
		return maior.valor;
	}

	// Busca menor
	public int buscaMenor(NoAvl root) {
		NoAvl menor = root;
		while (menor.esquerda != null) {
			menor = menor.esquerda;
		}
		System.out.print("\nMenor elemento: " + menor.valor);
		return menor.valor;
	}

	public NoAvl balance(NoAvl no) {
		if (fatorBalan(no) == 2) {
			if (fatorBalan(no.esquerda) > 0) {
				System.out.println("\nRotação Simples para direita.");
				no = rotDireita(no);
			} else {
				System.out.println("\nRotação dupla para direita.");
				no = rotDuplaDireita(no);
			}
		} else if (fatorBalan(no) == -2) {
			if (fatorBalan(no.direita) < 0) {
				System.out.println("\nRotação Simples para esquerda.");
				no = rotEsquerda(no);
			} else {
				System.out.println("\nRotação dupla para esquerda.");
				no = rotDuplaEsquerda(no);

			}
		}
		no.altura = max(altura(no.esquerda), altura(no.direita)) + 1;
		return no;
	}

	/** Faz Rotação simples a direita */
	private static NoAvl rotDireita(NoAvl no) {
		NoAvl noAux = no.esquerda;
		no.esquerda = noAux.direita;
		noAux.direita = no;
		no.altura = max(altura(no.esquerda), altura(no.direita)) + 1;
		noAux.altura = max(altura(noAux.esquerda), no.altura) + 1;
		return noAux;
	}

	/** Rotação simples à esquerda */
	private static NoAvl rotEsquerda(NoAvl no) {
		NoAvl noAux = no.direita;
		no.direita = noAux.esquerda;
		noAux.esquerda = no;
		no.altura = max(altura(no.esquerda), altura(no.direita)) + 1;
		noAux.altura = max(altura(noAux.direita), no.altura) + 1;
		return noAux;
	}

	/** Rotação dupla à direita */
	private static NoAvl rotDuplaDireita(NoAvl no) {
		no.esquerda = rotEsquerda(no.esquerda);
		return rotDireita(no);
	}

	/** Rotação dupla à esquerda */
	private static NoAvl rotDuplaEsquerda(NoAvl k1) {
		k1.direita = rotDireita(k1.direita);
		return rotEsquerda(k1);
	}

	public NoAvl busca(int x) {
		return busca(root, x);
	}

	protected NoAvl busca(NoAvl no, int x) {
		while (no != null) {
			/* se valor procurado == elemento do nó retorna referência ao nó */
			if (x == no.valor) {
				System.out.println("elemento " + x + " encontrada!");
				return no;
			}
			/*
			 * se valor procurado < elemento do nó, procurar na sub-árvore esquerda deste nó
			 */
			else if (x < no.valor)
				no = no.esquerda;
			/*
			 * se valor procurado > elemento do nó, procurar na sub-árvore direita deste nó
			 */
			else
				no = no.direita;
		}
		// caso elemento não foi achada, retorna null
		System.out.println("elemento " + x + " não encontrada!");
		return null;
	}

	// Impressão em Ordem
	public void emordem() {
		emordem(root);
	}

	private void emordem(NoAvl no) {
		if (no != null) {
			emordem(no.esquerda);
			System.out.print(no.valor + " ");
			emordem(no.direita);
		}
	}

	// Impressão em Pos Ordem
	public void postordem() {
		postordem(root);
	}

	protected void postordem(NoAvl no) {
		if (no != null) {
			postordem(no.esquerda);
			postordem(no.direita);
			System.out.print(no.valor + " ");
		}
	}

	// Busca PAI
	protected NoAvl buscaPai(int x) {
		NoAvl no = root;
		NoAvl noAux = null;
		while (no != null && !(no.valor == x)) { // acha o nó com a elemento x
			noAux = no;
			if (no.valor < x)
				no = no.direita;
			else
				no = no.esquerda;
		}
		if (no != null && no.valor == x)
			return noAux;
		return null;
	}

} // class