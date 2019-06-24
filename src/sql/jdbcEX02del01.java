package sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEX02del01 {

	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt;

		int su = 0;

		try {
			String sql = "Delete From ment01 where MEN_ID='Black'";
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			su = stmt.executeUpdate(sql);
			if(su != 0) {
				System.out.println("정상");
			}
			
		} catch (SQLException e) {
			System.out.println("문제발생");
		}

	}
}
