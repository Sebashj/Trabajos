package proyecto;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tablas {

	public JFrame frmTablas;
	private JTextArea txtResultado;
	private JButton btnBorrar;
	private JSpinner spnNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas window = new Tablas();
					window.frmTablas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tablas() {
		initialize();
	}

	private void initialize() {
		frmTablas = new JFrame();
		frmTablas.setTitle("Tablas");
		frmTablas.setBounds(100, 100, 273, 405);
		frmTablas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmTablas.getContentPane().setLayout(null);
		frmTablas.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/f.JPG")));
		
		JLabel lblNewLabel = new JLabel("incresa numero");
		lblNewLabel.setBounds(10, 23, 100, 14);
		frmTablas.getContentPane().add(lblNewLabel);
		
		spnNumero = new JSpinner();
		spnNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 int n=Integer.parseInt(spnNumero.getValue().toString());
				 String tablas="";
				 for (int i = 1; i <= 10; i++) {
			            tablas+=n+" x "+i+" = "+(n*i)+"\n";  
			        }
				 txtResultado.setText(tablas);
				 
			}
		});
		
		spnNumero.setBounds(108, 20, 109, 20);
		frmTablas.getContentPane().add(spnNumero);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(28, 90, 169, 260);
		frmTablas.getContentPane().add(txtResultado);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtResultado.setText("");
			}
		});
		btnBorrar.setBounds(60, 48, 89, 23);
		frmTablas.getContentPane().add(btnBorrar);
	}
}
