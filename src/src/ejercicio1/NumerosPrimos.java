/*
 * Programa: Numeros Primos
 * Nombre: David Leonardo Florez Percy
 * Fecha: Oct 21 de 2020
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerosPrimos {
	//inicio del programa
	public static void main(String arg[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//creacion del objeto
		validador resultado = new validador();
		System.out.println("\nPrograma que determina si un numero es primo o no");
		//ciclo por si se quiere ingresar otro valor
		do {
			System.out.println("\nDigite un numero =");
			resultado.numero = Integer.parseInt(in.readLine());
			//validar que sea numero positivo
			if (resultado.numero < 0) {
				System.out.println("\ningrese un valor correcto");
			} else {
				resultado.verificar();
				//primo o no
				if (resultado.indice < 2) {
					System.out.println("\n" + resultado.numero + " es un numero primo");
				} else {
					System.out.println("\n" + resultado.numero + " no es un numero primo");
				}
			}
			//salida
			System.out.println("\n" + " 1 = ingresar otro numero" + " 0 = Termiar con el programa");
			resultado.opcion = Integer.parseInt(in.readLine());
		}
        // Fin del programa
		while (resultado.opcion == 1);
		System.out.println("\nFin del programa");

	}
}
