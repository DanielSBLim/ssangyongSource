package classes;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class CardLayoutEx02 extends Frame implements WindowListener{

	CardLayout card = new CardLayout();
	Color[] color = { Color.red, Color.orange, Color.yellow, Color.green, Color.blue };
	JPanel[] pnl = new JPanel[color.length];
	String[] cardName = {"cRed", "cOrange", "cYellow", "cGreen", "cBlue"};
	JTabbedPane jtp = new JTabbedPane();

	public static void main(String[] args) {
		CardLayoutEx02 obj = new CardLayoutEx02();
		obj.setLayout(obj.card);
		
		for (int i = 0; i < obj.pnl.length; i++) {
			obj.pnl[i] = new JPanel();
			obj.pnl[i].setBackground(obj.color[i]);
			obj.add(obj.cardName[i], obj.pnl[i]);
			obj.pnl[i].addMouseListener(new MouseAdapter() {
				
				@Override
				 public void mouseClicked(MouseEvent e) {
					obj.card.show(obj, "cBlue");
				 }
			});
			
		}
		obj.setSize(500,500);
		obj.setVisible(true);
		obj.addWindowListener(obj);

	}

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
