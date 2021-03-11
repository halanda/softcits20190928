package JDBC_Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
   
	//*ɾ�����ݵķ���   ��ɾ�Ķ�ִ��update����
	public int delete(int stuno) {
		//��ȡ����
		Connection conn = ConnDb.getConnection();
	//   String sql = "delete from student where stuno="+stuno;
		String sql = "delete from student where stuno=?";
		//�������� Statement
	//	Statement st = null;
		PreparedStatement pst = null;
		try {
	//		st = conn.createStatement();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, stuno);
			
		//ִ�з��� ����Ӱ������
	//	   return st.executeUpdate(sql);
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ر���Դ �ȹ����� ���ͨ��
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
	
	//*�½�����
	public int insert(Student student) {
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		//��ռλ
		String sql ="insert into student(stuno,stuname,stuphone,stubirthday,stuheight,classid,createtime,updatetime) values (?,?,?,to_date(?,'yyyy-MM-dd'),?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql);
			//��ռλ�����и�ֵ
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
			//�ر���Դ �ȹ����� ���ͨ��
		
				ConnDb.close(null, pst, conn);
		}
		return 0;
	}
	
	//*�޸Ĳ���
	public int update(Student student) {
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		String sql = "Update student set stuname =?,stuphone =?,stubirthday=to_date(?,'yyyy-MM-dd'),stuheight =?,classid =?"+"where stuno=?";
		//��ֵ
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
			//�ر���Դ �ȹ����� ���ͨ��
			ConnDb.close(null, pst, conn);
		}
		
		return 0;
	}
	//*��ѯ���ݿ�
	public Student selectByStuno(int stuno) {
		Student student = null;
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		String sql = "select * from student where stuno=?";
		//�����
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, stuno);
		//ִ�в�ѯ��� ִ��executeQuery()
			rs = pst.executeQuery();
			if(rs.next()) {
			//ʵ��������
				student = new Student();
			//��ȡ������ж�Ӧ����ֵ ͨ��������ȡ
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
			//�ر���Դ �Ƚ���� �ٹ����� ����ͨ��
			ConnDb.close(rs, pst, conn);
		}
		
		return student;
	} 
	
	//��ѯ����
	public List<Student> selectAll(){
		List<Student> list = new ArrayList<>();
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		String sql = "select * from student";
		//�����
		ResultSet rs = null;
		
		try {
			pst = conn.prepareStatement(sql);
			
		//ִ�в�ѯ��� ִ��executeQuery()
			rs = pst.executeQuery();
			while(rs.next()) {
			//ʵ��������
				Student student = new Student();
			//��ȡ������ж�Ӧ����ֵ ͨ��������ȡ
				student.setStuname(rs.getString("stuname"));
				student.setStuphone(rs.getString("stuphone"));
				student.setStubirthday(rs.getString("stubirthday"));
				student.setStuheight(rs.getDouble("stuheight"));
				student.setClassid(rs.getInt("classid"));
				student.setStuno(rs.getInt("stuno"));
				//�ռ���������
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ر���Դ �Ƚ���� �ٹ����� ����ͨ��
			ConnDb.close(rs, pst, conn);
		}
		return list;
	}
	
	public static void main(String[] args) {
		//���Է���
		StudentDao studentdao = new StudentDao();
		int stuno = 1;
	// System.out.println(studentdao.delete(stuno));
		Student student = new Student();
		student.setStuno(stuno);
		student.setStuname("С��");
		student.setStuphone("13898408203");
		//����Ҫ�������ݿ��ʽд
	//	student.setStubirthday("25-3��-04");
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

