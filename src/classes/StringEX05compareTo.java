package classes;

class StringEX05compareTo {

	public static void main(String[] args) {
		
		String s01 = "Hello";
		
		int chk = s01.compareTo("ello");
		System.out.println(chk);

		chk = s01.compareTo("hello");
		System.out.println(chk);

		chk = s01.compareTo("Hello");
		System.out.println(chk);

		chk = s01.compareToIgnoreCase("hello");
		System.out.println(chk);

	}

}