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
			stmt = conn.createStatement();
			res = stmt.executeQuery(sql);
			
			System.out.println("id\t pw\t name\t mail\t phone\t add\t");
			UserObj.mLine(99, "=");
			while(res.next()) {
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
