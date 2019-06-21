package classes;

import java.io.IOException;

import javax.imageio.IIOException;

 class userException01Never extends Exception{
	userException01Never(){
		System.out.println("A 문자 입력 불가입니다.");
	}
}

public class ExceptionEx08 {


	
	
	public static void main(String[] args) {
		System.out.println("문자를 입력하세요");
		int r01 = 0;
		
		try {
			r01 = System.in.read();
			if(r01 == 65) {
				throw new userException01Never();
			}
			System.out.println("입력한 문자는 " + (char)r01 + "입니다");
		} catch (IOException e) {
			System.out.println(e);
		} catch (userException01Never e) {
			System.out.println(e);
		}
	}
}
