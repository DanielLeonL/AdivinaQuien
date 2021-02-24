/*
 * NOMBRE PROGRAMA: ADIVINA_QUIEN
 * AUTORES:JUAN DAVID MARTINEZ MONROY
 *		   DANIEL ESTEBAN LEON LEON
 * FECHA: FEBRERO 24-2021
 */
package adivina;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class Puntajes extends JFrame implements Serializable {
	// Declaro las variables
	private JPanel contentPane;
	private int puntaje1;
	private int puntaje2;
	ObjectInputStream Leyendo;
	ObjectOutputStream escribiendo;
	//Se crean los archivos que contendran la información	
	File Archivo1 = new File("datos");
	File Archivo = new File("Puntuacion");

	public Puntajes() {
		 //Se crea el método que guardara la partida cuando se cierre el juego

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//Crea el archivo
				try {
					escribiendo = new ObjectOutputStream(new FileOutputStream(Archivo1));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					//Escribe en el archivo las variables que se deseen guardar				

					int contador = 6;
					escribiendo.writeObject(contador);

				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				dispose();
			}
		});
		//Se genera el jframe
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 277);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 69, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		try {
			Leyendo = new ObjectInputStream(new FileInputStream(Archivo));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			puntaje1 = (int) Leyendo.readObject();
			puntaje2 = (int) Leyendo.readObject();
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Se genera los objetos que se encontraran dentro del jframe
		JLabel lblNewLabel = new JLabel("Jugador#1");
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 78, 183, 53);
		contentPane.add(lblNewLabel);

		JLabel lblJugador = new JLabel("Jugador#2");
		lblJugador.setFont(new Font("AR CHRISTY", Font.PLAIN, 24));
		lblJugador.setBounds(10, 142, 183, 53);
		contentPane.add(lblJugador);

		JLabel lblPuntajes = new JLabel("puntajes");
		lblPuntajes.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntajes.setFont(new Font("AR CHRISTY", Font.PLAIN, 24));
		lblPuntajes.setBounds(10, 14, 145, 53);
		contentPane.add(lblPuntajes);

		JLabel lblPartidasGanadas = new JLabel("partidas ganadas");
		lblPartidasGanadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPartidasGanadas.setFont(new Font("AR CHRISTY", Font.PLAIN, 24));
		lblPartidasGanadas.setBounds(202, 14, 210, 53);
		contentPane.add(lblPartidasGanadas);

		//Muestra ambos puntajes
		JLabel puntos1 = new JLabel("" + this.puntaje1);
		puntos1.setFont(new Font("AR CHRISTY", Font.PLAIN, 24));
		puntos1.setBounds(224, 78, 183, 53);
		contentPane.add(puntos1);

		JLabel puntos2 = new JLabel("" + this.puntaje2);
		puntos2.setFont(new Font("AR CHRISTY", Font.PLAIN, 24));
		puntos2.setBounds(224, 142, 183, 53);
		contentPane.add(puntos2);

		JButton btnNewButton = new JButton("Men\u00FA");
		btnNewButton.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnNewButton.setBounds(127, 204, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnActualizar = new JButton("Borrar Puntajes");
		btnActualizar.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnActualizar.setBounds(234, 204, 158, 23);
		contentPane.add(btnActualizar);

		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Reinicia los puntajes
				puntaje1 = 0;
				puntaje2 = 0;
				
				puntos1.setText("" + puntaje1);
				puntos2.setText("" + puntaje2);
				
				try {
					//Crea el archivo
					escribiendo=new ObjectOutputStream(new FileOutputStream(Archivo));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					//Escribe en el archivo las puntuaciones reiniciadas
					escribiendo.writeObject(puntaje1);
					escribiendo.writeObject(puntaje2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		//Devuelve a la pantalla principal

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Menu principal = new Menu();
				principal.setVisible(true);
				dispose();
			}
		});
	}

}
