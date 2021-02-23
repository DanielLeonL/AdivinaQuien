package adivina;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tablero1 extends JFrame {

	private JPanel contentPane;
	private String ruta;
	private int personaje;
	private int personaje1;
	private Intermediario intermedio;

	public void setintermedio(Intermediario intermedio) {

		this.intermedio = intermedio;
	}

	public Tablero1(int personaje, int personaje1) {

		this.personaje = personaje;
		this.personaje1 = personaje1;

		setBounds(50, 50, 600, 725);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Tablero #1");
		lblNewLabel.setFont(new Font("AR CHRISTY", Font.PLAIN, 20));
		lblNewLabel.setBounds(231, 10, 151, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_8_1 = new JButton("Finalizar turno");
		btnNewButton_8_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 18));
		btnNewButton_8_1.setBounds(218, 582, 164, 50);
		contentPane.add(btnNewButton_8_1);

		JButton boton1 = new JButton();
		boton1.setBounds(44, 64, 77, 109);
		ruta = "src/imagenes/cara1.jpg";
		ImageIcon imagen = new ImageIcon(ruta);
		ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton1.setIcon(aux);
		contentPane.add(boton1);

		JButton boton2 = new JButton();
		boton2.setBounds(131, 64, 77, 109);
		ruta = "src/imagenes/cara2.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton2.setIcon(aux);
		contentPane.add(boton2);

		JButton boton3 = new JButton();
		boton3.setBounds(218, 64, 77, 109);
		ruta = "src/imagenes/cara3.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton3.setIcon(aux);
		contentPane.add(boton3);

		JButton boton4 = new JButton();
		boton4.setBounds(305, 64, 77, 109);
		ruta = "src/imagenes/cara4.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton4.setIcon(aux);
		contentPane.add(boton4);

		JButton boton5 = new JButton();
		boton5.setBounds(392, 64, 77, 109);
		ruta = "src/imagenes/cara5.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton5.setIcon(aux);
		contentPane.add(boton5);

		JButton boton6 = new JButton();
		boton6.setBounds(479, 64, 77, 109);
		ruta = "src/imagenes/cara6.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton6.setIcon(aux);
		contentPane.add(boton6);

		JButton boton7 = new JButton();
		boton7.setBounds(44, 183, 77, 109);
		ruta = "src/imagenes/cara7.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton7.setIcon(aux);
		contentPane.add(boton7);

		JButton boton8 = new JButton();
		boton8.setBounds(131, 183, 77, 109);
		ruta = "src/imagenes/cara8.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton8.setIcon(aux);
		contentPane.add(boton8);

		JButton boton9 = new JButton();
		boton9.setBounds(218, 183, 77, 109);
		ruta = "src/imagenes/cara9.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton9.setIcon(aux);
		contentPane.add(boton9);

		JButton boton10 = new JButton();
		boton10.setBounds(305, 183, 77, 109);
		ruta = "src/imagenes/cara10.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton10.setIcon(aux);
		contentPane.add(boton10);

		JButton boton11 = new JButton();
		boton11.setBounds(392, 183, 77, 109);
		ruta = "src/imagenes/cara11.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton11.setIcon(aux);
		contentPane.add(boton11);

		JButton boton12 = new JButton();
		boton12.setBounds(479, 183, 77, 109);
		ruta = "src/imagenes/cara12.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton12.setIcon(aux);
		contentPane.add(boton12);

		JButton boton13 = new JButton();
		boton13.setBounds(44, 302, 77, 109);
		ruta = "src/imagenes/cara13.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton13.setIcon(aux);
		contentPane.add(boton13);

		JButton boton14 = new JButton();
		boton14.setBounds(131, 302, 77, 109);
		ruta = "src/imagenes/cara14.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton14.setIcon(aux);
		contentPane.add(boton14);

		JButton boton15 = new JButton();
		boton15.setBounds(218, 302, 77, 109);
		ruta = "src/imagenes/cara15.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton15.setIcon(aux);
		contentPane.add(boton15);

		JButton boton16 = new JButton();
		boton16.setBounds(305, 302, 77, 109);
		ruta = "src/imagenes/cara16.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton16.setIcon(aux);
		contentPane.add(boton16);

		JButton boton17 = new JButton();
		boton17.setBounds(392, 302, 77, 109);
		ruta = "src/imagenes/cara17.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton17.setIcon(aux);
		contentPane.add(boton17);

		JButton boton18 = new JButton();
		boton18.setBounds(479, 302, 77, 109);
		ruta = "src/imagenes/cara18.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton18.setIcon(aux);
		contentPane.add(boton18);

		JButton boton19 = new JButton();
		boton19.setBounds(44, 421, 77, 109);
		ruta = "src/imagenes/cara19.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton19.setIcon(aux);
		contentPane.add(boton19);

		JButton boton20 = new JButton();
		boton20.setBounds(131, 421, 77, 109);
		ruta = "src/imagenes/cara20.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton20.setIcon(aux);
		contentPane.add(boton20);

		JButton boton21 = new JButton();
		boton21.setBounds(218, 421, 77, 109);
		ruta = "src/imagenes/cara21.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton21.setIcon(aux);
		contentPane.add(boton21);

		JButton boton22 = new JButton();
		boton22.setBounds(305, 421, 77, 109);
		ruta = "src/imagenes/cara22.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton22.setIcon(aux);
		contentPane.add(boton22);

		JButton boton23 = new JButton();
		boton23.setBounds(392, 421, 77, 109);
		ruta = "src/imagenes/cara23.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton23.setIcon(aux);
		contentPane.add(boton23);

		JButton boton24 = new JButton();
		boton24.setBounds(479, 421, 77, 109);
		ruta = "src/imagenes/cara24.jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton24.setIcon(aux);
		contentPane.add(boton24);

		JButton boton25 = new JButton();
		boton25.setBounds(44, 566, 77, 109);
		ruta = "src/imagenes/cara" + personaje + ".jpg";
		imagen = new ImageIcon(ruta);
		aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
		boton25.setIcon(aux);
		contentPane.add(boton25);

		JLabel lblNewLabel_1 = new JLabel("Personaje");
		lblNewLabel_1.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(44, 541, 77, 14);
		contentPane.add(lblNewLabel_1);

		JRadioButton modoadivinar = new JRadioButton("Modo adivinar");
		modoadivinar.setBackground(new Color(0, 206, 209));
		modoadivinar.setFont(new Font("AR CHRISTY", Font.PLAIN, 14));
		modoadivinar.setBounds(447, 599, 109, 23);
		contentPane.add(modoadivinar);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.setFont(new Font("AR CHRISTY", Font.PLAIN, 15));
		reiniciar.setBounds(245, 652, 115, 23);
		contentPane.add(reiniciar);
		
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ruta = "src/imagenes/cara1.jpg";
				ImageIcon imagen = new ImageIcon(ruta);
				ImageIcon aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton1.setIcon(aux);
				boton1.setEnabled(true);
				
				ruta = "src/imagenes/cara2.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton2.setIcon(aux);
				boton2.setEnabled(true);
				
				ruta = "src/imagenes/cara3.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton3.setIcon(aux);
				boton3.setEnabled(true);
			
				ruta = "src/imagenes/cara4.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton4.setIcon(aux);
				boton4.setEnabled(true);

				ruta = "src/imagenes/cara5.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton5.setIcon(aux);
				boton5.setEnabled(true);
				
				ruta = "src/imagenes/cara6.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton6.setIcon(aux);
				boton6.setEnabled(true);
				
				ruta = "src/imagenes/cara7.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton7.setIcon(aux);
				boton7.setEnabled(true);

				ruta = "src/imagenes/cara8.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton8.setIcon(aux);
				boton8.setEnabled(true);

				ruta = "src/imagenes/cara9.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton9.setIcon(aux);
				boton9.setEnabled(true);
				
				ruta = "src/imagenes/cara10.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton10.setIcon(aux);
				boton10.setEnabled(true);

				ruta = "src/imagenes/cara11.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton11.setIcon(aux);
				boton11.setEnabled(true);
				
				ruta = "src/imagenes/cara12.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton12.setIcon(aux);
				boton12.setEnabled(true);

				ruta = "src/imagenes/cara13.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton13.setIcon(aux);
				boton13.setEnabled(true);

				ruta = "src/imagenes/cara14.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton14.setIcon(aux);
				boton14.setEnabled(true);

				ruta = "src/imagenes/cara15.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton15.setIcon(aux);
				boton15.setEnabled(true);

				ruta = "src/imagenes/cara16.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton16.setIcon(aux);
				boton16.setEnabled(true);

				ruta = "src/imagenes/cara17.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton17.setIcon(aux);
				boton17.setEnabled(true);

				ruta = "src/imagenes/cara18.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton18.setIcon(aux);
				boton18.setEnabled(true);

				ruta = "src/imagenes/cara19.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton19.setIcon(aux);
				boton19.setEnabled(true);

				ruta = "src/imagenes/cara20.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton20.setIcon(aux);
				boton20.setEnabled(true);

				ruta = "src/imagenes/cara21.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton21.setIcon(aux);
				boton21.setEnabled(true);

				ruta = "src/imagenes/cara22.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton22.setIcon(aux);
				boton22.setEnabled(true);

				ruta = "src/imagenes/cara23.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton23.setIcon(aux);
				boton23.setEnabled(true);

				ruta = "src/imagenes/cara24.jpg";
				imagen = new ImageIcon(ruta);
				aux = new ImageIcon(imagen.getImage().getScaledInstance(77, 109, Image.SCALE_AREA_AVERAGING));
				boton24.setIcon(aux);
				boton24.setEnabled(true);
			}
		});
		
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					
					intermedio.setturno(2);
					intermedio.setVisible(true);
					dispose();
				}

				if (modoadivinar.isSelected() == true) {
					
					JOptionPane.showMessageDialog(null, "No has intentado adivinar, seguro que quieres seguir, si es así deshabilita el modo adivinar", "Información",
							JOptionPane.INFORMATION_MESSAGE);
					

				}

			}
		});

		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton1.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 1;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton2.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 2;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton3.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 3;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton4.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 4;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton5.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 5;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton6.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 6;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton7.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 7;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton8.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 8;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton9.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 9;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton10.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 10;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton11.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 11;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton12.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 12;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton13.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 13;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton14.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 14;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton15.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 15;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton16.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 16;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton17.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 17;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton18.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 18;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton19.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 19;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton20.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 20;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton21.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 21;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton22.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 22;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton23.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 23;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

		boton24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (modoadivinar.isSelected() == false) {
					boton24.setEnabled(false);
				}
				if (modoadivinar.isSelected() == true) {

					int valor = 24;

					if (valor == personaje1) {

						Resultados calificador = new Resultados(0, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
					if (valor != personaje1) {

						Resultados calificador = new Resultados(1, 1, personaje, personaje1);
						calificador.setVisible(true);
						dispose();

					}
				}

			}
		});

	}
}
