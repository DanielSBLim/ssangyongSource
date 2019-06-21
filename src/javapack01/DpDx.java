package javapack01;
import classes.*;

public class DpDx  {

	public static void main(String[] args) {
		SpSc obj = new SpSc();
		
		System.out.println(obj.vPrivate);
		System.out.println(obj.vDefault);
		System.out.println(obj.vProtecred);
		System.out.println(obj.vPublic);
		obj.mPrivate();
		obj.mDefault();
		obj.mProtecred();
		obj.mPublic();

	}

}
