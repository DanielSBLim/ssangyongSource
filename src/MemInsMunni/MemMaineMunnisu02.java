package MemInsMunni;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MemMaineMunnisu02 extends JPanel{
	JLabel  lbl = new JLabel("Main PAGE", JLabel.CENTER);
	
	public  MemMaineMunnisu02() {
		setLayout(new GridLayout(1, 1));
		lbl.setForeground(Color.blue);
		lbl.setFont(new Font("휴먼둥근헤드라인", Font.ITALIC | Font.BOLD, 60));
		lbl.setIcon(new ImageIcon("./client/main.jpg"));
		add(lbl);
	}
	
}
