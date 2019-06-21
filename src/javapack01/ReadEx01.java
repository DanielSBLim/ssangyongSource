package javapack01;

import java.io.*;

class ReadEx02 {
	
	public static void main(String[] args){
	
		
		System.out.println("문자를 입력하세요 : ");

	try{
		int r01 = System.in.read();
		System.out.println("입력된 문자는 : " + r01);

		} catch (IOException e) {
		}
		


	}
}
