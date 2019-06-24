package javapack01;

import java.util.Scanner;

import classes.UserObj;

public class VoteScanerEx01 {
	final static String[] strName = { "김경훈", "김우진", "박지우", "박채림", "신다울", "원병선", "유미희", "이선재", "이승현", "이준석", "임성범",
			"장선애", "전대현", "조연태", "주란", "하현수", "허정현" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		char cFlag = 0;
		int iTotalSelect = 0;
		int loop = 5;
		int[] result = new int[strName.length];
		int[] iArrayrank = new int[strName.length];

		System.out.printf("[1 ~ %d] 사이의 숫자를 입력하세요 종료 0\n", strName.length);

		iTotalSelect = sc.nextInt();
		if (iTotalSelect == 0) {
			System.out.println("byebye");
			System.exit(0);
		}

		String[][] inputData = new String[loop][iTotalSelect];
		System.out.println("입력한값  : " + iTotalSelect);
		UserObj.mLine(99, "=");

		// 프로그램 동작.
		for (int j = 0; j < loop; j++) {
			System.out.println((j + 1) + "번째 입력결과");
			UserObj.mLine(99, "=");

			for (int count = 0; count < iTotalSelect; count++) {
				System.out.println((count + 1) + "#" + iTotalSelect + "번째 이름 입력 : ");
				// 입력검사 및체크.
				while (true) {

					String getData = sc2.nextLine();

					for (int i = 0; i < strName.length; i++) {
						if (getData.equals(strName[i])) {
							result[i] += 1;
							cFlag = 1;
							inputData[j][count] = strName[i];
							break;
						}
					}
					if (cFlag == 1) {
						cFlag = 0;

						break;
					}
					System.out.println("후보자가 DB에 없습니다. 확인해주세요");
					System.out.println(getData);
				}
			}

		}
		UserObj.mLine(99, "-");
		for (int i = 0; i < loop; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			for (int j = 0; j < iTotalSelect; j++) {
				System.out.print(inputData[i][j] + " ");
			}
			System.out.println();

		}

		// 순위짜는 알고리즘 짜야함
		int rankCount = 1;
		int iMax = 0;
		int sameCount = 0;

		// 최대값구하기
		for (int i = 0; i < strName.length; i++) {
			if (result[i] > iMax) {
				iMax = result[i];
			}
		}

		// 순위 구하기
		for (int i = iMax; i >= 0; --i) {
			for (int j = 0; j < strName.length; j++) {
				if (result[j] == i) {
					iArrayrank[j] = rankCount;
					sameCount++;
				}

			}
			rankCount = rankCount + sameCount;
			sameCount = 0;
		}

		for (int i = 1; i < strName.length + 1; i++) {

			for (int j = 0; j < strName.length; j++) {
				if (iArrayrank[j] == i) {
					System.out.printf("%d등	%s	%d번 \n", iArrayrank[j], strName[j], result[j]);
				}
			}

		}

	}

}
