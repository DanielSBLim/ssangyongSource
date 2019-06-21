/*
 * 실행시 숫자 하나를 입력 바당서 짝수, 홀수 구분하는 메세지 출력
 * 조건] args의 개수가 하나이상이면
 * 		"입력오류입니다[1개의 숫자를 입력하세요]"
 * 		스위치케이스
 * 결과 ]
 * 	입력하신 XX는 홀수 [짝수] 입니다.
 *	
 * 
 *
 */

package classes;

public class switchE03OddEven {

	public static void main(String[] args) {
		
		int getNumber = Integer.parseInt(args[0]);
		int mod;
		
		mod = getNumber % 2;
				
		if (args.length == 1 ) {
			
		switch(mod) { 
			case 0:
				System.out.println("입력하신" + getNumber + "는 짝수 입니다.");
				break;
			case 1:
				System.out.println("입력하신" + getNumber + "는 홀수 입니다.");
				break;
			default:
		}

		} else {
				System.out.println("입력오류입니다[1개의 숫자를 입력하세요]");
		}		

	}

}
