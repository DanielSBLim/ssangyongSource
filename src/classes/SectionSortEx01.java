/*
 * 10  50  30  25  100  90  55  5  25 35
 */

package classes;

public class SectionSortEx01 {

	public static void main(String[] args) {
		
		int iTotal = args.length;
		int var[] = new int[iTotal];
		
		for (int i = 0; i < iTotal; i++) {
			var[i] = Integer.parseInt(args[i]);
		}
		
		
		//	int var[] = {10, 50, 30, 25, 100, 90, 55, 5, 25, 35};
		int temp;
		
		System.out.println("소트 전 데이타 : ");
		printAll(var);
		
		for(int i = 0; i < var.length; i++) {
			
			for(int j = (i + 1); j < var.length; j++) {
				if(var[i] > var[j]) {
					temp = var[i];
					var[i] = var[j];
					var[j] = temp;
				}
			}
			
			
		}
		System.out.println("소트 후 데이타 : ");
		printAll(var);
				
	}
	
	public static void printAll(int[] var) {
		for(int i = 0; i < var.length; i++) {
			System.out.print(var[i] + " ");			
		}
		System.out.println();
		System.out.println("------------------------------");

		
	}

}
