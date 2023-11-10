package com.examples;

public class Example1 {

	
	
	public int Example(int a,int b,String ope)
	{
		int r=0;
	   
		switch (ope) {
		case "ADD": r=a+b;break;

		case "SUD" : r= a-b;break;

		case "MUL" : r= a*b;break;

		case "DIV" :r= a/b;break;

		default: r=a+b;
			
		}
		return r;
		
	}
}
