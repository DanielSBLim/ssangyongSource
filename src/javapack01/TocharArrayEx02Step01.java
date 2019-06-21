package javapack01;

public class TocharArrayEx02Step01 {

	public static void main(String[] args) {
		char[] getchar;
		String sInput = "1234432112";
		
		if (!(sInput.length() == 10)) {
			System.out.println("학생답안 개수 오류");
			System.exit(0);
		}
		getchar = args[0].toCharArray();
		int ivar;

		for (int i = 0; i < getchar.length; i++) {

			if (!(getchar[i] >= 49 && getchar[i] <= 52)) {
				System.out.println("답안 오류 확인 [ 1 ~ 4 사이의 답안 작성]");
				System.exit(0);
			}
		}
		for(int i = 0; i < getchar.length; i++) {
			System.out.println(getchar[i]);
		}

	}

}
