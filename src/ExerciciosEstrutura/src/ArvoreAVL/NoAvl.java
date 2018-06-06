package ArvoreAVL;

public class NoAvl {
    	protected int altura;       // altura = Balanco
    	protected int valor;
        protected NoAvl esquerda, direita;
        
        public NoAvl ( int theElement ) {
            this( theElement, null, null );
        }
        
        public NoAvl ( int theElement, NoAvl lt, NoAvl rt ) {
            valor = theElement;
            esquerda = lt;
            direita = rt;
            altura   = 0;
        }
}