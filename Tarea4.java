
//Rota una posición a la derecha todos los elementos, 
//dejando en primera posición el elemento
//que estaba en la última posición
public class Tarea4 {
	public static void main(String[] args) {
		
		int tabla[]= {3,6,2,77,3,10,23,14};
		
		int temp , valor = tabla[0] ;
		
		for(int i= 0;i<tabla.length -1 ;i++) { {
						temp = tabla[i+1]; // Guarda el siguiente numero.
						tabla[i+1]= valor ; //Guarda el numero que este en valor y lo pone en la nueva posicion
						valor = temp; // Toma el valor guardado en temp y lo guarda en i+1
				
		 }
					tabla[0]= temp;//Pone el ultimo numero en la primera posicion
		} 
		for (int i = 0; i <= tabla.length - 1; i++) // Bucle para que enseñe la tabla
					System.out.println(i + ": " + tabla[i]);			
				
	
	
				
	}
}




/*INTENTO CON FUNCIONES AUXILIARES:
 
 
 public class Tarea4 {
	static int tabla[]= {3,6,2,77,3,10,23,14};

	public static int[] rotarPosiciones(int[] tabla) {
		int[] nuevaTabla = new int[tabla.length];
		int temp = 0;
		int valor =0;
		  
		 for (int i = 0; i < tabla.length -1; i++) {
				temp = tabla[i+1];
				tabla[i+1]= valor ;
				valor = temp;
				 }
			tabla[0]= temp;
		return nuevaTabla;}
	
public static void main(String[] args) {
		System.out.println(rotarPosiciones(tabla));			

	}

}*/
