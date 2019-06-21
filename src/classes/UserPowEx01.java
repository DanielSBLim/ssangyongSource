package classes;

public class UserPowEx01 {

	public static void main(String[] args) {
		int var[];
		int result;

		numberWriteOver(args, 2);
		var = changeTypeStoI(args);
		result = userPow(var[0], var[1]);

		System.out.println(var[0] + " ^ " + var[1] + " = " + result);
	}

	public static int userPow(int getInt1, int getInt2) {
		int result = 1;

		System.out.println("계산 진행 중");
		if (getInt2 != 0) {
			for (int i = 0; i < getInt2; i++) {
				result = result * getInt1;
			}
		}
		System.out.println("계산 완료");
		return result;
	}

	public static int[] changeTypeStoI(String[] getData) {
		int[] printInt = new int[getData.length];

		for (int i = 0; i < getData.length; i++) {
			printInt[i] = Integer.parseInt(getData[i]);
		}
		return printInt;
	}


	public static void numberWriteOver(String[] getData, int inputCount) {
		if (getData.length != inputCount) {
			System.out.println("입력 개수 오류 입니다.");
			System.exit(0);
		}
		System.out.println("입력개수 정상");
	}

}
