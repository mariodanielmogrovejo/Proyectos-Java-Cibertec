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

public class ejercicio_02 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblMontoTotal;
	private JTextField txtMontoTotal;
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
					ejercicio_02 frame = new ejercicio_02();
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
	public ejercicio_02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMontoTotal = new JLabel("MontoTotal");
		lblMontoTotal.setBounds(10, 39, 67, 12);
		contentPane.add(lblMontoTotal);
		
		txtMontoTotal = new JTextField();
		txtMontoTotal.setColumns(10);
		txtMontoTotal.setBounds(99, 36, 96, 18);
		contentPane.add(txtMontoTotal);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(342, 10, 84, 20);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(342, 53, 84, 20);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 88, 416, 166);
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
		
		double montototal;
		double monto1, monto2, monto3, monto4, monto5;
			
		montototal = Double.parseDouble(txtMontoTotal.getText());
		
		monto2 = 0.27 * montototal;
		monto4 = 0.25 * montototal;
		monto1 = 0.85 * monto2;
		monto3 = 0.23 * (monto2 + monto4);
		monto5 = montototal - (monto1 + monto2 + monto3 + monto4 );
		
		txtS.setText("MONTO REPARTIDO\n\n");
		txtS.append("TAMAR\t: " + monto1 + "\n");
		txtS.append("JOSUE\t: " + monto2 + "\n");
		txtS.append("CALEB\t: " + monto3 + "\n");
		txtS.append("DANIEL\t: " + monto4 + "\n");
		txtS.append("DAVID\t: " + monto5 + "\n");
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
		txtMontoTotal.setText("");
		txtS.setText("");
		
		
		
		
		
	}
}
