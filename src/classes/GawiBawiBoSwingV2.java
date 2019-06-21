package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GawiBawiBoSwingV2 implements ActionListener {

	static JFrame frame = new JFrame("가위바위보를 해볼텐가?");
	static JPanel[] frameInnerPanel = { new JPanel(new FlowLayout()), new JPanel(new GridLayout(1, 3)),
			new JPanel(new GridLayout(1, 2)), new JPanel(new GridLayout(1, 2)), new JPanel(new GridLayout(1, 1)),
			new JPanel(new FlowLayout()) };
	static String[] gawiBawiBoImg = { "./GBB/Gawi.jpg", "./GBB/bowi.jpg", "./GBB/Bo.jpg"};
	static final int GAWI = 0;
	static final int BOWI = 1;
	static final int BO = 2;
	
	
	// First
	static JLabel firstPanelLabel = new JLabel();
	static String firstPanelButtonAddressImg = "./GBB/Title.jpg";
	
	

	// Second
	static JButton[] secondPanelButton = new JButton[3];
	static String[] secondPanelButtonMsg = { "가위", "바위", "보" };

	// Third
	static JLabel[] thirdPanelLabel = new JLabel[2];
	static String[] thirdPanelLabelMsg = { "Computer", "User" };

	// Fourh
	static JLabel[] fourhPanelLabel = { new JLabel("", JLabel.CENTER), new JLabel("", JLabel.CENTER) };
	static JPanel[] fourhPanelJPanel = { new JPanel(new GridLayout(1, 1)), new JPanel(new GridLayout(1, 1)) };

	// Fifth
	static JLabel fifthPanelLabel = new JLabel("You vs Computer", JLabel.CENTER);

	// Sixth
	
	static JButton[] sixthhPanelButton = new JButton[3];
	static String[] sixthhPanelButtonAdressImg = {"./GBB/Reset.jpg", "./GBB/Result.jpg", "./GBB/Exit.jpg"};
	
	
	// 계산관련 필드값
	static int gameTotalConunt = 0;
	static int gameComputerWinConunt = 0;
	static int gamePeopleWinConunt = 0;
	static int gameDrawConunt = 0;
	
	
	
	public static void main(String[] args) {
		GawiBawiBoSwingV2 obj = new GawiBawiBoSwingV2();

		frame.setLayout(new GridLayout(6, 1));

		// ---------------------------------------------------------------------------------------------------------

		
		frameInnerPanel[0].setBackground(Color.white);
		firstPanelLabel.setIcon(new ImageIcon(firstPanelButtonAddressImg));
		
		
		frameInnerPanel[0].add(firstPanelLabel);
		frame.add(frameInnerPanel[0]);
		
		// ---------------------------------------------------------------------------------------------------------

		for (int i = 0; i < secondPanelButton.length; i++) {
			secondPanelButton[i] = new JButton();
			secondPanelButton[i].setIcon(new ImageIcon(gawiBawiBoImg[i]));
			secondPanelButton[i].setFont(new Font("굵림", Font.BOLD, 30));
			secondPanelButton[i].setForeground(Color.WHITE);

			secondPanelButton[i].addActionListener(obj);

			frameInnerPanel[1].add(secondPanelButton[i]);
		}
	
		frame.add(frameInnerPanel[1]);
		// ---------------------------------------------------------------------------------------------------------

		for (int i = 0; i < thirdPanelLabelMsg.length; i++) {
			thirdPanelLabel[i] = new JLabel(thirdPanelLabelMsg[i], JLabel.CENTER);
			frameInnerPanel[2].add(thirdPanelLabel[i]);
			thirdPanelLabel[i].setFont(new Font("굵림", Font.BOLD, 30));
		}
		frameInnerPanel[2].setBackground(Color.WHITE);
		frame.add(frameInnerPanel[2]);
		// ---------------------------------------------------------------------------------------------------------

		for (int i = 0; i < fourhPanelLabel.length; i++) {
			fourhPanelJPanel[i].add(fourhPanelLabel[i], BorderLayout.CENTER);
			fourhPanelLabel[i].setFont(new Font("굵림", Font.BOLD, 30));
			fourhPanelJPanel[i].setBackground(Color.WHITE);
			fourhPanelLabel[i].setForeground(Color.WHITE);
			frameInnerPanel[3].add(fourhPanelJPanel[i]);
		}

		frame.add(frameInnerPanel[3]);
		// ---------------------------------------------------------------------------------------------------------

		frameInnerPanel[4].setBackground(Color.WHITE);
		fifthPanelLabel.setFont(new Font("굵림", Font.BOLD, 20));
		frameInnerPanel[4].add(fifthPanelLabel);
		frame.add(frameInnerPanel[4]);
		// ---------------------------------------------------------------------------------------------------------

		frameInnerPanel[5].setBackground(Color.WHITE);
		for(int i = 0; i < sixthhPanelButton.length; i++ ) {
			sixthhPanelButton[i] = new JButton(new ImageIcon(sixthhPanelButtonAdressImg[i]));
			sixthhPanelButton[i].addActionListener(obj);
			frameInnerPanel[5].add(sixthhPanelButton[i]);
			
		}
		frame.add(frameInnerPanel[5]);
		// ---------------------------------------------------------------------------------------------------------

		
		
		frame.setVisible(true);
		frame.setSize(500, 1000);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
		String btnGetData = e.getActionCommand();
		int peopleNumber = 0;
		Random rad = new Random();
		int computerNumber = rad.nextInt(3);

		if (e.getSource().equals(secondPanelButton[0])) {
			System.out.println("가위");
			fourhPanelLabel[1].setIcon(new ImageIcon(gawiBawiBoImg[GAWI]));
			peopleNumber = 0;

			fourhPanelLabel[0].setIcon(new ImageIcon(gawiBawiBoComputerView(computerNumber)));
			fifthPanelLabel.setText(gawiBawiBoResuit(peopleNumber, computerNumber));

		} else if (e.getSource().equals(secondPanelButton[1])) {
			System.out.println("바위");
			fourhPanelLabel[1].setIcon(new ImageIcon(gawiBawiBoImg[BOWI]));
			peopleNumber = 1;

			fourhPanelLabel[0].setIcon(new ImageIcon(gawiBawiBoComputerView(computerNumber)));
			fifthPanelLabel.setText(gawiBawiBoResuit(peopleNumber, computerNumber));
		} else if (e.getSource().equals(secondPanelButton[2])) {
			System.out.println("보");
			fourhPanelLabel[1].setIcon(new ImageIcon(gawiBawiBoImg[BO]));

			peopleNumber = 2;
			
			fourhPanelLabel[0].setIcon(new ImageIcon(gawiBawiBoComputerView(computerNumber)));
			fifthPanelLabel.setText(gawiBawiBoResuit(peopleNumber, computerNumber));
		} else if (e.getSource().equals(sixthhPanelButton[0])) {
			System.out.println("Reset");
			gameTotalConunt = 0;
			gameComputerWinConunt = 0;
			gamePeopleWinConunt = 0;
			gameDrawConunt = 0;
			fifthPanelLabel.setText("");
		}  else if (e.getSource().equals(sixthhPanelButton[1])) {
			System.out.println("Result");
			fifthPanelLabel.setText("Play "+ gameTotalConunt+ " \n" +
									"drow " + gameDrawConunt + " \n" +
									"win " + gamePeopleWinConunt + " \n" +
									"Lose " + gameComputerWinConunt + " \n" );
		}  else if (e.getSource().equals(sixthhPanelButton[2])) {
			System.out.println("Exit");
			System.exit(0);
		}

	}

	public static String gawiBawiBoComputerView(int getNumber) {
		if (getNumber == 0) {
			return gawiBawiBoImg[GAWI];
		} else if (getNumber == 1) {
			return gawiBawiBoImg[BOWI];
		} else {
			return gawiBawiBoImg[BO];
		}
	}

	public static String gawiBawiBoResuit(int people, int computer) {
		int result = people - computer;
		gameTotalConunt++;
		switch (result) {
		case -2:
			gamePeopleWinConunt++;
			return "People win";
		case 1:
			gamePeopleWinConunt++;
			return "People win";
		case -1:
			gameComputerWinConunt++;
			return "Computer win";
		case 2:
			gameComputerWinConunt++;
			return "Computer win";
		case 0:
			gameDrawConunt++;
			return "Draw";

		default:
			return "err";
		}
	}

}
