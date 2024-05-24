package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ConInsertarTecnico;
import controlador.ConInsertarUsuario;
import modelo.TecnicoDAO;
import modelo.UsuarioDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class InsertarUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public JTextField meterNumeor;
	public JTextField meterNombre;
	public JTextField meterApellidos;
	public JTextField meterDireccion;
	public JTextField meterPoblacion;
	public JTextField puntosAcumulados;
	UsuarioDAO dao = new UsuarioDAO();
	InsertarUsuario frame = this;
	public JButton insertButton = new JButton("Insertar");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InsertarUsuario dialog = new InsertarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InsertarUsuario() {
		setBounds(100, 100, 452, 396);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Usuario");
			lblNewLabel.setBounds(199, 10, 36, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Numero");
			lblNewLabel_1.setBounds(67, 73, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Nombre");
			lblNewLabel_2.setBounds(67, 110, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Apellidos");
			lblNewLabel_3.setBounds(67, 147, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Direccion");
			lblNewLabel_4.setBounds(67, 184, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Poblacion");
			lblNewLabel_5.setBounds(67, 219, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Puntos Acumulados");
			lblNewLabel_6.setBounds(67, 244, 93, 29);
			contentPanel.add(lblNewLabel_6);
		}
		{
			meterNumeor = new JTextField();
			meterNumeor.setBounds(209, 70, 86, 20);
			contentPanel.add(meterNumeor);
			meterNumeor.setColumns(10);
		}
		{
			meterNombre = new JTextField();
			meterNombre.setBounds(209, 107, 86, 20);
			contentPanel.add(meterNombre);
			meterNombre.setColumns(10);
		}
		{
			meterApellidos = new JTextField();
			meterApellidos.setBounds(209, 144, 86, 20);
			contentPanel.add(meterApellidos);
			meterApellidos.setColumns(10);
		}
		{
			meterDireccion = new JTextField();
			meterDireccion.setBounds(209, 181, 86, 20);
			contentPanel.add(meterDireccion);
			meterDireccion.setColumns(10);
		}
		{
			meterPoblacion = new JTextField();
			meterPoblacion.setBounds(209, 216, 86, 20);
			contentPanel.add(meterPoblacion);
			meterPoblacion.setColumns(10);
		}
		{
			puntosAcumulados = new JTextField();
			puntosAcumulados.setBounds(209, 248, 86, 20);
			contentPanel.add(puntosAcumulados);
			puntosAcumulados.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton volverButton = new JButton("Volver");
				volverButton.setActionCommand("OK");
				buttonPane.add(volverButton);
				getRootPane().setDefaultButton(volverButton);
			}
			{
				insertButton.setActionCommand("Cancel");
				insertButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						// TODO Auto-generated method stub
						ConInsertarUsuario ci = new ConInsertarUsuario(dao, frame);
						ci.actionPerformed(e);
					}
				});
				buttonPane.add(insertButton);
			}
		}
	}

}
