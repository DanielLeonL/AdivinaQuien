/*
 * Programa: Promedio de notas
 * Nombre: David Leonardo Florez Percy
 * Fecha: Oct 21 de 2020
 */
package ejercicio4;

public class prom {
//creacion de variables
	double nota1;
	double nota2;
	double nota3;
	double total1;
	double total2;
	double total3;
	double resultado;
	int opcion;

	public void suma() {
		// saco los acumulados con su porcentaje
		total1 = (nota1 * 0.3);
		total2 = (nota2 * 0.3);
		total3 = (nota3 * 0.4);
		// saco resultado total de los acumulados
		resultado = total1 + total2 + total3;
	}
}
