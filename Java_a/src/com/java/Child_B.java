package com.java;

public class Child_B extends Parent_A {
	public void college () {
		System.out.println("Print College");
	}
	public void office () {
		System.out.println("Print Office");
	}
	private void ground () {
		System.out.println("Print Ground");
	}
	 public static void main(String[] args) {
	    	Child_B D= new Child_B();
	    	D.house();
	    	D.land();
	    	D.ground();
	    	D.office();
	 }
}
