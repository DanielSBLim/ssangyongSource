package classes;

import java.awt.Button;
import java.awt.Frame;


public class BorderLayoutEx01 {

	Button btn01 = new Button("Button01"); 
	Button btn02 = new Button("Button02"); 
	
	Frame objFrm = new Frame();
	public static void main(String[] args) {
		BorderLayoutEx01 obj = new BorderLayoutEx01();
		obj.objFrm.setVisible(true);
		obj.objFrm.setSize(500, 500);
		
		obj.objFrm.add(obj.btn01);
		obj.objFrm.add(obj.btn02);
		
	}
}
