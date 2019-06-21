package javapack01;

public class StarticEx02 {
	int vI01 = 100;
	static int vI02 = 200;
	
	void mSum() {
		vI01++;
		vI02++;
	}
	
	void mPrint() {
		System.out.println(this);
		System.out.println(vI01);
		System.out.println(vI02);
	}
	
	
	public static void main(String[] args) {
		StarticEx02 obj01 = new StarticEx02(); obj01.mSum(); obj01.mPrint();
		StarticEx02 obj02 = new StarticEx02(); obj02.mSum(); obj02.mPrint();
		StarticEx02 obj03 = new StarticEx02(); obj03.mSum(); obj03.mPrint();

	}

}
