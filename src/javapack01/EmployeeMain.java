package javapack01;

import classes.UserObj;

public class EmployeeMain {

	public static void main(String[] args) {
		Regular[] r01 = {
				new Regular("R001", "둘리", "2018-03-15", 2700000),
				new Regular("R002", "공실이", "2018-03-15", 3100000)
		};
		Daily[] d01 = {
				new Daily("D001", "또치", "2019-02-01", 1, 3000000),
				new Daily("D002", "도우너", "2019-02-01", 1, 3000000)
		};

		System.out.printf("%-5s \t %-5s \t %-8s \t %-3s \t\n", "사번", "성명", "입사일", "급여");
		UserObj.mLine(50, "=");
		for(int countRegular = 0; countRegular < r01.length; countRegular++ ) {
			System.out.printf("%-5s \t %-5s \t %-8s \t %-,3d \t\n", r01[countRegular].no, r01[countRegular].name, r01[countRegular].unitday, r01[countRegular].pay);
		}
		for(int countDaily = 0; countDaily < d01.length; countDaily++ ) {
			System.out.printf("%-5s \t %-5s \t %-8s \t %-,3d \t\n", d01[countDaily].no, d01[countDaily].name, d01[countDaily].unitday, d01[countDaily].paycheck());
		}
		
		
	}

}
