package classes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListennerEx01 implements ActionListener {
	Frame frm		= new Frame();
	Button btn01	= new Button("Event Check");

	@Override
	public void actionPerformed(ActionEvent e) {}

	
	public static void main(String[] args) {
		ActionListennerEx01 obj = new ActionListennerEx01();
		obj.frm.add(obj.btn01);
		
		obj.frameIntro(obj.frm);
	}
	
	
	public void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(300, 300);
	}

}
