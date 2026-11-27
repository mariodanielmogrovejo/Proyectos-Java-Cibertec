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

public class ejercicio_07 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblEdad1;
	private JLabel lblEdad2;
	private JLabel lblEdad3;
	private JTextField txtEdad1;
	private JTextField txtEdad2;
	private JTextField txtEdad3;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtS;
	private JLabel lblMontoTotal;
	private JTextField txtMontoTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_07 frame = new ejercicio_07();
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
	public ejercicio_07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEdad1 = new JLabel("Edad1");
		lblEdad1.setBounds(10, 14, 99, 10);
		contentPane.add(lblEdad1);
		
		lblEdad2 = new JLabel("Edad2");
		lblEdad2.setBounds(10, 34, 99, 10);
		contentPane.add(lblEdad2);
		
		lblEdad3 = new JLabel("Edad3");
		lblEdad3.setBounds(10, 51, 99, 10);
		contentPane.add(lblEdad3);
		
		txtEdad1 = new JTextField();
		txtEdad1.setColumns(10);
		txtEdad1.setBounds(119, 11, 76, 16);
		contentPane.add(txtEdad1);
		
		txtEdad2 = new JTextField();
		txtEdad2.setColumns(10);
		txtEdad2.setBounds(119, 30, 76, 18);
		contentPane.add(txtEdad2);
		
		txtEdad3 = new JTextField();
		txtEdad3.setColumns(10);
		txtEdad3.setBounds(119, 51, 76, 18);
		contentPane.add(txtEdad3);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(339, 10, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(339, 36, 76, 18);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 121, 421, 142);
		contentPane.add(txtS);
		
		lblMontoTotal = new JLabel("MontoTotal");
		lblMontoTotal.setBounds(10, 79, 99, 10);
		contentPane.add(lblMontoTotal);
		
		txtMontoTotal = new JTextField();
		txtMontoTotal.setColumns(10);
		txtMontoTotal.setBounds(119, 79, 76, 18);
		contentPane.add(txtMontoTotal);

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
		
	int edad1, edad2, edad3;
	double montototal, monto1, monto2, monto3;
	
	edad1 = Integer.parseInt(txtEdad1.getText()); 
	edad2 = Integer.parseInt(txtEdad2.getText()); 	
	edad3 = Integer.parseInt(txtEdad3.getText()); 
	montototal = Double.parseDouble(txtMontoTotal.getText());
	
	monto1 = edad1 * montototal / (edad1 + edad2 +edad3 );
	monto2 = edad2 * montototal / (edad1 + edad2 +edad3 );
	monto3 = edad3 * montototal / (edad1 + edad2 +edad3 );
	
	txtS.setText("REPARTICION DE DINERO: \n\n");
	txtS.append("% MONTO1:\t\t" + monto1 + "\n");
	txtS.append("% MONTO2:\t\t" + monto2 + "\n");
	txtS.append("% MONTO3:\t\t" + monto3 + "\n");
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
		txtEdad1.setText("");
		txtEdad2.setText("");
		txtEdad3.setText("");
		txtMontoTotal.setText("");
		txtS.setText("");
			
		
		
		
		
		
		
	
	}
}
