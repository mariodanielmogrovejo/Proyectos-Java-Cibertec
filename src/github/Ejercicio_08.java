package github;

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

public class Ejercicio_08 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblLado;
	private JTextField txtLado;
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
					Ejercicio_08 frame = new Ejercicio_08();
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
	public Ejercicio_08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLado = new JLabel("Lado");
		lblLado.setBounds(10, 42, 67, 12);
		contentPane.add(lblLado);
		
		txtLado = new JTextField();
		txtLado.setColumns(10);
		txtLado.setBounds(108, 39, 96, 18);
		contentPane.add(txtLado);
		
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
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		
		
		double Lado;
		double A, V ;
		
		Lado = Double.parseDouble(txtLado.getText());
		
		A = 6 * ( Lado * Lado );
		V =  Lado * 3;
		
		
		txtS.setText("EL AREA Y VOLUMEN SON: \n\n");
		txtS.append("AREA:\t\t" + A + "\n");
		txtS.append("VOLUMEN:\t\t" + V + "\n");
		
		
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
	}
}
