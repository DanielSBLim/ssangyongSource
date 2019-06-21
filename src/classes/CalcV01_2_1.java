package classes;

import java.lang.*;

public class CalcV01_2_1 {
		
	public static void main(String[] args) {
		int su01, su02;
		
		su01 = 50;
		su02 = 60;
		
		System.out.println("su01 + su02 = " + (su01 + su02));
		System.out.println("su01 - su02 = " + (su01 - su02));
		System.out.println("su01 X su02 = " + (su01 * su02));
		System.out.println("su01 �� su02 = " + (su01 / su02));
		
		System.out.println("�߰� ����");
		System.out.println(args[0] + " + " + args[1]+ " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
		System.out.println(args[0] + " - " + args[1]+ " = " + (Integer.parseInt(args[0]) - Integer.parseInt(args[1])));
		System.out.println(args[0] + " X " + args[1]+ " = " + (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
		System.out.println(args[0] + " �� " + args[1]+ " = " + (Integer.parseInt(args[0]) / Integer.parseInt(args[1])));
		

		
	}
 }
