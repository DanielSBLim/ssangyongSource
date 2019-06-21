package classes;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;


public  class WinClose01 extends Frame implements MouseListener, WindowListener{
	Color white = new Color(255,255,255);
	Color blue = new Color(0,0,255);
	Color green =  new Color(0,255,0);
	Color red = new Color(255,0,0);
	Color black = new Color(0,0,0);
	static WinClose01 obj = new WinClose01();
	
	
	public  static void main(String[] args) {
		obj.setVisible(true);
		obj.setSize(500, 500);
		obj.addMouseListener(obj);
		obj.setTitle("메인메소드확인");
		
		//기입내역
		obj.addWindowListener(obj);
		
	}
	
	/*
	 * MouseListener abstract  Method list  
	 */

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		setTitle("누를때"); //누를때
		setBackground(obj.red);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		setTitle("땟을때"); //땟을때
		setBackground(blue);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		setTitle("창 진입"); //창 진입
		setBackground(green);
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setTitle("창 아웃"); //창 아웃
		setBackground(white);
		
	}
	
	/*
	 * WindowListener abstract  Method list  
	 */

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
