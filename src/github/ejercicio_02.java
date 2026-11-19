package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ejercicio_02 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtS;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextField txtLargo;
	private JTextField txtAncho;
	private JLabel lblLargo;
	private JLabel lblAncho;

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
		
		txtS = new JTextArea();
		txtS.setBounds(8, 104, 420, 151);
		contentPane.add(txtS);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(352, 8, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(352, 44, 76, 18);
		contentPane.add(btnBorrar);
		
		txtLargo = new JTextField();
		txtLargo.setBounds(75, 20, 65, 16);
		contentPane.add(txtLargo);
		txtLargo.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(75, 57, 65, 16);
		contentPane.add(txtAncho);
		
		lblLargo = new JLabel("Largo");
		lblLargo.setBounds(8, 14, 36, 26);
		contentPane.add(lblLargo);
		
		lblAncho = new JLabel("Ancho");
		lblAncho.setBounds(8, 60, 36, 10);
		contentPane.add(lblAncho);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
	}
	
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		

		double largo, ancho ;
		double area, precio ;
		
		largo = Double.parseDouble(txtLargo.getText());
		ancho = Double.parseDouble(txtAncho.getText());
		
		area = largo * ancho;
		precio = 750 * area;
		
		txtS.setText("AREA Y PRECIO DEL TERRENO\n\n");
		txtS.append("AREA:\t\t" + area + "\n"); 
		txtS.append("PRECIO:\t\t" + precio + "\n");
		
		
		
	}

protected void actionPerformedBtnBorrar(ActionEvent e) {
	
	txtAncho.setText("");
	txtLargo.setText("");
	txtS.setText("");
}
}














