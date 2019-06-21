/*
 * 실행시 수식을 입력 받아서,
 * 수식 :  피연산자 연산사 피연산자 -> 환경
 * 1. args.____! =3
 * 			? 수식오류입니다.
 * 2. 연산자 : + - X / 가 아니라면 
 * 			? 연산자 오류입니다.
 * 결과]
 * 	 X + Y = Z
 */

package classes;

public class CalaV04 {

	public static void main(String[] args) {

		int x, y;
		String oper;

		if (args.length == 3) {
			x = Integer.parseInt(args[0]);
			oper = args[1];
			y = Integer.parseInt(args[2]);
			if (oper.equals("+")) {
				System.out.println(x + " + " + y + " = " + (x + y));
			} else if (oper.equals("-")) {
				System.out.println(x + " - " + y + " = " + (x - y));
			} else if (oper.equals("/")) {
				System.out.println(x + " / " + y + " = " + (x / y));
			} else if (oper.equals("x")) {
				System.out.println(x + " x " + y + " = " + (x * y));
			} else
				System.out.println("연산자 오류입니다.");
		} else
			System.out.println("수식 오류입니다.");

	}

}
