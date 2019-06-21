package javapack01;

public class StaricEx01 {

	int vI01 = 100;
	int VI02 = 200;
	
	void mSum() {
		System.out.println(vI01 + vI02);
	}
	
	public static void main(String[] args) {
		StaricEx01 ex01 = new StaricEx01();
		
		// 메모리에 올려져 있지 않기 때문에 문제가 발생
		//System.out.println(vI01 + VI02);
		
		// 따라서 메모리가 올려져있는 객체안에 변수를 이용하면 사용이가능하다. 
		System.out.println(ex01.vI01 + ex01.VI02);
		
		// 메모리에 올려져 있지 않기 때문에 문제가 발생
		//mSum()
		
		// 메모리에 올려져 있지 않기 때문에 문제가 발생
		ex01.mSum();
	}

}
