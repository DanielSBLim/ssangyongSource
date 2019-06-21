package classes;

class Compare2 {

	public static void main(String[] args) {
		String getText = args[0];
		String s01 = "happyday";
	
		if (getText.compareToIgnoreCase(s01) == 0) {
			System.out.println("회원인증");
		} else {
			System.out.println("회원확인");
		}
	}

}