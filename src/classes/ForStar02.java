package classes;

public class ForStar02 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; --i) {
			mLine(6 - i, "*");
		}
	}

	public static void mLine(int su, String line) {
		for (int i = 1; i <= su; i++) {
			System.out.print(line);
		}
		System.out.println();

	}
}
