//  실행시 점수를 받아서 
//  0~100 사이의 점수가 아니면
//  점수 범위를 확인하세요. 그후 빠져 나간다.
//  결과 동일

package classes;
class ConditionEx02 {
	
		public static void main(String[] args) {
			int grade = Integer.parseInt(args[0]);
			
			if		(grade >= 90) System.out.println("A");
			else if (grade >= 80) System.out.println("B");
			else if (grade >= 70) System.out.println("C");
			else if (grade >= 60) System.out.println("D");
			else if (grade >= 0 ) System.out.println("F");
			else { 
				System.out.println("점수 범위를 확인하세요");
				System.exit(0);
			}
				
		}
}
			