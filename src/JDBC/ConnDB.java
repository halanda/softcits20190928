package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {

	public static Connection getConnection() {
		
		Connection conn = null;
		//1. ����������
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		// 2.��ȡ����ͨ��
		// @��ip,�˿ںţ����ݿ�����
		// 127.0.0.1����IP localhost��������
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			
		// invalid username/password; logon denied  �û�������������쳣
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
		//�����Ƿ�����
		System.out.println(ConnDB.getConnection());
		
		
	}
	
	
}
