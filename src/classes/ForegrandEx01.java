package classes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ForegrandEx01 extends WindowAdapter implements WindowListener, ActionListener {
	static String[] msg = { "RED", "ORANGE", "YELLOW", "GREEN", "BLUE" };
	static final int iLength = msg.length;

	static Button[] btn = new Button[iLength];
	static Button[] btn2 = new Button[iLength];
	static Label label = new Label("NiceDay", Label.CENTER);
	static Color[] colorArray = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };
	static Color[] colorArraycomplementary = { Color.GREEN, Color.BLUE, Color.PINK, Color.red, Color.orange };

	public static void main(String[] args) {
		ForegrandEx01 obj = new ForegrandEx01();

		Frame objFrame = new Frame();

		Panel panel1 = new Panel();
		Panel panel2 = new Panel();

		bntArrySetting(panel1, btn, colorArray, msg, obj);
		bntArrySetting2(panel2, btn2, colorArray, colorArraycomplementary, msg, obj);
		frameborderLayoutSectionAdd(objFrame, panel1, BorderLayout.NORTH);
		frameborderLayoutSectionAdd(objFrame, panel2, BorderLayout.SOUTH);

		// ---------------- 1번째
//		Panel flowPanel = new Panel(new FlowLayout());
//		objFrame.add(flowPanel, BorderLayout.CENTER);
//		flowPanel.add(label);
//		label.setBackground(Color.black);
//		label.setForeground(Color.white);
//		label.setFont(new Font("굵림", Font.BOLD, 50));
//		

		// --------------- 2번째
		objFrame.add(label, BorderLayout.CENTER);
		label.setBackground(Color.black);
		label.setForeground(Color.white);
		label.setFont(new Font("굵림", Font.BOLD, 50));

		// ---------------
		frameIntro(objFrame);
		shutdown(objFrame);
	}

	public static void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(700, 500);
	}

	public static void bntArrySetting(Panel panel1, Button[] btn, Color[] colorArray, String[] getMsg,
			ForegrandEx01 obj) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;

		for (int iCount = iFirst; iCount < iMsgLenght; iCount++) {
			btn[iCount] = new Button(getMsg[iCount]);
			panel1.add(btn[iCount]);
			btn[iCount].setFont(new Font(Font.SERIF, Font.BOLD, 30));
			btn[iCount].setBackground(colorArray[iCount]);
			btn[iCount].setForeground(colorArray[(iMsgLenght - 1) - iCount]);
			btn[iCount].addActionListener(obj);
		}
	}

	public static void bntArrySetting2(Panel panel1, Button[] btn, Color[] colorArray, Color[] colorArray2,
			String[] getMsg, ForegrandEx01 obj) {
		final int iMsgLenght = getMsg.length;
		final int iFirst = 0;

		for (int iCount = iFirst; iCount < iMsgLenght; iCount++) {
			btn[iCount] = new Button(getMsg[iCount]);
			panel1.add(btn[iCount]);
			btn[iCount].setFont(new Font(Font.SERIF, Font.BOLD, 30));
			btn[iCount].setBackground(colorArray[iCount]);
			btn[iCount].setForeground(colorArray2[iCount]);
			btn[iCount].addActionListener(obj);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource());

		for (int i = 0; i < btn.length; i++) {
			if (e.getSource().equals(btn[i])) {
				label.setBackground(colorArray[i]);
			}
		}

		for (int i = 0; i < btn.length; i++) {
			if (e.getSource().equals(btn2[i])) {
				label.setBackground(colorArray[i]);
			}

		}
		
	}

}
