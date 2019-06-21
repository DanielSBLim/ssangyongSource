/*
 * 무한 반복
 * 0입력시  종료
 */

package javapack01;

import java.io.IOException;

public class ReadEx05WarmUp01 {

	public static void main(String[] args) throws IOException {

		while (true) {
			System.out.print("1 ~ 30사이의 숫자를 입력하세요 : [종료 : 0]\n");
			int i01 = System.in.read();
			int i02 = System.in.read();
			int i03;

			if (i02 == 13) {
				int itemp02 = System.in.read();
				calcTwo(i01, i02, itemp02);

			} else {
				i03 = System.in.read();
				if (i03 == 13) {

					int itemp03 = System.in.read();
					calcThree(i01, i02, i03, itemp03);
				}
			}

		}
	}

	public static void calcThree(int first, int second, int third, int temp) {

		if (first == 13) {
			System.out.println("아무곳도 입력 않했습니다.");

		} else if (second == 13) {
			int result = first - 48;

			if (result > 0) {
				System.out.println(result);
			} else if (result == 0) {
				System.out.println("byebye");
				System.exit(0);
			} else {
				System.out.println("범위를 넘었습니다.");
			}
		} else if (third == 13) {
			int result = ((first - 48) * 10) + (second - 48);

			if (result < 31) {
				System.out.println(result);
			} else {
				System.out.println("범위를 넘었습니다.");
			}
		} else {
			System.out.println(" 2자리 숫자를 입력 하세요 ");
		}

	}

	public static void calcTwo(int first, int second, int temp) {

		if (first == 13) {
			System.out.println("아무곳도 입력 않했습니다.");

		} else if (second == 13) {
			int result = first - 48;

			if (result > 0) {
				System.out.println(result);
			} else if (result == 0) {
				System.out.println("byebye");
				System.exit(0);
			} else {
				System.out.println("범위를 넘었습니다.");
			}
		} else if (temp == 13) {
			int result = ((first - 48) * 10) + (second - 48);

			if (result < 31) {
				System.out.println(result);
			} else {
				System.out.println("범위를 넘었습니다.");
			}
		} else {
			System.out.println(" 2자리 숫자를 입력 하세요 ");
		}

	}

}
