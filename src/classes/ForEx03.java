/* 
 * 1~10까지의 합, 홀수합, 짝수합를 출력하세요ㅕ.
 * 결과 
 * 	1 ~ 10 까지의 합 : xx
 * 	1 ~ 10 까지의 홀수 합 : xx
 * 	1 ~ 10 까지의 짝수 합 : xx
 * 	vAdd, Vodd, vEven
 * 	for문은 한개만.
 * 
 */

package classes;

public class ForEx03 {

	public static void main(String[] args) {
		int vAdd, Vodd, vEven;
		
		vAdd = 0;
		vEven = 0;
		Vodd = 0;
	
		for (int i = 0; i <=10; ++i) {
			vAdd = vAdd + i;
			if (0 == i % 2) {
				vEven =+ i;
			} else {
				Vodd =+ i;
			}	
		}
		System.out.println("1 ~ 10 까지의 합 " + vAdd);
		System.out.println("1 ~ 10 까지의 홀수 합 " + Vodd);
		System.out.println("1 ~ 10 까지의 짝수 합 " + vEven);
	}
}
