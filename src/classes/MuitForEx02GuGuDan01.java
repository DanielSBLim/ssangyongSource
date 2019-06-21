/*
 * 결과
 * " 2단 "
 * 9단까지 
 */

package classes;

public class MuitForEx02GuGuDan01 {

	public static void main(String[] args) {
		int result;

		for (int i = 2; i <= 9; ++i) {
			System.out.println("# " + i + "단  #");
			mLine(30, "=");
			for (int j = 2; j <= 9; j++) {
				result = i * j;
				System.out.println(i + " x " + j + " = " + result);
			}
			mLine(30, "-");

		}
	}
	
	public static void mLine(int su, String line) {
		for (int i = 0; i <= su; i++) {
			System.out.print(line);
		}
		System.out.println();
		
	}

}
