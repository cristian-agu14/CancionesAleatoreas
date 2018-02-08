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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		JPanel panel = new JPanel();
		panel.setBounds(23, 29, 401, 135);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel.setBounds(20, 11, 357, 113);
		panel.add(lblNewLabel);

		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//miCan = new Cancion(0, "", "", false);
				miCan = principal.buscarCancionPorId();
				System.out.println("------>"+miCan.getNombre());
				lblNewLabel.setText(miCan.getNombre()+"-->"+miCan.getCantante());
				
				//lblNewLabel.setText(miCan.getNombre() + "-->" + miCan.getCantante());
				
			}
		});
		btnSiguiente.setBounds(124, 175, 234, 55);
		contentPane.add(btnSiguiente);

	}
}
