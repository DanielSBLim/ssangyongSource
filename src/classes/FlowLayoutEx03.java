package classes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowLayoutEx03 extends WindowAdapter implements WindowListener {
	static Frame objFrame = new Frame();
	static String[] msg = { "RED", "ORANGE", "YELLOW", "GREEN", "BLUE" };
	static Color[] colorArray = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };
	static Panel panel1, panel2;
	
	
	public static void main(String[] args) {
		FlowLayoutEx03 obj = new FlowLayoutEx03();

		objFrame.setVisible(true);
		objFrame.setSize(300, 200);

		panel1 = new Panel();
		Button[] btn = new Button[msg.length];
		for (int i = 0; i < msg.length; i++) {
			btn[i] = new Button(msg[i]);
			panel1.add(btn[i]);
			btn[i].setBackground(colorArray[i]);
		}
		
		
		panel2 = new Panel();
		Button[] btn2 = new Button[msg.length];
		for (int i = 0; i < msg.length; i++) {
			btn2[i] = new Button(msg[i]);
			panel2.add(btn2[i]);
			btn2[i].setBackground(colorArray[i]);
		}

		objFrame.add(panel1,BorderLayout.NORTH);
		objFrame.add(panel2,BorderLayout.SOUTH);

		
		
		objFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}

		});
	}

}
