package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IconEx03Su implements ActionListener {
	static String[] msgImg = { "./imgJava01/감.jpg", "./imgJava01/바나나.jpg", "./imgJava01/배.jpg", "./imgJava01/사과.jpg",
			"./imgJava01/포도.jpg" };
	static String[] msgTxt = { "감", "바나나", "배", "사과", "포도" };
	static final int iLength = msgImg.length;

	static JButton[] btn = new JButton[iLength];
	static JLabel addLabel = new JLabel();
	static JPanel blankPanel = new JPanel();

	public static void main(String[] args) {
		IconEx03Su obj = new IconEx03Su();
		JFrame objFrame = new JFrame();
		JPanel panel1 = new JPanel(new GridLayout(2, 3));
		bntArrySetting(panel1, btn, msgImg, obj);

		panel1.add(addLabel);

		frameborderLayoutSectionAdd(objFrame, panel1, BorderLayout.CENTER);
		frameIntro(objFrame);
	}

	public static void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(700, 500);
	}

	public static void bntArrySetting(JPanel panel1, JButton[] btn, String[] getMsg, IconEx03Su obj) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;

		for (int iCount = iFirst; iCount < iMsgLenght; iCount++) {
			btn[iCount] = new JButton(new ImageIcon(msgImg[iCount]));
			btn[iCount].setBackground(Color.white);
			btn[iCount].addActionListener(obj);
			panel1.add(btn[iCount]);
		}
	}

	public static void frameborderLayoutSectionAdd(JFrame getFrame, JPanel getPanel, String getSection) {
		getFrame.add(getPanel, getSection);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		addLabel.setText(e.getActionCommand());
//		if (e.getActionCommand().equals("감")) {
//			addLabel.setIcon(new ImageIcon(msgImg[0]));
//
//		} else if (e.getActionCommand().equals("바나나")) {
//			addLabel.setIcon(new ImageIcon(msgImg[1]));
//
//		} else if (e.getActionCommand().equals("배")) {
//
//			addLabel.setIcon(new ImageIcon(msgImg[2]));
//		} else if (e.getActionCommand().equals("사과")) {
//
//			addLabel.setIcon(new ImageIcon(msgImg[3]));
//		} else if (e.getActionCommand().equals("포도")) {
//
//			addLabel.setIcon(new ImageIcon(msgImg[4]));
//		}
		for(int i = 0; i < msgTxt.length; i++) {
			if(btn[i].equals(e.getSource())) {
				addLabel.setIcon(new ImageIcon(msgImg[i]));
				addLabel.setText(msgTxt[i]);
			}
		}
		

	}

}
