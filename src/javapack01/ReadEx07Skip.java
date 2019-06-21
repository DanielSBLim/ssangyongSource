package javapack01;

import java.io.IOException;

public class ReadEx07Skip {

	public static void main(String[] args) throws IOException {
		System.out.println("1 ~ 30 숫자를 입력하세요 : [종료 : 0]");
		int r01 = System.in.read();
		int r02 = System.in.read();
		
		long vAva = (long)System.in.available();
		System.in.skip(vAva);
		vAva = (long)System.in.available();
		System.out.println("2자이 읽은후 남은  Byte 개수 확인 : " + vAva);
	}

}
