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
import controlador.ConInsertarIncidencia;
import modelo.EspecialidadDAO;
import modelo.IncidenciaDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class InsertarIncidencia extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public JTextField meterID;
	public JTextField meterDescripcion;
	public JTextField meterEstado;
	public JTextField meterPuntosCoste;
	public JTextField meterNumCliente;
	public JTextField meterf_abierta;
	public JTextField meterNumRepara;
	public JTextField meterFrepara;
	public JButton insertButton = new JButton("Insert");
	public JTextField meterValoracion;
	InsertarIncidencia frame = this;
	IncidenciaDAO dao = new IncidenciaDAO();
	public JTextField meterNtecnico;
	public JTextField meterFAprobada;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InsertarIncidencia dialog = new InsertarIncidencia();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InsertarIncidencia() {
		setBounds(100, 100, 450, 351);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Incidencia");
			lblNewLabel.setBounds(193, 10, 48, 14);
			contentPanel.add(lblNewLabel);
		}

		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(23, 49, 46, 14);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Descripcion");
		lblNewLabel_2.setBounds(23, 73, 63, 14);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Estado");
		lblNewLabel_3.setBounds(23, 98, 46, 14);
		contentPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("PuntosCoste");
		lblNewLabel_4.setBounds(23, 124, 63, 14);
		contentPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("NumCliente");
		lblNewLabel_5.setBounds(23, 149, 63, 14);
		contentPanel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("f_abierta");
		lblNewLabel_6.setBounds(21, 174, 48, 14);
		contentPanel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("num_repara");
		lblNewLabel_7.setBounds(23, 199, 63, 14);
		contentPanel.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("f_repara");
		lblNewLabel_8.setBounds(23, 224, 46, 14);
		contentPanel.add(lblNewLabel_8);

		meterID = new JTextField();
		meterID.setBounds(149, 46, 86, 20);
		contentPanel.add(meterID);
		meterID.setColumns(10);

		meterDescripcion = new JTextField();
		meterDescripcion.setBounds(149, 70, 86, 20);
		contentPanel.add(meterDescripcion);
		meterDescripcion.setColumns(10);

		meterEstado = new JTextField();
		meterEstado.setBounds(149, 95, 86, 20);
		contentPanel.add(meterEstado);
		meterEstado.setColumns(10);

		meterPuntosCoste = new JTextField();
		meterPuntosCoste.setBounds(149, 121, 86, 20);
		contentPanel.add(meterPuntosCoste);
		meterPuntosCoste.setColumns(10);

		meterNumCliente = new JTextField();
		meterNumCliente.setBounds(149, 146, 86, 20);
		contentPanel.add(meterNumCliente);
		meterNumCliente.setColumns(10);

		meterf_abierta = new JTextField();
		meterf_abierta.setBounds(149, 171, 86, 20);
		contentPanel.add(meterf_abierta);
		meterf_abierta.setColumns(10);

		meterNumRepara = new JTextField();
		meterNumRepara.setBounds(149, 196, 86, 20);
		contentPanel.add(meterNumRepara);
		meterNumRepara.setColumns(10);

		meterFrepara = new JTextField();
		meterFrepara.setBounds(149, 221, 86, 20);
		contentPanel.add(meterFrepara);
		meterFrepara.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Valoracion");
		lblNewLabel_9.setBounds(23, 249, 63, 14);
		contentPanel.add(lblNewLabel_9);

		meterValoracion = new JTextField();
		meterValoracion.setBounds(149, 246, 86, 20);
		contentPanel.add(meterValoracion);
		meterValoracion.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("NumTecnico");
		lblNewLabel_10.setBounds(261, 49, 70, 14);
		contentPanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("F_Aprobada");
		lblNewLabel_11.setBounds(261, 73, 63, 14);
		contentPanel.add(lblNewLabel_11);
		
		meterNtecnico = new JTextField();
		meterNtecnico.setBounds(338, 46, 86, 20);
		contentPanel.add(meterNtecnico);
		meterNtecnico.setColumns(10);
		
		meterFAprobada = new JTextField();
		meterFAprobada.setBounds(338, 70, 86, 20);
		contentPanel.add(meterFAprobada);
		meterFAprobada.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton VolverButton = new JButton("Volver");
				VolverButton.setActionCommand("OK");
				VolverButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Ventana2 miVentana = new Ventana2();
//						miVentana.setVisible(true);

						dispose();
					}
				});
				buttonPane.add(VolverButton);
				getRootPane().setDefaultButton(VolverButton);
			}
			{

				insertButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						// TODO Auto-generated method stub
						ConInsertarIncidencia ci = new ConInsertarIncidencia(dao, frame);
						ci.actionPerformed(e);
					}
				});

				insertButton.setActionCommand("Cancel");

				buttonPane.add(insertButton);
			}
		}
	}
}
