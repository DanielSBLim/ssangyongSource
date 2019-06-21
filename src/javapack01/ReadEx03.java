/*
 * sysout "2 자리 숫자를 입력하세요" :
 * if(r02 == 13) ok
 *  sysout "입력된 숫자는 x 입니다"
 * if(r03 == 13 ) no
 * else
 *  sysout " 2자리 숫자를 입력 하세요 "
 *  System.out(); 
 */
package javapack01;

import java.io.IOException;

public class ReadEx03 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("2자리 숫자를 입력하세요");
		char c01, c02, c03;
		int i01 = System.in.read();
		int i02 = System.in.read();
		int i03 = System.in.read();
		c01 = (char)i01;
		c02 = (char)i02;
		c03 = (char)i03;

		if(i01 == 13) {
			System.out.println("아무곳도 입력 않했습니다.");
		} else if (i02 == 13) {
			System.out.println("입력하신 숫자는 " + c01);
		} else if (i03 == 13) {
			System.out.println("입력하신 숫자는 " + c01 +c02);
		} else {
			System.out.println(" 2자리 숫자를 입력 하세요 ");
		}
		
		
	}

}
