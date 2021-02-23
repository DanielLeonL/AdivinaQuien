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
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	private int puntaje1=0, puntaje2=0;
	File Archivo= new File("Puntuacion");
	ObjectOutputStream escribiendo;
	ObjectInputStream Leyendo;
	
	Asignador selector = new Asignador();

	public static void main(String[] args) {
		
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
		
		try {
			escribiendo=new ObjectOutputStream(new FileOutputStream(Archivo));
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

		JLabel lblNewLabel = new JLabel("Adivina Qui\u00E9n?");
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 35));
		lblNewLabel.setBounds(98, 10, 281, 83);
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
