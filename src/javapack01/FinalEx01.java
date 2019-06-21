package javapack01;

public class FinalEx01 {
	int vI01 = 100;
	void mFianl01() {
		System.out.println("상위메소드확인");
	}
}

class FinalEx01Main extends FinalEx01 {
	int vI02 = 200;

	void mFianl01() {
		System.out.println("하위메소드확인");
	}
	public static void main(String[] args) {
		FinalEx01Main obj01 = new FinalEx01Main();
		obj01.vI01 = 200;
	}

}
/*
 * Final 이라는 예약자는 변경할수 없는 상수 값으로 만드는 예약자이며.
 * 따라서 변수는 변경이 안되며
 * 		메소드는 override가 안되며
 * 		클래스는  상속이 가능하지 않습니다.
 */
