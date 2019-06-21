package classes;

class StringEx06etxcLength {
	
	public static void main(String args[]) {
		String s01 = "Hello";
		String s02 = "java";
		String sResult ="";
		boolean bResult;
		int		iResult;

		sResult = s02.concat(s01);
		System.out.println("concat(String str) = " + sResult);

		bResult = s01.endsWith("lo");
		System.out.println("endsWith(String str) = " + bResult);

		bResult = s01.startsWith("He");
		System.out.println("startsWith(String str) = " + bResult);

		iResult = s01.indexOf("el");
		System.out.println("indexOf(String str) = " + iResult);

		s02 = "";
		bResult = s02.isEmpty();
		System.out.println("isEmpty = " + bResult);

		iResult = s01.length();
		System.out.println("s01.length() =" + iResult);
	}

}