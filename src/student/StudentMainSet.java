package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class StudentMainSet {

	
	
	public static void main(String[] args) {
		Set dtoL;
		StudentDAOSet obj2 = new StudentDAOSet();
		dtoL = (obj2.studentInfo());
		
		Iterator iter01 = dtoL.iterator();	
	
//		StudentDTO B = (StudentDTO)iter01.next();
//		System.out.println(a.getnName());

		int[] totalAll = { 0, 0, 0 };
		double total = 0;
		System.out.println("결과");
		System.out.println(" 이름 " + " 국어 " + " 영어 " + "평균 ");
		UserObj.mLine(99, "-");

		for (int peopleCount = 0; peopleCount < dtoL.size(); peopleCount++) {
			StudentDTO B = (StudentDTO)iter01.next();
			total = B.getVEng() + B.getVKor() + B.getVMat();

			totalAll[0] += B.getVKor();
			totalAll[1] += B.getVEng();
			totalAll[2] += B.getVMat();

			System.out.printf("%s %d %d %d %.2f \n", B.getVName(),B.getVKor(),
					B.getVEng(), B.getVMat(), (total / 3));
		}

		UserObj.mLine(99, "-");
		System.out.printf("%S %.2f %.2f %.2f", "평균", ((double) totalAll[0] / dtoL.size()),
				((double) totalAll[1] / dtoL.size()), ((double) totalAll[2] / dtoL.size()));

		System.out.println();
		System.out.println("dtoL.size()--> " + dtoL.size());
	}

}
