package arboles;

public class Nodo {
	protected Object dato;
	protected Nodo izdo;
	protected Nodo dcho;
	
	public Nodo(Object valor) {
	dato = valor;
	izdo = dcho = null;  }
	public Nodo(Nodo ramaIzquierda, Object valor, Nodo ramaDerecha){
	dato= valor;
    izdo = ramaIzquierda;
	dcho = ramaDerecha;   }
	// operaciones de acceso 
	public Object valorNodo(){ 
		return dato; }
	
	public Nodo subarbolIzdo(){ 
		return izdo; }
	
	public Nodo subarbolDcho(){ 
		return dcho; }

	public void nuevoValor(Object d){ 
		dato = d; }
	
	public void ramaIzquierda(Nodo n){
		izdo = n; }
	
	public void ramaDerecha(Nodo n){
		dcho = n; }
	
	void visitar() {
	System.out.print(dato + " ");
	}
}
