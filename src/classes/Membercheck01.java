
/* 실행시 아이디와 패스워드 입력
 * 결과] 맞으면 환영합니다. id( 변수값 출력)
 * Err] id 확인하세요
 * Err] pw 확인하세요
 *
 */			
package classes;
class StringEx01 {
	
	public static void main(String[] args) {
		int i01 = 10;
		int i02 = 10;
		String s01 = new String("Nice");
		String s02 = new String("Nice");

		if (i01 == i02) {
			System.out.println("i01 + i02 : " + (i01 == i02));
		} else {
			System.out.println("i01 + i02 : " + (s01 == s02));
		}	
	}
	
}

