package classes;

public class SwitchEx01 {

	public static void main(String[] args) {
		int vInt = 0;
		String text ="";
		
		switch (vInt) {
		case 0:
			text ="off";
			break;
		case 1:
			text ="on";
			break;
		default:
			text = "No value found";
		
		}
		
		System.out.println(text);

	}

}
