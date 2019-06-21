package classes;

import java.io.IOException;

public class ExceptionEx01 {

	public static void main(String[] args)  {
		int a = 0;

		System.out.printf("문자를 입력하세요");
		

		try {
			a =  System.in.read();

		} catch (IOException e) {
			System.out.println("에러 발생");
		} 
		
		System.out.println("입력된문자 : " + (char)a);
		System.out.println("입력된문자 : " +  a);
	}

}
