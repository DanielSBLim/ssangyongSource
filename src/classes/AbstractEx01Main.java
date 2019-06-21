package classes;


abstract class AbstractEx01 {
	int vI01 = 100;
	
	// 1. AbstractEx01 클래스가  Abstract(추상화) 가 아니기에 안됨
	// 2. Abstract(추상화) 메소드 구현부에 동작코드가 있어서 동작이 안됨
	// 3. Abstract(추상화)는 객체 생성이 안되기에 동작이 안됨.
	
	abstract void mAbstract();
}

class AbstractEx02 extends AbstractEx01{
 
	
	@Override
	void mAbstract() {
		System.out.println("상위 메소드 확인");
		
	}
	
}


 class AbstractEx01Main  {

	public static void main(String[] args) {
		AbstractEx02 obj2 = new AbstractEx02();
		obj2.mAbstract();
		System.out.println("메인 메소드 확인");

	}

}
