package arboles;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        ArbolBinario arbol = new ArbolBinario();
	        System.out.println("-----------------------------------------------------");
	        System.out.println("                 ARBOLES BINARIOS");
	        System.out.println("-----------------------------------------------------");
	        System.out.println("             Correccion Examen Unidad 2");
			System.out.println("               Alumno: Duran Gioavnny");
			System.out.println("            Docente: Ing. Margot Guaraca");
			int opcion;
	        do {
	        	System.out.println("**********************************************\n");
	        	System.out.println("            Menú principal");
	    		System.out.println("OP 1..  Ingresar un nuevo nodo");
	    		System.out.println("OP 2..  Ver recorrido preorden");
	    		System.out.println("OP 3..  Ver recorrido indorden");
	    		System.out.println("OP 4..  Ver recorrido postOrden");
	    		System.out.println("OP 5..  Ver la cant de nodos");
	    		System.out.println("OP 6..  Ver suma de todos los nodos");
	    		System.out.println("OP 7.. Salir");
	    	    System.out.print("Ingrese la opción deseada: ");
	            opcion = entrada.nextInt();
	        	entrada.nextLine();
	           

	            switch (opcion) {
	            
	               case 1:
	            	   System.out.println("**********************************************");
	            	   System.out.println(" ¿Ingrese cuántos nodos  desea ingresar?:");
	            	   int nodosIngresar=entrada.nextInt();
	       	        	
	       	        	for(int i=1; i<=nodosIngresar; i++) {
	       	               	System.out.println("Ingrese su valor para el nodo "+i);
	       	        		entrada.nextLine();
	       	        		int valor=entrada.nextInt();
	       	        		arbol.insertar(valor);
	       	        	
	       	        	}
	       	        	
	                   /* System.out.print("Ingrese el valor del nodo a insertar: ");
	                    int dato = entrada.nextInt();
	                    arbol.insertar(dato);
	                    System.out.println("Nodo " + dato + " insertado correctamente.");*/	       
	       	        	
	                    break;
	                case 2:
	                	System.out.println("**********************************************");
	                    System.out.println("Recorrido en Preorden:");
	                    ArbolBinario.preorden(arbol.raizArbol());
	                    System.out.println();
	                    break;
	                case 3:
	                	System.out.println("**********************************************");
	                    System.out.println("Recorrido en Inorden:");
	                    ArbolBinario.inorden(arbol.raizArbol());
	                    System.out.println();
	                    break;
	                case 4:
	                	System.out.println("**********************************************");
	                    System.out.println("Recorrido en Postorden:");
	                    ArbolBinario.postorden(arbol.raizArbol());
	                    System.out.println();
	                    break;
	                case 5:
	                	System.out.println("**********************************************");
	                    int numNodos = arbol.contarNodos(arbol.raizArbol());
	                    System.out.println("Número de nodos en el árbol: " + numNodos);
	                    break;
	                case 6:
	                	System.out.println("**********************************************");
	                    int sumaElementos = arbol.calcularSuma(arbol.raizArbol());
	                    System.out.println("La suma de elementos del árbol es: " + sumaElementos);
	                    break;
	                case 7:
	                	System.out.println("**********************************************");
	                    System.out.println("Saliendo del programa.");
	                    break;
	                default:
	                	System.out.println("**********************************************");
	                    System.out.println("Opción inválida. Ingrese una opción válida.");
	            }
	        } while (opcion != 7);
	    }
}
