package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	@Test
	@Parameters({"MyName"})
	public void test( @Optional("Vansh") String name) {
		
		System.out.println("My Name: "+name);
	}
}
