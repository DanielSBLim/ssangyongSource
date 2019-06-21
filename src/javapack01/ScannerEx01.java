/*
 * sysout "숫자를 입력하세요."
 * int vRead = scanObj.nextint();
 * sysout "입력된 숫자는 vRead 입니다."
 */
package javapack01;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");
		Scanner scanObj = new Scanner(System.in);
		int vRead = scanObj.nextInt();

		System.out.println("입력된 숫자는 " + vRead + " 입니다.");

	}

}
