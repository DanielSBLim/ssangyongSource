package classes;

public class LableContinueEx01 {

	public static void main(String[] args) {
		vLabel: for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 3; j++) {

				if (j == 1)	continue vLabel;

				System.out.println("Exciting Java");
			}

		}

	}

}
