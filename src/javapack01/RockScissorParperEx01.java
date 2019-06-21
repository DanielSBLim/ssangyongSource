package javapack01;

import java.util.Random;
import java.util.Scanner;

import AccountV01.UserObj;

public class RockScissorParperEx01 {

	public static void main(String[] args) {
		int iCom;
		int iHum;
		int iCount = 1;
		int iHWCount = 0;
		int iHLCount = 0;
		int iHDCount = 0;
		System.out.println("가위 바위 보를 시작 하겠습니다.");
		while (true) {

			UserObj.mLine(99, "=");
			System.out.println(iCount + "번째 게임 입니다.");
			UserObj.mLine(99, "=");
			System.out.println("[ 1. 가위  2. 바위  3. 보 ] 중 번호를 선택 [종료 : 0]");

			Random ram = new Random();
			Scanner sc = new Scanner(System.in);

			iCom = ram.nextInt(3) + 1;
			iHum = sc.nextInt();
			
			if (iHum == 0) {
				UserObj.mLine(99, "-");
				System.out.println("게임을 종료 하겠습니다");
				UserObj.mLine(99, "-");
				iCount--;
				break;
			} else if (!(iHum > 0 && iHum <= 3)) {
				System.out.println("다시 입력해주세요");
				if(iCount == 1) {
					
				} else {
					iCount--;
				}
				
				
				continue;
			}

			if (iHum == iCom) {
				System.out.println("비겼습니다");
				iHDCount++;
			} else {
				if (iHum == 1) {
					if (iCom == 3) {
						System.out.println("사람이 이겼습니다");
						iHWCount++;
					} else {
						System.out.println("컴퓨터가 이겼습니다");
						iHLCount++;
					}
				} else if (iHum == 2) {
					if (iCom == 3) {
						System.out.println("컴퓨터가 이겼습니다");
						iHLCount++;
					} else {
						System.out.println("사람이 이겼습니다");
						iHWCount++;
					}
				} else {
					if (iCom == 2) {
						System.out.println("사람이 이겼습니다");
						iHWCount++;

					} else {
						System.out.println("컴퓨터가 이겼습니다");
						iHLCount++;
					}

				}

			}
			iCount++;
			
		}
		if (iCount != 0) {
			System.out.printf("총%d회의 게임중\n", iCount);
			System.out.printf("당신은 %d회 이겼고\n", iHWCount);
			System.out.printf("컴퓨터는 %d회 이겼고\n", iHLCount);
			System.out.printf("비긴 횟수는 %d회 입니다\n", iHDCount);
			System.out.println("따라서 결과는");
			if (iHWCount == iHLCount) {
				System.out.println("비겼다");
			} else if (iHWCount > iHLCount) {
				System.out.println("사람이 이겻다");
			} else {
				System.out.println("인류의 종말이 시작됬다");
			}
		} else {
			System.out.println("게임 한판도 안함.");
		}
	}

}
