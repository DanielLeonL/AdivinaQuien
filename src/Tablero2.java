
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

public class Tablero2 extends JFrame {

	private JPanel contentPane;
	public Tablero2() {
		super("Tablero de practica");
		setBounds(700, 50, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tablero de prueba");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(234, 10, 184, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(47, 88, 115, 79);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(211, 88, 115, 79);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(47, 177, 115, 79);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(47, 266, 115, 79);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(47, 355, 115, 79);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(371, 88, 115, 79);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(211, 177, 115, 79);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(211, 266, 115, 79);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(211, 355, 115, 79);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(371, 177, 115, 79);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(371, 266, 115, 79);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(371, 355, 115, 79);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(524, 355, 115, 79);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(524, 266, 115, 79);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(524, 177, 115, 79);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(524, 88, 115, 79);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_8_1 = new JButton("SIGUIENTE");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Intermedio j=new Intermedio();
				j.setVisible(true);
			}
		});
		btnNewButton_8_1.setBounds(303, 472, 115, 50);
		contentPane.add(btnNewButton_8_1);
		
		
	}
}

