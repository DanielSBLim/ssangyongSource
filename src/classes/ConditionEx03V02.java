package classes;

class ConditionEx03V02{

	public static void main(String[] args) {
			int grade = Integer.parseInt(args[0]);
			

			if (grade>=101 && grade <= -1) {
				if 		(grade >= 90) System.out.println("A");
				else if (grade >= 80) System.out.println("B");
				else if (grade >= 70) System.out.println("C");
				else if (grade >= 60) System.out.println("D");
				else  System.out.println("F");
			} else {
				System.out.println(grade + "확인하세요");
			}
		}
}
