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
import java.awt.event.ActionEvent;

public class Puntajes extends JFrame {

	private JPanel contentPane;
	private int puntaje1;
	private int puntaje2;

	public Puntajes(int puntaje1, int puntaje2) {

		this.puntaje1 = puntaje1;
		this.puntaje2 = puntaje2;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 277);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 69, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnActualizar.setBounds(234, 204, 117, 23);
		contentPane.add(btnActualizar);
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				puntos1.setText("" + puntaje1);
				puntos2.setText("" + puntaje2);
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Menu principal = new Menu();
				principal.setVisible(true);
				dispose();
			}
		});
	}

}
