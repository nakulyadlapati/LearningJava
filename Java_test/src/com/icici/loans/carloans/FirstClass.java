package com.icici.loans.carloans;

public class FirstClass implements FirstInterface {
	
	int a= 10 , b = 20 , c;
	
	public void addition()
	{
		c = a+b;
		
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		System.out.println("Hello Deepak");
		
		FirstClass obj = new FirstClass();
		
		obj.addition();
		
		
		FirstClass obj1 = new FirstClass();
		
		obj1.addition();
		
		obj.m1();
		

	}


	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		
		System.out.println("I am M1 method");
		
	}

}
