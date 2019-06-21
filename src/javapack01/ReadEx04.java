/*
 * 1 ~ 30 사이의 숫자입력하세요
 * 아니면 1~30 사이의 숫자를 입력하세요
 * 맞으면 입력한 숫자는 xx 입니다.
 */

package javapack01;

import java.io.IOException;

public class ReadEx04 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("2자리 숫자를 입력하세요");
		int i01 = System.in.read();
		int i02 = System.in.read();
		int i03 = System.in.read();

		calc(i01, i02, i03);
	}

	public static void calc(int first, int second, int third) {

		if (first == 13) {
			System.out.println("아무곳도 입력 않했습니다.");
		} else if (second == 13) {
			int result = first - 48;

			if (result > 0) {
				System.out.println(result);
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
}
