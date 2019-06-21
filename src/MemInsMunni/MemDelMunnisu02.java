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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.net.ssl.ExtendedSSLSession;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MemDelMunnisu02 extends JPanel implements WindowListener {

	// 프레임설정
	// panelBorderCenter 센터

	// 동서남북 빈패널
	JPanel empty[] = new JPanel[4];
	// ----------------------------------------------------------------------------------------------------------------

	// panelBorderCenter
	// panelArrayGrid 센터
	JPanel panelBorderCenter = new JPanel(new BorderLayout());

	// South 내역
	JLabel bntMaxDown = new JLabel(" ", JLabel.CENTER);
	// ----------------------------------------------------------------------------------------------------------------

	// panelArrayGrid 셋팅
	JPanel panelArrayGrid = new JPanel(new GridLayout(8, 1));
	JPanel[] GridInner = new JPanel[8];
	// ----------------------------------------------------------------------------------------------------------------

	// 상반
	JLabel titleButton = new JLabel("회원탈퇴");
	JLabel titleApplicate = new JLabel("");

	// 중간
	String[] subTitle = { "ID", "PW", "회원명", "E-mail", "Phone", "주소" };
	JTextField[] calText = new JTextField[6];
	JLabel[] btnlist = new JLabel[6];
	JPanel[] emptyCenter = new JPanel[4];

	// 하반
	JPanel lsatInnerPanel = new JPanel();
	JButton ApplicateDown = new JButton("회원탈퇴");
	JButton DeApplicateDown = new JButton("가입취소");
	// ----------------------------------------------------------------------------------------------------------------

	String errcode = "";
	int flag = 0;
	int total = 6;
	String[] errcodeArray;
	int count = 0;

	public MemDelMunnisu02() {
		 this.setLayout(new BorderLayout());
		panelSetting();
		panelBorderCenterSetting(panelBorderCenter);
		etc();
	}

	void etc() {
		 
		GridInner[0] = new JPanel(new FlowLayout());
		GridInner[0].setBackground(Color.WHITE);

		titleButton.setBackground(Color.WHITE);
		titleButton.setFont(new Font("굴림", Font.BOLD, 30));
		titleButton.setForeground(Color.BLUE);

		titleApplicate.setBackground(Color.WHITE);
		titleApplicate.setForeground(Color.BLUE);
		titleButton.setIcon(new ImageIcon("./client/del.jpg"));

		GridInner[0].add(titleButton);
		GridInner[0].add(titleApplicate);
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

			if (i == 1) {
				calText[i] = new JPasswordField();
				GridInner[i + 1].add(calText[i], BorderLayout.CENTER);

			} else {
				calText[i] = new JTextField();
				GridInner[i + 1].add(calText[i], BorderLayout.CENTER);
			}
			panelArrayGrid.add(GridInner[i + 1]);

		}

		// 공백추가
		panelArrayGrid.add(emptyCenter[0] = new JPanel());
		panelArrayGrid.add(emptyCenter[1] = new JPanel());
		panelArrayGrid.add(emptyCenter[2] = new JPanel());
		panelArrayGrid.add(emptyCenter[3] = new JPanel());

		// 공백 핑크추가
		emptyCenter[0].setBackground(Color.WHITE);
		emptyCenter[1].setBackground(Color.WHITE);
		emptyCenter[2].setBackground(Color.WHITE);
		emptyCenter[3].setBackground(Color.WHITE);

		// panelArrayGrid의마지막번째 패널 설정
		ApplicateDown.setBackground(Color.white);
		DeApplicateDown.setBackground(Color.white);
		ApplicateDown.setForeground(Color.blue);
		DeApplicateDown.setForeground(Color.blue);
		ApplicateDown.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		DeApplicateDown.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));

		ApplicateDown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bntMaxDown.setText(" ");
				errcode = "";
				for (int i = 0; i < 2; i++) {

					if (calText[i].getText().equals("")) {
						errcode = errcode + " " + subTitle[i];
						flag = 1;
					} else {

					}
				}
				if (flag == 1) {
					bntMaxDown.setText(errcode + "빈값입니다.");
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
					bntMaxDown.setText("확인");
				}

			}
		});
		DeApplicateDown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 2; i++) {
					calText[i].setText("");
				}
				calText[0].requestFocus();
				calText[0].setFocusable(true);
				bntMaxDown.setText(" ");
			}

		});

		lsatInnerPanel.add(ApplicateDown);
		lsatInnerPanel.add(DeApplicateDown);
		lsatInnerPanel.setBackground(Color.WHITE);
		panelArrayGrid.add(lsatInnerPanel);
		// ----------------------------------------------------------------------------------------------------------------

		// Frame 기본설정

	}

	

	public void panelSetting() {

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

	public void panelBorderCenterSetting(JPanel getJPanel) {

		// panelArrayGrid이라는 패널을 센터에다가 넣어준다.
		getJPanel.add(panelArrayGrid, BorderLayout.CENTER);

		// bntMaxDown 버튼을 남쪽에다가 넣어준다
		getJPanel.add(bntMaxDown, BorderLayout.SOUTH);

		// bntMaxDown 버튼의 배경색을 핑크, 굴씨체는 굴림, 진하게, 크기는 20으로한다.
		bntMaxDown.setBackground(Color.WHITE);
		bntMaxDown.setFont(new Font("굴림", Font.BOLD, 20));

		// panelArrayGrid 패널의 배경을 핑크로 칠한다.
		panelArrayGrid.setBackground(Color.WHITE);
		getJPanel.setBackground(Color.WHITE);

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}