package test;

public class TestString {
public static void main(String[] args) {
	
	String str1 = new String("123");
	String str2 = new String("123");
	
	String str3 = "123";
	str3 = "1234";
	System.out.println(str1==str3);

	
	StringBuffer s = new StringBuffer("123");
	System.out.println(str1);
}
		
}
