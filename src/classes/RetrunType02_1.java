package classes;

import java.lang.*;

public class RetrunType02_1 {
	
	static int a = 100;

	static char charR01() {
		System.out.println("�������� a = " + a);
		a = 200;
		return '¯';
	}

	static int intR01() {
		System.out.println("�������� a = " + a);
		return 100;
	}

	static String StringR01(){
		return "���� �Ϸ�";
	}

	public static void main(String[] args) {
		char c = charR01();
		int i  = intR01();
		String s= StringR01();
	}
}
