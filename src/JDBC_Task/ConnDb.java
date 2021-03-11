package JDBC_Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

  //关闭资源
	public static void close(ResultSet rs, Statement st,Connection conn) {
		
			try {
				if(rs!=null) {
					rs.close();
				}
				if(st!=null) {
					st.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
         public static void main(String[] args) {
			
        	 System.out.println(ConnDb.getConnection());
		}	
}
