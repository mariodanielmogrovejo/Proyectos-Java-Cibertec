package github_Reparto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio_01 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField txtMontoTotal;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtS;
	private JLabel lblMontoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_01 frame = new ejercicio_01();
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
	public ejercicio_01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 436, 263);
		contentPane.add(contentPane_1);
		
		txtMontoTotal = new JTextField();
		txtMontoTotal.setColumns(10);
		txtMontoTotal.setBounds(99, 35, 96, 18);
		contentPane_1.add(txtMontoTotal);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(342, 9, 84, 20);
		contentPane_1.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(342, 52, 84, 20);
		contentPane_1.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 87, 416, 166);
		contentPane_1.add(txtS);
		
		lblMontoTotal = new JLabel("MontoTotal");
		lblMontoTotal.setBounds(10, 38, 67, 12);
		contentPane_1.add(lblMontoTotal);

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
		
		
	double montototal;
	double Alquiler, Publicidad, Transporte, Servicios, Decoracion, Gastos;
		
	montototal = Double.parseDouble(txtMontoTotal.getText());
	
	Alquiler = 0.23 * montototal;
	Publicidad = 0.07 * montototal;
	Transporte = 0.26 * montototal;
	Servicios = 0.12 * montototal;
	Decoracion = 0.21 * montototal;
	Gastos = 0.11 * montototal;
	
	txtS.setText("MONTO REPARTIDO\n\n");
	txtS.append("Alquiler\t: " + Alquiler + "\n");
	txtS.append("Publicidad\t: " + Publicidad + "\n");
	txtS.append("Transporte\t: " + Transporte + "\n");
	txtS.append("Servicios\t: " + Servicios + "\n");
	txtS.append("Decoracion\t: " + Decoracion + "\n");
	txtS.append("Gastos\t: " + Gastos + "\n");
	
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
		txtMontoTotal.setText("");
		txtS.setText("");
		
		
		
		
		
		
		
	}
}
