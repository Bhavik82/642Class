package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationsDemo1 {

	@AfterClass // Post-condition
	public void afterClass() {
		System.out.println("I am @AfterClass");
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		System.out.println("I am @BeforeClass");
	}

	@Test // Actual Test cases script
	public void d() {
		System.out.println("I am @test d");
	}

	@Test // Actual Test cases script
	public void g() {
		System.out.println("I am @test g");
	}
	
}
