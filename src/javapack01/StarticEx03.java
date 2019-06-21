package javapack01;

public class StarticEx03 {
	int vI01 = 100;
	static int vI02 = 200;

	StarticEx03(){
		System.out.println("생성자 확인");
	}
	
	static	{
		System.out.println("Static 블록확인");
	
		
	}
	
	void mStatic1() {
		System.out.println("vI01 = " + vI01);
		System.out.println("vI02 = " + vI02);
	}
	
	void mStatic2() {
		System.out.println("vI01 = " + vI01);
		System.out.println("vI02 = " + vI02);
	}
	
	public static void main(String[] args) {
		StarticEx03 obj01 = new StarticEx03();
		obj01.mStatic1();
		obj01.mStatic2();

	}

}
