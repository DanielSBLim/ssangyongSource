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

/*
 * 
 */

package javapack01;

import java.util.Scanner;

import classes.UserObj;

public class TocharArrayEx04Compare {

	
// 정답입력
	static char[] jungDap = { '1', '2', '3', '4', '4', '3', '2', '1', '3', '2' };
	static char[] cAnswer;

	public static void main(String[] args) {
// 학생값 입력
		String aName[] = { "둘  리", "영  희", "또  치", "마이콜", "공실이", "고길동", "공실이", "희둥이", "엄  마", "도우너" };
		String aHakDap[] = { "1234432133", "1234432132", "1234432132", "1234432132", "1234432132", "1234432132",
				"1234432132", "1234432132", "1234432132", "1234432132" };

// 판단시작
		char[][] ox;
		ox = new char[aName.length][];
		// 수식 비교 다중
		ox = mutiCompare(ox, aName, jungDap, aHakDap);

// 출력
		UserObj.mLine(99, "=");
		System.out.print("정  답 : ");
		for (int i = 0; i < jungDap.length; i++) {
			System.out.printf("%-2C", jungDap[i]);
		}
		System.out.println();
		UserObj.mLine(99, "=");

		// 출력 다중
		mutiPrintAll(aHakDap, jungDap, ox, aName);
	}

	// 입력값 범위 검사
	public static void intputNumberOverCheck(char[] intput) {
		if (!(intput.length == 10)) {
			System.out.println("입력 개수 오류");
			System.exit(0);
		}
	}

	// 한개의 범위가 1~4까지 범위검사
	public static void numberlengthOverErrCheck(char[] getchar) {
		for (int i = 0; i < getchar.length; i++) {

			if (!(getchar[i] >= 49 && getchar[i] <= 52)) {
				System.out.println("범위 입력 오류 확인 [ 1 ~ 4 사이의 답안 작성]");
				System.exit(0);
			}
		}

	}

	// 판단 메소드
	public static void mCompare(String data) {
		cAnswer = new char[data.length()];
		char[] cStoC = data.toCharArray();
		for (int i = 0; i < cStoC.length; i++) {
			if (cStoC[i] == jungDap[i]) {
				cAnswer[i] = 'O';
			} else {
				cAnswer[i] = 'X';
			}
		}

	}

	// 출력 메소드
	public static void printAll(char[] first, char[] second, char[] third, String name) {
		int jumsu = 0;

		System.out.print(name + " : ");

		// 첫번째 배열 변수 출력
		for (int i = 0; i < first.length; i++) {
			System.out.printf("%-2C", first[i]);
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

		System.out.printf("점 수  : %d", jumsu);
		System.out.println();
		jumsu = 0;
	}

	public static void mutiPrintAll(String[] cHakDap, char[] cjungDap, char[][] cOX, String[] aName) {
		for (int i = 0; i < aName.length; i++) {
			printAll(cHakDap[i].toCharArray(), cjungDap, cOX[i], aName[i]);
		}
	}

	public static char[][] mutiCompare(char[][] ox, String[] name, char[] jungDap, String[] aHakDap) {
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < jungDap.length; j++) {
				mCompare(aHakDap[i]);
				ox[i] = cAnswer;
			}
		}
		return ox;

	}
}
