package student;

public class StudentDTO {

	private String vName;
	private int vKor;
	private int vEng;
	private int vMat;
	
	StudentDTO(String vName, int vKor, int vEng, int vMat){
		this.vName = vName;
		this.vKor = vKor;
		this.vEng = vEng;
		this.vMat = vMat;
	}
	
	StudentDTO( int vKor, int vEng, int vMat){
		this.vKor = vKor;
		this.vEng = vEng;
		this.vMat = vMat;
	}
	
	
	StudentDTO(String vName){
		this.vName = vName;
	}
	
	StudentDTO(){
	}
	
	
	public void setVName(String vName) {
		this.vName = vName;
	}
	public void setVKor(int vKor) {
		this.vKor = vKor;
	}
	public void setVEng(int vEng) {
		this.vEng = vEng;
	}
	public void setVMat(int vMat) {
		this.vMat = vMat;
	}
	public String getVName() {
		return vName;
	}
	public int getVKor() {
		return vKor;
	}
	public int getVEng() {
		return vEng;
	}
	public int getVMat() {
		return vMat;
	}


}
