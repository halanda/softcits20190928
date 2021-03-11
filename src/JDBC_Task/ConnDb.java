package JDBC_Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnDb {

	public static Connection getConnection() {
		
		Connection conn = null;
		
		//����������
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		//��ȡ����ͨ��
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			String user ="scott";
			String password ="tiger";
			
			conn = DriverManager.getConnection(url, user, password);
			//ClassNotFoundException�쳣��ԭ��1û��jar��/����� 2.��������
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;	
	}

  //�ر���Դ
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
