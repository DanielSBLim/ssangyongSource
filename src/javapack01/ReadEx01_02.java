package javapack01;
import java.io.*;

public class ReadEx01_02 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자를 입력하세요  : ");
		int r01 =  System.in.read();
		char c01 = (char)r01;
		System.out.println("입력된 문자는 : " + r01);
		System.out.println("입력된 문자는 : " + c01);
		System.out.printf("입력된 문자는 : %c", c01);
		System.out.println();
	}

}
