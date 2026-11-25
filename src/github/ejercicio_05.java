package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio_05 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBaseMayor;
	private JTextField txtBaseMenor;
	private JLabel lblBaseMayor;
	private JLabel lblBaseMenor;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextArea txtS;
	private JLabel lblAltura_1;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio_05 frame = new ejercicio_05();
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
	public ejercicio_05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBaseMayor = new JTextField();
		txtBaseMayor.setColumns(10);
		txtBaseMayor.setBounds(115, 11, 65, 16);
		contentPane.add(txtBaseMayor);
		
		txtBaseMenor = new JTextField();
		txtBaseMenor.setColumns(10);
		txtBaseMenor.setBounds(115, 35, 65, 16);
		contentPane.add(txtBaseMenor);
		
		lblBaseMayor = new JLabel("BaseMayor");
		lblBaseMayor.setBounds(31, 8, 76, 22);
		contentPane.add(lblBaseMayor);
		
		lblBaseMenor = new JLabel("BaseMenor");
		lblBaseMenor.setBounds(30, 35, 77, 16);
		contentPane.add(lblBaseMenor);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(330, 10, 76, 18);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(330, 43, 76, 18);
		contentPane.add(btnBorrar);
		
		txtS = new JTextArea();
		txtS.setBounds(8, 100, 420, 145);
		contentPane.add(txtS);
		
		lblAltura_1 = new JLabel("Altura");
		lblAltura_1.setBounds(30, 59, 77, 16);
		contentPane.add(lblAltura_1);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(115, 59, 65, 16);
		contentPane.add(txtAltura);

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
		
		double B, b, h;
		double A;
		
		B = Double.parseDouble(txtBaseMayor.getText());
		b = Double.parseDouble(txtBaseMenor.getText());
		h = Double.parseDouble(txtAltura.getText());
		
		A = ((b + B) * h)/2;
		
		txtS.setText("AREA DE UN ROMBO \n\n");
		txtS.setText("AREA : \t	\t" + A + "\n"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
	}
}
