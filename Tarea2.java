//En un array de 10 valores enteros, ¿es mayor la suma de la primera mitad o la suma de la segunda mitad?
public class Tarea2 {
	static int tabla[]= {3,6,2,77,3,10,23,14,};

	static int sumarPrimera(int[]tabla) { //Para poder sumar la primera mitad
	    int sumar = 0;
	    for (int i = 0; i < tabla.length / 2; i++) {//Lo divido en dos para que solo me cuente la primera mitad de la tabla
	      sumar += tabla[i];
	    }
	    return sumar;
	  }

	  static int sumarSegunda(int[] tabla) {
	    int sumar = 0;
	    for (int i = tabla.length / 2; i < tabla.length; i++) {
	      sumar += tabla[i];
	    }
		return sumar;
		}
	public static void main(String[] args) { //Aqui hago las comparaciones mencionado las funciones auxilares
				if (sumarPrimera(tabla) > sumarSegunda(tabla)) // Compara las dos sumas
					System.out.println("La primera mitad es mas GRANDE") ;
				else if (sumarPrimera(tabla) < sumarSegunda(tabla))
					System.out.println("La primera mitad es mas PEQUEÑO") ;
				else
					System.out.println("La primera mitad y la segunda mitad son IGUALES") ;
		

	}

}

/* SIN FUNCIONES AUXILARES:
 
 public class Prueba2 {
	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};
	//	En un array de 10 valores enteros, ¿es mayor la suma de la primera mitad o la suma de la segunda mitad?
		
		int sum1 = 0 , sum2 = 0 ;
		for (int i =0; i <tabla.length /2; i++) { // Suma la primera mitad.
			sum1= sum1 + tabla[i];
		}
		System.out.println("La suma de la tabla es : " + sum1);
		
		
		for (int i =tabla.length /2; i<tabla.length ; i++) { //Suma la segunda mitad.
			sum2 = sum2 + tabla[i];
		}
		System.out.println("La suma de la tabla es : " + sum2);
	
		if (sum1 > sum2) // Compara las dos sumas
			System.out.println("La primera mitad es mas GRANDE") ;
		else if (sum1 < sum2)
			System.out.println("La primera mitad es mas PEQUEÑO") ;
		else
			System.out.println("La primera mitad y la segunda mitad son IGUALES") ;
	}
}

*/
