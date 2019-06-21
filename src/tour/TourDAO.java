package tour;

public class TourDAO {
	TourDTO[] setDto;


	void tourMain() {
		TourDB tourDB = new TourDB();
		setDto = new TourDTO[tourDB.maxPerson.length];
		for (int peopleConnt = 0; peopleConnt < tourDB.maxPerson.length; peopleConnt++) {

			setDto[peopleConnt] = new TourDTO(tourDB.travelInfo[peopleConnt][0], tourDB.travelInfo[peopleConnt][1],
					tourDB.travelInfo[peopleConnt][2], tourDB.travelType[peopleConnt], tourDB.maxPerson[peopleConnt]);
		}

		while (true) {
			UserObj.mLine(50, "=");
			System.out.println("1. 전체 여행 상품 소개");
			System.out.println("2. 개별자유여행 상품소개");
			System.out.println("3. 패키지 여행 상품소개");
			System.out.println("4. 최대예약가능인원 변경");
			System.out.println("9. 메뉴 종료");
			UserObj.mLine(50, "=");
			System.out.print("숫자 입력 >> ");
			int writeNumber = UserObj.intScan();

			if (writeNumber == 9) {
				System.out.println("-----------프로그램이 종료 되었습니다---------");
				System.exit(0);
			} else if (writeNumber < 5 && writeNumber > 0) {
				if (writeNumber == 1) {
					travelProductIntroduction();
					continue;
				} else if (writeNumber == 2) {
					freeTravel();
					continue;
				} else if (writeNumber == 3) {
					packageTravel();
					continue;
				} else if (writeNumber == 4) {

					String changeTcode;
					int maxNumber;

					changeTcode: while (true) {
						System.out.println("바꿀 여행코드를 입력해주세요");
						System.out.println("[9]입력시 처음으로 돌아갑니다.");

						changeTcode = UserObj.stirngScan();

						if (changeTcode.equals("9")) {
							UserObj.mLine(50, "=");
							System.out.println();
							System.out.println("*메인 메뉴로 돌아갑니다.");
							System.out.println();
							UserObj.mLine(50, "=");
							continue;
						}

						for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
							if (changeTcode.equals(setDto[peopleConnt].getTourCode())) {
								break changeTcode;
							}
						}
						System.out.println("잘못입력하셨습니다. 다시입력바랍니다.");

					}

					System.out.println("바꿀 최대인원를 입력해주세요");
					maxNumber = UserObj.intScan();
					while (true) {
						if (maxNumber >= 0) {
							break;
						} else {
							System.out.println("잘못입력하셨습니다 다시 입력부탁드립니다.");
							System.out.println("바꿀 최대인원를 입력해주세요");
							maxNumber = UserObj.intScan();
						}
					}
					System.out.println();
					maxReservation(changeTcode, maxNumber);

					UserObj.mLine(50, "=");
					System.out.println();
					System.out.println("*메인 메뉴로 돌아갑니다.");
					System.out.println();
					UserObj.mLine(50, "=");
					continue;

				}
			} else {
				System.out.println("다시 입력바랍니다.");
				continue;
			}
		}

	}

	void travelProductIntroduction() {
		UserObj.mLine(50, "-");
		System.out.printf("%8s \t %4s \t %6s \t %8s \t %4s\n", "여행코드", "코드", "비행기", "여행유형", "최대인원");
		UserObj.mLine(50, "-");
		for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
			String tourtypeVal;
			if (setDto[peopleConnt].getTourtype() == 0) {
				tourtypeVal = "자유여행";
			} else {
				tourtypeVal = "패키지여행";
			}
			System.out.printf("%8s \t %4s \t %6s \t %8s \t %4d\n", setDto[peopleConnt].getTourCode(),
					setDto[peopleConnt].getCity(), setDto[peopleConnt].getAirplane(), tourtypeVal,
					setDto[peopleConnt].getMaxPersion());
		}
		first : while (true) {

			System.out.println("변경하고자 하는 여행코드를 입력해주세요 [종료 : 9]");
			String writeAllTcodeNumber = UserObj.stirngScan();

			if (writeAllTcodeNumber.equals("9")) {
				UserObj.mLine(50, "=");
				System.out.println();
				System.out.println("*메인 메뉴로 돌아갑니다.");
				System.out.println();
				UserObj.mLine(50, "=");
				break first;
			}

			boolean okflag = false;

			for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
				if (writeAllTcodeNumber.equals(setDto[peopleConnt].getTourCode())) {
					okflag = true;
					break;
				}
			}

			if (okflag) {
				okflag = false;
				int maxNumber;
				System.out.println("바꿀 최대인원를 입력해주세요");
				maxNumber = UserObj.intScan();
				while (true) {
					if (maxNumber >= 0) {
						break;
					} else {
						System.out.println("잘못입력하셨습니다 다시 입력부탁드립니다.");
						System.out.println("바꿀 최대인원를 입력해주세요");
						maxNumber = UserObj.intScan();
					}
				}
				System.out.println();
				maxReservation(writeAllTcodeNumber, maxNumber);
				travelProductIntroduction();
				break;

			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

	void freeTravel() {
		UserObj.mLine(50, "-");
		System.out.printf("%8s \t %4s \t %6s \t %8s \t %4s\n", "여행코드", "코드", "비행기", "여행유형", "최대인원");
		UserObj.mLine(50, "-");
		for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
			String tourtypeVal;
			if (setDto[peopleConnt].getTourtype() == 0) {
				tourtypeVal = "자유여행";
				System.out.printf("%8s \t %4s \t %6s \t %8s \t %4d\n", setDto[peopleConnt].getTourCode(),
						setDto[peopleConnt].getCity(), setDto[peopleConnt].getAirplane(), tourtypeVal,
						setDto[peopleConnt].getMaxPersion());
			} else {
			}

		}
		while (true) {

			System.out.println("변경하고자 하는 여행코드를 입력해주세요 [종료 : 9]");
			String writeAllTcodeNumber = UserObj.stirngScan();

			if (writeAllTcodeNumber.equals("9")) {
				UserObj.mLine(50, "=");
				System.out.println();
				System.out.println("*메인 메뉴로 돌아갑니다.");
				System.out.println();
				UserObj.mLine(50, "=");
				break;
			}

			boolean okflag = false;

			for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
				if (setDto[peopleConnt].getTourtype() == 0
						&& writeAllTcodeNumber.equals(setDto[peopleConnt].getTourCode())) {
					okflag = true;
					break;
				}
			}

			if (okflag) {
				okflag = false;
				int maxNumber;
				System.out.println("바꿀 최대인원를 입력해주세요");
				maxNumber = UserObj.intScan();
				while (true) {
					if (maxNumber >= 0) {
						break;
					} else {
						System.out.println("잘못입력하셨습니다 다시 입력부탁드립니다.");
						System.out.println("바꿀 최대인원를 입력해주세요");
						maxNumber = UserObj.intScan();
					}
				}
				System.out.println();
				maxReservation(writeAllTcodeNumber, maxNumber);
				freeTravel();
				break;

			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

	void packageTravel() {
		UserObj.mLine(50, "-");
		System.out.printf("%8s \t %4s \t %6s \t %8s \t %4s\n", "여행코드", "코드", "비행기", "여행유형", "최대인원");
		UserObj.mLine(50, "-");
		for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
			String tourtypeVal;
			if (setDto[peopleConnt].getTourtype() == 0) {

			} else {
				tourtypeVal = "패키지여행";
				System.out.printf("%8s \t %4s \t %6s \t %8s \t %4d\n", setDto[peopleConnt].getTourCode(),
						setDto[peopleConnt].getCity(), setDto[peopleConnt].getAirplane(), tourtypeVal,
						setDto[peopleConnt].getMaxPersion());
			}

		}

		// 문제 분석
		while (true) {

			System.out.println("변경하고자 하는 여행코드를 입력해주세요 [종료 : 9]");
			String writeAllTcodeNumber = UserObj.stirngScan();

			if (writeAllTcodeNumber.equals("9")) {
				UserObj.mLine(50, "=");
				System.out.println();
				System.out.println("*메인 메뉴로 돌아갑니다.");
				System.out.println();
				UserObj.mLine(50, "=");
				break;
			}

			boolean okflag = false;

			for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
				if (setDto[peopleConnt].getTourtype() == 1
						&& writeAllTcodeNumber.equals(setDto[peopleConnt].getTourCode())) {
					okflag = true;
					break;
				}
			}

			if (okflag) {
				okflag = false;
				int maxNumber;
				System.out.println("바꿀 최대인원를 입력해주세요");
				maxNumber = UserObj.intScan();
				while (true) {
					if (maxNumber >= 0) {
						break;
					} else {
						System.out.println("잘못입력하셨습니다 다시 입력부탁드립니다.");
						System.out.println("바꿀 최대인원를 입력해주세요");
						maxNumber = UserObj.intScan();
					}
				}
				System.out.println();
				maxReservation(writeAllTcodeNumber, maxNumber);
				packageTravel();
				break;

			} else {
				System.out.println("다시 입력해주세요");
			}
		}

	}

	void maxReservation(String tCode, int maxNumber) {
		for (int peopleConnt = 0; peopleConnt < setDto.length; peopleConnt++) {
			if (tCode.equals(setDto[peopleConnt].getTourCode())) {
				setDto[peopleConnt].setMaxPersion(maxNumber);
				break;
			}
		}
	}

}
