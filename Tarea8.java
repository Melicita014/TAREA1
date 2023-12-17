//¿Es la misma secuencia de números si se leen de 
//izquierda a derecha que de derecha a izquierda?
public class Tarea8 { 
	// Una funcion auxiliar para comparar las dos tablas
	static boolean comparar(int[] tabla, int[] tabla2) { 
	    for (int i = 0; i < tabla.length; i++) {
	        if (tabla[i] != tabla2[i]) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) {
		int [] tabla = {3,6,2,77,3,10,23,14,15,3};//{123321}; //
		int [] tabla2 = tabla ; // Para facilitar la comparacion
		int [] vuelta = new int[tabla.length];
		
		//Copiar la tabla original en el auxiliar en orden inverso.
		for (int i = 0; i < tabla.length; i++) {
	            int j = tabla.length-i-1; // Esta variable servirá como índice para el segundo array.Hace que coja la posicion contraria. 
	            vuelta[j] = tabla[i];
		}
			tabla = vuelta;
// Llamo a la funcion auxiliar para comparar y que me de el resultado
	 if (comparar(tabla,tabla2)==true) 
		 System.out.println("Es igual ");
	 else
		 System.out.println(" NO es igual ");
	}
}