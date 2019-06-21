/*
 * char jungDap[] = "1234432132";
 * 입력된 학생값과 정답이 일치 하면 -> +10점
 * char ox[] = new char[jungDamlength]
 * 
 * [출력]
 *  학생답 : x x x x
 *  정   답 : 1 2 3 4 
 *  ox판단: 0 X X 0
 *  ---------------
 *  점수 : 
 *  
 */

package javapack01;

public class TocharArrayEx02Finish {

	public static void main(String[] args) {

		String varText = "1334432112";
		// 학생값 입력
		char[] getchar;
		getchar = varText.toCharArray();
		intputNumberOverCheck(getchar);
		numberlengthOverErrCheck(getchar);

		// 문제 풀기
		char[] jungDap = { '1', '2', '3', '4', '4', '3', '2', '1', '3', '2' };
		char[] ox;

		ox = judgment(getchar, jungDap);
		printAll(getchar, jungDap, ox);
	}

	// 입력값 범위 검사
	public static void intputNumberOverCheck(char[] intput) {
		if (!(intput.length == 10)) {
			System.out.println("학생답안 개수 오류");
			System.exit(0);
		}

	}

	// 한개의 범위가 1~4까지 범위검사
	public static void numberlengthOverErrCheck(char[] getchar) {
		for (int i = 0; i < getchar.length; i++) {

			if (!(getchar[i] >= 49 && getchar[i] <= 52)) {
				System.out.println("답안 오류 확인 [ 1 ~ 4 사이의 답안 작성]");
				System.exit(0);
			}
		}

	}

	// 판단 메소드
	public static char[] judgment(char[] data, char[] answer) {
		char[] cAnswer = new char[data.length];

		for (int i = 0; i < data.length; i++) {
			if (data[i] == answer[i]) {
				cAnswer[i] = 'O';
			} else {
				cAnswer[i] = 'X';
			}
		}
		return cAnswer;

	}

	// 출력 메소드
	public static void printAll(char[] first, char[] second, char[] third) {
		int jumsu = 0;

		// 첫번째 배열 변수 출력
		System.out.printf("학생값 : ");
		for (int i = 0; i < first.length; i++) {
			System.out.printf("%-2C", first[i]);
		}
		System.out.println();

		// 두번째 배열 변수 출력
		System.out.print("정  답 : ");
		for (int i = 0; i < second.length; i++) {
			System.out.printf("%-2C", second[i]);
		}
		System.out.println();

		// 세번째 배열 변수 출력
		for (int i = 0; i < third.length; i++) {
			if (i == 0) {
				System.out.printf("%10C ", third[i]);
			} else {
				System.out.printf("%-2C", third[i]);
			}
			if (third[i] == 'O') {
				jumsu = jumsu + 10;
			}
		}
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.printf("점 수  : %d", jumsu);
	}

}
