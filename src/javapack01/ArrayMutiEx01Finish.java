package javapack01;

public class ArrayMutiEx01Finish {

	public static void main(String[] args) {
		int aI01[][];
		int count = 1;
		aI01 = new int[3][2];
//		System.out.println(aI01.length);
//		System.out.println(aI01[0].length);
		
		for(int i = 0; i < aI01.length; i++) {
			for(int j = 0; j < aI01[i].length; j++) {
				
				aI01[i][j] = count;
				count++;
				System.out.printf("aI01[%d][%d] = %-2d ",i , j, aI01[i][j]);
			}
			System.out.println();
		}
	}

}
