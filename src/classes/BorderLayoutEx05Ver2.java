package classes;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;

public class BorderLayoutEx05Ver2 {
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

		
		Button[] btn = new Button[sArrayPosition.length];
		for (int i = 0; i < sArrayPosition.length; i++) {
			btn[i] = new Button(bntList.get(i).getMsg());
			objFrm.add(btn[i], bntList.get(i).getPosition());
			btn[i].setBackground(bntList.get(i).getColor());
		}
	}
}
