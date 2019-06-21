package classes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JCheckBoxEx01_3 extends JFrame implements ItemListener{
	JPanel pnlN = new JPanel(new FlowLayout());
	JPanel pnlS = new JPanel(new FlowLayout());

	String[] msg = { "ASP", "PHP", "JSP", "SERVLET"};
	JCheckBox[] chkBox = new JCheckBox[msg.length];
	JTextField tf = new JTextField("입력값");
	JRadioButton rdobtn = new JRadioButton();
	
	public static void main(String[] args) {
		JCheckBoxEx01_3 obj = new JCheckBoxEx01_3();
		
		
		
		for(int i = 0; i < obj.msg.length; i++) {
			obj.chkBox[i] = new JCheckBox(obj.msg[i]);
			obj.chkBox[i].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
			obj.chkBox[i].addItemListener(obj);
			obj.pnlN.add(obj.chkBox[i]);
		}
		obj.tf.setPreferredSize(new Dimension(100, 40));
		obj.pnlN.add(obj.tf);
		
		obj.add(obj.pnlN, BorderLayout.NORTH);

		obj.setSize(600, 500);
		obj.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		tf.setText(" ");
		
		tf.setText(((JCheckBox)e.getItem()).getText());
	}
}
