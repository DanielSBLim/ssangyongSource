package classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JComboBoxEx01 extends JFrame implements ItemListener{
	JPanel pnlN = new JPanel(new FlowLayout());
	JComboBox<String> cmbBox = new JComboBox<String>(); 
	
	String[] msg = { "ASP", "PHP", "JSP", "SERVLET"};
	JCheckBox[] chkBox = new JCheckBox[msg.length];
	JTextField tf = new JTextField("입력값");
	
	public static void main(String[] args) {
		JComboBoxEx01 obj = new JComboBoxEx01();
		
		
		
		for(int i = 0; i < obj.msg.length; i++) {
			obj.cmbBox.addItem(obj.msg[i]);
		}
		
		obj.cmbBox.addItemListener(obj);
		obj.tf.setPreferredSize(new Dimension(100, 40));

		obj.pnlN.add(obj.cmbBox);
		obj.pnlN.add(obj.tf);
		
		
		obj.add(obj.pnlN, BorderLayout.NORTH);

		obj.setSize(600, 500);
		obj.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		tf.setText("입력");
		tf.setText((String)e.getItem());

	}
}
