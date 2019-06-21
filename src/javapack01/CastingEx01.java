package javapack01;

public class CastingEx01 {

	public static void main(String[] args) {

		Employee	objEm = new Employee();
		Regular		objRe = new Regular();
		Daily		objDa = new Daily();
		
		System.out.println(objEm.getClass());
		System.out.println(objRe.getClass());
		System.out.println(objDa.getClass());
		
		objEm = objRe;
		objEm = objDa;
		
		objRe = (Regular)objEm;
		objDa = (Daily)objEm;
	}

}
