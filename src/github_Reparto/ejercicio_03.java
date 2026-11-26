package github_Reparto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio_03 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPrecio;
	private JLabel lblUnidadesAdquiridas;
	private JTextField txtPrecio;
	private JTextArea txtS;
	private JTextField txtUnidadesAdquiridas;
	private JButton btnProcesar;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_03 frame = new ejercicio_03();
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
	public ejercicio_03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 14, 99, 10);
		contentPane.add(lblPrecio);
		
		lblUnidadesAdquiridas = new JLabel("UnidadesAdquiridas");
		lblUnidadesAdquiridas.setBounds(10, 38, 99, 10);
		contentPane.add(lblUnidadesAdquiridas);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(119, 11, 76, 16);
		contentPane.add(txtPrecio);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 62, 421, 199);
		contentPane.add(txtS);
		
		txtUnidadesAdquiridas = new JTextField();
		txtUnidadesAdquiridas.setColumns(10);
		txtUnidadesAdquiridas.setBounds(119, 34, 76, 18);
		contentPane.add(txtUnidadesAdquiridas);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(339, 10, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(339, 36, 76, 18);
		contentPane.add(btnBorrar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
	double IC, IV, ID, precio;
	int unidades, caramelos;
	
	precio = Double.parseDouble(txtPrecio.getText()); 
	unidades = Integer.parseInt(txtUnidadesAdquiridas.getText()); 
	
	IC = precio * unidades;
	ID = 0.11 * IC;
	IV = IC - ID; 
	caramelos = 2 * unidades; 
	IV = IC - ID;
	
	txtS.setText("IMPORTE DE VENTA, IMPORTE DE COMPRA E IMPORTE DE DESCUENTO: \n\n");
	txtS.append("IC:\t\t" + IC + "\n");
	txtS.append("IV:\t\t" + IV + "\n");
	txtS.append("ID:\t\t" + ID + "\n");
	txtS.append("CARAMELOS DE CORTESIA:\t\t" + caramelos + "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
	}
}
