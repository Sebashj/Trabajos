package proyecto;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
public class Calculadora {
	public  JFrame frmCalculadora;	
	private JButton btnSumar;
	private JButton btnResta;
	private JButton btnMulti;
	private JButton btnDivicion;
	private JButton btnRes;
	private JButton btnNBorrar;
	private JLabel lblSuma;
	private JLabel lblResta;
	private JLabel lblDivicion;
	private JLabel lblRes;
	private JLabel lblMulti;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Calculadora() {
		initialize();
	}
	public void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setBackground(new Color(240, 240, 240));
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/f.JPG")));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(200, 200, 450, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		btnSumar = new JButton("Suma");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int a =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 1;"));
			        int b =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 2;"));
			        int suma=a+b;
			        JOptionPane.showMessageDialog(null, "La suma: "+suma);
			        lblSuma.setText("La suma es: "+suma);
			}
		});
		btnSumar.setBounds(44, 26, 121, 23);
		frmCalculadora.getContentPane().add(btnSumar);
		
		btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // resta
		        int a =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 1;"));
		        int b =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 2;"));
		        int resta=a-b;
		        JOptionPane.showMessageDialog(null, "La suma: "+resta);		       
		        lblResta.setText("La resta es: "+resta);
			}
		});
		btnResta.setBounds(44, 65, 121, 23);
		frmCalculadora.getContentPane().add(btnResta);
		
		btnMulti = new JButton("Multiplicacion");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//multiplicacion
		        int a =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 1;"));
		        int b =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 2;"));
		        int multi=a*b;
		        JOptionPane.showMessageDialog(null, "La suma: "+multi);
		        lblMulti.setText("La multiplicaci??n es: "+multi);
			}
		});
		btnMulti.setBounds(44, 99, 121, 23);
		frmCalculadora.getContentPane().add(btnMulti);
		
		btnDivicion = new JButton("Divicion");
		btnDivicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // divisi??n
		         int a =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 1;"));
		        int b =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 2;"));
		        int d=a/b;
		        JOptionPane.showMessageDialog(null, "La suma: "+d);
		        lblDivicion.setText("La divisi??n es: "+d);	
			}
		});
		btnDivicion.setBounds(44, 133, 121, 23);
		frmCalculadora.getContentPane().add(btnDivicion);
		
		btnRes = new JButton("Residuo");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// residuo
		         int a =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 1;"));
		        int b =Integer.parseInt(JOptionPane.showInputDialog("introduce Numero 2;"));
		        int r=a%b;
		        JOptionPane.showMessageDialog(null, "La suma: "+r);
		        lblRes.setText("La residuo es: "+r);
			}
		});
		btnRes.setBounds(44, 167, 121, 23);
		frmCalculadora.getContentPane().add(btnRes);
		
		btnNBorrar = new JButton("Borrar");
		btnNBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 lblRes.setText("");
				 lblDivicion.setText("");
				 lblMulti.setText("");
				 lblResta.setText("");
				 lblSuma.setText("");
			}
		});
		btnNBorrar.setBounds(163, 214, 89, 23);
		frmCalculadora.getContentPane().add(btnNBorrar);
		
		lblSuma = new JLabel("");
		lblSuma.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSuma.setBounds(190, 30, 130, 19);
		frmCalculadora.getContentPane().add(lblSuma);
		
		lblResta = new JLabel("");
		lblResta.setHorizontalAlignment(SwingConstants.TRAILING);
		lblResta.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResta.setBounds(190, 69, 130, 19);
		frmCalculadora.getContentPane().add(lblResta);
		
		lblMulti = new JLabel("");
		lblMulti.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMulti.setBounds(190, 103, 130, 19);
		frmCalculadora.getContentPane().add(lblMulti);
		
		lblDivicion = new JLabel("");
		lblDivicion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDivicion.setBounds(190, 137, 130, 19);
		frmCalculadora.getContentPane().add(lblDivicion);
		
		lblRes = new JLabel("");
		lblRes.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblRes.setBounds(190, 171, 130, 19);
		frmCalculadora.getContentPane().add(lblRes);
	}
}
