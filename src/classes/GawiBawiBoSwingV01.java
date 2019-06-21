package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GawiBawiBoSwingV01 implements ActionListener {

	static JFrame frame = new JFrame();
	static JPanel[] frameInnerPanel = { new JPanel(new FlowLayout()), new JPanel(new GridLayout(1, 3)),
			new JPanel(new GridLayout(1, 2)), new JPanel(new GridLayout(1, 2)), new JPanel(new GridLayout(1, 2)) };

	// First
	static JLabel firstPanelLabel = new JLabel("게임을 선택하세요!");


	// Second
	static JButton[] secondPanelButton = new JButton[3];
	static String[] secondPanelButtonMsg = { "가위", "바위", "보" };

	// Third
	static JLabel[] thirdPanelLabel = new JLabel[2];
	static String[] thirdPanelLabelMsg = { "컴퓨터", "유저" };

	// Fourh
	static JLabel[] fourhPanelLabel = { new JLabel("", JLabel.CENTER), new JLabel("", JLabel.CENTER) };
	static JPanel[] fourhPanelJPanel = { new JPanel(new GridLayout(1, 1)), new JPanel(new GridLayout(1, 1)) };

	// Fifth
	static JLabel fifthPanelLabel = new JLabel("You vs Computer", JLabel.CENTER);
	static JButton fifthPanelButton = new JButton("그만하기");

	public static void main(String[] args) {
		GawiBawiBoSwingV01 obj = new GawiBawiBoSwingV01();

		frame.setLayout(new GridLayout(5, 1));

		//---------------------------------------------------------------------------------------------------------
		
		frameInnerPanel[0].add(firstPanelLabel);
		frameInnerPanel[0].setBackground(Color.WHITE);
		firstPanelLabel.setFont(new Font("굵림", Font.BOLD, 30));
		frame.add(frameInnerPanel[0]);
		//---------------------------------------------------------------------------------------------------------
		
		for (int i = 0; i < secondPanelButton.length; i++) {
			secondPanelButton[i] = new JButton(secondPanelButtonMsg[i]);
			secondPanelButton[i].setBackground(Color.BLACK);
			secondPanelButton[i].setFont(new Font("굵림", Font.BOLD, 30));
			secondPanelButton[i].setForeground(Color.WHITE);
			
			secondPanelButton[i].addActionListener(obj);
			
			frameInnerPanel[1].add(secondPanelButton[i]);
		}
		frame.add(frameInnerPanel[1]);
		//---------------------------------------------------------------------------------------------------------

		
		for (int i = 0; i < thirdPanelLabelMsg.length; i++) {
			thirdPanelLabel[i] = new JLabel(thirdPanelLabelMsg[i], JLabel.CENTER);
			frameInnerPanel[2].add(thirdPanelLabel[i]);
			thirdPanelLabel[i].setFont(new Font("굵림", Font.BOLD, 30));
		}
		frameInnerPanel[2].setBackground(Color.WHITE);
		frame.add(frameInnerPanel[2]);
		//---------------------------------------------------------------------------------------------------------

		for (int i = 0; i < fourhPanelLabel.length; i++) {
			fourhPanelJPanel[i].add(fourhPanelLabel[i], BorderLayout.CENTER);
			fourhPanelLabel[i].setFont(new Font("굵림", Font.BOLD, 30));
			fourhPanelJPanel[i].setBackground(Color.BLACK);
			fourhPanelLabel[i].setForeground(Color.WHITE);
			frameInnerPanel[3].add(fourhPanelJPanel[i]);
		}

		frame.add(frameInnerPanel[3]);
		//---------------------------------------------------------------------------------------------------------

		frameInnerPanel[4].setBackground(Color.WHITE);
		fifthPanelLabel.setFont(new Font("굵림", Font.BOLD, 20));
		frameInnerPanel[4].add(fifthPanelLabel);
		frameInnerPanel[4].add(fifthPanelButton);
		fifthPanelButton.setBackground(Color.gray);
		fifthPanelButton.setFont(new Font("굵림", Font.BOLD, 30));
		fifthPanelButton.addActionListener(obj);
		frame.add(frameInnerPanel[4]);
		//---------------------------------------------------------------------------------------------------------

		frame.setVisible(true);
		frame.setSize(500, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		String btnGetData = e.getActionCommand();
		int peopleNumber = 0;
		Random rad = new Random();
		int computerNumber = rad.nextInt(3);

		if (btnGetData.equals("그만하기")) {
			System.exit(0);
		} else if (btnGetData.equals("가위")) {

			fourhPanelLabel[1].setText("가위");
			peopleNumber = 0;

			fourhPanelLabel[0].setText(gawiBawiBoComputerView(computerNumber));
			fifthPanelLabel.setText(gawiBawiBoResuit(peopleNumber, computerNumber));

		} else if (btnGetData.equals("바위")) {
			fourhPanelLabel[1].setText("바위");
			peopleNumber = 1;

			fourhPanelLabel[0].setText(gawiBawiBoComputerView(computerNumber));
			fifthPanelLabel.setText(gawiBawiBoResuit(peopleNumber, computerNumber));
		} else if (btnGetData.equals("보")) {
			fourhPanelLabel[1].setText("보");

			peopleNumber = 2;

			fourhPanelLabel[0].setText(gawiBawiBoComputerView(computerNumber));
			fifthPanelLabel.setText(gawiBawiBoResuit(peopleNumber, computerNumber));
		}

	}

	public static String gawiBawiBoComputerView(int getNumber) {
		if (getNumber == 0) {
			return "가위";
		} else if (getNumber == 1) {
			return "바위";
		} else {
			return "보";
		}
	}

	public static String gawiBawiBoResuit(int people, int computer) {
		int result = people - computer;

		switch (result) {
		case -2:
			return "People win";
		case 1:
			return "People win";
		case -1:
			return "Computer win";
		case 2:
			return "Computer win";
		case 0:
			return "Draw";

		default:
			return "err";
		}
	}

}
