package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_07 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtS;
	private JLabel lblEdad;
	private JLabel lblPeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_07 frame = new Ejercicio_07();
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
	public Ejercicio_07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(99, 10, 96, 18);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(99, 53, 96, 18);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(342, 9, 84, 20);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(342, 52, 84, 20);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 87, 416, 166);
		contentPane.add(txtS);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 13, 67, 12);
		contentPane.add(lblEdad);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 56, 67, 12);
		contentPane.add(lblPeso);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		double Edad, Peso;
		double FrecuenciaCardica;
		
		Edad = Double.parseDouble(txtEdad.getText());
		Peso = Double.parseDouble(txtPeso.getText());
		
		FrecuenciaCardica = 210 - (0.5 * Edad) - (0.01 * Peso + 4);
		
		txtS.setText("LA FRECUENCIA CARDICA ES\n\n");
		txtS.append("fRECUENCIA:\t\t" + FrecuenciaCardica + "\n");		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
