package classes;
import java.lang.*;

public class UniGrade01 {
	static	float avr;
	static	int compagrade, proggrade, mathgrade, archgrade, total;

	public static void jumsooprint(){
		System.out.println("���۹�		=	" + compagrade);
		System.out.println("���α׷���	=	" + proggrade);
		System.out.println("�̻����	=	" + mathgrade);
		System.out.println("��ǻ�ͱ���	=	" + archgrade);
		System.out.println("�������	=	" + avr);
	}

	public static void main(String[] args) {
		compagrade	= Integer.parseInt(args[0]);
		proggrade	= Integer.parseInt(args[1]);
		mathgrade	= Integer.parseInt(args[2]);
		archgrade	= Integer.parseInt(args[3]);
		total		= compagrade + proggrade + mathgrade + archgrade;
		avr			= ((float)total/args.length);

		jumsooprint();
	}
}