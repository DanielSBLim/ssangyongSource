package classes;

public class SplitUrlEx02 {

	public static boolean querySelcet(int countVal, String[] listString ) {
		return listString[countVal].split("=")[0].equals("query");
		}
	
	public static String querySelcetValue(String[] qV, int count) {
		return qV[count].split("=")[1];
		
	}
	
	
	
	public static void main(String[] args) {
		String[] val,  qV;
		String printProtocal, printDomain, QueryString, getUrl;
		int printQueryNumber, qVCount, count;
		boolean querySelcet;
		
		getUrl = "https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=HTML";
		val = getUrl.split("/");
		printProtocal = val[0].substring(0,5);
		printDomain = val[2];
		QueryString = val[3].substring(13);
		printQueryNumber =  QueryString.split("\\&").length;
		qV = QueryString.split("&");
		count = 0; 

		if(querySelcet(count, qV)) {
			System.out.println("query 값은 ");
			System.out.println(querySelcetValue(qV, count));
		} else count++;
		
		if(querySelcet(count, qV)) {
			System.out.println("query 값은 ");
			System.out.println(querySelcetValue(qV, count));
		} else count++;
		
		if(querySelcet(count, qV)) {
			System.out.println("query 값은 ");
			System.out.println(querySelcetValue(qV, count));
		} else count++;
		
		if(querySelcet(count, qV)) {
			System.out.println("query 값은 ");
			System.out.println(querySelcetValue(qV, count));
		} else count++;
		
		
		
		System.out.println("결과");
		System.out.println("프로토콜  : " + printProtocal );
		System.out.println("도메인 : " + printDomain);
		System.out.println("쿼리스트링 : " + QueryString);
		System.out.println("쿼리스트링  개수  : " + printQueryNumber);
	
	}

} 
