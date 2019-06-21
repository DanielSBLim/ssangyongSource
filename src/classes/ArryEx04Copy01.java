package classes;

public class ArryEx04Copy01 {

	public static void main(String[] args) {
		String[] strName;

		numberWriteOverCheck(args, 3);
		strName = args;
		printAllHori(strName);

	}

	public static void numberWriteOverCheck(String[] getData, int inputCount) {
		if (getData.length < inputCount) {
			System.out.println("입력 개수 오류 입니다.");
			System.exit(0);
		}
		System.out.println("입력개수 정상");
	}

	public static void printAllHori(String[] getString) {
		for (int i = 0; i < getString.length; i++) {
			System.out.print(getString[i] + " ");
		}
		System.out.println();
	}

}
