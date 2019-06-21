package classes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class PanelEx01 extends WindowAdapter implements WindowListener {

	public static void main(String[] args) {
		String[] msg = { "RED", "ORANGE", "YELLOW", "GREEN", "BLUE" };
		final int iLength = msg.length;
		
		Color[] colorArray = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };

		Button[] btn = new Button[iLength];
		
		Frame objFrame = new Frame();
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		
		bntArrySetting(panel1, btn, colorArray, msg);
		bntArrySetting(panel2, btn, colorArray, msg);
		frameborderLayoutSectionAdd(objFrame, panel1, BorderLayout.NORTH);
		frameborderLayoutSectionAdd(objFrame, panel2, BorderLayout.SOUTH);
		frameIntro(objFrame);
		shutdown(objFrame);
	}
	
	public static void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(700, 500);
	}

	public static void bntArrySetting(Panel panel1, Button[] btn, Color[] colorArray, String[] getMsg) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;
		
		for (int iCount = iFirst; iCount < iMsgLenght; iCount++) {
			btn[iCount] = new Button(getMsg[iCount]);
			panel1.add(btn[iCount]);
			btn[iCount].setFont(new Font(Font.SERIF, Font.BOLD, 30));
			btn[iCount].setBackground(colorArray[iCount]);
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