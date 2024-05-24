package vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		/**
		 * Menubar en el que introdujiremos todos los menus
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		/* MENU INSERTAR */
		JMenu mnNewMenu = new JMenu("Insertar");
		menuBar.add(mnNewMenu);

		JButton btnNewButton_1 = TexturaBoton("Especialidad");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertarEspecialidad especialidad = new InsertarEspecialidad();
                especialidad.setVisible(true);
                
			}
		});
		mnNewMenu.add(btnNewButton_1);

		JButton btnNewButton_5 = TexturaBoton("Incidencia");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertarIncidencia incidencia = new InsertarIncidencia();
                incidencia.setVisible(true);
                
			}
		});

		mnNewMenu.add(btnNewButton_5);

		JButton btnNewButton_4 = TexturaBoton("Usuario");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertarUsuario usuario = new InsertarUsuario();
                usuario.setVisible(true);
                
			}
		});
		mnNewMenu.add(btnNewButton_4);

		JButton btnNewButton_3 = TexturaBoton("Tecnico");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertarTecnico tecnico = new InsertarTecnico();
                tecnico.setVisible(true);
                
			}
		});
		mnNewMenu.add(btnNewButton_3);

		/* Menu Visualizar */

		JMenu mnNewMenu_1 = new JMenu("Visualizar");
		menuBar.add(mnNewMenu_1);

		JButton btnNewButton_2 =TexturaBoton("Especialidad");
		mnNewMenu_1.add(btnNewButton_2);

		JButton btnNewButton_6 = TexturaBoton("Incidencia");
		mnNewMenu_1.add(btnNewButton_6);

		JButton btnNewButton_7 = TexturaBoton("Usuario");
		mnNewMenu_1.add(btnNewButton_7);

		JButton btnNewButton_8 = TexturaBoton("Tecnico");
		mnNewMenu_1.add(btnNewButton_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(125, 45, 200, 141);
		lblNewLabel_1.setIcon(new ImageIcon(
				VentanaPrincipal.class.getResource("/img/310651466_526801492786810_9002383737608535987_n.jpg")));
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(51, 212, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal miVentana = new VentanaPrincipal();
				miVentana.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);

		
		
		
	}
	/**
	 * Metodo que quita el borde al boton haciendolo parecer un texto plano
	 * @param text
	 * @return
	 */
	 private static JButton TexturaBoton(String text) {
	        JButton button = new JButton(text);
	        button.setBorderPainted(false);
	        button.setContentAreaFilled(false);
	        button.setFocusPainted(false);
	        button.setOpaque(false);
	        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        return button;
	    }
}
