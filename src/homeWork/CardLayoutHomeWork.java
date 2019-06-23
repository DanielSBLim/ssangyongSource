package homeWork;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutHomeWork {

	public static void main(String[] args) {
		new FrmMenu();
	}
}

class FrmMenu extends JFrame implements ActionListener {
	
	PnlMenu pnlMenu = new PnlMenu();
	CardLayout cardLayout = new CardLayout();
	
	JPanel pnlColor = new JPanel(cardLayout);
	JPanel[] pnlsColor = { new PnlFirst(), new PnlRed(), new PnlOrange(), new PnlYellow(), new PnlBlue(),
			new PnlGreen(), new PnlBlack() };

	String[] Name = { "처음", "빨강", "주황", "노랑", "초록", "파랑", "검정" };
	
	FrmMenu() {
		setLayout();
		setCardLayout();
		EventSetting();
		windowSetting();
	}

	void setLayout() {
		add(pnlMenu, BorderLayout.NORTH);
		add(pnlColor);
	}

	void setCardLayout() {

		for (int i = 0; i < pnlsColor.length; i++) {
			pnlColor.add(Name[i], pnlsColor[i]);
		}
	}

	void EventSetting() {
		for (int i = 0; i < pnlMenu.btnName.length; i++) {
			pnlMenu.btnList[i].addActionListener(this);
		}

	}

	void windowSetting() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		setSize(500, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < pnlsColor.length; i++) {
			if (e.getActionCommand().equals(Name[i])) {
				cardLayout.show(pnlColor, Name[i]);
				break;
			}
		}

	}

}

class PnlMenu extends JPanel {
	String[] btnName = { "처음", "빨강", "주황", "노랑", "초록", "파랑", "검정" };
	JButton[] btnList = new JButton[btnName.length];

	PnlMenu() {
		settingPnl();
	}

	void settingPnl() {

		for (int i = 0; i < btnName.length; i++) {
			btnList[i] = new JButton(btnName[i]);
			add(btnList[i]);
		}
	}

}

class PnlFirst extends JPanel {

	PnlFirst() {
		this.setBackground(Color.WHITE);
	}
}

class PnlRed extends JPanel {

	PnlRed() {
		this.setBackground(Color.RED);
	}
}

class PnlOrange extends JPanel {

	PnlOrange() {
		this.setBackground(Color.ORANGE);
	}
}

class PnlYellow extends JPanel {

	PnlYellow() {
		this.setBackground(Color.YELLOW);
	}

}

class PnlBlue extends JPanel {

	PnlBlue() {
		this.setBackground(Color.blue);
	}
}

class PnlGreen extends JPanel {

	PnlGreen() {
		this.setBackground(Color.green);
	}
}

class PnlBlack extends JPanel {

	PnlBlack() {

		this.setBackground(Color.black);
	}
}
