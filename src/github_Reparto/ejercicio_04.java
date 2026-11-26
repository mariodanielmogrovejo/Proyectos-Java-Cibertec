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

public class ejercicio_04 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel contentPane_1;
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
					ejercicio_04 frame = new ejercicio_04();
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
	public ejercicio_04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, -10, 436, 263);
		contentPane.add(contentPane_1);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 14, 99, 10);
		contentPane_1.add(lblPrecio);
		
		lblUnidadesAdquiridas = new JLabel("UnidadesAdquiridas");
		lblUnidadesAdquiridas.setBounds(10, 38, 99, 10);
		contentPane_1.add(lblUnidadesAdquiridas);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(119, 11, 76, 16);
		contentPane_1.add(txtPrecio);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 58, 421, 199);
		contentPane_1.add(txtS);
		
		txtUnidadesAdquiridas = new JTextField();
		txtUnidadesAdquiridas.setColumns(10);
		txtUnidadesAdquiridas.setBounds(119, 34, 76, 18);
		contentPane_1.add(txtUnidadesAdquiridas);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(339, 10, 76, 18);
		contentPane_1.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(339, 36, 76, 18);
		contentPane_1.add(btnBorrar);

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
		
		double precio, IC, IV, ID1, ID2, IDF;
		int unidades;
		
		precio = Double.parseDouble(txtPrecio.getText()); 
		unidades = Integer.parseInt(txtUnidadesAdquiridas.getText()); 
		
		IC = precio * unidades;
		ID1 = (0.07 * IC);
		ID2 = (0.07 * ( IC - ID1));
		IDF = (ID1 + ID2);
		IV = IC - IDF;
		
		txtS.setText("IMPORTE DE VENTA, IMPORTE DE COMPRA E IMPORTE DE DESCUENTO: \n\n");
		txtS.append("IC:\t\t" + IC + "\n");
		txtS.append("IV:\t\t" + IV + "\n");
		txtS.append("ID:\t\t" + IDF + "\n");
		
		
		
		
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
	}
}
