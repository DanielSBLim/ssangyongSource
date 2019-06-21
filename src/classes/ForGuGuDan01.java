/*
 * 실행시 단을 입력하세요 (단은 하나만 입력해야한다.)
 * 
 * 2 ~ 9 사이이의 숫자가 아니라면 (유효성 검사) 
 *  - "[2 ~ 9 사이의 숫자를 입력하세요]"
 *  출력]
 *  # 9(변수값) #
 *  2 * 2 = xx 
 *  ~
 *  2 * 9 = xx	
 *  
 */
package classes;

import util.*;

public class ForGuGuDan01 {

	public static void main(String[] args) {
		int getInt, result;
		if (Effectiveness.inputCountERRCheck(args, 1)) {
			getInt = Integer.parseInt(args[0]);
			if (getInt > 0 && getInt <= 10) {
				System.out.println("# " + getInt + " #");
				for (int i = 1; i <= 9; ++i) {
					result = i * getInt;
					System.out.println(getInt + " x " + i + " = " + result);
				}
			} else {
				System.out.println("[2 ~ 9 사이의 숫자를 입력하세요]");
			}
		} else {
			System.out.println("한개만 입력해주세요");
		}

	}
	

}
