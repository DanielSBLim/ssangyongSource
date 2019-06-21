package study;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main implements ActionListener {
// Final
	 final int FIRST = 0;
	 final int SECOND = 1;
	 final int THIRD = 2;
	 final int FOURD = 3;
	 final Color LIGTHBLUE = new Color(49, 168, 243);
	 final String addrUpimage = "./mini/BoradUp.jpg";
	 final String addrDownimage = "./mini/BoradDown.jpg";
	 final String addrHINT = "./mini/HINT.jpg";
	 final String addrCHECK = "./mini/CHECK.jpg";
	 final String addrHighLevel = "./mini/highLevel.jpg";
	 final String addrMeddleLevel = "./mini/middleLevel.jpg";
	 final String addrLowLevel = "./mini/lowLevel.jpg";
	 
	

//JFrameMain
	 JFrame frMain = new JFrame("알고리즘 이해");

// 1 pnlMainInnerNorth
	 JPanel pnlMainInnerNorth = new JPanel(new BorderLayout());

// 1 - 1 pnlMain InnerNorth InnerWest 
	 JPanel pnlMainInnerNorthInnerWest = new JPanel(new GridLayout(1, 3));
	 JButton[] btnMainInnerNorthInnerWest = { new JButton(), new JButton(), new JButton() };
	

// 1 - 2 lblMain InnerNorth InnerEast 
	 JPanel pnlMainInnerNorthInnerEast = new JPanel(new GridLayout(1, 1));
	 JLabel lblMainInnerNorthInnerEast = new JLabel("성적 :                  ");

// 2 pnlMainInnerCenter
	 JPanel pnlMainInnerCenter = new JPanel(new GridLayout(4, 1));

// 2 - 1 pnlArrayMainInnerCenterInnerGrid[] = new [4]
	 JPanel pnlArrayMainInnerCenterInnerGrid[] = { new JPanel(new GridLayout(1, 1)),
			new JPanel(new GridLayout(1, 1)), new JPanel(new GridLayout(2, 1)), new JPanel(new BorderLayout()) };

// 2 - 1 - 1 lblMainInnerCenterInnerGrid[0]

	 JLabel lblMainInnerCenterInnerGridFirst = new JLabel("10에 2의 보수는?", JLabel.CENTER) ;
	

// 2 - 1 - 2 lblMainInnerCenterInnerGrid[1]	
	 JLabel lblMainInnerCenterInnerGridSecond = new JLabel("10진수로!!", JLabel.CENTER);


// 2 - 1 - 3 pnlMainInnerCenterInnerGrid[2]	
	 JPanel pnlMainInnerCenterInnerGridThirdInnerFirst = new JPanel(new BorderLayout());
	 JPanel pnlMainInnerCenterInnerGridThirdInnerSecond = new JPanel(new FlowLayout());

// 2 - 1 - 3 - 1 pnlMainInnerCenterInnerGridThirdInnerFirstInner
	 JLabel lblMainInnerCenterInnerGridThirdInnerFirstInnerEast = new JLabel(" 답  : ", JLabel.CENTER);
	 JTextField tfMainInnerCenterInnerGridThirdInnerFirstInnerEast = new JTextField();
	 JPanel[] pnlBlink = { new JPanel(), new JPanel(), new JPanel() };

// 2 - 1 - 3 - 2 pnlMainInnerCenterInnerGridThirdInnerSecond

	 JButton btnMainInnerCenterInnerGridThirdInnerSecondCenterFirst = new JButton();
	 JButton btnMainInnerCenterInnerGridThirdInnerSecondCenterSecond = new JButton();

// 2 - 1 - 4 pnlMainInnerCenterInnerGrid[3]	
	 JLabel lblMainInnerCenterInnerGridThirdInnerSecondFirst = new JLabel("     힌트!!!!       ");
	 JLabel lblMainInnerCenterInnerGridFourd = new JLabel("힌트출력내역", JLabel.CENTER);

// 3 pnlMainInnerSouth
	 JPanel pnlMainInnerSouth = new JPanel(new GridLayout(1, 2));

// 3 - 1 pnlMainInnerSouthInnerGridFirst
	 JPanel pnlMainInnerSouthInnerGridFirst = new JPanel(new GridLayout(1, 1));
	 JLabel lblMainInnerSouthInnerGridFirst = new JLabel("정답", JLabel.CENTER);

// 3 - 2 pnlMainInnerSouthInnerGridSecond
	 JPanel pnlMainInnerSouthInnerGridSecond = new JPanel(new GridLayout(2, 1));

// 3 - 2 - 1 libMainInnerSouthInnerGridSecondInnerGridFirst
	 JLabel libMainInnerSouthInnerGridSecondInnerGridFirst = new JLabel("정답/문제", JLabel.CENTER);

// 3 - 2 - 2 pnlMainInnerSouthInnerGridSecondInnerGridSecond
	 JLabel libMainInnerSouthInnerGridSecondInnerGridSecond = new JLabel("1/5", JLabel.CENTER);

	
	public static void main(String[] args) {
		Main obj = new Main();

		obj.frMain.add(obj.pnlMainInnerNorth, BorderLayout.NORTH);
//--------------------------------------------------------------------------------------------------------------------
// 최상단 작업
		// 왼쪽
		obj.pnlMainInnerNorthInnerWest.add(obj.btnMainInnerNorthInnerWest[0]);
		obj.btnMainInnerNorthInnerWest[0].addActionListener(obj);
//		obj.pnlMainInnerNorthInnerWest.setSize(330, 25);
		obj.btnMainInnerNorthInnerWest[0].setIcon(new ImageIcon(obj.addrLowLevel));
		obj.btnMainInnerNorthInnerWest[0].setPreferredSize(new Dimension(110, 50));;
		
		obj.pnlMainInnerNorth.add(obj.pnlMainInnerNorthInnerWest, BorderLayout.WEST);

		// 오른쪽
		obj.pnlMainInnerNorthInnerEast.add(obj.lblMainInnerNorthInnerEast);
		obj.pnlMainInnerNorth.add(obj.pnlMainInnerNorthInnerEast, BorderLayout.EAST);
		// --------------------------------------------------------------------------------------------------------------------

//중간 작업
		
		//첫번째 이너 패널
		obj.pnlArrayMainInnerCenterInnerGrid[obj.FIRST] = new JPanel(new GridLayout(1, 1)){
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension d = getSize();
				ImageIcon image = new ImageIcon(obj.addrUpimage);
				g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
				
				
			}
		};
		obj.pnlArrayMainInnerCenterInnerGrid[obj.FIRST].add(obj.lblMainInnerCenterInnerGridFirst);
		obj.pnlArrayMainInnerCenterInnerGrid[obj.FIRST].setBackground(Color.white);
		obj.lblMainInnerCenterInnerGridFirst.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		obj.lblMainInnerCenterInnerGridFirst.setForeground(Color.white);
		// -----------------------------------------------------------------------------------------------------------------
		
		
		//두번째 이너 패널
		obj.pnlArrayMainInnerCenterInnerGrid[obj.SECOND] = new JPanel(new GridLayout(1, 1)){
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension d = getSize();
				ImageIcon image = new ImageIcon(obj.addrDownimage);
				g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
				
				
			}
		};
		obj.pnlArrayMainInnerCenterInnerGrid[obj.SECOND].add(obj.lblMainInnerCenterInnerGridSecond);
		obj.pnlArrayMainInnerCenterInnerGrid[obj.SECOND].setBackground(Color.white);
		obj.lblMainInnerCenterInnerGridSecond.setForeground(Color.white);
		obj.lblMainInnerCenterInnerGridSecond.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		// -----------------------------------------------------------------------------------------------------------------
		
		// 3번째 이너 패널
		obj.pnlMainInnerCenterInnerGridThirdInnerFirst.setBackground(Color.white);
		obj.lblMainInnerCenterInnerGridThirdInnerFirstInnerEast.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30));
		obj.tfMainInnerCenterInnerGridThirdInnerFirstInnerEast.setPreferredSize(new Dimension(360, 50));
		obj.tfMainInnerCenterInnerGridThirdInnerFirstInnerEast.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30));

		obj.pnlMainInnerCenterInnerGridThirdInnerFirst.add(obj.lblMainInnerCenterInnerGridThirdInnerFirstInnerEast,
				BorderLayout.WEST);
		obj.pnlMainInnerCenterInnerGridThirdInnerFirst.add(obj.tfMainInnerCenterInnerGridThirdInnerFirstInnerEast,
				BorderLayout.CENTER);

		for (int section = obj.FIRST; section < obj.pnlBlink.length; section++) {
			obj.pnlBlink[section].setBackground(Color.white);

		}
		obj.pnlMainInnerCenterInnerGridThirdInnerFirst.add(obj.pnlBlink[obj.FIRST], BorderLayout.SOUTH);
		obj.pnlMainInnerCenterInnerGridThirdInnerFirst.add(obj.pnlBlink[obj.SECOND], BorderLayout.NORTH);
		obj.pnlMainInnerCenterInnerGridThirdInnerFirst.add(obj.pnlBlink[obj.THIRD], BorderLayout.EAST);
		obj.pnlArrayMainInnerCenterInnerGrid[obj.THIRD].add(obj.pnlMainInnerCenterInnerGridThirdInnerFirst);
