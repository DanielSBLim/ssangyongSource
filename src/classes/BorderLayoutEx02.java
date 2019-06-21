package classes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;


public class BorderLayoutEx02 {

	Button btnEast = new Button("East"); 
	Button btnSouth = new Button("South"); 
	Button btnWest = new Button("West"); 
	Button btnNorth = new Button("North"); 
	Button btnCenter = new Button("Center"); 
	Frame objFrm = new Frame();
	
	String[] sArrayPosition = {BorderLayout.EAST, 
			BorderLayout.WEST,
			BorderLayout.NORTH,
			BorderLayout.SOUTH,
			BorderLayout.CENTER };
	public static void main(String[] args) {	
		BorderLayoutEx05Ver2 obj = new BorderLayoutEx05Ver2();
		obj.objFrm.setVisible(true);
		obj.objFrm.setSize(500, 500);
		
		obj.objFrm.add(obj.btnEast, obj.sArrayPosition[0]);
		obj.objFrm.add(obj.btnSouth, obj.sArrayPosition[3]);
		obj.objFrm.add(obj.btnWest, obj.sArrayPosition[1]);
		obj.objFrm.add(obj.btnNorth, obj.sArrayPosition[2]);
		obj.objFrm.add(obj.btnCenter, obj.sArrayPosition[4]);
		
	}
}
