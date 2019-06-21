package util;

public class Effectiveness {

	// 입력 갯수 검사
	public static boolean inputCountERRCheck(String[] getText, int checkNum) {

		if (getText.length == checkNum) {
			return true;
		} else {
			System.out.println("정해진 갯수에 맞쳐서 넣으세요");
			return false;
		}
	}

	public static void numberWriteOverCheck(String[] getData, int inputCount) {
		if (getData.length != inputCount) {
			System.out.println("입력 개수 오류 입니다.");
			System.exit(0);
		}
		System.out.println("입력개수 정상");
	}
	
	public static void numberWriteOverCheckMoreThan(String[] getData, int inputCount) {
		if (getData.length >= inputCount) {
			System.out.println("입력 개수 오류 입니다.");
			System.exit(0);
		}
		System.out.println("입력개수 정상");
	}
	

	// 입력 범위 검사
	public static void numberLengthOverCheck(int[] getInt, int maxLength, int lowLength) {
		for (int i = 0; i < getInt.length; i++) {
			if (!(getInt[i] > lowLength && getInt[i] < maxLength)) {
				System.out.println("숫자 범위 오류 확인 [ 1 ~ 45 ]");
				System.exit(0);
			}
		}
		System.out.println("숫자 범위 정상");
	}

	// 동일값 검사
	public static void sameErrCheck(int[] getdata) {
		for (int i = 0; i < getdata.length; i++) {
			for (int j = i + 1; j < getdata.length; j++) {
				if (getdata[i] == getdata[j]) {
					System.out.println("같은 숫자 입력 확인 [중복 불가]");
					System.exit(0);
				}
			}
		}
		System.out.println("동일값정상");
	}

}
