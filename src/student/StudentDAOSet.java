package student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StudentDAOSet {
	Set DtoL = new HashSet();
	
	
	public Set studentInfo() {
		StudentDB objDB = new StudentDB();


	
		for (int i = 0; i < objDB.aName.length; i++) {
			DtoL.add(new StudentDTO(objDB.aName[i], objDB.vJumSu[i][0], objDB.vJumSu[i][1], objDB.vJumSu[i][2]));
		}
		return DtoL;
		


		

	}

}
