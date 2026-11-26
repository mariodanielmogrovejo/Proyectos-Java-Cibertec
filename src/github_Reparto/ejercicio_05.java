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

public class ejercicio_05 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTarifaHoraria;
	private JLabel lblHorasTrabajadas;
	private JTextField txtTarifaHoraria;
	private JTextField txtHorasTrabajadas;
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
					ejercicio_05 frame = new ejercicio_05();
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
	public ejercicio_05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTarifaHoraria = new JLabel("TarifaHoraria");
		lblTarifaHoraria.setBounds(10, 14, 99, 10);
		contentPane.add(lblTarifaHoraria);
		
		lblHorasTrabajadas = new JLabel("HorasTrabajadas");
		lblHorasTrabajadas.setBounds(10, 38, 99, 10);
		contentPane.add(lblHorasTrabajadas);
		
		txtTarifaHoraria = new JTextField();
		txtTarifaHoraria.setColumns(10);
		txtTarifaHoraria.setBounds(119, 11, 76, 16);
		contentPane.add(txtTarifaHoraria);
		
		txtHorasTrabajadas = new JTextField();
		txtHorasTrabajadas.setColumns(10);
		txtHorasTrabajadas.setBounds(119, 34, 76, 18);
		contentPane.add(txtHorasTrabajadas);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(339, 10, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(339, 36, 76, 18);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 58, 421, 199);
		contentPane.add(txtS);

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
		
		
	double horastrabajadas, tarifahoraria;
	double sueldobase, bonificacion, sueldobruto, descuento, sueldoneto;
		
	horastrabajadas = Double.parseDouble(txtHorasTrabajadas.getText()); 
	tarifahoraria = Double.parseDouble(txtTarifaHoraria.getText()); 
	
	
	sueldobase = horastrabajadas * tarifahoraria;
	bonificacion = 0.20 * sueldobase;
	sueldobruto = sueldobase + bonificacion;
	descuento = 0.10 * sueldobruto;
	sueldoneto = sueldobruto - descuento;
		
	txtS.setText("CALCULO DEL PAGO MENSUAL: \n\n");
	txtS.append("sueldo base:\t\t" + sueldobase + "\n");
	txtS.append("bonificacion:\t\t" + bonificacion + "\n");
	txtS.append("sueldo bruto:\t\t" + sueldobruto + "\n");
	txtS.append("descuento:\t\t" + descuento + "\n");
	txtS.append("sueldo neto:\t\t" + sueldoneto + "\n");	
				
	}
	
	protected void actionPerformedBtnBorrar(ActionEvent e) {
	}
}
