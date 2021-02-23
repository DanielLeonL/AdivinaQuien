

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

public class Tablero1 extends JFrame {

	private JPanel contentPane;
	public Tablero1() {
		super("Tablero de practica");
		setBounds(50, 50, 600, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tablero de prueba");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(198, 10, 184, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_8_1 = new JButton("SIGUIENTE");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Intermedio j=new Intermedio();
				j.setVisible(true);
			}
		});
		btnNewButton_8_1.setBounds(218, 582, 164, 50);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setBounds(44, 64, 77, 109);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("New button");
		btnNewButton_4_1_1.setBounds(131, 64, 77, 109);
		contentPane.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_1_2 = new JButton("New button");
		btnNewButton_4_1_2.setBounds(218, 64, 77, 109);
		contentPane.add(btnNewButton_4_1_2);
		
		JButton btnNewButton_4_1_3 = new JButton("New button");
		btnNewButton_4_1_3.setBounds(305, 64, 77, 109);
		contentPane.add(btnNewButton_4_1_3);
		
		JButton btnNewButton_4_1_4 = new JButton("New button");
		btnNewButton_4_1_4.setBounds(392, 64, 77, 109);
		contentPane.add(btnNewButton_4_1_4);
		
		JButton btnNewButton_4_1_5 = new JButton("New button");
		btnNewButton_4_1_5.setBounds(479, 64, 77, 109);
		contentPane.add(btnNewButton_4_1_5);
		
		JButton btnNewButton_4_1_8 = new JButton("New button");
		btnNewButton_4_1_8.setBounds(44, 183, 77, 109);
		contentPane.add(btnNewButton_4_1_8);
		
		JButton btnNewButton_4_1_1_1 = new JButton("New button");
		btnNewButton_4_1_1_1.setBounds(131, 183, 77, 109);
		contentPane.add(btnNewButton_4_1_1_1);
		
		JButton btnNewButton_4_1_2_1 = new JButton("New button");
		btnNewButton_4_1_2_1.setBounds(218, 183, 77, 109);
		contentPane.add(btnNewButton_4_1_2_1);
		
		JButton btnNewButton_4_1_3_1 = new JButton("New button");
		btnNewButton_4_1_3_1.setBounds(305, 183, 77, 109);
		contentPane.add(btnNewButton_4_1_3_1);
		
		JButton btnNewButton_4_1_4_1 = new JButton("New button");
		btnNewButton_4_1_4_1.setBounds(392, 183, 77, 109);
		contentPane.add(btnNewButton_4_1_4_1);
		
		JButton btnNewButton_4_1_5_1 = new JButton("New button");
		btnNewButton_4_1_5_1.setBounds(479, 183, 77, 109);
		contentPane.add(btnNewButton_4_1_5_1);
		
		JButton btnNewButton_4_1_9 = new JButton("New button");
		btnNewButton_4_1_9.setBounds(44, 302, 77, 109);
		contentPane.add(btnNewButton_4_1_9);
		
		JButton btnNewButton_4_1_1_2 = new JButton("New button");
		btnNewButton_4_1_1_2.setBounds(131, 302, 77, 109);
		contentPane.add(btnNewButton_4_1_1_2);
		
		JButton btnNewButton_4_1_2_2 = new JButton("New button");
		btnNewButton_4_1_2_2.setBounds(218, 302, 77, 109);
		contentPane.add(btnNewButton_4_1_2_2);
		
		JButton btnNewButton_4_1_3_2 = new JButton("New button");
		btnNewButton_4_1_3_2.setBounds(305, 302, 77, 109);
		contentPane.add(btnNewButton_4_1_3_2);
		
		JButton btnNewButton_4_1_4_2 = new JButton("New button");
		btnNewButton_4_1_4_2.setBounds(392, 302, 77, 109);
		contentPane.add(btnNewButton_4_1_4_2);
		
		JButton btnNewButton_4_1_5_2 = new JButton("New button");
		btnNewButton_4_1_5_2.setBounds(479, 302, 77, 109);
		contentPane.add(btnNewButton_4_1_5_2);
		
		JButton btnNewButton_4_1_10 = new JButton("New button");
		btnNewButton_4_1_10.setBounds(44, 421, 77, 109);
		contentPane.add(btnNewButton_4_1_10);
		
		JButton btnNewButton_4_1_1_3 = new JButton("New button");
		btnNewButton_4_1_1_3.setBounds(131, 421, 77, 109);
		contentPane.add(btnNewButton_4_1_1_3);
		
		JButton btnNewButton_4_1_2_3 = new JButton("New button");
		btnNewButton_4_1_2_3.setBounds(218, 421, 77, 109);
		contentPane.add(btnNewButton_4_1_2_3);
		
		JButton btnNewButton_4_1_3_3 = new JButton("New button");
		btnNewButton_4_1_3_3.setBounds(305, 421, 77, 109);
		contentPane.add(btnNewButton_4_1_3_3);
		
		JButton btnNewButton_4_1_4_3 = new JButton("New button");
		btnNewButton_4_1_4_3.setBounds(392, 421, 77, 109);
		contentPane.add(btnNewButton_4_1_4_3);
		
		JButton btnNewButton_4_1_5_3 = new JButton("New button");
		btnNewButton_4_1_5_3.setBounds(479, 421, 77, 109);
		contentPane.add(btnNewButton_4_1_5_3);
		
		JButton btnNewButton_4_1_10_1 = new JButton("New button");
		btnNewButton_4_1_10_1.setBounds(44, 553, 77, 109);
		contentPane.add(btnNewButton_4_1_10_1);
		
		
	}
}
