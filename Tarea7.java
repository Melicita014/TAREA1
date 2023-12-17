//¿Hay más pares o impares?
public class Tarea7 {
	public static void main(String[] args) {
		
		int tabla[]= {3,6,2,77,3,10,23,14,14};
		
				int contadorpar = 0 , contadorimpar = 0 ;
	
				for (int i =0 ;i<tabla.length;i++) {// Va numero por numero por cada tabla y suma al contador de par o imapr segun elr esultado.
						if (tabla [i] % 2 == 0 ) {
							contadorpar ++ ;
						}
						else
							contadorimpar++ ;
				}
				if (contadorpar < contadorimpar) // Aqui hace la comparacion
					System.out.println("Hay mas impares");
				else if (contadorpar > contadorimpar)
					System.out.println("Hay mas pares");
				else
					System.out.println("Hay la misma cantidad");
	
	}
}

	/* INTENTO DE CON FUNCIONES AUXILIARES:
	 *	int tabla[]= {3,6,2,77,3,10,23,14,15,3};
	static int contadorpar = 0 ;
	static int contadorimpar = 0;
	  
	
	public static int esPar(int tabla[], int i) {
		  if (tabla[i] % 2 == 0) {
			  contadorpar ++;
		    return contadorpar;
		  } else {
			  contadorimpar++;
		    return contadorimpar;
		  }
		}
	public static int contarPares(int[][] tabla) {
		  int contador1 = 0;
		  for (int i = 0; i < tabla.length; i++) {
		    for (int j = 0; j < tabla[i].length; j++) {
		      if (esPar(tabla[i][j])) {
		        contador1++;
		      }
		    }
		  }
		  return contador1;
		}
	public static int contarImpares(int[][] tabla) {
		  int contador2 = 0;
		  for (int i = 0; i < tabla.length; i++) {
		    for (int j = 0; j < tabla[i].length; j++) {
		      if (esPar(tabla[i][j])) {
		        contador2++;
		      }
		    }
		  }
		  return contador2;
		}
	
			public static void main(String[] args) {						
				if (contarPares(tabla[i]) < contarImpares(tabla[i]))
					System.out.println("Hay mas impares");
				else if (contadorpar > contadorimpar)
					System.out.println("Hay mas pares");
				else
					System.out.println("Hay la misma cantidad");
		*/
