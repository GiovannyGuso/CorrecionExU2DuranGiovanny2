package arboles;

public class ArbolBinario {
	protected Nodo raiz;
	///     CREACION ARBOL
	public ArbolBinario() {
		raiz = null;
	}

	public ArbolBinario(Nodo raiz) {
		this.raiz = raiz;
	}
	public Nodo raizArbol() {
		return raiz;
	}
	///     CONTRUCCION DE ARBOL
	public static Nodo nuevoArbol(	Nodo ramaIzquierda, Object dato, Nodo ramaDerecha) {
		return new Nodo(ramaIzquierda, dato, ramaDerecha);
	}
	///       ES VACIO
	boolean esVacio() {
		return raiz == null;
	}
	public Nodo getRaiz() {
		return raiz;
	}
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	///      INSERTAR NODO
	public void insertar (Object dato) {
		raiz =insertar(raiz,dato);
	}
	private Nodo insertar(Nodo nodo,Object dato) {
		if  (nodo == null) {
			return new Nodo(dato);
		}
		if (nodo.subarbolIzdo()==null) {
			nodo.ramaIzquierda(insertar(nodo.subarbolIzdo(),dato));
		}else {
			nodo.ramaDerecha(insertar(nodo.subarbolDcho(),dato));
		}
		return nodo;
	}

	///      RECORRIDOS 
	public static void preorden(Nodo r){
		if (r != null) {
			r.visitar();
			preorden (r.subarbolIzdo());
			preorden (r.subarbolDcho());
		}
	}

	// Recorrido de un árbol binario en inorden
	public static void inorden(Nodo r) {
		if (r != null) {
			inorden (r.subarbolIzdo());
			r.visitar();
			inorden (r.subarbolDcho());
		}
	}

	// Recorrido de un árbol binario en postorden
	public static void postorden(Nodo r){
		if (r != null) {
			postorden (r.subarbolIzdo());
			postorden (r.subarbolDcho());
			r.visitar();
		}
	}
	/// CONTAR NUMERO DE NODOS DE UN ARBOL
	public int contarNodos(Nodo nodo) {
		if (nodo == null) {
			return 0;
		}

		int numNodosIzquierdo = contarNodos(nodo.subarbolIzdo());
		int numNodosDerecho = contarNodos(nodo.subarbolDcho());

		// Se suma 1 para contar el nodo actual y luego se suman los nodos de los subárboles izquierdo y derecho
		return 1 + numNodosIzquierdo + numNodosDerecho;
	}

	public int calcularSuma(Nodo nodo) {
		if (nodo == null) {
			return 0;
		}
		int sumaIzquierdo = calcularSuma(nodo.subarbolIzdo());
		int sumaDerecho = calcularSuma(nodo.subarbolDcho());
		return (int) nodo.valorNodo() + sumaIzquierdo + sumaDerecho;
	}
}
