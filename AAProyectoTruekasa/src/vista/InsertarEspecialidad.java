package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.EspecialidadDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controlador.ConInsertarEspecialidad;

public class InsertarEspecialidad extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public JTextField nombreCodigo;
	public JTextField nombreEspecialidad;
	EspecialidadDAO dao = new EspecialidadDAO();
	InsertarEspecialidad frame = this;
	public JButton InsertButton = new JButton("Insertar");

//	ConInsertarEspecialidad frame = this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InsertarEspecialidad dialog = new InsertarEspecialidad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Insertamos la especialidad Create the dialog.
	 */
	public InsertarEspecialidad() {
		setBounds(100, 100, 348, 197);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			nombreCodigo = new JTextField();
			nombreCodigo.setBounds(151, 56, 86, 20);
			contentPanel.add(nombreCodigo);
			nombreCodigo.setColumns(10);

		}
		{
			JLabel lblNewLabel = new JLabel("Especialidad");
			lblNewLabel.setBounds(165, 11, 58, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Codigo");
			lblNewLabel_1.setBounds(56, 59, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Especialidad");
			lblNewLabel_2.setBounds(56, 99, 70, 14);
			contentPanel.add(lblNewLabel_2);
		}

		nombreEspecialidad = new JTextField();
		nombreEspecialidad.setBounds(151, 96, 86, 20);
		contentPanel.add(nombreEspecialidad);
		nombreEspecialidad.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Volver");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Ventana2 miVentana = new Ventana2();
//						miVentana.setVisible(true);

						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{

				InsertButton.setActionCommand("Cancel");
				buttonPane.add(InsertButton);
				InsertButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						// TODO Auto-generated method stub
						ConInsertarEspecialidad ci = new ConInsertarEspecialidad(dao, frame);
						ci.actionPerformed(e);
					}
				});

			}
		}
	}
}
