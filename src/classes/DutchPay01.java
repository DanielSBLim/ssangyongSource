package classes;
import java.lang.*;

public class DutchPay01 {

	static int vPrice, vDesert, vCount, vDutch;
	
	public static void printValue (){
		System.out.println("�Ĵ��Ѱ���	=	" + vPrice);
		System.out.println("����Ʈ�Ѱ���	=	" + vDesert);
		System.out.println("�ο���		=	" + vCount);
		System.out.println("----------------------------");
		System.out.println("�δ������	=	" + vDutch);
	}

	public static void inputPrintValue (int getvPrice, int getvDesert, int getvCount, int getvDutch){
		System.out.println("�Ĵ��Ѱ���	=	" + getvPrice);
		System.out.println("����Ʈ�Ѱ���	=	" + getvDesert);
		System.out.println("�ο���		=	" + getvCount);
		System.out.println("----------------------------");
		System.out.println("�δ������	=	" + getvDutch);
	}

	public static void main(String[] args) {
		vPrice	= Integer.parseInt(args[0]);
		vDesert = Integer.parseInt(args[1]);
		vCount	= Integer.parseInt(args[2]);
		vDutch	= ((vPrice+vDesert)/vCount);

		printValue();
		System.out.println("-------------�ٸ�����------------");
		inputPrintValue(vPrice, vDesert, vCount ,vDutch);
	}
}

