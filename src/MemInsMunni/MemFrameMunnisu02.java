package MemInsMunni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MemFrameMunnisu02 extends JFrame {
	MemDelMunnisu02 del = new MemDelMunnisu02();
	MemUpdMunnisu02 upd = new MemUpdMunnisu02();
	MemInsMunnisu02 ins = new MemInsMunnisu02();
	MemLogMunnisu02 log = new MemLogMunnisu02();
	MemMaineMunnisu02 mainpage = new MemMaineMunnisu02();
	
	public static void main(String[] args) {

		MemFrameMunnisu02 main = new MemFrameMunnisu02();
		main.setLayout(new GridLayout(1, 1));
		
		JTabbedPane tbp = new JTabbedPane();
		
		//메인 
		tbp.add("메인", main.mainpage);
		
		//로그인
		tbp.add("로그인" , main.log);
		
		//수정
		tbp.add("수정",main.ins);
		
		//업데이트
		tbp.add("업데이트",main.upd);
		
		//삭제
		tbp.add("삭제",main.del);
		
		
		main.add(tbp);
		
		 
//		MemMaineMunni obj = new MemMaineMunni();
//		obj.frame.setLayout(new GridLayout(1, 1));
//		obj.lbl.setForeground(Color.blue);
//		obj.lbl.setFont(new Font("휴먼둥근헤드라인", Font.ITALIC | Font.BOLD, 60));
//		obj.lbl.setIcon(new ImageIcon("./client/main.jpg"));
//		obj.frame.add(obj.lbl);
//		
		main.setVisible(true);
		main.setSize(1000, 1000);
	}
}
