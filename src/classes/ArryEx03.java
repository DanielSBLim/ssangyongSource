package classes;

public class ArryEx03 {

	public static void main(String[] args) {
		int[] a3 = { 10, 20, 30 };

		for (int i = 0; i < a3.length; i++) {
			a3[i] = (i + 1) * 10;
		}
		printAllHori(a3);

	}

	public static void printAllHori(int[] getInt) {
		for (int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

}
