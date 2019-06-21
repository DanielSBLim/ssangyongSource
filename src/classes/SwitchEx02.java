/*
 * 실행시 숫자 (월 : 1~12 월)를 입력받아서
 * 조건 : 12 1 2 / 3 4 5 /6 7 8/ 9 10 11 
 * switch case 로 할것
 * 결과 : 입력하신 xx월은 [봄, 여룸, 가을, 겨울] 입니다.
 * 		1~ 12사이의 숫자가 아니라면  숫자 범위가 틀렸습니다.
 * 
 */


package classes;

public class SwitchEx02 {

	
	public static int seasonSelect(int getText) {
		
		if (getText == 12 || getText == 1 || getText == 2) {
			return 0;
		} else if (getText == 3 || getText == 4 || getText == 5) {
			return 1;
		} else if (getText == 6 || getText == 7 || getText == 8) {
			return 2;
		} else if (getText == 9 || getText == 10 || getText == 11) {
			return 3;
			
		} else { return 4; }
	}
	
	public static void main(String[] args) {
		
		int getText = Integer.parseInt(args[0]);
					
			switch (seasonSelect(getText)) {
			case 0:
				System.out.println("겨울");
			break;
			
			case 1:
				System.out.println("봄");
			break;
				
			case 2:
				System.out.println("여름");
			break;
			
			case 3:
				System.out.println("가을");
			break;
			
			default:
				System.out.println("숫자 범위가 틀렸습니다.");
			break;
			}
		
	}
}


