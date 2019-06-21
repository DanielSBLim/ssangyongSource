package student;

import java.util.ArrayList;

public class StudentMain {

	
	
	public static void main(String[] args) {
		StudentDAO objDAO = new StudentDAO();
		ArrayList<StudentDTO> dtoL = objDAO.studentInfo();
		System.out.println(dtoL.get(1).getnName());

		int[] totalAll = { 0, 0, 0 };
		double total = 0;
		System.out.println("결과");
		System.out.println(" 이름 " + " 국어 " + " 영어 " + "평균 ");
		UserObj.mLine(99, "-");

		for (int peopleCount = 0; peopleCount < dtoL.size(); peopleCount++) {

			total = dtoL.get(peopleCount).getVEng() + dtoL.get(peopleCount).getVKor() + dtoL.get(peopleCount).getVMat();

			totalAll[0] += dtoL.get(peopleCount).getVKor();
			totalAll[1] += dtoL.get(peopleCount).getVEng();
			totalAll[2] += dtoL.get(peopleCount).getVMat();

			System.out.printf("%s %d %d %d %.2f \n", dtoL.get(peopleCount).getnName(), dtoL.get(peopleCount).getVKor(),
					dtoL.get(peopleCount).getVEng(), dtoL.get(peopleCount).getVMat(), (total / 3));
		}

		UserObj.mLine(99, "-");
		System.out.printf("%S %.2f %.2f %.2f", "평균", ((double) totalAll[0] / dtoL.size()),
				((double) totalAll[1] / dtoL.size()), ((double) totalAll[2] / dtoL.size()));

		System.out.println();
		System.out.println("dtoL.size()--> " + dtoL.size());
	}

}
