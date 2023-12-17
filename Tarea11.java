// ¿Cuántos valores primos hay en el array?

public class Tarea11 {
	static int[] tabla= {3,6,2,77,3,10,23,14,13,13};
// Hago una funcion para que me diga si es par o no.
	public static boolean EsPar(int num) {
	    if (num == 1) return false;
	    if (num == 2) return true;
	    for (int i = 2; i * i <= num; i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		 int contadorPrimos = 0;
		        for (int i = 0; i < tabla.length; i++) {// Un bucle llamando a la funcion para que cuando me diga true sume uno al contador
		            if (EsPar(tabla[i])== true) {
		                contadorPrimos++;
		            }}
				System.out.println ("Hay exactamente: "+contadorPrimos +" Numeros primos.");
		
	}

}
