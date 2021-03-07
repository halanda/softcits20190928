package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {

	public static Connection getConnection() {
		
		Connection conn = null;
		//1. 加载驱动类
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		// 2.获取连接通道
		// @后ip,端口号，数据库名字
		// 127.0.0.1本机IP localhost本地主机
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			
		// invalid username/password; logon denied  用户名或密码错误异常
			String user = "scott";
			String password = "tiger";
		
			
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return conn;	
	}
	
	public static void main(String[] args) {
		//测试是否连接
		System.out.println(ConnDB.getConnection());
		
		
	}
	
	
}
