/*
 *  ���� https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=HTML �޾Ұ�
 *  ���
 *  �������� = https
	������ 	=  search.naver.com
	������Ʈ�� = "sm=top_hty&fbm=0&ie=utf8&=HTML"
	������Ʈ��  ���� = 4�� 
 * 
 *  �ڹ� ���ϸ� classUrl
 *  
 */

package classes;

public class SplitUrlEx01 {

	public static void main(String[] args) {
		String[] val;
		String getUrl = "https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=HTML";
		String printProtocal, printDomain, QueryString;
		int printQueryNumber;
		
		val = getUrl.split("/");
		printProtocal = val[0].substring(0,5);
		printDomain = val[2];
		QueryString = val[3].substring(13);
		printQueryNumber =  QueryString.split("\\&").length;
		
		System.out.println("���");
		System.out.println("��������  : " + printProtocal );
		System.out.println("������ : " + printDomain);
		System.out.println("������Ʈ�� : " + QueryString);
		System.out.println("������Ʈ��  ����  : " + printQueryNumber);
	
	}

}
