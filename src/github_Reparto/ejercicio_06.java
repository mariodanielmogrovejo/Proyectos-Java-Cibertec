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

public class ejercicio_06 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDebora;
	private JTextField txtDebora;
	private JLabel lblRaquel;
	private JTextField txtRaquel;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtS;
	private JLabel lblSefora;
	private JTextField txtSefora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_06 frame = new ejercicio_06();
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
	public ejercicio_06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDebora = new JLabel("Debora");
		lblDebora.setBounds(10, 14, 99, 10);
		contentPane.add(lblDebora);
		
		txtDebora = new JTextField();
		txtDebora.setColumns(10);
		txtDebora.setBounds(119, 11, 76, 16);
		contentPane.add(txtDebora);
		
		lblRaquel = new JLabel("Raquel");
		lblRaquel.setBounds(10, 38, 99, 10);
		contentPane.add(lblRaquel);
		
		txtRaquel = new JTextField();
		txtRaquel.setColumns(10);
		txtRaquel.setBounds(119, 34, 76, 18);
		contentPane.add(txtRaquel);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(339, 10, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(339, 36, 76, 18);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 87, 421, 170);
		contentPane.add(txtS);
		
		lblSefora = new JLabel("Sefora");
		lblSefora.setBounds(10, 58, 99, 10);
		contentPane.add(lblSefora);
		
		txtSefora = new JTextField();
		txtSefora.setColumns(10);
		txtSefora.setBounds(119, 54, 76, 18);
		contentPane.add(txtSefora);

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
		
	double Debora, Raquel, Sefora;
	double monto1, monto2, monto3, total;
	
	Debora = Double.parseDouble(txtDebora.getText()); 
	Raquel = Double.parseDouble(txtRaquel.getText()); 
	Sefora = Double.parseDouble(txtSefora.getText()); 
	
	total = Debora + Raquel + Sefora;
	monto1 = (Debora / total) * 100;
	monto2= (Raquel / total) * 100;
	monto3 = (Sefora / total) * 100;
	
	txtS.setText("MONTO TOTAL Y PORCENTAJES: \n\n");
	txtS.append("TOTAL:\t\t" + total + "\n");
	txtS.append("% DEBORA:\t\t" + monto1 + "\n");
	txtS.append("% RAQUEL:\t\t" + monto2 + "\n");
	txtS.append("% SEFORA:\t\t" + monto3 + "\n");
	
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
	}
}
