package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Label De titulo
		JLabel lblNewLabel = new JLabel("Bienvenidos a TrueCasa");
		lblNewLabel.setBounds(159, 10, 139, 14);
		contentPane.add(lblNewLabel);
		//IMAGEN
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/img/310651466_526801492786810_9002383737608535987_n.jpg")));
		lblNewLabel_1.setBounds(125, 45, 200, 141);
		contentPane.add(lblNewLabel_1);
		/**
		 * Boton de salir, al pulsarlo cierra la pantalla
		 */
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();			}
		});
		btnNewButton.setBounds(51, 212, 89, 23);
		contentPane.add(btnNewButton);
		/**
		 * Boton de entrar, al pulsarlo abre la ventana2 y cierra la actual
		 */
		JButton btnNewButton_1 = new JButton("Entrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana2 v2 = new Ventana2();
                v2.setVisible(true);
                dispose();
			}
		});
		btnNewButton_1.setBounds(305, 212, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
