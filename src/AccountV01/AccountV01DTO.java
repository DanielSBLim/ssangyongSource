package AccountV01;

public class AccountV01DTO {
	private String customerld;
	private String customerName;
	private String customerNo;
	private int openMoney;
	
	/*
	 * 19.06.05
	 * bankBalnce
	 * getter/ setter 추가
	 * 은행 초기 금액 100000	 */
	private static  int bankBalnce;
	 static {
		 bankBalnce = 100000;
		}
	
	
	
	 
	 public static void setBankBalnce(int getbankBalnce) {
		bankBalnce = getbankBalnce;
	}
	 public static int gettBankBalnce() {
		 return bankBalnce;
	 }
	 
	 
	//-------------------------------------------
	AccountV01DTO(String customerld, String customerName, 
			String customerNo, int openMoney){
	this.customerld = customerld;
	this.customerName = customerName;
	this.customerNo = customerNo;
	this.openMoney = openMoney;
	
	}
	public String getCustomerld() {
		return customerld;
	}

	public void setCustomerld(String customerld) {
		this.customerld = customerld;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public int getOpenMoney() {
		return openMoney;
	}

	public void setOpenMoney(int openMoney) {
		this.openMoney = openMoney;
	}


}
