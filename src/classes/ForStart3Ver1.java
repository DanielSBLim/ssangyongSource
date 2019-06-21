package classes;

public class ForStart3Ver1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; ++i) {
			mLineMargin(i, "*", 5 - i);
		}


		for (int i = 4; i >= 0; --i) {
			mLineMargin(i, "*", 5 - i);
		}

	}

	public static void mLine(int su, String line) {
		for (int i = 1; i <= su; i++) {
			System.out.print(line);
		}
	}
	
	public static void mLineMargin(int su, String line, int leftMargin) {
		for (int i = 1; i <= leftMargin; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= su; i++) {
			System.out.print(line);
		}
		System.out.println();

	}

}
