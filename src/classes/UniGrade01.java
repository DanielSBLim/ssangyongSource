package classes;
import java.lang.*;

public class UniGrade01 {
	static	float avr;
	static	int compagrade, proggrade, mathgrade, archgrade, total;

	public static void jumsooprint(){
		System.out.println("영작문		=	" + compagrade);
		System.out.println("프로그래밍	=	" + proggrade);
		System.out.println("이산수학	=	" + mathgrade);
		System.out.println("컴퓨터구조	=	" + archgrade);
		System.out.println("평균점수	=	" + avr);
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