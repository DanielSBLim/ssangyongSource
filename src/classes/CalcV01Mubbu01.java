package classes;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CalcV01Mubbu01 extends WindowAdapter implements WindowListener {

	public static void main(String[] args) {
		final int GRIDMAX = 5;
		final int GRIDMIN = 0;
		final int FRIST = 0;
		final int TOTALPANEL = GRIDMAX + GRIDMIN;

		Frame objFrame = new Frame();
		objFrame.setLayout(new GridLayout(GRIDMAX, GRIDMIN));
		Panel[] panelArrayCal = new Panel[GRIDMAX];



		final int IMNUMBER = 4;
		final int INNUMBER = 4;

		String[][] sDoubleArrayButtonName = { { "7", "8", "9", "+" }, { "4", "5", "6", "-" }, { "1", "2", "3", "X" },
				{ "c", "0", "del", "=" } };
		Color[][] sDoubleArrayColor = { { Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.orange },
				{ Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.orange },
				{ Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.orange },
				{ Color.orange, Color.YELLOW, Color.orange, Color.orange } };

		Button[][] btn = new Button[IMNUMBER][INNUMBER];
		panelArrayCal[0] = new Panel();
		objFrame.add(panelArrayCal[0]);

		/*
		 * panelArryCal[0] 은 안쓰기에 1 부터 작업한다.
		 */
		
		for (int iPanelCount = FRIST; iPanelCount < GRIDMAX - 1; iPanelCount++) {
			
			panelArrayCal[iPanelCount + 1] = new Panel(new GridLayout(0,INNUMBER));
			
			for (int iButtonCount = FRIST; iButtonCount < IMNUMBER; iButtonCount++) {
				
				btn[iPanelCount][iButtonCount] = new Button(sDoubleArrayButtonName[iPanelCount][iButtonCount]);
				btn[iPanelCount][iButtonCount].setBackground(sDoubleArrayColor[iPanelCount][iButtonCount]);
				btn[iPanelCount][iButtonCount].setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
				panelArrayCal[iPanelCount + 1].add(btn[iPanelCount][iButtonCount]);
			}
			objFrame.add(panelArrayCal[iPanelCount+1]);
		}

		frameIntro(objFrame);
		shutdown(objFrame);
	}

	public static void frameIntro(Frame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(500, 500);
	}

	public static void shutdown(Frame getFrame) {
		getFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}

		});

	}

}
