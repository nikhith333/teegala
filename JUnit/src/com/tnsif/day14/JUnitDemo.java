package com.tnsif.day14;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class JUnitDemo {
	@DisplayName("JUnittesting")
	@RepeatedTest(2)
	@Test
	public void show()
	{
		System.out.println("this is show method");
	}
	
	@Ignore
	public void hii()
	{
		System.out.println("this is hii method");
	}
	@DisplayName("JUnittesting2")
	@Test
	public void hello()
	{
		System.out.println("this is hello method");
	}

}
