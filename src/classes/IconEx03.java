package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IconEx03 {
	static String[] msg = { "./imgJava01/감.jpg", "./imgJava01/바나나.jpg", "./imgJava01/배.jpg", "./imgJava01/사과.jpg",
			"./imgJava01/포도.jpg" };
	static final int iLength = msg.length;

	static JLabel[] btn = new JLabel[iLength];
	static JLabel addLabel = new JLabel("과일들", JLabel.CENTER);
	static Color[] colorArray = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };

	public static void main(String[] args) {
		IconEx03 obj = new IconEx03();
		JFrame objFrame = new JFrame();
		JPanel panel1 = new JPanel(new GridLayout(2, 3));
		bntArrySetting(panel1, btn, colorArray, msg, obj);
		
		addLabel.setText("과일이름");
		addLabel.setIcon(new ImageIcon(msg[2]));
		
		panel1.add(addLabel);
		
		frameborderLayoutSectionAdd(objFrame, panel1, BorderLayout.CENTER);
		frameIntro(objFrame);
	}

	public static void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(700, 500);
	}

	public static void bntArrySetting(JPanel panel1, JLabel[] btn, Color[] colorArray, String[] getMsg,
			IconEx03 obj) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;

		for (int iCount = iFirst; iCount < iMsgLenght; iCount++) {
			btn[iCount] = new JLabel(new ImageIcon(msg[iCount]));
			panel1.add(btn[iCount]);
		}
	}

	public static void frameborderLayoutSectionAdd(JFrame getFrame, JPanel getPanel, String getSection) {
		getFrame.add(getPanel, getSection);
	}

}
