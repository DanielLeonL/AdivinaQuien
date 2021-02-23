package adivina;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intermediario extends JFrame {

	private JPanel contentPane;
	private int turno;
	Tablero1 jugador1;
	Tablero2 jugador2;

	public void setturno(int siguente) {

		this.turno = siguente;
	}

	public Intermediario(Tablero1 jugador1, Tablero2 jugador2) {

		this.jugador1 = jugador1;
		this.jugador2 = jugador2;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 69, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Empezar turno");
		btnNewButton.setFont(new Font("AR CHRISTY", Font.PLAIN, 18));
		btnNewButton.setBounds(137, 158, 160, 58);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Turno finalizado, siguente jugador");
		if (turno == 1) {

			lblNewLabel.setText("Siguente turno, Jugador#1");

		}
		if (turno == 2) {

			lblNewLabel.setText("Siguente turno, Jugador#2");

		}
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 20));
		lblNewLabel.setBounds(48, 45, 346, 43);
		contentPane.add(lblNewLabel);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (turno == 1) {

					jugador1.setVisible(true);
					dispose();

				}
				if (turno == 2) {

					jugador2.setVisible(true);
					dispose();

				}
			}
		});

	}

}
