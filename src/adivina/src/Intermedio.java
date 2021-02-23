
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Intermedio extends JFrame {

	private JPanel contentPane;
	public Intermedio() {
		super("Tablero de practica");
		setBounds(400, 50, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tablero de prueba");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(234, 10, 184, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_8_1 = new JButton("SIGUIENTE");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tablero1 j=new Tablero1();
				j.setVisible(true);
			}
		});
		btnNewButton_8_1.setBounds(66, 97, 115, 50);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_1_1 = new JButton("SIGUIENTE");
		btnNewButton_8_1_1.setBounds(415, 97, 115, 50);
		btnNewButton_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tablero2 j=new Tablero2();
				j.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_8_1_1);
		
		
	}
}
