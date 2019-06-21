package classes;

public class ExceptionEx05 {

	public static void main(String[] args) {
		int i = 0;
		StudentDTO[] sutDTO = new StudentDTO[5];
		sutDTO[0] = new StudentDTO("SYU01", "보라돌이");
		sutDTO[1] = new StudentDTO("SYU02", "뽀오");
		
		for(i = 0; i < sutDTO.length; i++) {
			try {
				System.out.printf("%s / %s  \n ", sutDTO[i].getNum(), sutDTO[i].getName());
			} catch (NullPointerException e) {
				System.out.printf("NullPointerException 확인 \n");
			} finally {
				UserObj.mLine(45, "-");
			}
		}
	}
	
}
