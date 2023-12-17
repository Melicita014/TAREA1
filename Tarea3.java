//¿Son todos los elementos del array diferentes?
public class Tarea3 {
	static int tabla[]= {3,6,2,77,3,10,23,14};
	static int contarRep(int[] tabla) {
		  int contador = 0;
		  for (int i = 0; i < tabla.length -1; i++){ // Cojes el primer numero para compararlo con los demas
			  for(int j=i+1;j<tabla.length ;j++){// Cojes el siguiente numero segun el contador
				  if (tabla[i] == tabla[j]) 
					  contador++; 
			  }
		  }
		return contador;
	}
			
	public static void main(String[] args) {
			if (contarRep(tabla) == 0)
				System.out.println("Son todos los contadores DIFERENTES");
			else
				System.out.println("Hay algun numero IGUAL");
			
					

	}

}

/* SIN FUNCIONES AUXILARES : 
  public class Tarea3 {

	public static void main(String[] args) {
		
		int tabla[]= {3,6,2,77,3,10,23,14};
			
		//¿Son todos los elementos del array diferentes?
		int contador = 0 ;
	
	for (int i = 0; i <tabla.length - 1 ; i++){ // Cojes el primer numero para compararlo con los demas
			
			for(int j=i+1;j<tabla.length ;j++)  // Cojes el siguiente numero segun el contador
					
				if (tabla[i]== tabla[j])
					contador++ ;
	}
				
				if (contador == 0)
					System.out.println("Son todos los contadores DIFERENTES");
					else
						System.out.println("Hay algun numero IGUAL");
	
			/* OTRA OPCION CON FUNCIONES ELEMENTALES:
			boolean repetio = false ;
			for (int i = 0; i <tabla.length - 1 ; i++){
			
				for(int j=i+1;j<tabla.length ;j++) 
					
				if (tabla[i]== tabla[j])
				repetido = true ;
				}
	}
				*/	




