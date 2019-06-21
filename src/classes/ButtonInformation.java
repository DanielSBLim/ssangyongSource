package classes;

import java.awt.Color;

public class ButtonInformation {
	private String msg;

	private String position;
	private Color color;

	public ButtonInformation(String getMsg, String getPosition, Color getColor) {
		this.msg = getMsg;
		this.position = getPosition;
		this.color = getColor;

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
