package MemInsMunni;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MemMaineMunni {
	JFrame frame = new JFrame("main");
	JLabel  lbl = new JLabel("Main PAGE", JLabel.CENTER);
	
	public static void main(String[] args) {
		MemMaineMunni obj = new MemMaineMunni();
		obj.frame.setLayout(new GridLayout(1, 1));
		obj.lbl.setForeground(Color.blue);
		obj.lbl.setFont(new Font("휴먼둥근헤드라인", Font.ITALIC | Font.BOLD, 60));
		obj.lbl.setIcon(new ImageIcon("./client/main.jpg"));
		obj.frame.add(obj.lbl);
		
		obj.frame.setVisible(true);
		obj.frame.setSize(500, 500);
	}
	
}
