package classes;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class BorderLayoutEx06 extends WindowAdapter implements WindowListener {
	static Frame objFrm = new Frame();

	static String[] msg = { "EAST", "WEST", "NORTH", "SOUTH", "CENTER" };
	static String[] sArrayPosition = { "East", "West", "North", "South", "Center" };
	static Color[] colorArray = { Color.blue, Color.GREEN, Color.RED, Color.gray, Color.ORANGE };

	public static void main(String[] args) {
		
		//어레이 리스트로 작성해서 하나 생성할때마다 버튼 생성출력 동시에
		ArrayList<ButtonInformation> bntList = new ArrayList<>();
		for (int i = 0; i < sArrayPosition.length; i++) {
			bntList.add(new ButtonInformation(msg[i], sArrayPosition[i], colorArray[i]));
		}
		objFrm.setVisible(true);
		objFrm.setSize(500, 500);
		
		objFrm.addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		});
	}

}
