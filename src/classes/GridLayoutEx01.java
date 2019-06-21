package classes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GridLayoutEx01 extends WindowAdapter implements WindowListener {

	public static void main(String[] args) {
		String[] msg = { "RED", "ORANGE", "YELLOW", "GREEN", "BLUE" };
		final int iTotalLength = msg.length;

		Color[] colorArray = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };

		Button[] btn = new Button[iTotalLength];
		Button[] btn2 = new Button[iTotalLength];

		Frame objFrame = new Frame();

		Panel panel1 = new Panel();

		objFrame.setLayout(new GridLayout(3, 2));
		bntArrySettingFrameGrid(objFrame, btn, colorArray, msg);
		
		frameborderLayoutSectionAdd(objFrame, panel1, BorderLayout.NORTH);
		frameIntro(objFrame);
		shutdown(objFrame);
	}


	public static void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(629, 200);
	}

	public static void bntArrySettingNorth(Panel panel1, Button[] btn, Color[] colorArray, String[] getMsg) {
		final int iTotalLenght = getMsg.length;
		final int iFirst = 0;

		for (int iCount = iFirst; iCount < iTotalLenght; iCount++) {
			btn[iCount] = new Button(getMsg[iCount]);
			panel1.add(btn[iCount]);

			// 기입
			btn[iCount].setBackground(colorArray[iCount]);
		}
	}

	public static void bntArrySettingSouth(Panel panel1, Button[] btn, Color[] colorArray, String[] getMsg) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;

		for (int iCount = iFirst; iCount < iMsgLenght; iCount++) {
			btn[iCount] = new Button(getMsg[iCount]);
			panel1.add(btn[iCount]);

			// 기입
			btn[iCount].setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
			btn[iCount].setBackground(colorArray[iCount]);
		}
	}

	public static void bntArrySettingFrameGrid(Frame getFrame, Button[] btn, Color[] colorArray, String[] getMsg) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;

		for (int iMCount = iFirst; iMCount < iMsgLenght; iMCount++) {

			btn[iMCount] = new Button(getMsg[iMCount]);
			getFrame.add(btn[iMCount]);
			btn[iMCount].setBackground(colorArray[iMCount]);

		}
	}

	public static void frameborderLayoutSectionAdd(Frame getFrame, Panel getPanel, String getSection) {
		getFrame.add(getPanel, getSection);
	}

	// class에 extends WindowAdapter implements WindowListener가 필요
	public static void shutdown(Frame getFrame) {
		getFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}

		});

	}

}
