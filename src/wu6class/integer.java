package wu6class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class integer {
public static void main(String[] args) {
	
	int a=1;
//	a.����������
	Integer b =1;
	System.out.println(b.MAX_VALUE);
	
	String str = "123";
	System.out.println(str+1);
	int num = Integer.parseInt(str);
	System.out.println(num+1);
	System.out.println(Integer.parseInt(str)+1);
//	�����أ�Integer -128~127
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
//	������
	Date d = new Date();
	Date d1 = new Date();
//	�������ڱ�ʾ
//	System.out.println(d);
//	�����׼��dateתString
//	MM����ô�д
//	String patten = "yyyy-MM-dd";
	String patten2 = "yyyy-MM-dd hh:mm:ss";
	String patten1 = "hh-mm-ss";
	SimpleDateFormat sdf = new SimpleDateFormat(patten2);
	SimpleDateFormat sdf1 = new SimpleDateFormat(patten1);
	String timeStr = sdf.format(d);
	String timeStr1 = sdf1.format(d1);
	System.out.println("d�ı�׼"+timeStr);
	System.out.println("d1�ı�׼"+timeStr1);
	
//	����
//	�Ƚ���������С �õ�1
	Math.min(1, 2);
//	ȡ����ֵ
	Math.abs(-1);
//	��������
	Math.round(123.456);
//	�����
	Random random = new Random();
//	��0~9��
	System.out.println(random.nextInt(9));
	
	
	
	
}
	
	
}
