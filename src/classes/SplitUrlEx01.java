/*
 *  문제 https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=HTML 받았고
 *  결과
 *  프로토콜 = https
	도메인 	=  search.naver.com
	쿼리스트링 = "sm=top_hty&fbm=0&ie=utf8&=HTML"
	쿼리스트링  개수 = 4개 
 * 
 *  자바 파일명 classUrl
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
		
		System.out.println("결과");
		System.out.println("프로토콜  : " + printProtocal );
		System.out.println("도메인 : " + printDomain);
		System.out.println("쿼리스트링 : " + QueryString);
		System.out.println("쿼리스트링  개수  : " + printQueryNumber);
	
	}

}
