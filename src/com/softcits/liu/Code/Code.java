package com.softcits.liu.Code;

public class Code {

//	�������4����ĸ����֤��
	public static String getRandomCode() {
//		����һ������
		char[] arr = new char[52];
		for (int i = 0; i < 26; i++) {
			arr[i] = (char)(65+i); //ascii A=65
		}
		for (int i = 26; i < arr.length; i++) {
			arr[i] = (char)(97+i-26); //ascii a=97
		}
		String str ="";
		for (int i = 0; i < 4; i++) {
			int index = (int)(Math.random()*52);
			
			str+= arr[index];
			
		}
		return str;
		
	}
	public static void main(String[] args) {
		Code c = new Code();
		System.out.println(c.getRandomCode());
	}
}
