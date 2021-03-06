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
import java.awt.event.ActionEvent;

public class Resultados extends JFrame {

	private JPanel contentPane;
	private int modo, puntaje1, puntaje2;
	private int jugador;
	private int personaje1;
	private int personaje2;
	private String ruta;
	Puntajes tablero;
	Menu principal = new Menu();

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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 20, 60));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 27));
		lblNewLabel.setBounds(63, 11, 316, 49);
		if (modo == 0) {

			if (jugador == 1) {

				lblNewLabel.setText("Ganaste jugador# 1");
				puntaje1 = puntaje1 + 1;

			}

			if (jugador == 2) {

				lblNewLabel.setText("Ganaste jugador# 2");
				puntaje2 = puntaje2 + 1;

			}

		}
		if (modo == 1) {

			if (jugador == 1) {

				lblNewLabel.setText("Perdiste jugador# 1");
			}

			if (jugador == 2) {

				lblNewLabel.setText("Perdiste jugador# 2");
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

				principal.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		btnNewButton.setBounds(176, 167, 90, 23);
		contentPane.add(btnNewButton);

	}
}
