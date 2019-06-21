package MemInsMunni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

public class JTabbedPaneEx01 extends JFrame implements ItemListener {

	ButtonGroup btnGroup = new ButtonGroup();
	String[] msg = {"위쪽", "아래쪽", "왼쪽", "오른쪽"};
	JRadioButton[] location = new JRadioButton[msg.length];
	JPanel pnl = new JPanel();
	JTabbedPane jtp =new JTabbedPane();
	
	public static void main(String[] args) {
		JTabbedPaneEx01 obj = new JTabbedPaneEx01();
		for(int i = 0; i < obj.msg.length; i++) {
			obj.location[i] = new JRadioButton(obj.msg[i]);
			obj.btnGroup.add(obj.location[i]);
			obj.location[i].addItemListener(obj);
			obj.pnl.add(obj.location[i]);
		}
		obj.add(obj.pnl, BorderLayout.NORTH);
		obj.mInt();
		

	}

	private void mInt() {
		
		 jtp.add("Red" ,new CRed());
		 jtp.add("Orange" ,new COrange());
		 jtp.add("Yellow" ,new CYellow());
		 jtp.add("CGreen" ,new CGreen());
		 jtp.add("CBlue" ,new CBlue());
		 
		 add(jtp, BorderLayout.CENTER);
		 setSize(500, 500);
		 setVisible(true);
		 
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		System.out.println(((JRadioButton)e.getItem()).getText());
		
		if(((JRadioButton)e.getItem()).getText().equals("위쪽")) {
			jtp.setTabPlacement(JTabbedPane.TOP);
		} else if(((JRadioButton)e.getItem()).getText().equals("아래쪽")) {
			jtp.setTabPlacement(JTabbedPane.BOTTOM);	
		} else if(((JRadioButton)e.getItem()).getText().equals("오른쪽")){
			jtp.setTabPlacement(JTabbedPane.RIGHT);	
		} else if(((JRadioButton)e.getItem()).getText().equals("왼쪽")) {
			jtp.setTabPlacement(JTabbedPane.LEFT);	
		}
		
	}
}

///----------------------------------------------------------
class CRed extends JPanel {

	public CRed() {
		setBackground(Color.RED);
	}
}

///----------------------------------------------------------
class COrange extends JPanel {

	public COrange() {
		setBackground(Color.ORANGE);
	}
}

///----------------------------------------------------------
class CYellow extends JPanel {

	public CYellow() {
		setBackground(Color.YELLOW);
	}
}
///----------------------------------------------------------

class CGreen extends JPanel {

	public CGreen() {
		setBackground(Color.GREEN);
	}
}

///----------------------------------------------------------
class CBlue extends JPanel {

	public CBlue() {
		setBackground(Color.BLUE);
	}
}
///----------------------------------------------------------
