package ui.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import entidades.Persona;
import negocio.CtrlABMPersona;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ABMPersona {

	private JFrame frame;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEmail;
	
	private CtrlABMPersona ctrlPer = new CtrlABMPersona(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABMPersona window = new ABMPersona();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ABMPersona() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblDni = new JLabel("DNI:");
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				buscar();
			}
		});
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				guardar();
			}
		});
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				borrar();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(lblDni))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtDni)
								.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnGuardar)
								.addComponent(btnBuscar)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblApellido)
								.addComponent(lblEmail))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtEmail)
								.addComponent(txtApellido, 205, 205, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(btnBorrar)))
					.addGap(18))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni)
						.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardar))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido)
						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBorrar))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(146, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	protected Persona mapearDeDatos(){
		Persona p = new Persona();
		p.setDni(Integer.parseInt(txtDni.getText()));
		p.setNombre(txtNombre.getText());
		p.setApellido(txtApellido.getText());
		p.setEmail(txtEmail.getText());
		return p;
	}
	
	protected void mapearADatos(Persona p){
		txtDni.setText(String.valueOf(p.getDni()));
		txtNombre.setText(p.getNombre());
		txtApellido.setText(p.getApellido());
		txtEmail.setText(p.getEmail());
	}

	protected void borrar() {
		ctrlPer.delete(this.mapearDeDatos());
		this.txtDni.setText("");
		this.txtNombre.setText("");
		this.txtApellido.setText("");
		this.txtEmail.setText("");
	}

	protected void guardar() {
		Persona p= this.mapearDeDatos();
		ctrlPer.save(p);
		//txtId.setText(String.valueOf(p.getId()));
	}

	protected void buscar() {
		Persona p = ctrlPer.getByDni(Integer.parseInt(txtDni.getText()));
		if (p==null){
			JOptionPane.showMessageDialog(null, "No se ha encontrado el DNI", "Error al buscar", JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.mapearADatos(p);
		}
	}
}
