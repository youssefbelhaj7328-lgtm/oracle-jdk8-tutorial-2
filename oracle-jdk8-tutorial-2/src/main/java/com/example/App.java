package com.example;

public class App {
	public static void main(String[] args) {

		/*
		 * Sentencia while:
		 * 
		 * 
		 * Las sentencias for clasica y for mejorada se utilizan cuando se sabe, a
		 * priori, la cantidad de veces que se va a ejecutar un bloque de instrucciones.
		 * 
		 * Mientras que la sentencia while se utiliza cuando no se sabe, a priori, la
		 * cantidad de veces que se va a ejecutar un bloque de instrucciones y ademas,
		 * cuando no se requiere ejecutar el bloque de instrucciones ni una sola vez
		 * aunque ya no se cumpla la condicion
		 */

		// Ejemplo sencillo para comprender la sintaxis de la sentencia while
		

		int z = -1;
		
		
		int counterr = 0;

		while (z >= 0) {
			System.out.println("El valor de la variable z: " + z);
			
			z--;
			counterr++;
		}
		System.out
				.println("El bloque correspondiente a la sentencia while" + ", se ha ejecutado " + counterr + " veces");
		System.out.println("El valor final de la variable z es: " + z);
			/*sentencia do - while.
	 

* La condicion se evalua al final, no al principio como
* en la sentencia while, por lo que si se necesita ejecutar
* el bloque de instrucciones que estan entre las llaves de
* apertura y cierre, una vez al menos, pues esta es la sentencia
* indicada */
			int zz = 20;
			

			do {
			System.out.println("No se cumple ya la condicion y "
			+ "hemos entrado al bucle una vez, de todas formas ");
			zz -= 5;
			} while (zz < 10);
			
				
		

	}

}
