package util;

public class Repeat {

	// 몇개 반복 출력
	public static void mLine(int su, String line) {
		for (int i = 1; i <= su; i++) {
			System.out.print(line);
		}
		System.out.println();

	}

	// 마진 몇번 출력 몇번 출력
	public static void mLineMargin(int su, String line, int leftMargin) {
		for (int i = 1; i <= leftMargin; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= su; i++) {
			System.out.print(line);
		}
		System.out.println();

	}

	// 입력값 출력
	// 인트형
	// 배열 모든값 하나씩 가로로 츌력 ex 1 2 3 4
	public static void printAllHori(int[] getInt) {
		for (int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

	/*
	 * 배열 모든값 하나씩 세로로 츌력 ex) 1 2 3 4
	 */

	public static void printAllVert(int[] getInt) {
		for (int i = 0; i < getInt.length; i++) {
			System.out.println(getInt[i] + " ");
		}
	}

	// 문자열
	public static void printAllHori(String[] getString) {
		for (int i = 0; i < getString.length; i++) {
			System.out.print(getString[i] + " ");
		}
		System.out.println();
	}

	
	//원하는 배열을 랜덤값으로 지정하고 최대 랜덤 변수 사용
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

}
