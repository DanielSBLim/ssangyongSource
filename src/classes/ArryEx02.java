package classes;

public class ArryEx02 {
	
	public static void main(String[] args) {
		int[] a2 = new int[3];
		for(int i = 0; i < a2.length; i++) {
			a2[i] = (i + 1) * 10;
		}
		printAllHori(a2);
	}
	public static void printAllHori(int[] getInt) {
		for(int i = 0; i < getInt.length; i++) {
			System.out.print(getInt[i] + " ");
		}
		System.out.println();
	}

}
