package student;

import java.util.ArrayList;
import java.util.List;


public class StudentDAO2 {

	public List studentInfo() {
		StudentDB objDB = new StudentDB();


		List DTO = new ArrayList();
	
		for (int i = 0; i < objDB.aName.length; i++) {
			DTO.add(new StudentDTO(objDB.aName[i], objDB.vJumSu[i][0], objDB.vJumSu[i][1], objDB.vJumSu[i][2]));
		}
		return DTO;
		


		

	}

}
