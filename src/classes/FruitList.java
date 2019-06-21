/*
 * 1. 실행시 1개의 숫자 입력 받는다.
 * 2. 숫자 반복..... ex) 25입력이면 1~25까지
 * 3. 3으로 나누워서 나머지가 0이면 Orange 리스트 누적?
 * 4. 4으로 나누워서 나머지가 0이면  StrawBerry 리스트 누적
 * 5. 5으로 나누워서 나머지가 0이면  ManGo 리스트 누적
 * 6. 8으로 나누워서 나머지가 0이면 Apple 리스트 누적
 *  결과]
 *  "## FruitList ##
 *  1
 *  2
 *  3. Orange
 *  15. Orange, ManGo
 *  
 */
package classes;

public class FruitList {

	public static void main(String[] args) {
		int intMaxNumber, orangeCount, strawBerryCount, manGoCount, appleCount;
		int[] intArray;

		numberWriteOverCheckMoreThan(args, 1);
		intMaxNumber = Integer.parseInt(args[0]);
		intArray = new int[intMaxNumber];
		orangeCount = 0;
		strawBerryCount = 0;
		manGoCount = 0;
		appleCount = 0;
		
		for (int i = 0; i < intMaxNumber; i++) {
			intArray[i] = i + 1;
		}

		System.out.println("## " + intMaxNumber +"회F ruitList ##");
		for (int i = 0; i < intMaxNumber; i++) {
			System.out.print(intArray[i] + ". ");
			if (intArray[i] % 3 == 0) {
				System.out.print(" Orange");
				orangeCount++;
			}
			if (intArray[i] % 4 == 0) {
				System.out.print(" StrawBerry");
				strawBerryCount++;
			}
			if (intArray[i] % 5 == 0) {
				System.out.print(" ManGo");
				manGoCount++;
			}
			if (intArray[i] % 8 == 0) {
				System.out.print(" Apple");
				appleCount++;
			}
			System.out.println();
		}
		System.out.println("## Fruit Count List ##");
		System.out.println("1. Orange : " + orangeCount + " 회");
		System.out.println("2. StrawBerry : " + strawBerryCount + " 회");
		System.out.println("3. ManGo : " + manGoCount + " 회");
		System.out.println("4. Apple : " + appleCount + " 회");
		
		
		

	}

	public static void numberWriteOverCheckMoreThan(String[] getData, int inputCount) {
		if (!(getData.length == inputCount)) {
			System.out.println("입력 개수 오류 입니다.");
			System.exit(0);
		} else {
			System.out.println("입력개수 정상");
		}

	}

	public static void printAllHori(int[] getInt) {
		for (int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

}
