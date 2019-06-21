package classes;

public class BreakEx01 {

	public static void main(String[] args) {
		int i, j;

		for (i = 0; i < 5; ++i) {
			for (j = 0; j < 3; ++j) {
				if (j == 1) {
					break;
				}
				System.out.println("Exciting Java");
			}
		}
		System.out.println("-----------------------------");
		for (i = 0; i < 5; ++i) {
			for (j = 0; j < 3; ++j) {
				if (j == 1) {
					continue;
				}
				System.out.println("Exciting Java");
			}

		}
	}

}
