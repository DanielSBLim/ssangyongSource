package student;

import java.util.*;

public class StudentMainMap {

	public static void main(String[] args) {
		StudentDAOMAP objDAO = new StudentDAOMAP();
		Map<String, StudentDTO> dtoL = new HashMap<String, StudentDTO>();
		
		
		dtoL = (Map<String, StudentDTO>)objDAO.studentInfo();
		StudentDTO objDTO = new StudentDTO();
		int sum = 0;
		int totalSum[] = new int[3];

		System.out.printf("%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "평균");
		UserObj.mLine(30, "-");
		for (int i = 0; i < dtoL.size(); i++) {
			objDTO = dtoL.get("map" + i);

			System.out.printf("%s\t", objDTO.getVName());
			System.out.printf("%d\t", objDTO.getVKor());
			System.out.printf("%d\t", objDTO.getVEng());
			System.out.printf("%d\t", objDTO.getVMat());
			sum = objDTO.getVKor() + objDTO.getVEng() + objDTO.getVMat();
			System.out.println(sum / 3);
			totalSum[0] += objDTO.getVKor();
			totalSum[1] += objDTO.getVEng();
			totalSum[2] += objDTO.getVMat();

		}
		UserObj.mLine(30, "=");
		System.out.printf("%s\t%d\t%d\t%d", "총평균", totalSum[0] / 9, totalSum[1] / 9, totalSum[2] / 9);

	}

}
