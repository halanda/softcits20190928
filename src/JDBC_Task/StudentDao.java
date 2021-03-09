package JDBC_Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
   
	//*ɾ�����ݵķ���   ��ɾ�Ķ�ִ��update����
	public int delete(int stuno) {
		//��ȡ����
		Connection conn = ConnDb.getConnection();
	
		String sql = "delete from student where stuno="+stuno;
		//�������� Statement
		Statement st = null;
		try {
			st = conn.createStatement();
		//ִ�з��� ����Ӱ������
		   return st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ر���Դ �ȹ����� ���ͨ��
			try {
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
		return 0;
	}
	
	//*�½�����
	public int insert(Student student) {
		Connection conn = ConnDb.getConnection();
		PreparedStatement pst = null;
		//��ռλ
		String sql ="insert into student(stuno,stuname,stuphone,stubirthday,stuheight,classid,createtime,updatetime) values"+"(?,?,?,to_date(?,'yyyy-MM-dd'),?,?,?,?)";
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
	
	public static void main(String[] args) {
		//���Է���
		StudentDao studentdao = new StudentDao();
		int stuno = 1;
	// System.out.println(studentdao.delete(stuno));
		Student student = new Student();
		student.setStuno(stuno);
		student.setStuname("С��");
		student.setStuphone("15999999");
		//����Ҫ�������ݿ��ʽд
	//	student.setStubirthday("25-3��-04");
		student.setStubirthday("25-03-2004");
		student.setClassid(12);
		student.setStuheight(1.13);
		student.setCreatetime("20210307155357202");
		student.setUpdatetime("20210307155357202");
		
		System.out.println(studentdao.insert(student));
		
	}
}

