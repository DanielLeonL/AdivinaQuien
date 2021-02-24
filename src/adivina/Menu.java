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
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Menu extends JFrame implements Serializable {
	// Declaro las variables
	private JPanel contentPane;
	ObjectOutputStream escribiendo;
	ObjectInputStream Leyendo;
	//Se crean los archivos que contendran la información
	File Archivo1 = new File("datos");
	File Archivo = new File("Puntuacion");

	//Se crean el objeto que iniciara el juego
	Asignador selector = new Asignador();

	public Menu() {

		//Se verifica que el archivo exista para no volver a crearlo
		  if (Archivo.exists()) {
			  
		  }else {
			  //Crea el archivo en caso de no existir

		try {
			escribiendo = new ObjectOutputStream(new FileOutputStream(Archivo));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  }
		  
		  //Se crea el método que guardara la partida cuando se cierre el juego
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {	
				try {
					escribiendo = new ObjectOutputStream(new FileOutputStream(Archivo1));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					int contador = 5;
					escribiendo.writeObject(contador);

				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				dispose();
			}
		});

		//Se genera los objetos que se encontraran dentro del jframe
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 232);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setForeground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Adivina Qui\u00E9n?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 35));
		lblNewLabel.setBounds(110, 11, 281, 83);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnNewButton.setBounds(201, 105, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Puntuaci\u00F3n");
		btnNewButton_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnNewButton_1.setBounds(190, 139, 110, 23);
		contentPane.add(btnNewButton_1);

		
		//Se crean las acciones que se ejecutarán al accionar los botones
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Inicia el juego
				selector.setVisible(true);
				dispose();
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Genera el tablero donde se verán los puntajes
				Puntajes tablero = new Puntajes();
				tablero.setVisible(true);
				dispose();
			}
		});

	}
}
