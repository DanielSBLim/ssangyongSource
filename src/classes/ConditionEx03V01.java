package classes;

public class ConditionEx03V01 {
	public static void main(String[] args) {
		int grade = 101;

		if (grade<= 100 || grade <= 0) {
			if 		(grade >= 90) System.out.println("A");
			else if (grade >= 80) System.out.println("B");
			else if (grade >= 70) System.out.println("C");
			else if (grade >= 60) System.out.println("D");
			else  System.out.println("F");
		} else {
			System.out.println(grade + "Ȯ���ϼ���");
		}
	}
}
