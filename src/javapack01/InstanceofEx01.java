package javapack01;

public class InstanceofEx01 {

	public static void main(String[] args) {
		Employee	objEm = new Employee();
		Regular		objRe = new Regular();
		Daily		objDa = new Daily();
		
		System.out.println(objEm.getClass());
		System.out.println(objRe.getClass());
		System.out.println(objDa.getClass());
		
	
		System.out.println(objEm instanceof Employee);
		System.out.println(objRe instanceof Employee);
		System.out.println(objDa instanceof Employee);
		
		System.out.println(objEm instanceof Daily);
		System.out.println(objDa instanceof Daily);
		
	}

}
