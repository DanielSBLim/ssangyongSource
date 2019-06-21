package classes;

public class ExceptionEx07 {

	public static void main(String[] args) {
		StudentDTO[] sutDTO = new StudentDTO[3];
		sutDTO[0] = new StudentDTO("SYU01", "보라돌이");
		sutDTO[1] = new StudentDTO("SYU02", "뽀오");

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(sutDTO[i].getNum() + " / " + sutDTO[i].getName());
				System.out.println("10  / " + i + " = " + (10 / i));
			} catch (ArithmeticException e) {
				System.out.println("10/0 이기에 ArithmeticException");
			} catch (NullPointerException e) {
				System.out.println("빈 값이 나오기에 NullPointerException");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("범위 초과이기에 IndexOutOfBoundsException");
			}
		}

	}
}
