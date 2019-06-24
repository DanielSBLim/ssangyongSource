package javapack01;

import classes.UserObj;

public class GuGuDanMultiV2 {

	public static void main(String[] args) {
		
		UserObj.mLine(99, "=");
		firstPrint();
		UserObj.mLine(99, "=");
		gugudan();
		UserObj.mLine(99, "=");

	}

	public static void firstPrint() {
		for (int i = 2; i <= 9; i++) {
			System.out.printf("    %d단     ", i);
		}
		System.out.println();

	}

	public static void gugudan() {
		for (int var = 2; var < 10; var++) {
			for (int dan = 2; dan < 10; dan++) {
				System.out.printf("  %-2d* %-2d= %-2d", dan, var, dan * var);
			}
			System.out.println();

		}

	}

}
