package adivina;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ObjectInputStream Leyendo = null;
		File Archivo = new File("datos");
		boolean[] arreglo1 = new boolean[24];
		boolean[] arreglo2 = new boolean[24];

		try {

			Leyendo = new ObjectInputStream(new FileInputStream(Archivo));
		} catch (FileNotFoundException e) {

			JOptionPane.showMessageDialog(null, "No hay autoguardado registrado, se abrira el inicio del juego",
					"Información", JOptionPane.INFORMATION_MESSAGE);

			Menu frame = new Menu();
			frame.setVisible(true);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {

			int contador = (int) Leyendo.readObject();

			if (contador == 1) {

				int personaje = (int) Leyendo.readObject();
				int personaje1 = (int) Leyendo.readObject();
				arreglo1 = (boolean[]) Leyendo.readObject();
				int personaje2 = (int) Leyendo.readObject();
				int personaje3 = (int) Leyendo.readObject();
				arreglo2 = (boolean[]) Leyendo.readObject();
				Tablero1 jugador1 = new Tablero1(personaje, personaje1, arreglo1);
				Tablero2 jugador2 = new Tablero2(personaje2, personaje3, arreglo2);
				Intermediario intermedio = new Intermediario(jugador1, jugador2);
				jugador1.setintermedio(intermedio);
				jugador2.setintermedio(intermedio);
				jugador1.setVisible(true);

			}

			if (contador == 2) {

				int personaje = (int) Leyendo.readObject();
				int personaje1 = (int) Leyendo.readObject();
				arreglo1 = (boolean[]) Leyendo.readObject();
				int personaje2 = (int) Leyendo.readObject();
				int personaje3 = (int) Leyendo.readObject();
				arreglo2 = (boolean[]) Leyendo.readObject();
				Tablero1 jugador1 = new Tablero1(personaje2, personaje3, arreglo2);
				Tablero2 jugador2 = new Tablero2(personaje, personaje1, arreglo1);
				Intermediario intermedio = new Intermediario(jugador1, jugador2);
				jugador1.setintermedio(intermedio);
				jugador2.setintermedio(intermedio);
				jugador2.setVisible(true);

			}
			
			if (contador == 3) {

				int personaje = (int) Leyendo.readObject();
				int personaje1 = (int) Leyendo.readObject();
				arreglo1 = (boolean[]) Leyendo.readObject();
				int personaje2 = (int) Leyendo.readObject();
				int personaje3 = (int) Leyendo.readObject();
				arreglo2 = (boolean[]) Leyendo.readObject();
				int turno = (int) Leyendo.readObject();
				Tablero1 jugador1 = new Tablero1(personaje, personaje1, arreglo1);
				Tablero2 jugador2 = new Tablero2(personaje2, personaje3, arreglo2);
				Intermediario intermedio = new Intermediario(jugador1, jugador2);
				jugador1.setintermedio(intermedio);
				jugador2.setintermedio(intermedio);
				intermedio.setturno(turno);
				intermedio.setVisible(true);

			}

			if (contador == 4) {

				int modo = (int) Leyendo.readObject();
				int jugador = (int) Leyendo.readObject();
				int jugador1 = (int) Leyendo.readObject();
				int jugador2 = (int) Leyendo.readObject();
				Resultados resultados = new Resultados(modo, jugador, jugador1, jugador2);
				resultados.setVisible(true);

			}

			if (contador == 5 || contador == 0) {

				Menu frame = new Menu();
				frame.setVisible(true);

			}

			if (contador == 6) {

				Puntajes frame = new Puntajes();
				frame.setVisible(true);

			}
			if (contador == 7) {

				int contador1 = (int) Leyendo.readObject();
				int personaje1 = (int) Leyendo.readObject();
				int personaje2 = (int) Leyendo.readObject();
				Asignador regulador = new Asignador(personaje1,personaje2,contador1);
				regulador.setVisible(true);

			}
		} catch (ClassNotFoundException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		} catch (IOException e111) {
			// TODO Auto-generated catch block
			e111.printStackTrace();

		} catch (NullPointerException e1111) {

		}
	}
}
