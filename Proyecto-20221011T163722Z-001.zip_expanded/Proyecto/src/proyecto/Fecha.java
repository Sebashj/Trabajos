package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Fecha {

	private JFrame frame;
	private final JLabel lblNewLabel_2 = new JLabel("Fecha");
	private JComboBox cboDia;
	private JComboBox cboMes;
	private JLabel lblResultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fecha window = new Fecha();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Fecha() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 235, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cboDia = new JComboBox();
		cboDia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblResultado.setText(" "+cboDia.getSelectedItem().toString());
			}
		});
		cboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cboDia.setBounds(149, 11, 58, 22);
		frame.getContentPane().add(cboDia);
		
		cboMes = new JComboBox();
		cboMes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblResultado.setText(cboDia.getSelectedItem().toString()+" de "+cboMes.getSelectedItem().toString());
			}
		});
		cboMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "junio", "julio", "Agosto", "septiembre", "Octubre", "Noviempre", "Dicienmbre"}));
		cboMes.setBounds(105, 48, 102, 22);
		frame.getContentPane().add(cboMes);
		
		JLabel lblNewLabel = new JLabel("Dia");
		lblNewLabel.setBounds(22, 15, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mes");
		lblNewLabel_1.setBounds(22, 52, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setBounds(10, 81, 98, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(20, 123, 169, 31);
		frame.getContentPane().add(lblResultado);
	}
}
