/*
 * 1 ~ 10 까지 합친 결과 출력
 * hap 합치는 변수
 * count 숫자 세는 횟수
 */

package classes;

public class ForEx02 {

	public static void main(String[] args) {
		int hap = 0;
		
		for(int count = 1; count <= 10; ++count) {
			hap = hap + count;
		}

		System.out.println("1 ~ 10 까지 합 " + hap);
		
	}

}
