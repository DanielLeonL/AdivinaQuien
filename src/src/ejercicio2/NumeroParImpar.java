/*
 * Programa: Numero par o impar
 * Nombre: David Leonardo Florez Percy
 * Fecha: Oct 21 de 2020
 */
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroParImpar {

	// inicio del programa
	public static void main(String arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// creacion del objeto
		par resultado = new par();
		System.out.println("\nPrograma que determina si un numero es par o impar");
		do {
			//pido un numero
			System.out.println("\nDigite un numero =");
			resultado.numero = Integer.parseInt(in.readLine());
			resultado.comprobar();
			// es par o no es impar
			if (resultado.residuo == 0) {
				System.out.println("\n" + resultado.numero + " es un numero par");
			} else {
				System.out.println("\n" + resultado.numero + " es un numero impar");
			}
			// salida
			System.out.println("\n" + " 1 = ingresar otro numero" + " 0 = Termiar con el programa");
			resultado.opcion = Integer.parseInt(in.readLine());
		}
		// Fin del programa
		while (resultado.opcion == 1);
		System.out.println("\nFin del programa");
	}
}
