package com.java.StringPallindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    
	App app = new App();
	
	@Test
	public void ispallindrometest()
	{
		String x = "noon";
		boolean k =app.ispallindrome(x);
		assertEquals(true, k);
	}
	@Test
	public void isnotpallindrometest()
	{
		String x = "rohit";
		boolean k = app.ispallindrome(x);
		assertEquals(false, k);
	}
	
	
	
}