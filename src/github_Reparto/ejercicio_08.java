package github_Reparto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio_08 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblImportedeventa;
	private JTextField txtImportedeventa;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_08 frame = new ejercicio_08();
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
	public ejercicio_08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblImportedeventa = new JLabel("Importe de venta");
		lblImportedeventa.setBounds(10, 27, 99, 10);
		contentPane.add(lblImportedeventa);

		txtImportedeventa = new JTextField();
		txtImportedeventa.setColumns(10);
		txtImportedeventa.setBounds(119, 24, 76, 16);
		contentPane.add(txtImportedeventa);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(339, 10, 76, 18);
		contentPane.add(btnProcesar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(339, 36, 76, 18);
		contentPane.add(btnBorrar);

		txtS = new JTextArea();
		txtS.setBounds(10, 64, 421, 199);
		contentPane.add(txtS);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		
	//INICIO//
		Double IV, ID , subase = 350.75, subruto, comision, suneto;
		
		IV = Double.parseDouble(txtImportedeventa.getText()); 
	
		
		subase = 350.75;
		comision = 0.05 * IV;
		subruto = subase + comision;
		ID = 0.15 * subruto;
		suneto = subruto - ID;	
		
		txtS.setText("----BOLETA-----\n\n");
		txtS.append("SUELDO BASE:\t\t" + subase + "\n");		
		txtS.append("COMISION:\t\t" + comision + "\n");
		txtS.append("SUELDO BRUTO:\t\t" + subruto + "\n");
		txtS.append("DESCUENTO:\t\t" + ID + "\n");
		txtS.append("SUELDO NETO:\t\t" + suneto + "\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
