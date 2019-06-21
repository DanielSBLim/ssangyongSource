package classes;

import java.lang.*;

public class RetrunType01 {
	
	static void sum() {
		int i01 = 100;
		int i02 = 200;
		System.out.println("합을 계산하기 위한 메소드 입니다.");
	}

	static int sum2() {
		int i01 = 100;
		int i02 = 200;
		return i01 + i02; 
	}

	public static void main(String[] args) {
		sum();
		int result = sum2();
		System.out.println("반환된값 확인 !!! = " + result);
	}
}
