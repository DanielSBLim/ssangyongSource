package util;

public class Sort {

	public static int[] selectSort(int[] getIntlist) {
		int temp;
		int[] changeSort = getIntlist;

		for (int i = 0; i < changeSort.length; i++) {

			for (int j = (i + 1); j < changeSort.length; j++) {
				if (changeSort[i] > changeSort[j]) {
					temp = changeSort[i];
					changeSort[i] = changeSort[j];
					changeSort[j] = temp;
				}
			}

		}
		return changeSort;
	}
}
