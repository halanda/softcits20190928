package JDBC_Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
   
	//*删除数据的方法   增删改都执行update方法
	public int delete(int stuno) {
		//获取连接
		Connection conn = ConnDb.getConnection();
	//   String sql = "delete from student where stuno="+stuno;
		String sql = "delete from student where stuno=?";
		//创建载体 Statement
	//	Statement st = null;
		PreparedStatement pst = null;
		try {
	//		st = conn.createStatement();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, stuno);
			
		//执行方法 返回影响行数
	//	   return st.executeUpdate(sql);
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源 先关载体 后关通道
			try {
	//			if(st!=null) {
	//				st.close();
				
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
	
	//*新建数据
	public int insert(Student student) {
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		//？占位
		String sql ="insert into student(stuno,stuname,stuphone,stubirthday,stuheight,classid,createtime,updatetime) values (?,?,?,to_date(?,'yyyy-MM-dd'),?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			//对占位符进行赋值
			pst.setInt(1, student.getStuno());
			pst.setString(2, student.getStuname());
			pst.setString(3, student.getStuphone());
			pst.setString(4, student.getStubirthday());
			pst.setDouble(5, student.getStuheight());
			pst.setInt(6, student.getClassid());
			pst.setString(7, student.getCreatetime());
			pst.setString(8, student.getUpdatetime());
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源 先关载体 后关通道
		
				ConnDb.close(null, pst, conn);
		}
		return 0;
	}
	
	//*修改操作
	public int update(Student student) {
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		String sql = "Update student set stuname =?,stuphone =?,stubirthday=to_date(?,'yyyy-MM-dd'),stuheight =?,classid =?"+"where stuno=?";
		//赋值
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, student.getStuname());
			pst.setString(2, student.getStuphone());
			pst.setString(3, student.getStubirthday());
			pst.setDouble(4, student.getStuheight());
			pst.setInt(5, student.getClassid());
			/*
			 * pst.setString(6, student.getCreatetime());
			 * pst.setString(7, student.getUpdatetime());
			 */
			pst.setInt(6, student.getStuno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源 先关载体 后关通道
			ConnDb.close(null, pst, conn);
		}
		
		return 0;
	}
	//*查询数据库
	public Student selectByStuno(int stuno) {
		Student student = null;
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		String sql = "select * from student where stuno=?";
		//结果集
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, stuno);
		//执行查询语句 执行executeQuery()
			rs = pst.executeQuery();
			if(rs.next()) {
			//实例化对象
				student = new Student();
			//获取结果集中对应的列值 通过列名获取
				student.setStuname(rs.getString("stuname"));
				student.setStuphone(rs.getString("stuphone"));
				student.setStubirthday(rs.getString("stubirthday"));
				student.setStuheight(rs.getDouble("stuheight"));
				student.setClassid(rs.getInt("classid"));
				student.setStuno(rs.getInt("stuno"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源 先结果集 再关载体 最后关通道
			ConnDb.close(rs, pst, conn);
		}
		
		return student;
	} 
	
	//查询所有
	public List<Student> selectAll(){
		List<Student> list = new ArrayList<>();
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		String sql = "select * from student";
		//结果集
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement(sql);
			
		//执行查询语句 执行executeQuery()
			rs = pst.executeQuery();
			while(rs.next()) {
			//实例化对象
				Student student = new Student();
			//获取结果集中对应的列值 通过列名获取
				student.setStuname(rs.getString("stuname"));
				student.setStuphone(rs.getString("stuphone"));
				student.setStubirthday(rs.getString("stubirthday"));
				student.setStuheight(rs.getDouble("stuheight"));
				student.setClassid(rs.getInt("classid"));
				student.setStuno(rs.getInt("stuno"));
				//收集到集合中
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源 先结果集 再关载体 最后关通道
			ConnDb.close(rs, pst, conn);
		}
		return list;
	}
	
	public static void main(String[] args) {
		//测试方法
		StudentDao studentdao = new StudentDao();
		int stuno = 1;
	// System.out.println(studentdao.delete(stuno));
		Student student = new Student();
		student.setStuno(stuno);
		student.setStuname("小欢");
		student.setStuphone("13898408203");
		//日期要按照数据库格式写
	//	student.setStubirthday("25-3月-04");
		student.setStubirthday("1990-08-08");
		student.setClassid(12);
		student.setStuheight(1.64);
		student.setCreatetime("20210307155357202");
		student.setUpdatetime("20210307155357202");
	//	System.out.println(studentdao.insert(student));
	//	System.out.println(studentdao.update(student));
	//	System.out.println(studentdao.selectByStuno(8));
		System.out.println(studentdao.selectAll());
		
	}
}

