//En un array de números de 20 posiciones, inicialmente sin valores,
//deja en cada posición el valor de la secuencia Fibonacc
public class Tarea6 {
public static int Fibonacci(int[] tabla, int i) {
	  if (i < 2) {
	    tabla[i] = 1;
	    return 1;
	  }
	  Fibonacci(tabla, i - 1);
	  int temp = tabla[i - 1] + tabla[i - 2];
	  return tabla[i] = temp;
	}
	public static void main(String[] args) {
		 
		int[] tabla = new int[20];
	
		
	//Rellenar la tabla con factorial
		for (int i = 0; i <= tabla.length -1 ; i++)
			tabla[i]= Fibonacci(tabla, i);
		
	//Mostrar la tabla en pantalla
		for (int i = 0; i <= tabla.length -1 ; i++)
			System.out.println(i + ": " +tabla[i] );
	}

}
