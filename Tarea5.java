//En un array de números de 10 posiciones, inicialmente sin valores,
//deja en cada posición el valor de la función factorial.
public class Tarea5 {
	static int factorial (int x) {
		
	if (x==0||x==1)
		return 1 ;
	else
		return x * factorial(x-1);
	}
	public static void main(String[] args) {
		int[] tabla = new int[10];
	
		
	//Rellenar la tabla con factorial
		for (int i = 0; i <= tabla.length -1 ; i++)
			tabla[i]= factorial(i);
		
	//Mostrar la tabla en pantalla
		for (int i = 0; i <= tabla.length -1 ; i++)
			System.out.println(i + ": " +tabla[i] );
		
	
		
	}
}

