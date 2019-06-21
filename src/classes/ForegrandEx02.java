package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ForegrandEx02 {
	static String[] msg = { "./imgJava01/감.jpg", "./imgJava01/바나나.jpg", "./imgJava01/배.jpg", "./imgJava01/사과.jpg",
			"./imgJava01/포도.jpg" };
	static final int iLength = msg.length;

	static JButton[] btn = new JButton[iLength];
	static Color[] colorArray = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };

	public static void main(String[] args) {
		ForegrandEx02 obj = new ForegrandEx02();
		JFrame objFrame = new JFrame();
		JPanel panel1 = new JPanel(new GridLayout(1, 5));
		bntArrySetting(panel1, btn, colorArray, msg, obj);
		frameborderLayoutSectionAdd(objFrame, panel1, BorderLayout.CENTER);
		frameIntro(objFrame);
	}

	public static void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(700, 500);
	}

	public static void bntArrySetting(JPanel panel1, JButton[] btn, Color[] colorArray, String[] getMsg,
			ForegrandEx02 obj) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;

		for (int iCount = iFirst; iCount < iMsgLenght; iCount++) {
			btn[iCount] = new JButton(new ImageIcon(msg[iCount]));
			panel1.add(btn[iCount]);
		}
	}

	public static void frameborderLayoutSectionAdd(JFrame getFrame, JPanel getPanel, String getSection) {
		getFrame.add(getPanel, getSection);
	}

}
