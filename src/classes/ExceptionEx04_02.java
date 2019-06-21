package classes;

public class ExceptionEx04_02 {
	public static void main(String[] args) {
		int i = 0;
		for (i = -3; i <= 3; i++) {
			try {

				System.out.println("10 / " + i + " = " + 10 / i);

			} catch (ArithmeticException e) {
				System.out.printf("%d / %d Err 확인\n", 10, i);
			} finally {
				UserObj.mLine(15, "-");
			}
		}
	}

}
