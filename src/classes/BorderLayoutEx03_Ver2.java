package classes;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;


public class BorderLayoutEx03_Ver2 {

	Button btnEast = new Button("East"); 
	Button btnSouth = new Button("South"); 
	Button btnWest = new Button("West"); 
	Button btnNorth = new Button("North"); 
	Button btnCenter = new Button("Center"); 
	Frame objFrm = new Frame();
	
	static final int PositionEast 	= 0;
	static final int PositionWest 	= 1;
	static final int PositionNorth	= 2;
	static final int PositionSouth	= 3;
	static final int PositionCenter = 4;
	
	String[] sArrayPosition = {BorderLayout.EAST, 
			BorderLayout.WEST,
			BorderLayout.NORTH,
			BorderLayout.SOUTH,
			BorderLayout.CENTER };
	
	public static void main(String[] args) {	
		BorderLayoutEx02 obj = new BorderLayoutEx02();
		obj.objFrm.setVisible(true);
		obj.objFrm.setSize(500, 500);
		
		obj.objFrm.add(obj.btnEast, 
				obj.sArrayPosition[PositionEast]);
		obj.objFrm.add(obj.btnSouth,
				obj.sArrayPosition[PositionSouth]);
		obj.objFrm.add(obj.btnWest,
				obj.sArrayPosition[PositionWest]);
		obj.objFrm.add(obj.btnNorth,
				obj.sArrayPosition[PositionNorth]);
		obj.objFrm.add(obj.btnCenter,
				obj.sArrayPosition[PositionCenter]);
		
	}
}
