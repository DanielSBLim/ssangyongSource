package classes;

public class ConstrryctorEx02 {

	public static void main(String[] args) {
		SungJuk01DTO objDTO = new SungJuk01DTO("빙그리", 95, 99, 97);
		SungJuk01DTO objDTO = new SungJuk01DTO();
		
		System.out.printf(" 이름 : %s\n 국어 : %d\n 영어 : %d\n 수학 : %d", 
				objDTO.getnName(), objDTO.getVKor(), objDTO.getVEng(),
				objDTO.getVMat());

	}

}
