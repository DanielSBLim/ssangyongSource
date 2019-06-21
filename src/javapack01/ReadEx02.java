package javapack01;

import java.io.*;

public class ReadEx02 {

	public static void main(String[] args) throws IOException {

		
		System.out.println("문자를 입력하세요.");
		int r01 = System.in.read();
		int r02 = System.in.read();
		int r03 = System.in.read();
		
		System.out.println("입력된 문자는 : " + r01);
		System.out.println("입력된 문자는 : " + r02);
		System.out.println("입력된 문자는 : " + r03);
	}

}
