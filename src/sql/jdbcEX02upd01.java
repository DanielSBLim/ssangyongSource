package sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEX02upd01 {

	public static void main(String args[]) {
		Connection conn = null;
		Statement stmt;

		int su = 0;

		try {
			String sql = "insert into ment01 values('Black', '1234', '보라돌이', 'Black@test.com', '031', '화정')";
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			su = stmt.executeUpdate(sql);
			if (su != 0) {
				System.out.println(su + "명 회원 가입 성공 !!");
			}

		} catch (SQLException e) {
			System.out.println("문제발생");
		}

	}
}
