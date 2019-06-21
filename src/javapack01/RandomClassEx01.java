package javapack01;

import java.util.Random;

public class RandomClassEx01 {
	

	public static void main(String[] args) {

		Random ranObj = new Random();
		int vRanl01 = ranObj.nextInt(29);
		System.out.println((vRanl01 + 1));

	}

}
