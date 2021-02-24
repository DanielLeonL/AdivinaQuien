package adivina;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
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

public class Resultados extends JFrame implements Serializable{

	private JPanel contentPane;
	private int modo, puntaje1, puntaje2;
	private int jugador;
	private int personaje1;
	private int personaje2;
	private String ruta;
	Puntajes tablero;
	Menu principal = new Menu();
	File Archivo = new File("Puntuacion");
	ObjectOutputStream escribiendo;
	ObjectInputStream Leyendo;
	File Archivo1 = new File("datos");
	ObjectOutputStream escribiendo1;

	public int personaje1() {

		return personaje1;
	}

	public int personaje2() {

		return personaje2;
	}

	public Resultados(int modo, int jugador, int personaje1, int personaje2) {

		this.modo = modo;
		this.jugador = jugador;
		this.personaje1 = personaje1;
		this.personaje2 = personaje2;

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

				try {
					escribiendo1 = new ObjectOutputStream(new FileOutputStream(Archivo1));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					
					int contador = 4;
					escribiendo1.writeObject(contador);
					escribiendo1.writeObject(modo);
					escribiendo1.writeObject(jugador);
					escribiendo1.writeObject(personaje1);
					escribiendo1.writeObject(personaje2);

				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				dispose();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 20, 60));
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

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 27));
		lblNewLabel.setBounds(63, 11, 316, 49);
		if (modo == 0) {
			if (jugador == 1) {

				lblNewLabel.setText("Ganaste jugador# 1");
				puntaje1++;

			}

			if (jugador == 2) {

				lblNewLabel.setText("Ganaste jugador# 2");
				puntaje2++;

			}

		}
		if (modo == 1) {

			if (jugador == 1) {

				lblNewLabel.setText("Perdiste jugador# 1");
				puntaje2++;
			}

			if (jugador == 2) {

				lblNewLabel.setText("Perdiste jugador# 2");
				puntaje1++;
			}
		}

		contentPane.add(lblNewLabel);

		JLabel cuadro1 = new JLabel("");
		cuadro1.setBounds(63, 71, 103, 132);
		cuadro1.setBorder(new LineBorder(new Color(0, 0, 0)));
		ruta = "src/imagenes/cara" + personaje1 + ".jpg";
		ImageIcon imagen = new ImageIcon(ruta);
		ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(103, 132, Image.SCALE_AREA_AVERAGING));
		cuadro1.setIcon(aux);
		contentPane.add(cuadro1);

		JLabel cuadro2 = new JLabel("");
		cuadro2.setBorder(new LineBorder(new Color(0, 0, 0)));
		cuadro2.setBounds(276, 71, 103, 132);
		ruta = "src/imagenes/cara" + personaje2 + ".jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(103, 132, Image.SCALE_AREA_AVERAGING));
		cuadro2.setIcon(aux);
		contentPane.add(cuadro2);

		JLabel lblNewLabel_2 = new JLabel("Personaje del ");
		lblNewLabel_2.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(73, 214, 93, 20);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("jugador #1");
		lblNewLabel_2_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(83, 230, 93, 20);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Personaje del ");
		lblNewLabel_2_2.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(286, 214, 93, 20);
		contentPane.add(lblNewLabel_2_2);

		JLabel lblNewLabel_3 = new JLabel("jugador #2");
		lblNewLabel_3.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(296, 233, 98, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Men\u00FA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					escribiendo = new ObjectOutputStream(new FileOutputStream(Archivo));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					escribiendo.writeObject(puntaje1);
					escribiendo.writeObject(puntaje2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				principal.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		btnNewButton.setBounds(176, 167, 90, 23);
		contentPane.add(btnNewButton);

	}

}
