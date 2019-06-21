package classes;

import java.lang.*;

public class RetrunType02_1 {
	
	static int a = 100;

	static char charR01() {
		System.out.println("전역변수 a = " + a);
		a = 200;
		return '짱';
	}

	static int intR01() {
		System.out.println("전역변수 a = " + a);
		return 100;
	}

	static String StringR01(){
		return "좋은 하루";
	}

	public static void main(String[] args) {
		char c = charR01();
		int i  = intR01();
		String s= StringR01();
	}
}
