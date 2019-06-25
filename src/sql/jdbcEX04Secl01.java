package sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEX04Secl01 {
	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt;
		ResultSet res;
		String sql = "select * from menT01";
		int su = 0;
		String vID, vPW, vName, vEmail, vPhone, vAddr;

		try {
			
			conn = DBConnection.getConnection();
			
			//연결된 값을 Statement 즉 SQL문을 보낼수 있는 객체로 변경한다.
			stmt = conn.createStatement();
			
			//ResultSet쿼리에 의해 생성 된 데이터를 포함 하는 객체를 만든다.
			res = stmt.executeQuery(sql);
			
			System.out.println("id\t pw\t name\t mail\t phone\t add\t");
			UserObj.mLine(99, "=");
			
			//row 다음줄 확인
			while(res.next()) {
				// 해당 컬럼을 받고 해당값을 다음 변수에 입력받는다.
				vID = res.getString("MEN_ID");
				vPW = res.getString("MEN_PWD");			
				vName = res.getString("MEN_NAME");		
				vEmail = res.getString("MEN_EMAIL");	
				vPhone = res.getString("MEN_PHONE");
				vAddr = res.getString("MEN_ADDR");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t\n", vID, vPW, vName, vEmail, vPhone, vAddr);
			}
			UserObj.mLine(99, "=");
	

		} catch (SQLException e) {
			System.out.println("문제발생");
		}
		
		
	}
	

}
