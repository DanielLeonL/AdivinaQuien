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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.awt.event.ActionEvent;

public class Intermediario extends JFrame implements Serializable {

	private JPanel contentPane;
	private int turno;
	private Tablero1 jugador1;
	private Tablero2 jugador2;
	File Archivo1 = new File("datos");
	ObjectOutputStream escribiendo;

	public Tablero1 gettablero1() {

		return jugador1;
	}

	public Tablero2 gettablero2() {

		return jugador2;
	}

	public void setturno(int siguente) {

		this.turno = siguente;
	}

	public Intermediario(Tablero1 jugador11, Tablero2 jugador22) {

		this.jugador1 = jugador11;
		this.jugador2 = jugador22;

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

				try {
					escribiendo = new ObjectOutputStream(new FileOutputStream(Archivo1));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {

					int contador = 3;
					escribiendo.writeObject(contador);
					escribiendo.writeObject(jugador1.getPersonaje());
					escribiendo.writeObject(jugador1.getPersonaje1());
					escribiendo.writeObject(jugador1.getarreglo());
					escribiendo.writeObject(jugador2.getPersonaje());
					escribiendo.writeObject(jugador2.getPersonaje1());
					escribiendo.writeObject(jugador2.getarreglo());
					escribiendo.writeObject(turno);

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
