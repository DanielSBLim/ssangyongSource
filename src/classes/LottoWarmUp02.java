/*
 * 1. Ramdom 적용 1 ~ 45 까지 반환
 * 2. 6개
 * 3. 중복 없이.
 */

package classes;

public class LottoWarmUp02 {

	public static void main(String[] args) {
		int[] lottoNumber = new int[6];
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int) (Math.random() * 45 + 1);
			for (int j = (i - 1); j >= 0; j--) {
				if (lottoNumber[i] == lottoNumber[j]) {
					--i;
					break;
				}

			}
		}

		sameErrCheck(lottoNumber);

		lottoNumber = selectSort(lottoNumber);
		printAllHori(lottoNumber);

	}

	public static void printAllHori(int[] getInt) {
		for (int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

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

	public static void sameErrCheck(int[] getdata) {
		for (int i = 0; i < getdata.length; i++) {
			for (int j = i + 1; j < getdata.length; j++) {
				if (getdata[i] == getdata[j]) {
					System.out.println("같은 숫자 입력 확인 [중복 불가]");
				}
			}
		}
		System.out.println("동일값정상");
	}

}
