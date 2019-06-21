package util;

public class Change {

	public static int[] changeTypeStoI(String[] getData) {
		int[] printInt = new int[getData.length];

		for (int i = 0; i < getData.length; i++) {
			printInt[i] = Integer.parseInt(getData[i]);
		}
		return printInt;

	}
}
