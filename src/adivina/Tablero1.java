/*
 * NOMBRE PROGRAMA: ADIVINA_QUIEN
 * AUTORES:JUAN DAVID MARTINEZ MONROY
 *		   DANIEL ESTEBAN LEON LEON
 * FECHA: FEBRERO 24-2021
 */
package adivina;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Tablero1 extends JFrame implements Serializable {
	// Declaro las variables
	private JPanel contentPane;
	private String ruta;
	private int personaje;
	private int personaje1;
	private Intermediario intermedio;
	private boolean[] arreglo = new boolean[24];
	ImageIcon imagen;
	ImageIcon aux;
	ObjectOutputStream escribiendo;
	
	//Se crean los archivos que contendran la información
	File Archivo1 = new File("datos");
	//Se crean los getters
	public boolean[] getarreglo() {
		return arreglo;
	}

	public int getPersonaje() {
		return personaje;
	}

	public int getPersonaje1() {
		return personaje1;
	}
	//Crea el objeto Intermediario
	public void setintermedio(Intermediario intermedio) {

		this.intermedio = intermedio;
	}
	//Crea el constructor que construye el tablero en caso de cerrar
	public Tablero1(int personaje, int personaje1, boolean[] arreglo1) {

		this.personaje = personaje;
		this.personaje1 = personaje1;
		this.arreglo = arreglo1;
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

					int contador = 1;
					escribiendo.writeObject(contador);
					escribiendo.writeObject(personaje);
					escribiendo.writeObject(personaje1);
					escribiendo.writeObject(arreglo);
					escribiendo.writeObject(intermedio.gettablero2().getPersonaje());
					escribiendo.writeObject(intermedio.gettablero2().getPersonaje1());
					escribiendo.writeObject(intermedio.gettablero2().getarreglo());

				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				dispose();
			}
		});
		//Se genera los objetos que se encontraran dentro del jframe
		setBounds(50, 50, 600, 725);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Tablero #1");
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 20));
		lblNewLabel.setBounds(231, 10, 151, 44);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_8_1 = new JButton("Finalizar turno");
		btnNewButton_8_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 18));
		btnNewButton_8_1.setBounds(218, 582, 164, 50);
		contentPane.add(btnNewButton_8_1);
		//Se genera el grupo de 24 botones que representan los 24 personajes
		JButton boton1 = new JButton();
		boton1.setBounds(44, 64, 77, 109);
		//En caso de cargar desde el tablero, entonces se determina si ya han sido seleccionadas las tarjetas o no
		if (arreglo[0] == true) {
			ruta = "src/imagenes/cara1.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton1.setIcon(aux);
			boton1.setEnabled(true);
		}
		if (arreglo[0] == false) {
			ruta = "src/imagenes/page_1.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton1.setDisabledIcon(aux);
			boton1.setEnabled(false);
			boton1.setIcon(aux);
		}
		contentPane.add(boton1);

		JButton boton2 = new JButton();
		boton2.setBounds(131, 64, 77, 109);
		if (arreglo[1] == true) {
			ruta = "src/imagenes/cara2.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton2.setIcon(aux);
			boton2.setEnabled(true);
		}
		if (arreglo[1] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton2.setDisabledIcon(aux);
			boton2.setEnabled(false);
			boton2.setIcon(aux);
		}
		contentPane.add(boton2);

		JButton boton3 = new JButton();
		boton3.setBounds(218, 64, 77, 109);
		if (arreglo[2] == true) {
			ruta = "src/imagenes/cara3.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton3.setIcon(aux);
			boton3.setEnabled(true);
		}
		if (arreglo[2] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton3.setDisabledIcon(aux);
			boton3.setEnabled(false);
			boton3.setIcon(aux);
		}
		contentPane.add(boton3);

		JButton boton4 = new JButton();
		boton4.setBounds(305, 64, 77, 109);
		if (arreglo[3] == true) {
			ruta = "src/imagenes/cara4.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton4.setIcon(aux);
			boton4.setEnabled(true);
		}
		if (arreglo[3] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton4.setDisabledIcon(aux);
			boton4.setEnabled(false);
			boton4.setIcon(aux);
		}
		contentPane.add(boton4);

		JButton boton5 = new JButton();
		boton5.setBounds(392, 64, 77, 109);
		if (arreglo[4] == true) {
			ruta = "src/imagenes/cara5.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton5.setIcon(aux);
			boton5.setEnabled(true);
		}
		if (arreglo[4] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton5.setDisabledIcon(aux);
			boton5.setEnabled(false);
			boton5.setIcon(aux);
		}
		contentPane.add(boton5);

		JButton boton6 = new JButton();
		boton6.setBounds(479, 64, 77, 109);
		if (arreglo[5] == true) {
			ruta = "src/imagenes/cara6.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton6.setIcon(aux);
			boton6.setEnabled(true);
		}
		if (arreglo[5] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton6.setDisabledIcon(aux);
			boton6.setEnabled(false);
			boton6.setIcon(aux);
		}
		contentPane.add(boton6);

		JButton boton7 = new JButton();
		boton7.setBounds(44, 183, 77, 109);
		if (arreglo[6] == true) {
			ruta = "src/imagenes/cara7.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton7.setIcon(aux);
			boton7.setEnabled(true);
		}
		if (arreglo[6] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton7.setDisabledIcon(aux);
			boton7.setEnabled(false);
			boton7.setIcon(aux);
		}
		contentPane.add(boton7);

		JButton boton8 = new JButton();
		boton8.setBounds(131, 183, 77, 109);
		if (arreglo[7] == true) {
			ruta = "src/imagenes/cara8.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton8.setIcon(aux);
			boton8.setEnabled(true);
		}
		if (arreglo[7] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton8.setDisabledIcon(aux);
			boton8.setEnabled(false);
			boton8.setIcon(aux);
		}
		contentPane.add(boton8);

		JButton boton9 = new JButton();
		boton9.setBounds(218, 183, 77, 109);
		if (arreglo[8] == true) {
			ruta = "src/imagenes/cara9.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton9.setIcon(aux);
			boton9.setEnabled(true);
		}
		if (arreglo[8] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton9.setDisabledIcon(aux);
			boton9.setEnabled(false);
			boton9.setIcon(aux);
		}
		contentPane.add(boton9);

		JButton boton10 = new JButton();
		boton10.setBounds(305, 183, 77, 109);
		if (arreglo[9] == true) {
			ruta = "src/imagenes/cara10.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton10.setIcon(aux);
			boton10.setEnabled(true);
		}
		if (arreglo[9] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton10.setDisabledIcon(aux);
			boton10.setEnabled(false);
			boton10.setIcon(aux);
		}
		contentPane.add(boton10);

		JButton boton11 = new JButton();
		boton11.setBounds(392, 183, 77, 109);
		if (arreglo[10] == true) {
			ruta = "src/imagenes/cara11.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton11.setIcon(aux);
			boton11.setEnabled(true);
		}
		if (arreglo[10] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton11.setDisabledIcon(aux);
			boton11.setEnabled(false);
			boton11.setIcon(aux);
		}
		contentPane.add(boton11);

		JButton boton12 = new JButton();
		boton12.setBounds(479, 183, 77, 109);
		if (arreglo[11] == true) {
			ruta = "src/imagenes/cara12.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton12.setIcon(aux);
			boton12.setEnabled(true);
		}
		if (arreglo[11] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton12.setDisabledIcon(aux);
			boton12.setEnabled(false);
			boton12.setIcon(aux);
		}
		contentPane.add(boton12);

		JButton boton13 = new JButton();
		boton13.setBounds(44, 302, 77, 109);
		if (arreglo[12] == true) {
			ruta = "src/imagenes/cara13.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton13.setIcon(aux);
			boton13.setEnabled(true);
		}
		if (arreglo[12] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton13.setDisabledIcon(aux);
			boton13.setEnabled(false);
			boton13.setIcon(aux);
		}
		contentPane.add(boton13);

		JButton boton14 = new JButton();
		boton14.setBounds(131, 302, 77, 109);
		if (arreglo[13] == true) {
			ruta = "src/imagenes/cara14.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton14.setIcon(aux);
			boton14.setEnabled(true);
		}
		if (arreglo[13] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton14.setDisabledIcon(aux);
			boton14.setEnabled(false);
			boton14.setIcon(aux);
		}
		contentPane.add(boton14);

		JButton boton15 = new JButton();
		boton15.setBounds(218, 302, 77, 109);
		if (arreglo[14] == true) {
			ruta = "src/imagenes/cara15.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton15.setIcon(aux);
			boton15.setEnabled(true);
		}
		if (arreglo[14] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton15.setDisabledIcon(aux);
			boton15.setEnabled(false);
			boton15.setIcon(aux);
		}
		contentPane.add(boton15);

		JButton boton16 = new JButton();
		boton16.setBounds(305, 302, 77, 109);
		if (arreglo[15] == true) {
			ruta = "src/imagenes/cara16.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton16.setIcon(aux);
			boton16.setEnabled(true);
		}
		if (arreglo[15] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton16.setDisabledIcon(aux);
			boton16.setEnabled(false);
			boton16.setIcon(aux);
		}
		contentPane.add(boton16);

		JButton boton17 = new JButton();
		boton17.setBounds(392, 302, 77, 109);
		if (arreglo[16] == true) {
			ruta = "src/imagenes/cara17.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton17.setIcon(aux);
			boton17.setEnabled(true);
		}
		if (arreglo[16] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton17.setDisabledIcon(aux);
			boton17.setEnabled(false);
			boton17.setIcon(aux);
		}
		contentPane.add(boton17);

		JButton boton18 = new JButton();
		boton18.setBounds(479, 302, 77, 109);
		if (arreglo[17] == true) {
			ruta = "src/imagenes/cara18.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton18.setIcon(aux);
			boton18.setEnabled(true);
		}
		if (arreglo[17] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton18.setDisabledIcon(aux);
			boton18.setEnabled(false);
			boton18.setIcon(aux);
		}
		contentPane.add(boton18);

		JButton boton19 = new JButton();
		boton19.setBounds(44, 421, 77, 109);
		if (arreglo[18] == true) {
			ruta = "src/imagenes/cara19.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton19.setIcon(aux);
			boton19.setEnabled(true);
		}
		if (arreglo[18] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton19.setDisabledIcon(aux);
			boton19.setEnabled(false);
			boton19.setIcon(aux);
		}
		contentPane.add(boton19);

		JButton boton20 = new JButton();
		boton20.setBounds(131, 421, 77, 109);
		if (arreglo[19] == true) {
			ruta = "src/imagenes/cara20.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton20.setIcon(aux);
			boton20.setEnabled(true);
		}
		if (arreglo[19] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton20.setDisabledIcon(aux);
			boton20.setEnabled(false);
			boton20.setIcon(aux);
		}
		contentPane.add(boton20);

		JButton boton21 = new JButton();
		boton21.setBounds(218, 421, 77, 109);
		if (arreglo[20] == true) {
			ruta = "src/imagenes/cara21.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton21.setIcon(aux);
			boton21.setEnabled(true);
		}
		if (arreglo[20] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton21.setDisabledIcon(aux);
			boton21.setEnabled(false);
			boton21.setIcon(aux);
		}
		contentPane.add(boton21);

		JButton boton22 = new JButton();
		boton22.setBounds(305, 421, 77, 109);
		if (arreglo[21] == true) {
			ruta = "src/imagenes/cara22.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton22.setIcon(aux);
			boton22.setEnabled(true);
		}
		if (arreglo[21] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton22.setDisabledIcon(aux);
			boton22.setEnabled(false);
			boton22.setIcon(aux);
		}
		contentPane.add(boton22);

		JButton boton23 = new JButton();
		boton23.setBounds(392, 421, 77, 109);
		if (arreglo[22] == true) {
			ruta = "src/imagenes/cara23.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton23.setIcon(aux);
			boton23.setEnabled(true);
		}
		if (arreglo[22] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton23.setDisabledIcon(aux);
			boton23.setEnabled(false);
			boton23.setIcon(aux);
		}
		contentPane.add(boton23);

		JButton boton24 = new JButton();
		boton24.setBounds(479, 421, 77, 109);
		if (arreglo[23] == true) {
			ruta = "src/imagenes/cara24.jpg";
			imagen = new ImageIcon(ruta);
			aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton24.setIcon(aux);
			boton24.setEnabled(true);
		}
		if (arreglo[23] == false) {
			ruta = "src/imagenes/page_1.jpg";
			ImageIcon imagen = new ImageIcon(ruta);
			ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
			boton24.setDisabledIcon(aux);
			boton24.setEnabled(false);
			boton24.setIcon(aux);
		}
		contentPane.add(boton24);

		JButton boton25 = new JButton();
		boton25.setBounds(44, 566, 77, 109);
		ruta = "src/imagenes/cara" + personaje + ".jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton25.setIcon(aux);
		contentPane.add(boton25);

		JLabel lblNewLabel_1 = new JLabel("Personaje");
		lblNewLabel_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 541, 77, 14);
		contentPane.add(lblNewLabel_1);

		JRadioButton modoadivinar = new JRadioButton("Modo adivinar");
		modoadivinar.setBackground(new Color(0, 206, 209));
		modoadivinar.setFont(new Font("AR CHRISTY", Font.PLAIN, 14));
		modoadivinar.setBounds(447, 599, 109, 23);
		contentPane.add(modoadivinar);

		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		reiniciar.setBounds(245, 652, 115, 23);
		contentPane.add(reiniciar);

		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for (int i = 0; i < 24; i++) {

					arreglo[i] = true;

				}

				ruta = "src/imagenes/cara1.jpg";
				ImageIcon imagen = new ImageIcon(ruta);
				ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton1.setIcon(aux);
				boton1.setEnabled(true);
				boton1.setVisible(true);

				ruta = "src/imagenes/cara2.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton2.setIcon(aux);
				boton2.setEnabled(true);

				ruta = "src/imagenes/cara3.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton3.setIcon(aux);
				boton3.setEnabled(true);

				ruta = "src/imagenes/cara4.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton4.setIcon(aux);
				boton4.setEnabled(true);

				ruta = "src/imagenes/cara5.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton5.setIcon(aux);
				boton5.setEnabled(true);

				ruta = "src/imagenes/cara6.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton6.setIcon(aux);
				boton6.setEnabled(true);

				ruta = "src/imagenes/cara7.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton7.setIcon(aux);
				boton7.setEnabled(true);

				ruta = "src/imagenes/cara8.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton8.setIcon(aux);
				boton8.setEnabled(true);

				ruta = "src/imagenes/cara9.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton9.setIcon(aux);
				boton9.setEnabled(true);

				ruta = "src/imagenes/cara10.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton10.setIcon(aux);
				boton10.setEnabled(true);

				ruta = "src/imagenes/cara11.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton11.setIcon(aux);
				boton11.setEnabled(true);

				ruta = "src/imagenes/cara12.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton12.setIcon(aux);
				boton12.setEnabled(true);

				ruta = "src/imagenes/cara13.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton13.setIcon(aux);
				boton13.setEnabled(true);

				ruta = "src/imagenes/cara14.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton14.setIcon(aux);
				boton14.setEnabled(true);

				ruta = "src/imagenes/cara15.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton15.setIcon(aux);
				boton15.setEnabled(true);

				ruta = "src/imagenes/cara16.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton16.setIcon(aux);
				boton16.setEnabled(true);

				ruta = "src/imagenes/cara17.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton17.setIcon(aux);
				boton17.setEnabled(true);

				ruta = "src/imagenes/cara18.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton18.setIcon(aux);
				boton18.setEnabled(true);

				ruta = "src/imagenes/cara19.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton19.setIcon(aux);
				boton19.setEnabled(true);

				ruta = "src/imagenes/cara20.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton20.setIcon(aux);
				boton20.setEnabled(true);

				ruta = "src/imagenes/cara21.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton21.setIcon(aux);
				boton21.setEnabled(true);

				ruta = "src/imagenes/cara22.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton22.setIcon(aux);
				boton22.setEnabled(true);

				ruta = "src/imagenes/cara23.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton23.setIcon(aux);
				boton23.setEnabled(true);

				ruta = "src/imagenes/cara24.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton24.setIcon(aux);
				boton24.setEnabled(true);
			}
		});

		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {

					intermedio.setturno(2);
					intermedio.setVisible(true);
					dispose();
				}

				if (modoadivinar.isSelected() == true) {

					JOptionPane.showMessageDialog(null,
							"No has intentado adivinar, seguro que quieres seguir, si es así deshabilita el modo adivinar",
							"Información", JOptionPane.INFORMATION_MESSAGE);

				}

			}
		});

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {

					arreglo[0]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton1.setDisabledIcon(aux);
					boton1.setEnabled(false);
					boton1.setIcon(aux);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 1;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[1]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton2.setDisabledIcon(aux);
					boton2.setEnabled(false);
					boton2.setIcon(aux);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 2;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[2]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton3.setDisabledIcon(aux);
					boton3.setEnabled(false);
					boton3.setIcon(aux);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 3;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[3]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton4.setDisabledIcon(aux);
					boton4.setIcon(aux);
					boton4.setEnabled(false);

				}
				if (modoadivinar.isSelected() == true) {

					int valor = 4;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[4]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton5.setDisabledIcon(aux);
					boton5.setIcon(aux);
					boton5.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 5;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[5]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton6.setDisabledIcon(aux);
					boton6.setIcon(aux);
					boton6.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 6;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[6]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton7.setDisabledIcon(aux);
					boton7.setIcon(aux);
					boton7.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 7;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[7]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton8.setDisabledIcon(aux);
					boton8.setIcon(aux);
					boton8.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 8;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[8]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton9.setDisabledIcon(aux);
					boton9.setIcon(aux);
					boton9.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 9;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[9]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton10.setDisabledIcon(aux);
					boton10.setIcon(aux);
					boton10.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 10;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[10]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton11.setDisabledIcon(aux);
					boton11.setIcon(aux);
					boton11.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 11;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[11]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton12.setDisabledIcon(aux);
					boton12.setIcon(aux);
					boton12.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 12;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[12]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton13.setDisabledIcon(aux);
					boton13.setIcon(aux);
					boton13.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 13;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[13]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton14.setDisabledIcon(aux);
					boton14.setIcon(aux);
					boton14.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 14;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[14]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton15.setDisabledIcon(aux);
					boton15.setIcon(aux);
					boton15.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 15;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[15]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton16.setDisabledIcon(aux);
					boton16.setIcon(aux);
					boton16.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 16;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[16]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton17.setDisabledIcon(aux);
					boton17.setIcon(aux);
					boton17.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 17;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[17]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton18.setDisabledIcon(aux);
					boton18.setIcon(aux);
					boton18.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 18;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[18]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton19.setDisabledIcon(aux);
					boton19.setIcon(aux);
					boton19.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 19;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[19]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton20.setDisabledIcon(aux);
					boton20.setIcon(aux);
					boton20.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 20;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[20]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton21.setDisabledIcon(aux);
					boton21.setIcon(aux);
					boton21.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 21;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[21]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton22.setDisabledIcon(aux);
					boton22.setIcon(aux);
					boton22.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 22;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[22]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton23.setDisabledIcon(aux);
					boton23.setIcon(aux);
					boton23.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 23;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					arreglo[23]= false;
					ruta = "src/imagenes/page_1.jpg";
					ImageIcon imagen = new ImageIcon(ruta);
					ImageIcon aux = new ImageIcon(
							imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
					boton24.setDisabledIcon(aux);
					boton24.setIcon(aux);
					boton24.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 24;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

	}

}
