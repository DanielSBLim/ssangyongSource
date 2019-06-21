package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentDAOMAP {

	StudentDB obDB = new StudentDB();
	StudentDTO objDTO = new StudentDTO();
	Map<String, StudentDTO> dtoL = new HashMap<String, StudentDTO>();

	Map<String, StudentDTO> studentInfo() {

		for (int i = 0; i < obDB.aName.length; i++) {
			objDTO = (new StudentDTO(obDB.aName[i], obDB.vJumSu[i][0], obDB.vJumSu[i][1], obDB.vJumSu[i][2]));
			dtoL.put("map" + i, objDTO);
		}
		return dtoL;

	}
}