//--------------------------------------------------------------------------------------------------------------------------
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterFirst.addActionListener(obj);
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterSecond.addActionListener(obj);
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterFirst.setIcon(new ImageIcon(obj.addrCHECK));
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterSecond.setIcon(new ImageIcon(obj.addrHINT));
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterFirst.setPreferredSize(new Dimension(100, 50));
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterSecond.setPreferredSize(new Dimension(100, 50));
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterFirst.setBackground(Color.white);
		obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterSecond.setBackground(Color.white);
		obj.pnlMainInnerCenterInnerGridThirdInnerSecond.add(obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterFirst);
		obj.pnlMainInnerCenterInnerGridThirdInnerSecond.add(obj.btnMainInnerCenterInnerGridThirdInnerSecondCenterSecond);
		obj.pnlMainInnerCenterInnerGridThirdInnerSecond.setBackground(Color.white);
		obj.pnlArrayMainInnerCenterInnerGrid[obj.THIRD].add(obj.pnlMainInnerCenterInnerGridThirdInnerSecond);

		
		// 4번째 이너 패널
		obj.pnlArrayMainInnerCenterInnerGrid[obj.FOURD].add(obj.lblMainInnerCenterInnerGridThirdInnerSecondFirst,
				BorderLayout.NORTH);
		obj.pnlArrayMainInnerCenterInnerGrid[obj.FOURD].add(obj.lblMainInnerCenterInnerGridFourd, BorderLayout.CENTER);
		obj.pnlArrayMainInnerCenterInnerGrid[obj.FOURD].setBackground(Color.white);

		for (int section = obj.FIRST; section < obj.pnlArrayMainInnerCenterInnerGrid.length; section++) {
			obj.pnlMainInnerCenter.add(obj.pnlArrayMainInnerCenterInnerGrid[section]);
		}

		obj.frMain.add(obj.pnlMainInnerCenter, BorderLayout.CENTER);

		
