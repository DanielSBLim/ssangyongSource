package javapack01;

import java.io.IOException;

import classes.UserObj;

public class ReadEx05Finish01 {

	public static void main(String[] args) throws IOException {
		int var;
		while (true) {

			System.out.println("시작");
			System.out.println("1 ~ 30 사이의 숫자를 입력하세요. 종료하고 싶으면 0을 입력하세요");
			var = UserObj.intputNum();

			if (var <= 30 && var >= 1) {
				System.out.println("입력값은 : " + var);

			} else {
				System.out.println("값 범위 문제");
			}
		}
	}

}
