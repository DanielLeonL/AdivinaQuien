package adivina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	Puntajes tablero = new Puntajes(0, 0);

	Asignador selector = new Asignador();

	public static void main(String[] args) {
		int puntaje1;
		int puntaje2;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 232);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setForeground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Adivina Qui\u00E9n?");
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 35));
		lblNewLabel.setBounds(137, 11, 221, 83);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnNewButton.setBounds(201, 105, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Puntuaci\u00F3n");
		btnNewButton_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		btnNewButton_1.setBounds(190, 139, 110, 23);
		contentPane.add(btnNewButton_1);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				selector.setVisible(true);
				dispose();
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				tablero.setVisible(true);
				dispose();
			}
		});

	}
}
