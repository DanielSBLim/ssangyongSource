package classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcV01Munni01Step07 extends WindowAdapter implements WindowListener, ActionListener {

	static JTextField calText;
	static JTextField calText2;
	static JTextArea calTextRead;
	static JFrame objFrame;
	static JPanel[] panelArrayCal;
	static String viualresult = "";
	static String result = "";
	static int temp;
	static int temp2;
	static int resultFlag = 0; // empty + - * /

	static String[][] sDoubleArrayButtonName = { { "7", "8", "9", "+" }, { "4", "5", "6", "-" }, { "1", "2", "3", "X" },
			{ "c", "0", "del", "=" } };
	static Color[][] sDoubleArrayColor = { { Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.orange },
			{ Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.orange },
			{ Color.YELLOW, Color.YELLOW, Color.YELLOW, Color.orange },
			{ Color.orange, Color.YELLOW, Color.orange, Color.orange } };

	public static void main(String[] args) {
		final int FRAME_GRID_MAX = 5;
		final int FRAME_GRID_MIN = 1;
		final int FRIST = 0;

		objFrame = new JFrame();
		objFrame.setLayout(new GridLayout(FRAME_GRID_MAX, FRAME_GRID_MIN));
		panelArrayCal = new JPanel[FRAME_GRID_MAX];

		CalcV01Munni01Step07 obj = new CalcV01Munni01Step07();

		final int I_M_NUMBER = 4;
		final int I_N_NUMBER = 4;

		JButton[][] btn = new JButton[I_M_NUMBER][I_N_NUMBER];

		panelArrayCal[0] = new JPanel(new GridLayout(1, 0));

		/*
		 * JTextField 내역
		 */
		calText = new JTextField("");

		calText.setHorizontalAlignment(SwingConstants.RIGHT);
		calText.setFont(new Font(Font.DIALOG, Font.BOLD, 50));

		panelArrayCal[0].add(calText);
		objFrame.add(panelArrayCal[0]);

		/*
		 * panelArryCal[0] 은 안쓰기에 1 부터 작업한다.
		 */

		for (int iPanelCount = FRIST; iPanelCount < FRAME_GRID_MAX - 1; iPanelCount++) {

			panelArrayCal[iPanelCount + 1] = new JPanel(new GridLayout(0, I_N_NUMBER));

			for (int iButtonCount = FRIST; iButtonCount < I_M_NUMBER; iButtonCount++) {

				// 버튼색 기입 버튼생성하기.
				btn[iPanelCount][iButtonCount] = new JButton(sDoubleArrayButtonName[iPanelCount][iButtonCount]);

				// 버튼색 기입.
				btn[iPanelCount][iButtonCount].setBackground(sDoubleArrayColor[iPanelCount][iButtonCount]);

				// 버튼 폰트 변경하기.
				btn[iPanelCount][iButtonCount].setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));

				// 버튼눌렀을때
				btn[iPanelCount][iButtonCount].addActionListener(obj);

				// 버튼를 패널에 기입하기.
				panelArrayCal[iPanelCount + 1].add(btn[iPanelCount][iButtonCount]);
			}
			objFrame.add(panelArrayCal[iPanelCount + 1]);
		}

		frameIntro(objFrame);
	}

	public static void frameIntro(JFrame getFrame) {
		getFrame.setVisible(true);
		getFrame.setSize(500, 500);
	}

//-------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		String Numbers = e.getActionCommand();
		calc(Numbers);
		System.out.println(e.getActionCommand());
	}

	public static void calc(String getNumber) {
		if (getNumber.equals("+")) {
			temp = Integer.parseInt(result);
			result = "";
			resultFlag = 1;
			calText.setText("");
		} else if (getNumber.equals("X")) {
			temp = Integer.parseInt(result);
			result = "";
			resultFlag = 3;
			calText.setText("");
		} else if (getNumber.equals("-")) {
			temp = Integer.parseInt(result);
			result = "";
			resultFlag = 2;
			calText.setText(result);
		} else if (getNumber.equals("=")) {

			if (resultFlag == 1) {
				temp2 = Integer.parseInt(result);
				result = Integer.toString(temp2 + temp);
				calText.setText(result);
				resultFlag = 0;
			} else if (resultFlag == 2) {

				temp2 = Integer.parseInt(result);
				result = Integer.toString(temp - temp2);
				calText.setText(result);
				resultFlag = 0;
			} else if (resultFlag == 3) {
				temp2 = Integer.parseInt(result);
				result = Integer.toString(temp * temp2);
				calText.setText(result);
				resultFlag = 0;
			}
		} else if (getNumber.equals("del")) {
			if (result.length() != 0) {
				result = result.substring(0, result.length() - 1);
			}
			calText.setText(result);

		} else if (getNumber.equals("c")) {
			result = "";
			temp = 0;
			calText.setText(result);

		} else {
			result += getNumber;
			calText.setText(result);
		}

	}

}
