package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDao {
		
		public int delete(int empno) {
			Connection conn = ConnDB.getConnection();
			String sql = "delete from emps where empno ="+empno;
			Statement st = null;
			
			try {
				st = conn.createStatement();
				
				return st.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				try {
					if(st!= null) {
						st.close();
					}
					if(conn!= null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

		return 0;
	}
		//新建
		public int insert (Emp emp) {
			Connection conn = ConnDB.getConnection();
			PreparedStatement pst = null;
			String sql = "insert into emps(empno,ename,job,sal,hiredate,deptno)values"+
			"(?,?,?,?,to_date(?,'yyyy-MM-dd'),?)";
			
			try {
				pst = conn.prepareStatement(sql);
				pst.setInt(1, emp.getEmpno());
				pst.setString(2, emp.getEname());
				pst.setString(3, emp.getJob());
				pst.setDouble(4, emp.getSal());
				pst.setString(5, emp.getHiredate());
				pst.setInt(6, emp.getDeptno());
				return pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					if(pst!=null) {
						pst.close();					
					}
					if(conn!=null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return 0;
		}
		
		
		//查询
		public Emp selectByEmpno(int empno) {
			Emp emp = null;
			Connection conn = ConnDB.getConnection();
			PreparedStatement pst =null;
			String sql = "select * from emps where empno =?";
			//结果集
			ResultSet rs =null;
			
			try {
				pst = conn.prepareStatement(sql);
				pst.setInt(1,empno);
				rs = pst.executeQuery();
				if(rs.next()) {
					emp = new Emp();
					emp.setEname(rs.getString("ename"));
					emp.setJob(rs.getString("job"));
					emp.setSal(rs.getDouble("sal"));
					emp.setHiredate(rs.getString("hiredate"));
					emp.setDeptno(rs.getInt("deptno"));
					emp.setEmpno(rs.getInt("empno"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				try {
					if(rs!=null) {
						rs.close();
					}
					if(pst!=null) {
						pst.close();
					}
					if(conn!=null) {}
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return emp;
		}
		
		
	public static void main(String[] args) {
		
		EmpDao empDao = new EmpDao();
		int empno =1234;
//		System.out.println(empDao.delete(empno));
		Emp emp = new Emp();
		emp.setEmpno(empno);
		emp.setDeptno(10);
		emp.setEname("TEST");
//  	emp.setJob("Salesman");
		emp.setJob("DEV");
		emp.setSal(8888.88);	
		emp.setHiredate("2021-3-7");
//	    System.out.println(empDao.insert(emp));
		
		System.out.println(empDao.selectByEmpno(7521));
	
	}
	
}
