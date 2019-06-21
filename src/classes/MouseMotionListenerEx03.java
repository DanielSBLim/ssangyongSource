package classes;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MouseMotionListenerEx03 extends WindowAdapter implements MouseMotionListener, WindowListener {
	static int getMouseMotionX, getMouseMotionY;
	static String mouseFollow = "마우스를 따라다녀요";
	Frame objFrame = new Frame() {
		@Override
		public void paint(Graphics g) {
			g.drawString(mouseFollow, getMouseMotionX, getMouseMotionY);
		}
	};
	
	public static void main(String[] args) {
		MouseMotionListenerEx03 obj = new MouseMotionListenerEx03();
		obj.objFrame.setVisible(true);
		obj.objFrame.setSize(500, 500);
		obj.objFrame.setTitle("메인메소드확인");
		obj.objFrame.addMouseMotionListener(obj);
		obj.objFrame.addWindowListener(obj);
	
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
		objFrame.setTitle("X좌표 : " + getMouseMotionX + " Y좌표 : " + getMouseMotionY);
		/*
		 * repaint()는 컴포너트에 있으며, 해당 메서드를 실행을 하면.
		 * Paint메서드가 callbeck 실행된다.
		 */
		objFrame.repaint();
	}

}
