package wu6class;

public class integer {
public static void main(String[] args) {
	
	int a=1;
//	a.出不来东西
	Integer b =1;
	System.out.println(b.MAX_VALUE);
	
	String str = "123";
	System.out.println(str+1);
	int num = Integer.parseInt(str);
	System.out.println(num+1);
	System.out.println(Integer.parseInt(str)+1);
//	常量池：Integer -128~127
//	ture
	Integer no1 =1;
	Integer no2 =1;
//  false	
	Integer no3 =128;
	Integer no4 =128;
// ture	
	Integer no5 =-128;
	Integer no6 =-128;
	System.out.println(no5==no6);
}
	
	
}
