package car;


public class CarDAO {
//	Car1[] Car1Dto;
//	Car2[] Car2Dto;

	Engin[] setDto ;

	public void dtoSet() {
		CarDB DB = new CarDB();

		setDto = new Engin[DB.carOwner.length];
		int count = 0;
		
		for (String i:DB.carKind) {
			if (i.equals("Car1")) {
				
				setDto[count] = new Car1(DB.carOwner[count]);
				count++;
			} else if (i.equals("Car2")) {
				setDto[count] = new Car2(DB.carOwner[count]);
				count++;
			}

		}
		
//		int Car1Count = 0;
//		int Car2Count = 0;
//		for(int i = 0; i < DB.carKind.length; i++) {
//		if(DB.carKind[i].equals("Car1")) {
//			Car1Count++;
//		} else if (DB.carKind[i].equals("Car2")) {
//			Car2Count++;
//		}
//			
//	}

//		setDto = new Car1[Car1Count];
//		setDto = new Car2[Car2Count];
//		Car2Count = 0;
//		Car1Count = 0;

//		for(int i = 0; i < DB.carKind.length; i++) {
//			if(DB.carKind[i].equals("Car1")) {
//				Car1Dto[Car1Count] = new Car1(DB.carOwner[i]);
//				Car1Count ++;
//				
//			} else if (DB.carKind[i].equals("Car2")) {
//				Car2Dto[Car2Count] = new Car2(DB.carOwner[i]);
//				Car2Count ++;
//			}
//				
//		}

	
	}

//	public void carPrintinfo() {
//
//		for (int i = 0; i < Car1Dto.length; i++) {
//			System.out.println("차     주 : " + Car1Dto[i].getOwner());
//			System.out.println("차     량 : " + Car1Dto[i].explain());
//			System.out.println("평균속도 : " + Car1Dto[i].avgSpeed());
//			System.out.println("최고속도 : " + Car1Dto[i].norSpeed());
//			UserObj.mLine(45, "=");
//		}
//
//		for (int i = 0; i < Car2Dto.length; i++) {
//			System.out.println("차     주 : " + Car2Dto[i].getOwner());
//			System.out.println("차     량 : " + Car2Dto[i].explain());
//			System.out.println("평균속도 : " + Car2Dto[i].avgSpeed());
//			System.out.println("최고속도 : " + Car2Dto[i].norSpeed());
//			UserObj.mLine(45, "=");
//		}
//
//	}
	
	public void carPrintinfo() {

		for (int i = 0; i < setDto.length; i++) {
			System.out.println("차     주 : " + setDto[i].getOwner());
			System.out.println("차     량 : " + setDto[i].explain());
			System.out.println("평균속도 : " + setDto[i].avgSpeed());
			System.out.println("최고속도 : " + setDto[i].norSpeed());
			UserObj.mLine(45, "=");
		}


	}

}
