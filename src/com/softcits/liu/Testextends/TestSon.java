package com.softcits.liu.Testextends;

public class TestSon {

	public static void main(String[] args) {
		
        Son son = new Son();
        
//   方法的重写： 条件必须是继承下，子类重写父类方法，权限修饰符不能缩小，返回值，方法名，参数列表一致
        son.earnMoney();
	}

}
