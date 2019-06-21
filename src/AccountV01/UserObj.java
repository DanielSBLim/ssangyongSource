/*
 * 무한 반복
 * 0?��?��?��  종료
 */

package AccountV01;

import java.io.IOException;
import java.util.Scanner;

public class UserObj {

	public static int intputNum() throws IOException {
		int vNum01 = System.in.read();
		int vNum02 = System.in.read();
		int count = 0;
		while (System.in.read() != 10) {
			count++;
		}
		return calcTwo(vNum01, vNum02, count);
	}

	public static void mLine(int su, String line) {
		for (int i = 1; i <= su; i++) {
			System.out.print(line);
		}
		System.out.println();

	}

	public static int calcTwo(int first, int second, int count) {

		if (first == 13) {
			System.out.println("?��무곳?�� ?��?�� ?��?��?��?��?��.");
			return -1;
		} else if (second == 13) {
			int result = first - 48;

			if (result > 0) {
				return result;
			} else if (result == 0) {
				System.out.println("byebye");
				System.exit(0);
			} else {
				System.out.println("범위�? ?��?��?��?��?��.");
				return -1;
			}
		} else if (count < 3) {
			int result = ((first - 48) * 10) + (second - 48);

			if (result < 31) {
				return result;
			} else {
				System.out.println("범위�? ?��?��?��?��?��.");
				return -1;
			}
		} else {
			System.out.println(" 범위�? ?��?��?��?��?�� ");
			return -1;
		}
		return -1;
		

	}
	
	public static int intScan() {
		Scanner iScan = new Scanner(System.in);
		return iScan.nextInt();
	}
	
	public static String stirngScan() {
		Scanner sScan = new Scanner(System.in);
		return sScan.nextLine();
	}
	

}
