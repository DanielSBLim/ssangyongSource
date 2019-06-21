package student;

import java.util.ArrayList;


public class StudentDAO {

	public ArrayList<StudentDTO> studentInfo() {
		StudentDB objDB = new StudentDB();


		ArrayList<StudentDTO> DTO = new ArrayList<StudentDTO>();
	
		for (int i = 0; i < objDB.aName.length; i++) {
			DTO.add(new StudentDTO(objDB.aName[i], objDB.vJumSu[i][0], objDB.vJumSu[i][1], objDB.vJumSu[i][2]));
		}
		return DTO;
		


		

	}

}
