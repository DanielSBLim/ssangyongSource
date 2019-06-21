// 1 실행시 pwn를 입력받니다.
// 2. pwn 길이가 8보다 작으면 "8 이상의 길이를 입력하세요" 출력
// 3. 그렇지 않으면 당신의 "패스워드는 happday 입니다." 출력

package classes;

class MemberChk02 {

		public static void main(String[] args) {
			String getText = args[0];

			if(getText.length() == 8){
				System.out.println("패스워드는 happday 입니다");
			} else {
				System.out.println("8 이상의 길이를 입력하세요");
			}

		}


}