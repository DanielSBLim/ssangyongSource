package javapack01;

class FinalEx02 {
	static void mStatic02() {
		System.out.println("Override 메소드확인 [상위]");
	}
}

class FinalEx02Main extends FinalEx02 {

	
	void mStatic02() {
		System.out.println("Override 메소드확인");
	}

	public static void main(String[] args) {
		FinalEx01Main obj01 = new FinalEx01Main();
	}

}
