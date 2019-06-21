/*
 * 실행시 6개의 숫자를 입력 받는다. 
 * 
 *  1. 실행시 6개만 받아야한다.(System.out으로 처리)
 * 	옮지 않는 경우 "입력 개수 오류 입니다."
 * 
 * 	2. 각 숫자가 0 ~ 45 사이에 숫자가 아니라면
 *  "숫자 범위 오류 확인 [ 1 ~ 45 ]" 
 *  
 *  3. 6개의 숫자를 비교 해서 동일 숫자존재 하면
 *  "같은 숫자 입력 확인 [중복 불가]"
 * 
 */

package classes;

public class LottoWarmUp {

	public static void main(String[] args) {
		int[] var;

		numberWriteOver(args, 6);
		var = changeTypeStoI(args);
		numberLengthOver(var);
		sameErr(var);
		System.out.println("출력결과");
		printAll(var);
		

	}

	public static int[] changeTypeStoI(String[] getData) {
		int[] printInt = new int[getData.length];

		for (int i = 0; i < getData.length; i++) {
			printInt[i] = Integer.parseInt(getData[i]);
		}
		return printInt;

	}

	public static void numberWriteOver(String[] getData, int inputCount) {
		if(getData.length != inputCount) {
			System.out.println( "입력 개수 오류 입니다.");
			System.exit(0);
		}
		System.out.println("입력개수 정상");
	}
	
	public static void numberLengthOver(int[] getInt) {
		for (int i = 0; i < getInt.length; i++ ) {
			if(!(getInt[i] > 0 && getInt[i] < 46)) {
				System.out.println("숫자 범위 오류 확인 [ 1 ~ 45 ]");
				System.exit(0);
			} 
		}
		System.out.println("숫자 범위 정상");
	}
	
	public static void sameErr(int[] getdata) {
		for(int i = 0; i < getdata.length; i++) {
			for(int j = i + 1; j < getdata.length; j++) {
				if(getdata[i] == getdata[j]) {
					System.out.println("같은 숫자 입력 확인 [중복 불가]");
					System.exit(0);
				}
			}
		}
		System.out.println("동일값정상");
	}
	public static void printAll(int[] getInt) {
		for(int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

}
