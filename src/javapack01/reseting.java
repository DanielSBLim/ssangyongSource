package javapack01;

import java.io.*;

class reseting {

	public static void main(String[] args) throws IOException {

		while (true) { // ------------- 1차 ( While에 넣어주세요) While Start

			System.out.print("문자를 입력하세요 [ 종료 : 0 ] :");
			int r01 = System.in.read();
			int r02 = System.in.read();
			// int r03 = System.in.read(); // r03이면 13 == 두자리
			int result = 0;
			int count = 0;
			// -------------
			if ((char) r01 == '0') // 만약에 r01이 0이라면
			{
				System.out.println("Bye!"); // 바이!
				break; // 빠져나오세요~
			}

			while ((System.in.read() != 10)) // 13 == 두자리 10 == LF
			{
				count++;
			}

			if (count > 1) {
				System.out.println("2자리 이상 입니다.");
			}

			if (r02 == 13) // 13 = Enter 이므로 r01 다음에 13이 오면 한자리 수
			{
				result = r01 - 48;
				// 49-48은 1이니까 r01에서 1 빼주기
			}
			/*
			 * else if(r03 == 13) // 13 = Enter 이므로 r02 다음에 13이 오면 두자리 수 { result =((r01-48)
			 * * 10 + (r02 - 48)); // 49-48은 1이니까 r01에서 1 빼주고 *10으로 10의 자리 + r02-48 }
			 */
			else {
				System.out.printf("2자리 숫자를 입력하세요.\n");

			}

			if (result >= 1 || result >= 30) // 1 ~ 30 까지의 수가 맞는지 체크해보세용
			{
				System.out.printf("입력된 숫자는 %d 입니다.\n", result);
			} else {
				System.out.println("1 ~ 30 사이의 숫자를  입력하세요.");
			}
		} // ------------- While End
	}
}