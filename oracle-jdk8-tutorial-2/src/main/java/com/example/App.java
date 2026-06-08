package com.example;

public class App {
	public static void main(String[] args) {

		/*
		 * Trabajo con arrays de dos dimensiones, tambien llamado matriz cuando el array
		 * es de una sola dimension se le de denimina victor.
		 */

		/* ¿Como declarara un array de dos dimensiones (matriz)? */
		/*
		 * Amodo de ejemplo , vamos a creasr un array bidimensional de 3 filas y 3
		 * columnas con numeros enteros. posteriormente recorremos dicha matriz para
		 * buscar ocurrencia de un numero y cuando se encuentre impriir en la consola la
		 * fila y la colomna donde ha sido encontrado dicho numero
		 */

		/*
		 * No tiene que ver con los array de dos dimensiones , pero vale para recordar:
		 * Que cuando se declara un array y en mismo momento se le asigna valores, se
		 * obtiene un array de tamaño fijo
		 */
		String[] nombres = { "Elida", "Gina" };

		// nombres[2] = "Miguel";
		int[][] matrizEnteros = {

				{ 1, 2, 3, 10, 100, 200 }, { 4, 5, 6, 20 }, { 7, 8, 9 }, { 4, 5, 6, 20, 400 }, { 7, 8, 9, 30 }

		};

		/*
		 * Ejemplo: Recorrer la matriz anterior para buscar la primera ocurrencia del
		 * numero 5 y mostrar la fila y la columna en las cuales ha sido encontrado.
		 * 
		 * Para recorrer una matriz se utilizan sentecias for anidadas, una para las
		 * filas y otra para las columnas
		 */
		// for (int fila = 0; fila <= 3 - 1; fila++ )
		// for (int columna = 0; columna <= 3 - 1; columna++ ) {
		//
		// }

		/*
		 * El codigo anterior no es correcto y se ha comentado porque solamente serviria
		 * para tratar una matriz cuadrada de 3 x 3, es decir 3 filas y 3 columnas.
		 * 
		 * Si ampliamos o disminuimos el numero de filas o de columnas ya el codigo no
		 * vale para nada
		 */
		int totalFilas = matrizEnteros.length;

		System.out.println("Total de filas: " + totalFilas);
		// el numero a buscar, su primer ocurencia en la matiz es el numero 5
		int numeroABuscar = 5;

		for (int fila = 0; fila <= totalFilas - 1; fila++)
			for (int columna = 0; columna <= matrizEnteros[fila].length - 1; columna++) {

				/*
				 * El codigo siguiente ha sido sugerido por GitHub Copilot, un agente de IA,
				 * pero soluciona el encontrar la primera ocurrencia del numero a buscar, porque
				 * aunque ya haya encontrado el numero lo continua buscando, pero si el numero
				 * se encontrase repetido en la misma fila tampoco lo encontraria por segunda
				 * vez.
				 * 
				 * En resumen, es bastante deficiente el codigo sugerido inicialmente
				 * 
				 * Solamente servira para encontrar la primera ocurrencia en cada fila
				 */
				if (matrizEnteros[fila][columna] == numeroABuscar) {
					System.out.println("Numero encontrado en la fila: " + fila);
					System.out.println("Numero encontrado en la columna: " + columna);
					break;
				}
			}
		/*
		 * Acontinuación el codigo que reañmente soluciona el plantamiento original es
		 * decir de buscar la PRIMERA ocurrencia del valor buscado el numero 5 en este
		 * caso
		 */
		System.out.println("Codigo que soliciona el problema origenal;");

		bucleExterior: for (int fila = 0; fila <= totalFilas - 1; fila++)
			for (int columna = 0; columna <= matrizEnteros[fila].length - 1; columna++) {

				if (matrizEnteros[fila][columna] == numeroABuscar) {
					System.out.println("Numero encontrado en la fila: " + fila);
					System.out.println("Numero encontrado en la columna: " + columna);
					break bucleExterior;

				}
			}
		/*
		 * Ejercicio 1 del viernes 5 de junio. Recorrer la matriz y encontrar todas la
		 * correncias del numerio 5 es decir tener en cuenta que puede estar en la misma
		 * fila en mas de un columna
		 */
		/* Solucion */
		System.out.println("-----Solucion al ejercicio # 1 del viernes 5 de Junio-----");

		for (int fila = 0; fila <= totalFilas - 1; fila++)
			for (int columna = 0; columna <= matrizEnteros[fila].length - 1; columna++) {

				if (matrizEnteros[fila][columna] == numeroABuscar)
					System.out.println("Numero encontrado en fila: " + fila + " y columna: " + columna);
			}
		/*
		 * Sentencia continue
		 * 
		 * A diferencia del break, no rompe el bucle sino que continua en la siguiente
		 * iteracion
		 * 
		 * Tambien admite etiquetas,
		 * 
		 * A modo de ejemplo, recorrer la matriz de numeros enteros, pero utilizando
		 * sentencias for mejoradas y cada vez que se encuentre un valor par, continuar
		 * en la siguiente iteracion,
		 * 
		 * Si el valor encontrado no es par, elvar al cuadrado el numero y almacenarlo
		 * en la mismo ubicacion
		 * 
		 * Mostrar el array resultante al final
		 */
		/*
		 * Primero: recorrer la matriz con dos sentencias for mejoradas
		 */
		/*
		 * Sentencia continue
		 * 
		 * A diferencia del break, no rompe el bucle sino que continua en la siguiente
		 * iteracion
		 * 
		 * Tambien admite etiquetas,
		 * 
		 * A modo de ejemplo, recorrer la matriz de numeros enteros, pero utilizando
		 * sentencias for mejoradas y cada vez que se encuentre un valor par, continuar
		 * en la siguiente iteracion,
		 * 
		 * Si el valor encontrado no es par, elevar al cuadrado el numero y almacenarlo
		 * en una nueva matriz de numeros enteros, es decir, una matriz de numeros
		 * enteros al cuadrado.
		 * 
		 * 
		 * Mostrar el array resultante al final
		 */
		System.out.println("-----Ejercicio con sentencia continue-----");
		/*
		 * Array bidimensional donde se va aalmacenar elcuadrado de los menores impares
		 * 
		 */
		int[][] matriz = new int[10][100];

		int i = -1; // indice para las filas
		int j = 0; // indice para las columnas
		// recorrer matriz con for mejorado la matriz de numeros enteros
		for (int[] fila : matrizEnteros) {

			// si el valor es par, continuar
			for (int numero : fila) {
				if (numero % 2 == 0)
					continue;
				// si el valor no es par, elevar al cuadrado
				else {
					// int numeroAlCuadrado = numero * numero;
					numero *= numero;
					// System.out.println("El numero es: " + numero);
					System.out.println("El numero al cuadrado es: " + numero);

				}

			}

		}
		// Matriz resultante con los cuadrados de los numeros impares

		System.out.println("La matriz resultante con los cuadrados: ");
		for (int[] fila : matriz)
			for (int valor : fila)
				if (valor != 0)
					System.out.println(valor);
	}
}
