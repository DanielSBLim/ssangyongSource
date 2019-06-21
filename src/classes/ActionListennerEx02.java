package classes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListennerEx02 implements ActionListener {
	Frame frm		= new Frame();
	Button btn01	= new Button("Event Check");

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼클릭");
	}

	
	public static void main(String[] args) {
		ActionListennerEx02 obj = new ActionListennerEx02();
		obj.frm.add(obj.btn01);
		
		obj.btn01.addActionListener(obj);
		
		obj.frameIntro(obj.frm);
	}
	
	
	public void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(300, 300);
	}

}
