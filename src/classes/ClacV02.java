package classes;

import java.lang.*;

public class ClacV02 {
	int result;
	ClacV02 objCalc = new ClacV02();

	public void mSum(int num01, int num02) {result = num01 + num02;}
	public void mSubrtact(int num01, int num02) {result = num01 - num02;}
	public void mMuitiple(int num01, int num02) {result = num01 * num02;}
	public void mDivide(int num01, int num02) {result = num01 / num02;}

	public static void main(String[] args) {
	
	int num01 = 7;
	int num02 = 3;
	System.out.println("num01 = " + num01 + " num02 = " + num02);
	System.out.println("result = " + Math.pow(2,2));
	System.out.println("7 / 3 = " + (7 / 3));
	System.out.println("7 % 3  = " + (7 % 3));
	
	System.out.println("후위 1 = " + (num01++));
	System.out.println("전위 1 = " + (++num02));
	
	num01 = 2;
	num02 = 2;

	System.out.println("후위 2 = " + (num01++));
	System.out.println("전위 2 = " + (++num02));

	System.out.println("후위 2 = " + (num01));




	}
 }
