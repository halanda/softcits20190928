package capchup_20;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlTest {

	public static void main(String[] args) throws ClassNotFoundException {
		List <ProductBean> list = new ArrayList<>();
		
		// load mysql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
				//setup database connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.109:3306/sales", "root", "123456");
				Statement stmt = conn.createStatement();
				int rs = stmt.executeUpdate("insert into product_tbl(product_name,price,onboard_date,produce_city) values ('Honor','2999.00','2020-10-01','Dalian');");		
				ResultSet RS = stmt.executeQuery("select * from product_tbl");
					while (RS.next()) {
						System.out.println(RS.getInt(1) + " " + RS.getString(2) + " " + RS.getDouble(3) + " " + RS.getDate(4));
						ProductBean productBean = new ProductBean();
						productBean.setId (RS.getInt(1));
						productBean.setProduct_name(RS.getString(2));
						productBean.setPrice(RS.getDouble(3));
						productBean.setOnboard_date(RS.getDate(4));
						list.add(productBean);
					
					}
		
		          System.out.println("Total objects:"+ list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
