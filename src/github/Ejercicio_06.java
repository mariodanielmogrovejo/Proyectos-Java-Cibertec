package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Ejercicio_06 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDiagonalMayor;
	private JLabel lblDiagonalMenor;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JTextField txtDiagonalMayor;
	private JTextField txtDiagonalMenor;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_06 frame = new Ejercicio_06();
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
	public Ejercicio_06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDiagonalMayor = new JLabel("Diagonal Mayor");
		lblDiagonalMayor.setBounds(21, 10, 71, 12);
		contentPane.add(lblDiagonalMayor);
		
		lblDiagonalMenor = new JLabel("Diagonal Menor");
		lblDiagonalMenor.setBounds(21, 47, 71, 12);
		contentPane.add(lblDiagonalMenor);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(342, 10, 84, 20);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(342, 43, 84, 20);
		contentPane.add(btnBorrar);
		
		txtDiagonalMayor = new JTextField();
		txtDiagonalMayor.setBounds(119, 7, 96, 18);
		contentPane.add(txtDiagonalMayor);
		txtDiagonalMayor.setColumns(10);
		
		txtDiagonalMenor = new JTextField();
		txtDiagonalMenor.setBounds(119, 44, 96, 18);
		contentPane.add(txtDiagonalMenor);
		txtDiagonalMenor.setColumns(10);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 82, 416, 171);
		contentPane.add(txtS);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		
		double D, d;
		double A;
		
		D = Double.parseDouble(txtDiagonalMayor.getText());
		d = Double.parseDouble(txtDiagonalMenor.getText());
		
		A = (D * d) / 2	;
		
		txtS.setText("AREA DE UN ROMBO\n\n");
		txtS.append("AREA:\t\t" + A + "\n");		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
