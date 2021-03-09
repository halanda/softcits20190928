package JDBC_Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

         public static void main(String[] args) {
			
        	 System.out.println(ConnDb.getConnection());
		}	
}
