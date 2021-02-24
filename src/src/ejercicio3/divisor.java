/*
 * Programa: Divisores positivos
 * Nombre: David Leonardo Florez Percy
 * Fecha: Oct 21 de 2020
 */
package ejercicio3;

public class divisor {

	// creacion de las variables
	int numero;
	int opcion;

	void Verificador() {
		// numeros que se pueden dividir
		for (int i = 1; i <= numero; i++)
			
		{
			// si el residuo del umero es 0 se muestra en pantalla
			if ((numero % i) == 0)
			{
				System.out.print(" "+ i );
			}
		}

	}
}
