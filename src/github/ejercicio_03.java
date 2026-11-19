package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio_03 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtS;
	private JLabel lblRadio;
	private JTextField txtRadio;
	private JButton btnProcesar;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_03 frame = new ejercicio_03();
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
	public ejercicio_03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtS = new JTextArea();
		txtS.setBounds(8, 87, 420, 168);
		contentPane.add(txtS);
		
		lblRadio = new JLabel("Radio");
		lblRadio.setBounds(8, 40, 65, 10);
		contentPane.add(lblRadio);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(85, 37, 65, 16);
		contentPane.add(txtRadio);
		txtRadio.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(326, 8, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(326, 36, 76, 18);
		contentPane.add(btnBorrar);

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
		
		double radio, area, circunferencia; 
		
		radio = Double.parseDouble(txtRadio.getText());
		
		area = 3.1416 * radio * 2;
		
		circunferencia = 2 * 3.1416 * radio; 
		
		txtS.setText("AREA  Y CIRCUNFERENCIA\n\n");
		txtS.append("AREA:\t\t\t" + area + "\n"); 
		txtS.append("CIRCUNFERENCIA:\t\t" + circunferencia+ "\n");
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
		txtRadio.setText("");
		txtS.setText("");
		
	}
}
