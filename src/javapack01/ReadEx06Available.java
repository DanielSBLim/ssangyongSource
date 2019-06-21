package javapack01;

import java.io.IOException;

public class ReadEx06Available {

	public static void main(String[] args) throws IOException {
		System.out.println("1 ~ 30 숫자를 입력하세요 : [종료 : 0]");
		int r01 = System.in.read();
		int r02 = System.in.read();
		
		int result = 0;
		int count = 0;
		
		int vAva = System.in.available();
		
		for(int i = 0; i < vAva; i++) {
			System.in.read();
		}
		System.out.println("2자이 읽은후 남은  Byte 개수 확인 : " + vAva);
		
	}

}
