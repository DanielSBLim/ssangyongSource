package classes;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseMotionListenerEx02 extends WindowAdapter implements MouseMotionListener {
	static int getMouseMotionX, getMouseMotionY;
	static Frame objFrame = new Frame() {
		
	};

	public static void main(String[] args) {
		MouseMotionListenerEx02 obj = new MouseMotionListenerEx02();
		objFrame.setVisible(true);
		objFrame.setSize(500, 500);
		objFrame.setTitle("메인메소드확인");
		objFrame.addMouseMotionListener(obj);
		objFrame.addWindowListener(obj);
	}

	/*
	 * WindowListener abstract Method list
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	/*
	 * MouseMotionListener abstract Method list
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		objFrame.setTitle("mouseDragged 확인");
		getMouseMotionX = e.getX();
		getMouseMotionY = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		getMouseMotionX = e.getX();
		getMouseMotionY = e.getY();
		objFrame.setTitle("X좌표 : " + getMouseMotionX + " Y좌표 : " + getMouseMotionY);;
	}
}
