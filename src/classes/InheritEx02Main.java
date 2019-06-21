package classes;

class InheritEx02 {
	int vI01 = 100;
	void mView() {
		System.out.println("상위 메소드 확인!!!");
	}
}



public class InheritEx02Main  extends InheritEx02 {
	int vI01 = 200;
	
	void mView() {
		System.out.println(vI01);
		System.out.println(this.vI01);
		System.out.println(super.vI01);
		System.out.println("상위 메소드 확인!!!");
	}
	
	void mPrint() {
		System.out.println(vI01);
		System.out.println(this.vI01);
		System.out.println(super.vI01);
		System.out.println("상위 메소드 확인!!!");
	}
	
	public static void main(String[] args) {
		InheritEx02Main obj = new InheritEx02Main();
		obj.mView();
		obj.mPrint();
	}

}
