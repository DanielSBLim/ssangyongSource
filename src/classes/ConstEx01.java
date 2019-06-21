package classes;

import java.lang.*;

public class ConstEx01 {
	
	void main(int vI01, int vI02, int vI03, int vI04) {
		System.out.println("vI01 = " + vI01);
		System.out.println("vI02 = " + vI02);
		System.out.println("vI03 = " + vI03);
		System.out.println("vI04 = " + vI04);
	}
		
	public static void main(String[] args) {
		ConstEx01 constEx01 = new ConstEx01();
		
		
		constEx01.main(100, 100, 200, 300);
	}
 }
