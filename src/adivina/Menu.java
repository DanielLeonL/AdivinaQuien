package adivina;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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
import javax.swing.SwingConstants;

public class Menu extends JFrame implements Serializable {

	private JPanel contentPane;
	File Archivo = new File("Puntuacion");
	ObjectOutputStream escribiendo;
	ObjectInputStream Leyendo;
	File Archivo1 = new File("datos");

	Asignador selector = new Asignador();

	public Menu() {

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

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				selector.setVisible(true);
				dispose();
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Puntajes tablero = new Puntajes();
				tablero.setVisible(true);
				dispose();
			}
		});

	}
}
