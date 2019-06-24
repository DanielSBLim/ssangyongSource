package javapack01;

import classes.UserObj;

public class ArrayMutiFradeEx01 {

	public static void main(String[] args) {
		int jumsu[][] = {	{89, 90, 85},
							{77, 90, 95},
							{85, 80, 75},
							{80, 50, 75}};
		
		System.out.println("결과");
		System.out.printf("%S%4S%4S%S\n", "번호", "국어", "영어", "수학");
		UserObj.mLine(99, "=");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.printf("%d %c %d %d %d \n", i + 1, '.', jumsu[i][0], jumsu[i][1], jumsu[i][2]);
		}
		UserObj.mLine(99, "=");
		int[] iTotal = {0, 0, 0}; // 국어, 영어, 수학
		float[] fAvr = {0, 0, 0}; // 국어, 영어, 수학
		
		for (int i = 0; i < jumsu.length; i++) {
			for(int j = 0; j < jumsu[i].length; j++) {
				iTotal[j] = iTotal[j] + jumsu[i][j];
				if(i == jumsu.length - 1) {
					fAvr[j] = (float)iTotal[j] / jumsu.length;
				}
			}
			
		}
		
		
		System.out.printf("%S%5d%5d%5d\n","총점", iTotal[0], iTotal[1], iTotal[2]);
		System.out.printf("%S %.2f %.2f %.2f","평균", fAvr[0], fAvr[1], fAvr[2]);
		
		
		
	}

}
