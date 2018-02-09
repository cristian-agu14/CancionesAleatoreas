package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Cancion;
import logica.Principal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class ventana extends JFrame {

	private JPanel contentPane;

	private static Principal principal = new Principal();

	private static Cancion miCan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					miCan = principal.buscarCancionPorId();
					System.out.println(miCan.getNombre());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		miCan = new Cancion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(23, 29, 411, 206);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel labelNombre = new JLabel("Hola Amigos");
		labelNombre.setForeground(Color.BLUE);
		labelNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		labelNombre.setBounds(20, 11, 381, 113);
		panel.add(labelNombre);

		JLabel labelCantante = new JLabel("New label");
		labelCantante.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		labelCantante.setBounds(20, 147, 381, 48);
		panel.add(labelCantante);

		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				miCan = principal.buscarCancionPorId();
				System.out.println("------>" + miCan.getNombre());
				if (miCan.isEstadoJ()) {
					labelNombre.setText(miCan.getNombre());
					labelCantante.setText(miCan.getCantante());
				} else {
					labelNombre.setText(miCan.getNombre());
					labelCantante.setText(miCan.getCantante());
				}
			}
		});
		btnSiguiente.setBounds(115, 300, 234, 55);
		contentPane.add(btnSiguiente);

	}
}
