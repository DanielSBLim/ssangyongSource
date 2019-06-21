package classes;
/* ����� ���̵�� �н����� �Է�
 * ���] ������ ȯ���մϴ�. id( ������ ���)
 * Err] id Ȯ���ϼ���
 * Err] pw Ȯ���ϼ���
 *
 */			
class StringEx02_1 {

	public static void main(String[] args) {

		String s01 = "Nice";
		String s02 = "Nice";
		String s03 = new String("Nice");
		String s04 = new String("Nice");

		if (s01 == s02)	{
			System.out.println("s01 == s02 �� �� 1");
		} else {
			System.out.println("s01 == s02 �� ���� 0");
		}

		if (s01 == s03)	{
			System.out.println("s01 == s03 �� �� 1");
		} else {
			System.out.println("s01 == s03 �� ���� 0");
		}

		
		if (s03 == s04)	{
			System.out.println("s03 == s04 �� �� 1");
		} else {
			System.out.println("s03 == s04 �� ���� 0");
		}


		
	}	
}