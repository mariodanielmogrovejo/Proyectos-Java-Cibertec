package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio_04 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JLabel lblBase;
	private JLabel lblAltura;
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
		
		txtBase = new JTextField();
		txtBase.setBounds(85, 21, 65, 16);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(85, 54, 65, 16);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		lblBase = new JLabel("Base");
		lblBase.setBounds(20, 18, 46, 22);
		contentPane.add(lblBase);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(20, 54, 57, 16);
		contentPane.add(lblAltura);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(330, 20, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(330, 53, 76, 18);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(8, 90, 420, 165);
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
		
		double b, h;
		double A, P;
		
		b = Double.parseDouble(txtBase.getText()); 
		h = Double.parseDouble(txtAltura.getText());
				
		A = b * h;
		P = 2 * (b+h);
		
		txtS.setText("AREA Y PERIMETRO\n\n");
		txtS.append("AREA:\t\t" + A + "\n");		
		txtS.append("CIRCUNFERENCIA:\t\t" + P + "\n");
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
		txtBase.setText("");
		txtAltura.setText("");
		txtS.setText("");
		
		
		
		
		
		
	}
}
