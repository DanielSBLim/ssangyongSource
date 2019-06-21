package classes;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseMotionListenerEx01 extends WindowAdapter implements MouseListener, MouseMotionListener {
	Color white = new Color(255, 255, 255);
	Color blue = new Color(0, 0, 255);
	Color green = new Color(0, 255, 0);
	Color red = new Color(255, 0, 0);
	Color black = new Color(0, 0, 0);
	static int getMouseX, getMouseY;
	static Frame objFrame = new Frame();

	public static void main(String[] args) {
		MouseMotionListenerEx01 obj = new MouseMotionListenerEx01();
		objFrame.setVisible(true);
		objFrame.setSize(500, 500);
		objFrame.addMouseListener(obj);
		objFrame.setTitle("메인메소드확인");
		
		objFrame.addMouseMotionListener(obj);
		// 기입내역
		objFrame.addWindowListener(obj);

	}

	/*
	 * MouseListener abstract Method list
	 */

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		objFrame.setTitle("누를때"); // 누를때
		objFrame.setBackground(red);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		objFrame.setTitle("땟을때"); // 땟을때
		objFrame.setBackground(blue);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		objFrame.setTitle("창 진입"); // 창 진입
		objFrame.setBackground(green);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		objFrame.setTitle("창 아웃"); // 창 아웃
		objFrame.setBackground(white);

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
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		objFrame.setTitle("mouseMoved 확인");
	}



}
