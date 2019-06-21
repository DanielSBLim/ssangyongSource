package classes;

import AccountV01.UserObj;

public class ConstructorEx03 {

	public static void main(String[] args) {

		StudentDB objDB = new StudentDB();
		System.out.println("결과");
		System.out.println(" 이름 " + " 국어 " + " 영어 " + "평균 ");
		UserObj.mLine(99, "-");
		int[] totalAll = {0, 0, 0};
		int iPeopleCount = objDB.aName.length;
		
		StudentDTO[] objDTO = new StudentDTO[iPeopleCount];
		for (int i = 0; i < iPeopleCount; i++) {
			objDTO[i] = new StudentDTO(objDB.aName[i], objDB.vJumSu[i][0], objDB.vJumSu[i][1], objDB.vJumSu[i][2]);
			totalAll[0] += objDB.vJumSu[i][0];
			totalAll[1] += objDB.vJumSu[i][1];
			totalAll[2] += objDB.vJumSu[i][2];	
		}

		for (int i = 0; i < objDB.aName.length; i++) {
			System.out.printf("%s %d %d %d %.2f \n", objDTO[i].getnName(), objDTO[i].getVKor(), objDTO[i].getVEng(),
					objDTO[i].getVMat(),
					((double) (objDTO[i].getVKor() + objDTO[i].getVEng() + objDTO[i].getVMat()) / 3));
		}
		UserObj.mLine(99, "-");
		System.out.printf("총평균 %.2f %.2f %.2f", (double)totalAll[0]/iPeopleCount, (double)totalAll[1]/iPeopleCount, (double)totalAll[2]/iPeopleCount);
	}
}
