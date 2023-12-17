//¿Cuántos valores hay divisibles entre 7?
public class Tarea10 {

	public static void main(String[] args) {
	
				int tabla[]= {3,6,2,77,3,10,23,14};
				
						int contadorSiete = 0 ; // Creo un contador
			
						for (int i =0 ;i<tabla.length;i++) { // Hago un for para ir uno a uni y me diga si es divisible.
								if (tabla [i] % 7 == 0 ) {
									contadorSiete ++ ;
							}
		}
								System.out.println("Hay: " + contadorSiete+ " Numeros divisibles por Siete");
		

	

	}

}
