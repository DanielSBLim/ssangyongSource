package javapack01;

public class ToCharEx01 {

	public static void main(String[] args) {
		String sHaveANiceDay = "HaveANiceDay";
		char[] getText = sHaveANiceDay.toCharArray();
		
		for(int i  = 0; i < getText.length; i++) {
			System.out.println(getText[i]);
		}
		
	}

}
