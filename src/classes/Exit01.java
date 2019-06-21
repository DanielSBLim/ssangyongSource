package classes;

public class Exit01 {

	public static void main(String[] args) {
		String msg = "nice";
		if(args[0].equals(msg)) {
			System.out.println("Bye~~~~");
			System.exit(0);
		}
		else System.out.println("일치하지 않습니다");
	}

}
