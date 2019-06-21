/*
 * 선언 + 생성 int aI01[][] = new int[3][2]
 * 할당 
 */
package javapack01;

public class ArrayMutiEx02 {

	public static void main(String[] args) {

		int aI01[][] = new int[5][];
		for(int i = 0; i < aI01.length; i++ ) {
			for(int j = 0; j <= i; j++) {
				aI01[i] = new int[i + 1];
			}
			System.out.printf("aI01[%d].length = %d%n", i , aI01[i].length);
		}
		
		
	}

}
