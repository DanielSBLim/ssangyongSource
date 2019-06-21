package classes;

public class StringEx08replaceSubs {

	public static void main(String[] args) {
		String sV01 = "Exciting Java ";
		String sResult = "";
		sResult = sV01.replace("Exciting", "Fun");
		System.out.println(sResult);
		
		System.out.println(sV01.substring(7));
		System.out.println(sV01.substring(3,6));
		
	}

}
