/*
 * 1. 사용자 -> 30 사이의 숫자를 입력 받는다 / [종료 : 0]
 * 	vRead
 * 2. math.random() 1 ~ 30 사아의 숫자 반환
 *  vRan
 *  3. vRean > vRan? "작은 숫자를 입력하세요"
 *     vRean < vRan? "큰 숫자를 입력하세요"
 *  .  vRean > vRan? "빙고~!! x번쩨 정답 입니다 "
 *  -------------------------------------
 *  3회 이하 : "천재 이십니다~^^/"
 *  4~7회   "양호하세요 하십니다/~^.^"
 *  8~10회 "분발하세요  -.-"
 *  11회 이상 "10회 초과 탈락 그만하세요.
 *  
 */

package javapack01;

import java.io.IOException;

import classes.UserObj;

public class GuessGameV01 {

	public static void main(String[] args) throws IOException {
		int vRan, count;

		vRan = (int) (Math.random() * 30);
		System.out.println("GuessGame 시작");
		count = GuessGame(vRan);
		printResult(count);

	}

	public static int GuessGame(int sameInt) throws IOException {
		int count = 0;
		int vRead;
		
		while (count < 11) {
			count++;
			System.out.println("사용자 -> 30 사이의 숫자를 입력 받는다 / [종료 : 0]");
			vRead = UserObj.intputNum();
			System.out.println(vRead);
			if (vRead == sameInt) {
				System.out.println("빙고~!! " + count + "번째 정답 입니다 ");
				break;
			} else if (vRead > sameInt) {
				System.out.println("작은 숫자를 입력하세요");
			} else {
				System.out.println("큰 숫자를 입력하세요");
			}

		}
		return count;

	}

	public static void printResult(int count) {
		if (count <= 3) {
			System.out.println("천재 이십니다~^^/");
		} else if (count <= 7) {
			System.out.println("양호하세요 하십니다/~^.^");
		} else if (count <= 10) {
			System.out.println("분발하세요  -.-");
		} else {
			System.out.println("10회 초과 탈락 그만하세요.");
		}
	}

}
