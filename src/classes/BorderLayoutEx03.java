package classes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;


public class BorderLayoutEx03 {

	Button btnEast = new Button("East"); 
	Button btnSouth = new Button("South"); 
	Button btnWest = new Button("West"); 
	Button btnNorth = new Button("North"); 
	Button btnCenter = new Button("Center"); 
	Frame objFrm = new Frame();
	
	static final int East = 0;
	static final int West = 1;
	static final int North = 2;
	static final int South = 3;
	static final int Center = 4;
	
	String[] sArrayPosition = {BorderLayout.EAST, 
			BorderLayout.WEST,
			BorderLayout.NORTH,
			BorderLayout.SOUTH,
			BorderLayout.CENTER };
	public static void main(String[] args) {	
		BorderLayoutEx02 obj = new BorderLayoutEx02();
		obj.objFrm.setVisible(true);
		obj.objFrm.setSize(500, 500);
		
		obj.objFrm.add(obj.btnEast, obj.sArrayPosition[East]);
		obj.objFrm.add(obj.btnSouth, obj.sArrayPosition[South]);
		obj.objFrm.add(obj.btnWest, obj.sArrayPosition[West]);
		obj.objFrm.add(obj.btnNorth, obj.sArrayPosition[North]);
		obj.objFrm.add(obj.btnCenter, obj.sArrayPosition[Center]);
		
	}
}
