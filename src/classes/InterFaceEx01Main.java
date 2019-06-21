
package classes;

class InterFaceEx02 implements InterFaceEx01 {

	@Override
	public void mInter01() {
		System.out.println("InterFaceEx02상위인터페이스");
	}

	@Override
	public void mInter02() {
		System.out.println("InterFaceEx02상위인터페이스");
	}

}


class InterFaceEx03 implements InterFaceEx01 {

	@Override
	public void mInter01() {
		System.out.println("InterFaceEx03상위인터페이스");
	}

	@Override
	public void mInter02() {
		System.out.println("InterFaceEx03상위인터페이스");
	}

}

interface InterFaceEx01 {
	void mInter01();

	void mInter02();
}

public class InterFaceEx01Main {

	public static void main(String[] args) {
		InterFaceEx01 obj = new InterFaceEx02();
		InterFaceEx01 obj2 = new InterFaceEx03();
		
		
		obj.mInter01();
		obj.mInter02();
		obj2.mInter01();
		obj2.mInter02();

		System.out.println("메인인터페이스확인");
	}

}
