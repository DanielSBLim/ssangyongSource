package homeWork;

import java.awt.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CardLayoutFinish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutInner();
	}

}

class CardLayoutInner extends JFrame implements ActionListener {

	CardLayout card = new CardLayout();
	String[] cardName = { "cWhite", "cRed", "cOrange", "cYellow", "cGreen", "cBlue" };
	String[] colorButtonName = { "Default", "Red", "Orange", "Yellow", "Green", "Blue" };

	Panel topButtonPanel = new Panel();
	Panel cardLayoutPanel = new Panel();
	Panel[] panel = new Panel[6];
	Color[] color = { Color.WHITE, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };
	Button[] colorButton = new Button[panel.length];

	public CardLayoutInner() {

		cardLayoutPanel.setLayout(card);
		for (int i = 0; i < panel.length; i++) {
			// 버튼 생성 및 액션 추가 -----------------------------------------------------------
			colorButton[i] = new Button(colorButtonName[i]); // 버튼 생성
			colorButton[i].setBackground(color[i]);
			topButtonPanel.add(colorButton[i]);
			colorButton[i].addActionListener(this);

			// 패널 생성 및 카드레이아웃에 각 패널 추가 -----------------------------------------------
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			cardLayoutPanel.add(cardName[i], panel[i]);
		}
		
		add(topButtonPanel, BorderLayout.NORTH);
		add(cardLayoutPanel, BorderLayout.CENTER);
		setSize(500, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		for (int i = 0; i < panel.length; i++) {
			if (str.equals(colorButtonName[i])) {
				card.show(cardLayoutPanel, cardName[i]);
			}
		}

	}

}
