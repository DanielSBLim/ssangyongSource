package AccountV01;

import classes.UserObj;

public class AccountV01DAO {
		AccountV01DTO[] setDto;

		boolean	findUser;
	public void dtoSet() {
		AccountV01DB aDB = new AccountV01DB();
		int vTotalPeople = aDB.openMoney.length;
		setDto =  new AccountV01DTO[vTotalPeople];
		for(int peopleCount = 0; peopleCount < vTotalPeople; peopleCount++) {
			setDto[peopleCount] =	new AccountV01DTO(
					aDB.customerinfo[peopleCount][0],
					aDB.customerinfo[peopleCount][1],
					aDB.customerinfo[peopleCount][2],
					aDB.openMoney[peopleCount]);
		}
		for(int peopleCount = 0; peopleCount < vTotalPeople; peopleCount++) {
			AccountV01DTO.setBankBalnce(setDto[peopleCount].gettBankBalnce() + setDto[peopleCount].getOpenMoney()); 
		}
	}
	
	public void accountView() {
		
		int vTotalPeople = setDto.length;
		
		System.out.printf("%s \t%s \t%s \t%s \t\n", "Id", "Name", "No", "Account");
		UserObj.mLine(50, "=");
		for(int peopleCount = 0; peopleCount < vTotalPeople; peopleCount++) {
			
			System.out.printf("%s \t%s \t%s \t%,d \t\n", 
					setDto[peopleCount].getCustomerld(),
					setDto[peopleCount].getCustomerName(),
					setDto[peopleCount].getCustomerNo(),
					setDto[peopleCount].getOpenMoney());
		}
		
		System.out.printf("%,d\n", setDto[0].gettBankBalnce());
	
	}
	
	public void customerPriuntInfo() {
		int chkInt;
			while(true) {
			System.out.println("<< 고객 번호를 입력하세요. >> [4를 누를시 종료됩니다.]");
			System.out.print("고객번호 입력 >>");
			String userInput = UserObj.stirngScan();
			System.out.println();
			if(userInput.equals("admin0024")) {
				accountView();
			} else if (userInput.equals("4")) {
				System.out.println("<<은행관리 프로그램을 종료하겠습니다>>");
				System.exit(0);
			} else {
				chkInt = customrChk(userInput);
				if(findUser) {
					System.out.println((chkInt+1) + "번째 고객 확인");
					customerView(chkInt);
					while(true) {
						System.out.printf("%s\n\t%s\n\t%s\n\t%s\n\t%s\n%s", 
								"<<< 선택하세요.>>",
								"1. 입금",
								"2. 출금",
								"3. 고객정보",
								"4. 종료",
								"선택 : ");
						String inputMenu = UserObj.stirngScan();
						
						if(inputMenu.equals("4")) {
							System.out.println("<<종료를 선택 하셨습니다.>>");
							break;
						} else if (inputMenu.equals("1")) {
							System.out.println("입금 내역입니다.");
							deposit(setDto[chkInt].getOpenMoney(), chkInt);
						} else if (inputMenu.equals("2")) {
							System.out.println("출금 내역입니다.");
							withdraw(setDto[chkInt].getOpenMoney(), chkInt);
						} else if (inputMenu.equals("3")) {
							customerView(chkInt);
						}
					}
				} else {
					System.out.println("고객정보 없음");
				}
			}
			

		}
	}
	
	public int customrChk(String chkld) {
		
		for(int peopleCount = 0; peopleCount < setDto.length; peopleCount++) {
			if(chkld.equals(setDto[peopleCount].getCustomerld())) {
				
				findUser = true;
				return peopleCount;
			} 
		}
		findUser = false;
		return -1;
		
	}
	
	public void customerView(int userIndex) {
		UserObj.mLine(45, "-");
		System.out.printf("%30s\n",setDto[userIndex].getCustomerName());
		UserObj.mLine(45, "-");
		System.out.println("고객번호 : " + setDto[userIndex].getCustomerld());
		System.out.println("고객이름 : " + setDto[userIndex].getCustomerName());
		System.out.println("계좌번호 : " + setDto[userIndex].getCustomerNo());
		System.out.printf("고객잔액 : %,3d\n" , setDto[userIndex].getOpenMoney());
		
		
	}
	
	public void deposit(int money, int id) {
		System.out.println("얼마 입금 하시겠습니까?");
		while(true){
			int temp = UserObj.intScan();
			if(temp < 0) {
				System.out.println("다시 입력하세요");
			} else {
				setDto[id].setOpenMoney(money + temp); 
				AccountV01DTO.setBankBalnce(AccountV01DTO.gettBankBalnce()+temp);
				System.out.println("정상 입금처리 되었습니다.");
				customerView(id);
				break;
			}
		}
	}
	public void withdraw(int money, int id) {
		while(true){
			int temp = UserObj.intScan();
			if(temp < 0) {
				System.out.println("다시 입력하세요");
			} else if (temp > money) {
				System.out.println("잔액이 부족합니다.");
				customerView(id);
				break;
			} else {
				setDto[id].setOpenMoney(money - temp); 
				AccountV01DTO.setBankBalnce(AccountV01DTO.gettBankBalnce()-temp);
				System.out.println("정상 처리 되었습니다.");
				customerView(id);
				break;
			}
		}
	}
	
	

}
