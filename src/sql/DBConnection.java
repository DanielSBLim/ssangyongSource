package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection dbConn;

	public static Connection getConnection() {
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "happyday";

		try {
			//클래스 클래스에 forName 메서드를 이용해 해당 객체를 가져온다
			Class.forName(driver);
			System.out.println("DB연동 확인");
			
			//DriverManager 클래스에서  getConnection 메서드를 이용해  url, user, password값을 이용해
			//연결을 한다.
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로깅 실패");

		} catch (SQLException e) {
			System.out.println("오라클 연결 실패");
		} catch (Exception e) {
			System.out.println("Unkonwn error");
		}
		return conn;
	}
}
