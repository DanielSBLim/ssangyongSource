package MemInsMunni;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneEx01 extends JFrame {

	public static void main(String[] args) {
		JTabbedPaneEx01 obj = new JTabbedPaneEx01();
		obj.mInt();
	}

	private void mInt() {
		 JTabbedPane jtp =new JTabbedPane();
		 
		 jtp.add("Red" ,new CRed());
		 jtp.add("Orange" ,new COrange());
		 jtp.add("Yellow" ,new CYellow());
		 jtp.add("CGreen" ,new CGreen());
		 jtp.add("CBlue" ,new CBlue());
		 
		 add(jtp);
		 setSize(500, 500);
		 setVisible(true);
		 
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
