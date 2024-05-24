package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ConInsertarEspecialidad;
import controlador.ConInsertarTecnico;
import modelo.TecnicoDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class InsertarTecnico extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public JTextField meterCodigo;
	public JTextField meterNombre;
	TecnicoDAO dao = new TecnicoDAO();
	InsertarTecnico frame = this;
	public JButton insertButton = new JButton("Insertar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InsertarTecnico dialog = new InsertarTecnico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InsertarTecnico() {
		setBounds(100, 100, 348, 197);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tecnico");
			lblNewLabel.setBounds(168, 11, 36, 14);
			contentPanel.add(lblNewLabel);
		}

		meterCodigo = new JTextField();
		meterCodigo.setBounds(145, 46, 86, 20);
		contentPanel.add(meterCodigo);
		meterCodigo.setColumns(10);

		meterNombre = new JTextField();
		meterNombre.setBounds(145, 77, 86, 20);
		contentPanel.add(meterNombre);
		meterNombre.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(62, 49, 46, 14);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Especialidad");
		lblNewLabel_2.setBounds(62, 80, 46, 14);
		contentPanel.add(lblNewLabel_2);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton volverButton = new JButton("Volver");
				volverButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Ventana2 miVentana = new Ventana2();
//						miVentana.setVisible(true);

						dispose();
					}
				});
				volverButton.setActionCommand("OK");
				buttonPane.add(volverButton);
				getRootPane().setDefaultButton(volverButton);
			}
			{
				insertButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						// TODO Auto-generated method stub
						ConInsertarTecnico ci = new ConInsertarTecnico(dao, frame);
						ci.actionPerformed(e);
					}
				});
				insertButton.setActionCommand("Cancel");
				buttonPane.add(insertButton);
			}
		}
	}
}
