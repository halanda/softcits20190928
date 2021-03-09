package JDBC_Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDb {

	public static Connection getConnection() {
		
		Connection conn = null;
		
		//加载驱动类
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		//获取连接通道
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			String user ="scott";
			String password ="tiger";
			
			conn = DriverManager.getConnection(url, user, password);
			//ClassNotFoundException异常的原因：1没导jar包/导错包 2.类名错误
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
			
        	 System.out.println(ConnDb.getConnection());
		}	
}
