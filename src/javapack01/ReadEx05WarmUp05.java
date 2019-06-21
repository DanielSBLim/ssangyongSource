package javapack01;

import java.io.*;

// 1~30 사이의 숫자 입력하세요
public class ReadEx05WarmUp05 {

	public static void main(String[] args) throws IOException {

		while (true) {
			System.out.print("1~30 사이의 숫자를 입력하세요: (종료 :0) ");
			int count= 0;
			int r01 = System.in.read();
			int r02 = System.in.read();
			while (System.in.read() != 10) {
				count++;
			}
			int result = 0;

			

//0일때
			if (r01 == 48) {
				System.out.println("ByeBye~~~");
				break;
			}

// 1자리일때
//			if (count > 1) {
//				System.out.print("두자리 이상입니다");
//				System.out.println((char)r01 + (char)r02);
//				continue;
//			}

// 1
			if (r02 == 13) {
				result = r01 - 48;
				System.out.print("입력하신 값 은:" + result);
				System.out.println();
			} else {
				result = (r01 - 48) * 10 + (r02 - 48);
			}
		}
	}
}
