package classes;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;



public class Split01 extends Object{
	
	
	public static void main(String[] args) throws UnknownHostException {
		String   str = "a?b?cd?ef";
		String[] arr = str.split("\\?");
		
		System.out.println("���ڿ��� ���� = " + (arr.length));
		System.out.println(arr[3]);
		
		
		InetAddress local = InetAddress.getLocalHost();

	    System.out.println("local ip : "+local.getHostAddress());



	}

}
