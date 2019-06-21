package classes;

public class ArryEx01_01 {

	public static void main(String[] args) {
		int a1[];
		a1 = new int[3];
		a1[0] = 10;
		
		for(int i = 0; i < a1.length; i++) {
			a1[i] = (i + 1) * 10;
		}
		printAllHori(a1);

	}
	
	public static void printAllHori(int[] getInt) {
		for(int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

}
