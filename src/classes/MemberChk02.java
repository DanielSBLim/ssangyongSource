
/* 실행시 아이디와 패스워드 입력
 * 결과] 맞으면 환영합니다. id( 변수값 출력)
 * Err] id 확인하세요
 * Err] pw 확인하세요
 *
 */

package classes;

class MemberChk02 {

	public static void main(String[] args) {
		String getText1 = args[0];
		String getText2 = args[1];
		String id = "Orange";
		String pwd = "1234";

		String s01 = new String("Nice");
		String s02 = new String("Nice");

		if (getText1.equals(id)) {
			if (getText2.equals(pwd)) {
				System.out.println("환영합니다." + getText1);
			} else {
				System.out.println("pw 확인하세요");
			}
		} else {
			System.out.println("id 확인하세요");
		}
	}
}