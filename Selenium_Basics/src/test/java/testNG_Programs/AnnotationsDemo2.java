package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AnnotationsDemo2 {
	@Test
	public void f() {
		System.out.println("@Test f");
	}

	@Test
	public void c() {
		System.out.println("@Test c");
	}

	@BeforeMethod
	public void beforeTest() {
		System.out.println("@BeforeTest ");
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("@AfterTest ");
	}

	@Test
	public void z() {
		System.out.println("@Test z");
	}
}
