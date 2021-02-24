/*
 * Programa: Promedio de notas
 * Nombre: David Leonardo Florez Percy
 * Fecha: Oct 21 de 2020
 */
package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notas {
	// inicio del programa
	public static void main(String arg[]) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			// creacion del objeto
			prom resultado = new prom();
			System.out.println("\nPrograma que calcula la definitiva de un estudiante");
			do {
				do {
					// pido la nota
					System.out.println("\nIngrese la primera nota : ");
					resultado.nota1 = Double.parseDouble(in.readLine());
					// la nota debe ser entre 0 - 5 
				}while( resultado.nota1 < 0 || resultado.nota1 < 5);
				do {
					// pido la nota
					System.out.println("\nIngrese la segunda nota : ");
					resultado.nota2 = Double.parseDouble(in.readLine());
					// la nota debe ser entre 0 - 5 
				}while( resultado.nota2 < 0 || resultado.nota2 < 5);
				do {
					// pido la nota
					System.out.println("\nIngrese la tercera nota : ");
					resultado.nota3 = Double.parseDouble(in.readLine());
					// la nota debe ser entre 0 - 5 
				}while( resultado.nota3 < 0 || resultado.nota3 < 5);
				resultado.suma();
				
				if(resultado.resultado > 4.5)
			    {
				    System.out.println("\n\tFelicitaciones, Usted llegará lejos "+ resultado.resultado);
			    }
			    
			    else if (resultado.resultado > 4 || resultado.resultado <= 4.5)
			    {
				    System.out.println("\n\tPuede hacerlo mejor "+ resultado.resultado);
			    }
			    else if (resultado.resultado > 3 || resultado.resultado <= 4)
			    {
				    System.out.println("\n\tDebe esforzarse más "+ resultado.resultado);
			    }
			    else 
			    System.out.println("\n\tDebes repetir la asigantura "+ resultado.resultado);
				// salida
				System.out.println("\n" + " 1 = ingresar otras notas" + " 0 = Termiar con el programa");
				resultado.opcion = Integer.parseInt(in.readLine());
			}
			while (resultado.opcion == 1);
			System.out.println("\nFin del programa");
				
				}
			}

