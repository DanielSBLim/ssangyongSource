/*
 * 1. 실행시 4인 이상을 입력 받는다.
 * ?"4인이상 입력 요망"
 * 2. aName[] 변수에 입력수 만큼 생성후 복사 후 출력.
 * 3. aJo[] 변수 생성 타입은 int, 입력수 만큼 생성수, 1 ~ 입력수 사이의 값을 중복없이
 *    랜덤으로 할당.
 */

package classes;

public class JoconfirmV01 {

	public static void main(String[] args) {
		String[] aName;
		int[] aJo;
		int arrayInt;

		numberWriteOverCheck(args, 4);
		arrayInt = args.length;
		aName = args;
		aJo = new int[arrayInt];
		aJo = lotto(arrayInt, aJo);

		printAllHori(aName);
		printAllHori(aJo);

	}

	// 입력 갯수 검사
	public static void numberWriteOverCheck(String[] getData, int inputCount) {
		if (getData.length < inputCount) {
			System.out.println("입력 개수 오류 입니다.");
			System.exit(0);
		}
		System.out.println("입력개수 정상");
	}

	public static int[] lotto(int maxVal, int[] lottoNumber) {
		for (int i = 0; i < lottoNumber.length; i++) {
			lottoNumber[i] = (int) (Math.random() * maxVal + 1);
			for (int j = (i - 1); j >= 0; j--) {
				if (lottoNumber[i] == lottoNumber[j]) {
					--i;
					break;
				}

			}
		}
		return lottoNumber;
	}

	public static void printAllHori(int[] getInt) {
		for (int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

	public static void printAllHori(String[] getString) {
		for (int i = 0; i < getString.length; i++) {
			System.out.print(getString[i] + " ");
		}
		System.out.println();
	}

}
