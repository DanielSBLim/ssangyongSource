package interFace;

public class Ex01List {

	public static InterfaceEx01 base() {
		ClassEx01 obj = new ClassEx01(1);
		
		return obj;
	}
	
	public static InterfaceEx01 alltwo() {
		ClassEx01 obj = new ClassEx01(2);
		
		return obj;
	}
}
