//En un array de 8 posiciones, cargar valores aleatorios 
//de 0 a 39(ambos límites incluidos), pero sin que se repitan.
public class Tara9 {

	public static void main(String[] args) {
		int[] tabla = new int[8]; // Creo una tabla vacia de 8 espacios y los lleno con numeros randoms
					for(int i = 1;i< 7;i++) {
						tabla[i]=(int)Math.floor(Math.random()*39 ) ;
					}
	
					
			for (int i = 0; i < tabla.length; i++) {{ // Localiza si hay numeros repetidos
				for (int j = 0 ; j < tabla.length; j++)
					if(tabla[i] == tabla[j])		
						tabla[i]=(int)Math.floor(Math.random()*39 );// Le da otro valor
			}			
				System.out.println(tabla[i]);
	
			}

	}
}