
package proyecto;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Signo {

private JFrame frmSignosZodiacales;
private JLabel lblResultado;
private JComboBox cboMes;
private JComboBox cboDia;
private JLabel lblFecha;
private JButton lblBorrar;

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Signo window = new Signo();
window.frmSignosZodiacales.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

public Signo() {
initialize();
}

public void calcularSigno() {
int dia = Integer.parseInt(cboDia.getSelectedItem().toString());
String mes = cboMes.getSelectedItem().toString();
lblFecha.setText(dia + " de " + mes);
Image a = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/A.JPG"));
Image ag = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/AG.JPG"));
Image c = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/C.JPG"));
Image ca = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/CA.JPG"));
Image g = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/G.JPG"));
Image l = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/L.JPG"));
Image li = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/LI.JPG"));
Image p = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/P.JPG"));
Image s = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/S.JPG"));
Image sg = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/SG.JPG"));
Image t = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/T.JPG"));
Image v = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Signos/V.JPG"));

int ancho = lblResultado.getWidth();
int alto = lblResultado.getHeight();
switch (mes) {
case "Enero":
if (dia <= 21) {
lblResultado.setIcon(new ImageIcon(a.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(ag.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "frebrero":
if (dia <= 19) {
lblResultado.setIcon(new ImageIcon(c.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(ca.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "marzo":
if (dia <= 21) {
lblResultado.setIcon(new ImageIcon(g.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(l.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "abril":
if (dia <= 21) {
lblResultado.setIcon(new ImageIcon(li.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(p.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "mayo":
if (dia <= 22) {
lblResultado.setIcon(new ImageIcon(s.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(sg.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "junio":
if (dia <= 22) {
lblResultado.setIcon(new ImageIcon(t.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(v.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "julio":
if (dia <= 22) {
lblResultado.setIcon(new ImageIcon(a.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(ag.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "agosto":
if (dia <= 23) {
lblResultado.setIcon(new ImageIcon(c.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(ca.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "septiembre":
if (dia <= 23) {
lblResultado.setIcon(new ImageIcon(c.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(g.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "octubre":
if (dia <= 23) {
lblResultado.setIcon(new ImageIcon(l.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(li.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "noviembre":
if (dia <= 23) {
lblResultado.setIcon(new ImageIcon(p.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(s.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
case "diciembre":
if (dia <= 21) {
lblResultado.setIcon(new ImageIcon(sg.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
} else {
lblResultado.setIcon(new ImageIcon(t.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
}
break;
}


}

private void initialize() {
frmSignosZodiacales = new JFrame();

frmSignosZodiacales.setTitle("SIGNOS ZODIACALES");
frmSignosZodiacales.setBounds(100, 100, 689, 606);
frmSignosZodiacales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmSignosZodiacales.getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("Dia");
lblNewLabel.setBounds(54, 29, 121, 41);
frmSignosZodiacales.getContentPane().add(lblNewLabel);

cboDia = new JComboBox();
cboDia.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
calcularSigno();
}
});
cboDia.setModel(new DefaultComboBoxModel(
new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
cboDia.setBounds(211, 38, 91, 22);
frmSignosZodiacales.getContentPane().add(cboDia);

JLabel lblMes = new JLabel("Mes");
lblMes.setBounds(54, 104, 121, 41);
frmSignosZodiacales.getContentPane().add(lblMes);

cboMes = new JComboBox();
cboMes.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
calcularSigno();
}
});
cboMes.setModel(new DefaultComboBoxModel(new String[] { "Enero ", "frebrero", "marzo", "abril", "mayo",
" junio", " julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", "" }));
cboMes.setBounds(211, 113, 91, 22);
frmSignosZodiacales.getContentPane().add(cboMes);

lblResultado = new JLabel("");
lblResultado.setIcon(new ImageIcon(Signo.class.getResource("/img/t.JPG")));
lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
lblResultado.setBounds(114, 191, 338, 257);
frmSignosZodiacales.getContentPane().add(lblResultado);
lblFecha = new JLabel("");
lblFecha.setBorder(new LineBorder(new Color(0, 0, 0)));
lblFecha.setBounds(319, 78, 204, 22);
frmSignosZodiacales.getContentPane().add(lblFecha);

lblBorrar = new JButton("Borrar");
lblBorrar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
lblFecha.setText("");
lblResultado.setIcon(new ImageIcon(Signo.class.getResource("/img/t.JPG")));
}
});
lblBorrar.setBounds(387, 136, 136, 23);
frmSignosZodiacales.getContentPane().add(lblBorrar);
}
}