/*
 * Programa: Divisores positivos
 * Nombre: David Leonardo Florez Percy
 * Fecha: Oct 21 de 2020
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisoresPositivos {
	// inicio del programa
	public static void main(String arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// creacion del objeto
		divisor resultado = new divisor();
		System.out.println("\nPrograma que determina los divisores de un numero");

		do {
			do {
				// pido un numero
				System.out.println("\nDigite un numero =");
				resultado.numero = Integer.parseInt(in.readLine());
			}
			// solo positivos
			while (resultado.numero <= 0);
			System.out.println("Valor erroneo");

			// muestra los divisores
			System.out.println("los divisores son :");
			resultado.Verificador();

			// salida
			System.out.println("\n" + " 1 = ingresar otro numero" + " 0 = Termiar con el programa");
			resultado.opcion = Integer.parseInt(in.readLine());
		}
		// Fin del programa
		while (resultado.opcion == 1);
		System.out.println("\nFin del programa");
	}

}
