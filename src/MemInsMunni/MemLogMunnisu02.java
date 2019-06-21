package MemInsMunni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MemLogMunnisu02 extends JPanel implements WindowListener {

   // 프레임설정
   // panelBorderCenter 센터

   // 동서남북 빈패널
    JPanel empty[] = new JPanel[4];
   // ----------------------------------------------------------------------------------------------------------------

   // panelBorderCenter
   // panelArrayGrid 센터
    JPanel panelBorderCenter = new JPanel(new BorderLayout());

   // South 내역
    JLabel labelMaxDown = new JLabel(" ", JLabel.CENTER);
   // ----------------------------------------------------------------------------------------------------------------

   // panelArrayGrid 셋팅
    JPanel panelArrayGrid = new JPanel(new GridLayout(8, 1));
    JPanel[] GridInner = new JPanel[8];
   // ----------------------------------------------------------------------------------------------------------------

   // 상반
    JLabel titleLabel = new JLabel("Login");
//    JLabel titleApplicate = new JLabel("로그인");

   // 중간
    String[] subTitle = { "ID", "PW", "회원명", "E-mail", "Phone", "주소" };
    JTextField[] calText = new JTextField[6];
    JLabel[] btnlist = new JLabel[6];
    JPanel[] emptyCenter = new JPanel[4];

   // 하반
    JPanel lsatInnerPanel = new JPanel();
    JButton btnApplicateDown = new JButton("로그인");
    JButton btnDeApplicateDown = new JButton("가입취소");
   // ----------------------------------------------------------------------------------------------------------------

	//
	String errcode = "";
	int flag = 0;
	int total = 6;
	String[] errcodeArray;
	int count = 0;

   
   public   MemLogMunnisu02() {

      MemLogMunnisu obj = new MemLogMunnisu();

      this.setLayout(new BorderLayout());
//       프레임 레이아웃 만들기
//      1. BorderLayout으로 해서 Center 빼고 전부 마진을 넣는다. 
//      2. 마진 넣은 패널을 핑크로 칠한다.
//      3. 센터는 panelBorderCenter를 넣어준다. 
//         -> 다음은 panelBorderCenter세팅이 필요하다

      frameSetting();
//----------------------------------------------------------------------------------------------------------------

//       panelBorderCenter 세팅하기.
//         1. panelArrayGrid이라는 패널을 센터에다가 넣어준다. 
//         2. bntMaxDown 버튼을 남쪽에다가 넣어준다 
//         3. bntMaxDown 버튼의 배경색을 핑크, 굴씨체는 굴림, 진하게, 크기는 20으로한다. 
//         4. panelArrayGrid 패널의 배경을 핑크로 칠한다. 
//         -> panelArrayGrid 세팅이 필요하다.

      panelBorderCenterSetting(panelBorderCenter);
//----------------------------------------------------------------------------------------------------------------

//        panelArrayGrid 세팅하기.

      // panelArrayGrid의 0번째 패널 설정
      GridInner[0] = new JPanel(new FlowLayout());
      GridInner[0].setBackground(Color.WHITE);

      titleLabel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30));
      titleLabel.setForeground(Color.BLUE);
      titleLabel.setIcon(new ImageIcon("./client/log.jpg"));

//      titleApplicate.setForeground(Color.BLUE);

      GridInner[0].add(titleLabel);
