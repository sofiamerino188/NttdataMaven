package com.nttdata.mvn;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.util.ArithmeticUtils;

/**
 * Clase Principal
 * 
 * @author sofiamerino
 *
 */
public class App {
	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Generación de mensaje
		final String message = "Hola compañeros y compañeras de la bootcamp";

		// Generación de número
		final int num = 23456789;

		// Ejecución de mensaje
		sayHello(message);

		// Ejecución de comprobación
		checkPower2(num);
	}

	/**
	 * Método para saludar
	 * 
	 * @param msg
	 */
	public static void sayHello(final String msg) {

		// Validación de integridad
		if (StringUtils.isNoneBlank(msg)) {

			// Printado de mensaje
			System.out.println(msg);

		} else {

			// Printado de error
			System.out.println("ERROR");
		}

	}

	/**
	 * Método para comprobar si un numero es potencia de dos
	 * 
	 * @param num
	 */
	public static void checkPower2(final int num) {
		
		if (ArithmeticUtils.isPowerOfTwo(num)) {
			
			// Printado del resultado
			System.out.println(num + " es potencia de 2");
			
		} else {
			
			// Printado del resultado
			System.out.println(num + " no es potencia de 2");
		}
	}

}
