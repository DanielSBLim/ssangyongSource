package MemInsMunni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemInsMunni extends WindowAdapter implements WindowListener {

   // 프레임설정
   // panelBorderCenter 센터
   static JFrame frameObj = new JFrame("회원가입");

   // 동서남북 빈패널
   static JPanel empty[] = new JPanel[4];
   // ----------------------------------------------------------------------------------------------------------------

   // panelBorderCenter
   // panelArrayGrid 센터
   static JPanel panelBorderCenter = new JPanel(new BorderLayout());

   // South 내역
   static JLabel labelMaxDown = new JLabel("");
   // ----------------------------------------------------------------------------------------------------------------

   // panelArrayGrid 셋팅
   static JPanel panelArrayGrid = new JPanel(new GridLayout(8, 1));
   static JPanel[] GridInner = new JPanel[8];
   // ----------------------------------------------------------------------------------------------------------------

   // 상반
   static JLabel titleLabel = new JLabel("Aplication");
   static JLabel titleApplicate = new JLabel("회원가입");

   // 중간
   static String[] subTitle = { "ID", "PW", "회원명", "E-mail", "Phone", "주소" };
   static JTextField[] calText = new JTextField[6];
   static JLabel[] btnlist = new JLabel[6];

   // 하반
   static JPanel lsatInnerPanel = new JPanel();
   static JButton btnApplicateDown = new JButton("회원가입");
   static JButton btnDeApplicateDown = new JButton("가입취소");
   // ----------------------------------------------------------------------------------------------------------------

   public static void main(String[] args) {

      MemInsMunni obj = new MemInsMunni();

//       프레임 레이아웃 만들기
//      1. BorderLayout으로 해서 Center 빼고 전부 마진을 넣는다. 
//      2. 마진 넣은 패널을 핑크로 칠한다.
//      3. 센터는 panelBorderCenter를 넣어준다. 
//         -> 다음은 panelBorderCenter세팅이 필요하다

      frameSetting(frameObj);
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

      GridInner[0].add(titleLabel);
      panelArrayGrid.add(GridInner[0]);

      // panelArrayGrid의 1 ~ 6번째 패널 설정
      for (int i = 0; i < 6; i++) {
         GridInner[i + 1] = new JPanel(new BorderLayout());
         GridInner[i + 1].setBackground(Color.WHITE);
        		 
         btnlist[i] = new JLabel(subTitle[i], JLabel.CENTER);
         btnlist[i].setPreferredSize(new Dimension(100, 0));
         btnlist[i].setFont(new Font("굴림", Font.BOLD, 16));
         btnlist[i].setBackground(Color.PINK);
         btnlist[i].setForeground(Color.BLUE   );
         GridInner[i + 1].add(btnlist[i], BorderLayout.WEST);

         calText[i] = new JTextField();
         GridInner[i + 1].add(calText[i], BorderLayout.CENTER);

         panelArrayGrid.add(GridInner[i + 1]);
      }

      // panelArrayGrid의마지막번째 패널 설정
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
      frameIntro(frameObj);

   }

   public static void frameIntro(JFrame getFrame) {
      getFrame.setVisible(true);
      getFrame.setSize(500, 500);
   }

   public static void frameSetting(JFrame getFrame) {

      // 여백 만들기
      getFrame.add(empty[0] = new JPanel(), BorderLayout.SOUTH);
      getFrame.add(empty[1] = new JPanel(), BorderLayout.NORTH);
      getFrame.add(empty[2] = new JPanel(), BorderLayout.EAST);
      getFrame.add(empty[3] = new JPanel(), BorderLayout.WEST);

      // 빈 패널들 색깔 핑크로 칠하기
      empty[0].setBackground(Color.WHITE);
      empty[1].setBackground(Color.WHITE);
      empty[2].setBackground(Color.WHITE);
      empty[3].setBackground(Color.WHITE);
      getFrame.setBackground(Color.WHITE);

      // 센터안에 panelBorderCenter 넣기
      getFrame.add(panelBorderCenter, BorderLayout.CENTER);

   }

   public static void panelBorderCenterSetting(JPanel getJPanel) {

      // panelArrayGrid이라는 패널을 센터에다가 넣어준다.
      getJPanel.add(panelArrayGrid, BorderLayout.CENTER);

      // bntMaxDown 버튼을 남쪽에다가 넣어준다
//      getJPanel.add(labelMaxDown, BorderLayout.SOUTH);

      // bntMaxDown 버튼의 배경색을 핑크, 굴씨체는 굴림, 진하게, 크기는 20으로한다.
      labelMaxDown.setBackground(Color.PINK);
      labelMaxDown.setFont(new Font("굴림", Font.BOLD, 20));

      // panelArrayGrid 패널의 배경을 핑크로 칠한다.
      panelArrayGrid.setBackground(Color.PINK);
      getJPanel.setBackground(Color.PINK);

   }
}