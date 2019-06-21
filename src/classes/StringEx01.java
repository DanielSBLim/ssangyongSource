package classes;

public class StringEx01 {
	
	public static void main(String[] args) {
		
		int i01 = 10;
		int i02 = 10;
		String s01 = "10";
		String s02 = "10";

		if (i01 == i02) {
			System.out.println("i01 + i02 : " + (i01 == i02));
		} else {
			System.out.println("i01 + i02 : " + (s01 == s02));
		}	

		if (s01.equals(s02)) {
			System.out.println("i01.equals(i02)는 참");
		} else {
			System.out.println("i01.equals(i02)는 거짓");
		}	
	}
	
}
