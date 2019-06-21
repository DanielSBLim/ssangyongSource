package classes;

public class ExceptionEx04Finsh {
	public static void main(String[] args)  {
		int i = 0;
		
		try {
			for ( i = -3; i <= 3; i++) {
				System.out.println("10 / " + i + " = " + 10 / i);
			}
		} catch (ArithmeticException e) {
			System.out.printf("%d / %d Err 확인", 10, i);
		}

	}
}
