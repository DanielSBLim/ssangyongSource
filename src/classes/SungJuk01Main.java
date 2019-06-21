package classes;

public class SungJuk01Main {

	public static void main(String[] args) {
	SungJuk01DTO lim = new SungJuk01DTO();
	
	lim.setnName("임성범");
	lim.setVEng(100);
	lim.setVKor(100);
	lim.setVMat(100);
	
	System.out.printf("%s 국어 %d 영어 %d 수학 %d", lim.getnName(), 
			lim.getVKor(), lim.getVEng(), lim.getVMat());
		
	}

}
