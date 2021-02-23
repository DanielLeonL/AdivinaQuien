package adivina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class Asignador extends JFrame {

	private JPanel contentPane;
	private double valor;
	private int valorf;
	private int contador = 1;
	private int personaje1, personaje2;
	private String ruta, texto;
	Intermediario intermedio;

	public Asignador() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 276);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(524, 11, 46, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Personaje");
		btnNewButton.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnNewButton.setBounds(183, 165, 115, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Finalizar");
		btnNewButton_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnNewButton_1.setBounds(183, 203, 115, 23);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("Turno del jugador # 1");
		lblNewLabel_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 11, 183, 23);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");

		lblNewLabel_2.setBounds(183, 11, 115, 143);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblNewLabel_2);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		textPane.setBackground(new Color(255, 140, 0));
		textPane.setBounds(10, 45, 163, 181);
		contentPane.add(textPane);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textPane.setText("");

				lblNewLabel_2.setIcon(null);

				if (contador == 1) {

					if (personaje1 != 0) {

						lblNewLabel_1.setText("Turno del jugador # 2");
					} else {

						JOptionPane.showMessageDialog(null, "Primero obtén un personaje", "Información",
								JOptionPane.INFORMATION_MESSAGE);
					}

				}

				if (contador == 2) {

					if (personaje2 != 0) {

						Tablero1 jugador1 = new Tablero1(personaje1, personaje2);
						Tablero2 jugador2 = new Tablero2(personaje1, personaje2);
						Intermediario intermedio = new Intermediario(jugador1, jugador2);
						jugador1.setintermedio(intermedio);
						jugador2.setintermedio(intermedio);
						jugador1.setVisible(true);
						dispose();

					} else {

						JOptionPane.showMessageDialog(null, "Primero obtén un personaje", "Información",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}

				if (personaje1 != 0) {
					contador = contador + 1;
				}

			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				valor = Math.floor(Math.random() * 24 + 1);

				valorf = (int) valor;

				ruta = "src/imagenes/cara" + valorf + ".jpg";

				ImageIcon imagen = new ImageIcon(ruta);

				ImageIcon aux = new ImageIcon(
						imagen.getImage().getScaledInstance(115, 143, Image.SCALE_AREA_AVERAGING));

				lblNewLabel_2.setIcon(aux);

				texto = "Memoriza bien tu personaje, recuerda solo realizar preguntas cerradas, y una sola por turno, si decides intentar adivinar solo tienes una oportunidad";

				textPane.setText(texto);

				if (contador == 1) {

					personaje1 = valorf;

				}

				if (contador == 2) {

					personaje2 = valorf;

				}

			}
		});
	}
}
