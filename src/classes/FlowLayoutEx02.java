package classes;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowLayoutEx02 extends WindowAdapter implements WindowListener {
	static Frame objFrame = new Frame();
	static String[] msg = { "EAST", "WEST", "NORTH", "SOUTH", "CENTER" };
	static Color[] colorArray = { Color.blue, Color.GREEN, Color.RED, Color.gray, Color.ORANGE };

	public static void main(String[] args) {
		FlowLayoutEx01 obj = new FlowLayoutEx01();

		// 레이아웃을 변경하기 위한 메소드.(setLayout)
		objFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		objFrame.setVisible(true);
		objFrame.setSize(500, 500);

		Button[] btn = new Button[msg.length];
		for (int i = 0; i < msg.length; i++) {
			btn[i] = new Button(msg[i]);
			objFrame.add(btn[i]);
			btn[i].setBackground(colorArray[i]);
		}
		objFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}

		});
	}

}