//      GridInner[0].add(titleApplicate);
      panelArrayGrid.add(GridInner[0]);

      // panelArrayGrid의 1 ~ 6번째 패널 설정
      for (int i = 0; i < 2; i++) {
    	  GridInner[i + 1] = new JPanel(new BorderLayout());
          GridInner[i + 1].setBackground(Color.WHITE);
         		 
          btnlist[i] = new JLabel(subTitle[i], JLabel.CENTER);
          btnlist[i].setPreferredSize(new Dimension(100, 0));
          btnlist[i].setFont(new Font("굴림", Font.BOLD, 16));
          btnlist[i].setBackground(Color.WHITE);
          btnlist[i].setForeground(Color.BLUE);
          GridInner[i + 1].add(btnlist[i], BorderLayout.WEST);

          if(i == 1) {
          calText[i] = new JPasswordField();
          GridInner[i + 1].add(calText[i], BorderLayout.CENTER);

          } else {
         	 calText[i] = new JTextField();
         	 GridInner[i + 1].add(calText[i], BorderLayout.CENTER);
          }
          panelArrayGrid.add(GridInner[i + 1]);
      }
      // 공백추가
      panelArrayGrid.add(emptyCenter[0]  = new JPanel());
      panelArrayGrid.add(emptyCenter[1]  = new JPanel());
      panelArrayGrid.add(emptyCenter[2]  = new JPanel());
      panelArrayGrid.add(emptyCenter[3]  = new JPanel());
      
      //공백 핑크추가
      emptyCenter[0].setBackground(Color.WHITE);
      emptyCenter[1].setBackground(Color.WHITE);
      emptyCenter[2].setBackground(Color.WHITE);
      emptyCenter[3].setBackground(Color.WHITE);

      // panelArrayGrid의마지막번째 패널 설정
      btnApplicateDown.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("확인");
			labelMaxDown.setText(" ");
			errcode = "";
			for (int i = 0; i < 2; i++) {

				if (calText[i].getText().equals("")) {
					errcode = errcode + " " + subTitle[i];
					flag = 1;
				} else {

				}
			}
			if (flag == 1) {
				labelMaxDown.setText(errcode + "빈값입니다.");
				flag = 0;

				errcodeArray = errcode.split(" ");

				for (int i = 0; i < subTitle.length; i++) {
					if (errcodeArray[1].equals(subTitle[i])) {

						calText[i].requestFocus();
						calText[i].setFocusable(true);
						break;
					}
				}
			} else {
				labelMaxDown.setText("확인");
			}

		}
	});
      btnDeApplicateDown.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("초기화");
			for (int i = 0; i < 2; i++) {
				calText[i].setText("");
		
			} 
			calText[0].requestFocus();
			calText[0].setFocusable(true);
			labelMaxDown.setText(" ");
			
		}
    	  
      });
      
      lsatInnerPanel.add(btnApplicateDown);
      lsatInnerPanel.add(btnDeApplicateDown);
      btnApplicateDown.setBackground(Color.WHITE);
      btnDeApplicateDown.setBackground(Color.WHITE);
      btnApplicateDown.setForeground(Color.BLUE);
      btnDeApplicateDown.setForeground(Color.BLUE);
      lsatInnerPanel.setBackground(Color.WHITE);
      btnApplicateDown.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
      btnDeApplicateDown.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
      
      panelArrayGrid.add(lsatInnerPanel);
      // ----------------------------------------------------------------------------------------------------------------

      // Frame 기본설정
      frameIntro();

   }

   public  void frameIntro() {




      setSize(500, 500);
	   setVisible(true);
	      calText[0].requestFocus();
	      calText[0].setFocusable(true);

   }

   public  void frameSetting() {

      // 여백 만들기
      add(empty[0] = new JPanel(), BorderLayout.SOUTH);
      add(empty[1] = new JPanel(), BorderLayout.NORTH);
      add(empty[2] = new JPanel(), BorderLayout.EAST);
      add(empty[3] = new JPanel(), BorderLayout.WEST);

      // 빈 패널들 색깔 핑크로 칠하기
      empty[0].setBackground(Color.WHITE);
      empty[1].setBackground(Color.WHITE);
      empty[2].setBackground(Color.WHITE);
      empty[3].setBackground(Color.WHITE);
      setBackground(Color.WHITE);

      // 센터안에 panelBorderCenter 넣기
      add(panelBorderCenter, BorderLayout.CENTER);

   }

   public  void panelBorderCenterSetting(JPanel getJPanel) {

		// panelArrayGrid이라는 패널을 센터에다가 넣어준다.
		getJPanel.add(panelArrayGrid, BorderLayout.CENTER);

		// bntMaxDown 버튼을 남쪽에다가 넣어준다
		getJPanel.add(labelMaxDown, BorderLayout.SOUTH);

		// bntMaxDown 버튼의 배경색을 핑크, 굴씨체는 굴림, 진하게, 크기는 20으로한다.
		labelMaxDown.setBackground(Color.BLUE);
		labelMaxDown.setFont(new Font("굴림", Font.BOLD, 20));

		// panelArrayGrid 패널의 배경을 핑크로 칠한다.
		panelArrayGrid.setBackground(Color.WHITE);
		getJPanel.setBackground(Color.WHITE);


   }
}