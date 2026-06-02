package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		// El array es un identificador que hace referencia a una zona de memoria,
		// a diferencia de una variable que hace referencia a una sola ubicacion
		// en la memoria, y que puede contener elementos de un mismo tipo de datos
		// A los elementos del array se pueden acceder utilizando un indice numerico,
		// entero, entre corchetes

		/* ¿Como se declara un array actualmente? */

		// por ejemplo, un array de String
		// El identificador nombres es un array donde cada elemento del array
		// es de tipo String

		// ¿Que ventajas no ofrece?
		// Que en lugar de crear una variable por cada elemento ahora solo tenemos
		// un nombre para todo el conjunto de los elementos y es mucho mas escalable
		// porque podremos tratar 10, 20 o un millon de elementos de la misma forma

		// Si no existieran los array, entonces

		String nombre1;
		String nombre2;
		;
		;
		String nombren; // Donde n puede estar entre 1 y varios millones

		String[] nombres = { "Yodalis", "Jakelin", "Youseff" };

		System.out.println("Array original de nombres");
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);

		System.out.println("El array de nombres tiene " + nombres.length + " elementos");

		// Tamaño fijo implica que no se pueden agregar mas elementos al array,
		// pero si se pueden modificar los elementos existentes
		// nombres[3] = "Marisol";

		nombres[2] = "Marisol";

		System.out.println("Array de nombres modificado");

		System.out.println(nombres[2]);

		int[] arrayNumerosEnteros = { 1, 2, 3, 4, 5 };

		// Array de 3 manzanas

		/*
		 * Manzana[] manzanas = { new Manzana("Roja", "Dulce", "Red Delicious", 7.5,
		 * 0.2, new BigDecimal("0.50")), new Manzana("Verde", "Acida", "Granny Smith",
		 * 6.0, 0.25, new BigDecimal("0.60")), new Manzana("Amarilla", "Dulce",
		 * "Golden Delicious", 8.0, 0.3, new BigDecimal("0.55")) };
		 */

		Manzana[] manzanas = {
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(),
				Manzana.builder().color("Verde").sabor("Dulce").variedad("Granny Smith").size(6.0).peso(0.25)
						.precio(new BigDecimal("0.60")).build(),
				Manzana.builder().color("Amarilla").sabor("Dulce").variedad("Golden Delicious").size(8.0).peso(0.3)
						.precio(new BigDecimal("0.55")).build(),
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(),
				Manzana.builder().color("Verde").sabor("Acida").variedad("Granny Smith").size(6.0).peso(0.25)
						.precio(new BigDecimal("0.60")).build(),
				Manzana.builder().color("Amarilla").sabor("Dulce").variedad("Golden Delicious").size(8.0).peso(0.3)
						.precio(new BigDecimal("0.55")).build(),
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build() };

		// Hasta el momento los arrays que hemos creado son de tamaño
		// fijo, es decir, no se pueden modificar una vez que han sido creados

		/*
		 * Declarar arrays que sean modificables, es decir, que se le puedan agregar o
		 * eliminar elementos o modificar los elementos existentes
		 */

		String[] nombres2 = new String[3];

		// El array de nombres2 tiene 3 elementos, pero todos los elementos son null
		// porque no se les ha asignado un valor aun. Con la sentencia anterior
		// se ha reservado espacio en la memoria para 3 elementos de tipo String.
		// No sera posible pasarse de la cantidad de elementos reservados para el array
		// que en el caso anterior es de 3.

		// Agregando elemento al array nombres2

		nombres2[0] = "Pepa";
		nombres2[1] = "Jakelin";
		nombres2[2] = "Marisol";

		/*
		 * SENTENCIAS DE CONTROL DE FLUJO. En general permiten modificar el flujo de
		 * ejecucion de un programa en dependencia del cumplimiento de una o varias
		 * condiciones, aqui estarian las sentencia condicionales if - else y switch -
		 * case y switch - expression
		 * 
		 * Y por otra parte, pero como parte tambien de las sentencias de control flujo
		 * estarian las que permiten ejecutar en bucle un conjunto de sentencias entre
		 * las que estarian
		 * 
		 * 1- sentencia for clasica 2- sentencia for mejorada 3- sentencia while 4-
		 * sentencia do - while
		 * 
		 * Por ultimo las sentencias break y continue
		 */

		/*
		 * La sentencia for clasica, se utiliza cuando se conoce a priori la cantidad de
		 * veces que se van ejecutar un conjunto de instrucciones.
		 * 
		 * Tambien se puede utilizar para recorrer los elementos de un array
		 */

		/*
		 * Para mostrar en la consola los elementos de un array, por ejemplo el array de
		 * nombres
		 */

		/* Si intentaramos mostrar por la consola los elemetos del array nombres */

		System.out.println("Intentando imprimir los elementos del array nombres");
		System.out.println(nombres);

		/*
		 * La sentencia anterior solamente mostro por la consola la direccion de memoria
		 * de la zona donde estan almacenados los elementos del array pero los elementos
		 * como tal no los ha mostrado.
		 * 
		 * Para mostrar los elementos del array se necesita una sentencia de control de
		 * flujo, que en bucle recorra todos los elementos del array de nombres y podria
		 * ser la sentencia for clasica, en primer lugar, y en segundo lugar la
		 * sentencia for mejorada
		 */

		// Primero: Sentencia for clasica

		System.out
				.println("Recorriendo/Iterando los elementos del array de nombres" + "con una sentencia for clasica: ");

		int totalNombres = nombres.length;

		for (int i = 0; i <= totalNombres - 1; i++) {
			System.out.println(nombres[i]);
		}

		System.out.println("La sentencia for ha concluido");

		/* OPERADOR DE AUTO INCREMENTO (++) Y DE AUTO DECREMENTO (--) */

		int ii = 0;

		++ii;

		ii++;

		/*
		 * Para comprobar la diferencia entre las dos instrucciones anteriores se puede
		 * utilizar una herramiento de linea de comandos llamado jshell y comprobaremos
		 * que el operador de autoincremento cuando esta solo, es lo mismo que este al
		 * principio que al final, que no es igual a cuando esta en una expresion
		 */

		/*
		 * Ejemplo de creacion de un array de numeros fraccionarios, tipo double, que
		 * tienen parte entera y parte fraccionaria. Los valores del array se tienen que
		 * generar de forma aleatoria y con numeros entre 0 100,
		 * 
		 * Sabemos que debemos de utilizar el metodo random() de la biblioteca Math,
		 * pero no sabemos como hacer que genere numeros aleatorios entre 0 y 100.
		 * 
		 * Por lo tanto vamos a utilizar la herramienta jshell para averiguar como hacer
		 * que se generen los numeros aleatorios que queremos
		 */

		System.out.println("Array de numeros de tipo double, generado de forma aleatoria ");

		double[] arrayDeDoubles = new double[20];

		System.out.println("Array original, con los valores por defecto ");

		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		}

		// Rellenando el array con valores generados aleatoriamente
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			arrayDeDoubles[i] = Math.random() * 100 - 1;
		}

		// Mostrando el array resultante

		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {

			System.out.println(arrayDeDoubles[i]);
		}

		/*
		 * Ejercicio # 1. Modificar el ejemplo anterior para que array sea de 100
		 * numeros enteros generados aleatoriamente
		 * 
		 * Sugerencia: Hacer un commit previamente a ponerse con la solucion del
		 * ejercicio, para que puedas modificar el codigo sin que se pierda el codigo
		 * del ejemplo original
		 */

		System.out.println("-------- Solucion al Ejercicio # 1 ----------");
		long[] numerosEnteros = new long[100];

		System.out.println("Array original de numeros enteros: ");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			System.out.println(numerosEnteros[i]);
		}

		System.out.println("Array resultante, generado aleatoriamente");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			numerosEnteros[i] = Math.round(Math.random() * 100 - 1);
		}

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			System.out.println(numerosEnteros[i]);
		}

		/*
		 * SENTENCIA FOR MEJORADA.
		 * 
		 * Se recomienda su uso siempre que no haya que trabajar con el indice o los
		 * indices de un array
		 */

		System.out.println("----- SENTENCIA FOR MEJORADA (Mal llamada forEach) ---------------");

		for (long numeroEntero : numerosEnteros) {
			System.out.println(numeroEntero);
		}

		/*
		 * Ejercicio # 2.
		 * 
		 * Recorrer el array numerosEnteros y solamente mostrar aquellos elementos que
		 * son de indice par
		 * 
		 * ¿Cuando un valor es par?
		 * 
		 * Cuando el resultado del residuo de la division por 2 es igual a cero.
		 * 
		 * El residuo de la division la da el operador %, o tambien mod en una
		 * calculadora
		 */

		// Solucion utilizando una sentencia for clasica

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {

			if (i % 2 == 0) {
				System.out.println("indice: " + i + ", numero: " + numerosEnteros[i]);
			}
		}

		/*
		 * Ejercicio # 3.
		 * 
		 * Recorrer el array de numerosEnteros y mostrar solamente los elementos impares
		 */

		/*
		 * Ejercicio # 4.
		 * 
		 * Recorrer el array de numerosEnteros y mostrar solamente los que sean de
		 * indice impar
		 */

		/* -------- SENTENCIAS DE ASIGNACION COMPUESTAS ---------- */

		/*
		 * Primero: En Java existen dos tipos de datos, los tipos de datos primitivos
		 * cuyo nombre es todo letras minusculas, como por ejemplo int, long, byte,
		 * short, boolean, double, float, y por otra parte NO TIENEN propiedades ni
		 * metodos ¿Como lo sabemos? Porque le aplicamos el operador punto (.) a
		 * continuacion y no se muestra nada
		 */

		int e = 20;

		// e. // No se muestra nada despues del operador punto porque el tipo de dato

		/*
		 * Segundo: Existen los tipos de datos no primitivos, que son aquellos cuyo
		 * nombre comienza con mayuscula, como por ejemplo String, BigDecimal, Manzana,
		 * etc. Estos tipos de datos no primitivos SI TIENEN propiedades y metodos
		 */

		Integer e2 = 200;

		/* Existe una excepcion y es que el tipo datos String no tiene primitivo */

		// Tamaño fijo
		String[] nombres3 = { "Elida", "Jakelin", "Juan Carlos", "Miguel" };

		// A continuacion array que no es de tamaño fijo
		String[] nombres4 = new String[100];

		// Ejemplo: Recorrer el array nombres3 y mostrar solamente los nombres que
		// tengan
		// mas de 5 caracteres

		for (String nombre : nombres3) {

			if (nombre.length() > 5)
				System.out.println(nombre);
		}

		/*
		 * Tercero: Existen las sentencias de asignacion compuestas, que son aquellas
		 * que permiten modificar el valor de una variable utilizando un operador de
		 * asignacion compuesto, como por ejemplo +=, -=, *=, /=, %=, etc.
		 */

		/*
		 * COMENTARIO MUY IMPORTANTE
		 * 
		 * Simpre que sea posible las variables se deben declarar de un tipo de datos
		 * primitivo, porque de esta manera el lenguaje no tiene que hacer ninguna
		 * conversion implicita o explicita.
		 * 
		 * El tipo de datos objeto, la contraparte del primitivo, realmente NO existe,
		 * el tipo objeto es un envoltorio del tipo primitivo
		 */

		byte v1 = 20;
		short v2 = 30;

		// v2 = (short) (v2 + v1);

		v2 += v1; // v2 = v2 + v1

		/*
		 * Lo anterior es un ejemplo de la potencia de las sentencias de asignacion
		 * compuestas
		 * 
		 * De no utilizar una sentencia de asignacion compuesta en el ejemplo anterior,
		 * tendriamos que terminar haciendo un type casting (casteo en castelleno) que
		 * significa obligar a convertir a un tipo de datos concreto, que debe evitarse
		 * en la medida de lo posible.
		 * 
		 * Concretamente en la operacion anterior, los operandos v1 y v2 se convierten
		 * al tipo int y el resultado se obtiene como un int tambien y no se puede
		 * almacenar en la variable v2 a no ser que se realice un casteo a tipo short
		 * 
		 * Todo lo anterior lo realiza la sentencia de asignacion compuesta
		 */

		/*
		 * Conceptos de Contador y Acumulador, implementados a traves del uso de las
		 * sentencias de asignacion compuestas
		 * 
		 * A modo de ejemplo # 1: Vamos a recorrer el array de manzanas y calcular el
		 * peso promedio de todas las manzanas
		 * 
		 * A modo de ejemplo # 2: Recorrer el array de manzanas y mostrar solamente las
		 * manzanas cuyo peso sea superior al promedio, de color verde, de tamaño (size)
		 * superior a 5, y de sabor dulce
		 */

		/* Solucion al ejemplo # 1 */

		// Contador para llevar la cuenta del total de mazanas a las cuales
		// le hemos leido el peso, para luego poder calcular el promedio
		int counter = 0;

		// Acumulador para ir sumando el peso de cada manzana, para luego poder
		// calcular el promedio
		double acumuladorPeso = 0.0; // Sumatoria del peso de las manzanas

		// ¿sentencia for clasica o mejorada? Rta Mejorada, porque no se pide nada
		// respecto al indice del array de manzanas

		for (Manzana m : manzanas) {

			// Incrementamos el contador en uno
			++counter; // counter = counter + 1

			// acumuladorPeso = acumuladorPeso + m.getPeso();
			acumuladorPeso += m.getPeso();
		}

		// Fuera del bucle for se calcularia el promedio

		double pesoPromedio = acumuladorPeso / counter;

		// Imprimir en la consola el peso promedio
		System.out.println("El peso promedio es: " + pesoPromedio);

		/*
		 * Solucion al ejemplo # 2. Utilizacion del operador logico relacional && que en
		 * otros lenguajes de programacion seria el operador AND y implica que tienen
		 * que ser verdaderas las condiciones a la izquierda y la derecha del operador
		 * para que la condicion completa, al evaluar la expresion sea verdadera.
		 * 
		 * Se le llama tambien al operador && de corto-circuito, porque la primera
		 * condicion que encuentre que es falsa ya no continua evaluando la restantes
		 */

		for (Manzana man : manzanas) {

			if (man.getPeso() > pesoPromedio && man.getColor().equals("Verde") && man.getSize() > 5
					&& man.getSabor().equals("Dulce"))
				System.out.println(man.toString());
		}

		/* Demostracion de que el operador logico && es de corto-circuito */

		BigDecimal precio = new BigDecimal(0.80);

		System.out.println("Precio original: " + precio);

		for (Manzana man : manzanas) {

			if (man.getPeso() > pesoPromedio && man.getColor().equals("Verde") && man.getSize() > 7
					&& man.getPrecio().equals(precio = new BigDecimal(2.00)) && man.getSabor().equals("Dulce"))
				System.out.println(man.toString());
		}

		System.out.println("Precio modificado ???? " + precio);

		/*
		 * OPERADOR LOGICO OR (||). Este operador dará como resultado verdadero, si al
		 * menos una de las condiciones que se evaluan en la expresion es verdadera.
		 * 
		 * A direncia del OPERADOR AND (&&), el operador OR no es de corto-circuito, es
		 * decir, que si una expresion no se cumple siempre va a evaluar las siguientes
		 */
		// A continuación ,un ejemplo sencillo
		boolean t1 = false;
		boolean t2 = false;
		boolean t3 = true;
		if (t1 == false || t2 == false || t3 == true) {
			System.out.println("La epresion es verdadera");
		} else {
			System.out.println("La exprsion es false");

			/*
			 * OPERADOR DE NEGACION NOT (!)
			 * 
			 * A modo de ejemplo: ¿Que sucederia si se niega la variable t3, en la condicion
			 * de la sentencia if anterior?
			 */

			if (t1 || t2 || t3) {
				System.out.println("La epresion es verdadera");
			} else {
				System.out.println("La exprsion es false");

				/* En la misma expresion se pueden tener operadores OR (||) y AND (&&) */

				if (t1 || t2 || !t3) {
					System.out.println("La epresion es verdadera");
				} else {
					System.out.println("La expresion es false");

				}

				/*
				 * Ejercicio # 1 del Lunes 1 de Junio:
				 * 
				 * Respecto al array de manzanas, recorrerlo con una sentencia for mejorada y
				 * mostrar por la consola las manzanas que incluyan en el nombre de la variedad
				 * la palabra Delicious y, ademas, sean de color Rojo, o que tengan un precio
				 * inferior o igual al precio promedio
				 */

				System.out.println("----- Ejercicio 1 del lunes 1 de Junio -----");

				int counter2 = 0;
				double acumuPrecio = 0.0;

				for (Manzana man2 : manzanas) {
					counter2++;
					acumuPrecio += man2.getPrecio().doubleValue();
				}
				double precioPromedio = acumuPrecio / counter2;
				System.out.println("El precio promedio de las manzanas es: " + precioPromedio);

				for (Manzana manza : manzanas) {
					if (manza.getVariedad().contains("Delicious") && manza.getColor().equals("Roja")
							|| manza.getPrecio().doubleValue() <= precioPromedio) {
						System.out.println("La manzana que cumple la condicion es: " + manza);

					}
				}
				/*
				 * SENTENCIA SWITCH CASE.
				 * 
				 * Es una variante de la sentencia if - else, preferible cuando con una sentenci
				 * if - else hay que evaluar mas de 3 o 4 condiciones porque el codigo se hace
				 * dificil de mantener y poco legible
				 */
				/*
				 * Para ejemplicar, vamos a crear un enumerable con los dias de la semana y
				 * mostrar un mensaje en dependencia del dia de la semana que se trate.
				 * 
				 * Se propone crear un metodo a nivel de la clase App que recibe un tipo enum y
				 * devuelva un tipo String con el mensaje segun el dia de la semana en cuestion
				 */
				/*
				 * Solucion:
				 * 
				 * Primero: con una sentencia if - else en el cuerpo del metodo
				 * 
				 * Segundo: con una sentencia switch - case en el cuerpo del metodo
				 */
				// Invocacion o llamada del metodo infoDiaSemana con parametro correspondiente
				// al viernes

				// Invocar el metodo infoDiaSemana, al cual le hemos quitado
				// el modificador static
				App app;
				app = new App();
				

				System.out.println(new App().infoDiaSemana(DiaSemana.VIERNES));
					// metodo de istancias, es decir, sin modificador saratic,
				// Metodo de instancia, es decir, sin el modificador static,

				// que recibe un tipo enum y devuelve un String

				// Se necesita una instancia (objeto) de la clase App

				// para poder invocar el metodo infoDiaSemana, porque es un metodo de instancia





				
				
				
				
				

			}
		}

	}

	String infoDiaSemana(DiaSemana diaSemana) {
		
		if (diaSemana.equals(DiaSemana.LUNES))
			return "Primer dia de la semana, a trabajar";
		else if (diaSemana.equals(DiaSemana.MARTES))
			return "Hemos pasado el lunes";
		else if (diaSemana.equals(DiaSemana.MIERCOLES))
			return "Nos acercamos al fin de semana";
		else if (diaSemana.equals(DiaSemana.JUEVES))
			return "Es juernes, los nuevos viernes, a disfrutar!!!";
		else if (diaSemana.equals(DiaSemana.VIERNES))
			return "El viernes y el cuerpo lo sabe";
		else if (diaSemana.equals(DiaSemana.SABADO) || diaSemana.equals(DiaSemana.DOMINGO))
			return "Es fin de semana";
		else
			return "El dia recibido no existe";

		

	}
}
