package classes;

public class ValChangeEx01 {

	public static void main(String[] args) {
		int vI01, vI02, temp;
		vI01 = 10;
		vI02 = 20;
		System.out.println("변경전 vI01 = " + vI01);
		System.out.println("변경전 vI02 = " + vI02);
		
		temp = vI01;
		vI01 = vI02;
		vI02 = temp;
		System.out.println("변경후 vI01 = " + vI01);
		System.out.println("변경후 vI02 = " + vI02);
		
		
		
		
		
	}

}
