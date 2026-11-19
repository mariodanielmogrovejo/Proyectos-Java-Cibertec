package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ejercicio_01 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtS;
	private JLabel lblPeso;
	private JLabel lblEstatura;
	private JTextField txtPeso;
	private JTextField txtEstatura;

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
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(337, 4, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(337, 30, 76, 18);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(8, 56, 421, 199);
		contentPane.add(txtS);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(18, 8, 36, 10);
		contentPane.add(lblPeso);
		
		lblEstatura = new JLabel("Estatura");
		lblEstatura.setBounds(18, 32, 36, 10);
		contentPane.add(lblEstatura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(75, 5, 76, 16);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtEstatura = new JTextField();
		txtEstatura.setBounds(75, 25, 76, 18);
		contentPane.add(txtEstatura);
		txtEstatura.setColumns(10);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	
	double peso, estatura, IMC ;
	
	peso = Double.parseDouble(txtPeso.getText());
	estatura = Double.parseDouble(txtEstatura.getText());
	
	IMC = peso / (estatura * estatura);
	
	txtS.setText("INDICE DE MASA CORPORAL\n\n");
	txtS.append("INDICE DE MASA CORPORAL\t: " + IMC + "\n");
	}
	
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
		txtPeso.setText("");
		txtEstatura.setText("");
		txtS.setText("");
		
	}
}
