// ¿Cuántos valores 3 hay en el array?
public class Tarea1 {
	static int tabla[]= {3,6,2,77,3,10,23,14,3,3,3};
	static int contador = 0;
	
	static int contar(int[] tabla) {
		  
		  for (int i = 0; i < tabla.length; i++) { //Hacemos un bucle para que vaya por cada numero viendo si es un 3 o no.
		    if (tabla[i] == 3) {
		      contador++;
		    }
		  }
		  return contador; //Me devuelve la cantidad de 3es.
		}
	
	  
	public static void main(String[] args) {
	
		System.out.println ("Hay exactamente " + contar(tabla) + " numeros '3'."); // Aqui llamo a la funcion para que me diga el resultado.

	}

}
/* SIN FUNCIONES AUXILARES :
  public class Tarea1 {
	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
		//¿Cuántos valores 3 hay en el array?
		int contador = 0  ;
		
		for (int i = 0 ; i<tabla.length;i++) { // Por cada numero de la tabla
			if (tabla[i]== 3)
				contador++ ;} // Cada vez que hay un 3 suma 1 al contador
		
		System.out.println ("Hay exactamente " + contador + " numeros '3'");
		
	}
}

*/
 