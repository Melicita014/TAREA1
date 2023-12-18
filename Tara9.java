//En un array de 8 posiciones, cargar valores aleatorios 
//de 0 a 39(ambos límites incluidos), pero sin que se repitan.
public class Tara9 {
	
	// Funcion para comprobar si esta repetido o no
	
	static boolean seRepite (int t[], int numero, int cantidad) {
		for (int i=0 ; i<cantidad;i++)
			if (t[i]== numero)
				return true ;
				
			return false ;
	}
	
		public static void main(String[] args) {
			
		int[] tabla = new int[8];
		//Calcular 8 posiciones diferentes
				for(int i = 1;i< tabla.length;i++) {
							int aleatorio ;
							aleatorio =(int)Math.floor(Math.random()*39 );
							
				while (seRepite(tabla, aleatorio, i))
								aleatorio =(int)Math.floor(Math.random()*39 );
								tabla[i]= aleatorio;
				}
		// Visualizar tabla
				for(int i = 0;i< tabla.length;i++)
							System.out.println(tabla[i]);
		}
	}

