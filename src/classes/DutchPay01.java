package classes;
import java.lang.*;

public class DutchPay01 {

	static int vPrice, vDesert, vCount, vDutch;
	
	public static void printValue (){
		System.out.println("식대총가격	=	" + vPrice);
		System.out.println("디저트총가격	=	" + vDesert);
		System.out.println("인원수		=	" + vCount);
		System.out.println("----------------------------");
		System.out.println("인당원가격	=	" + vDutch);
	}

	public static void inputPrintValue (int getvPrice, int getvDesert, int getvCount, int getvDutch){
		System.out.println("식대총가격	=	" + getvPrice);
		System.out.println("디저트총가격	=	" + getvDesert);
		System.out.println("인원수		=	" + getvCount);
		System.out.println("----------------------------");
		System.out.println("인당원가격	=	" + getvDutch);
	}

	public static void main(String[] args) {
		vPrice	= Integer.parseInt(args[0]);
		vDesert = Integer.parseInt(args[1]);
		vCount	= Integer.parseInt(args[2]);
		vDutch	= ((vPrice+vDesert)/vCount);

		printValue();
		System.out.println("-------------다른버젼------------");
		inputPrintValue(vPrice, vDesert, vCount ,vDutch);
	}
}

