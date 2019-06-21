package interFace;

public class main {
	
	public static void main(String[] args) {
		InterfaceEx01 Ex01 = new Ex01List().base();
		InterfaceEx01 Ex02 = new Ex01List().alltwo();
		
		System.out.println(Ex01.one());
		System.out.println(Ex02.one());

	}

}
