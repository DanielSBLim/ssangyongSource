package javapack01;

import classes.UserObj;

public class EmployeeMain03 {

	public static void main(String[] args) {

		Employee[] objEm = { new Regular("R001", "둘리", "2018-03-15", 2700000),
				new Regular("R002", "공실이", "2018-03-15", 3100000), 
				new Daily("D001", "또치", "2019-02-01", 1, 3000000),
				new Daily("D002", "도우너", "2019-02-01", 1, 3000000) };

		System.out.printf("%-5s \t %-5s \t %-5s \t %-8s \t %-3s \t\n"
						, "구분", "사번", "성명", "입사일", "급여");
		UserObj.mLine(50, "=");
		
		String sjobRank = "";
		for (int countRegular = 0; countRegular < objEm.length; countRegular++) {
			if (objEm[countRegular] instanceof Regular) {
				sjobRank = "정규직";
			}
			if (objEm[countRegular] instanceof Daily) {
				sjobRank = "계약직";
			}
			
			System.out.printf("%-5s \t %-5s \t %-5s\t %-8s \t %-,3d \t\n", 
					sjobRank, objEm[countRegular].no,	objEm[countRegular].name, 
					objEm[countRegular].unitday, objEm[countRegular].paycheck());
		}

	}

}