//최하단 측
		obj.lblMainInnerSouthInnerGridFirst.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 36));
		obj.lblMainInnerSouthInnerGridFirst.setForeground(Color.white);
		obj.pnlMainInnerSouthInnerGridFirst.add(obj.lblMainInnerSouthInnerGridFirst);

		obj.pnlMainInnerSouthInnerGridSecond.add(obj.libMainInnerSouthInnerGridSecondInnerGridFirst);
		obj.pnlMainInnerSouthInnerGridSecond.add(obj.libMainInnerSouthInnerGridSecondInnerGridSecond);
		obj.libMainInnerSouthInnerGridSecondInnerGridFirst.setForeground(Color.white);
		obj.libMainInnerSouthInnerGridSecondInnerGridSecond.setForeground(Color.white);
		obj.libMainInnerSouthInnerGridSecondInnerGridFirst.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		obj.libMainInnerSouthInnerGridSecondInnerGridSecond.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		
		obj.pnlMainInnerSouthInnerGridFirst.setBackground(obj.LIGTHBLUE);
		obj.pnlMainInnerSouthInnerGridSecond.setBackground(obj.LIGTHBLUE);
		obj.pnlMainInnerSouth.add(obj.pnlMainInnerSouthInnerGridFirst);
		obj.pnlMainInnerSouth.add(obj.pnlMainInnerSouthInnerGridSecond);
		obj.pnlMainInnerSouth.setPreferredSize(new Dimension(500, 60));

		obj.frMain.add(obj.pnlMainInnerSouth, BorderLayout.SOUTH);
//--------------------------------------------------------------------------------------------------------------------		

		obj.frMain.setSize(500, 700);
		obj.frMain.setVisible(true);
		obj.frMain.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getSource());
		
		// 로직상에선 버튼 난이도 버튼은 하나만 추가 된 상태
		if(e.getSource().equals(btnMainInnerNorthInnerWest[0])) {
			System.out.println("초급");
		} else if (e.getSource().equals(btnMainInnerNorthInnerWest[1])) {
			System.out.println("중급");
		} else if (e.getSource().equals(btnMainInnerNorthInnerWest[2])) {
			System.out.println("고급");
		} else if (e.getSource().equals(btnMainInnerCenterInnerGridThirdInnerSecondCenterFirst)) {
			System.out.println("결과");
			lblMainInnerCenterInnerGridFirst.setText("결과1");
			lblMainInnerCenterInnerGridSecond.setText("결과2");
			lblMainInnerSouthInnerGridFirst.setText("결과3");
			libMainInnerSouthInnerGridSecondInnerGridSecond.setText("결과4");
			lblMainInnerCenterInnerGridFourd.setText("결과이미지");
			lblMainInnerNorthInnerEast.setText("결과점수");
			
			
		} else if (e.getSource().equals(btnMainInnerCenterInnerGridThirdInnerSecondCenterSecond)) {
			System.out.println("힌트");
		}

	}
}
