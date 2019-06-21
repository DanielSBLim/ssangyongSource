package classes;

import java.lang.*;

public class ReturnType02 {
	
	static char charR01() {
		return '¯';
	}

	static int intR01() {
		return 100;
	}

	static String StringR01(){
		return "���� �Ϸ�";
	}

	public static void main(String[] args) {
		char c = charR01();
		int i  = intR01();
		String s= StringR01();

		System.out.println("charR01() ��� = " + c);
		System.out.println("intR01()  ��� = " + i);
		System.out.println("charR01() ��� = " + s);



	}
}
