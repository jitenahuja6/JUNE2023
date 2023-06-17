package com.java.StringPallindrome;

public class App {
 
	public boolean ispallindrome(String input)
	{
		if(input == null)
		{
			throw new IllegalArgumentException();
		}
		
		else if(input.equals(reverse(input)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String reverse(String n)
	{
		String rev="";
	
		for(int i = n.length() - 1; i>=0; i--)
		{
			rev = rev + n.charAt(i);
		}
		return rev;
	}}