package com.java;

public class Child_A extends Parent_A {
	private void bike () {
		System.out.println("Print Bike");
	}
	public void car () {
		System.out.println("Print Car");
	}
	public void school () {
		System.out.println("Print School");
	}
    public static void main(String[] args) {
    	Child_A B= new Child_A();
    	B.land();
    	B.house();
    	B.bike();
    }
}
