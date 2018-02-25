package com.icici.loans.carloans;

public class ChildClass extends AbstractClass {

	public static void main(String[] args) {
		
		
		
		ChildClass obj = new ChildClass();
		
		obj.method1();
		obj.method2();

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Abstract method from AbstractClass");
		
	}

}
