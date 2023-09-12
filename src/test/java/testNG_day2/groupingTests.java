package testNG_day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class groupingTests {

	
	@Test(groups = "smoke")
	public void alexTest() {
		System.out.println("alexTest");
	}

	@Test(groups = {"smoke", "regression"})
	public void EverTest() {
		System.out.println("EverTest");

	}
	
	@Test(groups = "functional")
	public void shaffyTest() {
		System.out.println("shaffyTest");

	}

	@Test(groups = {"functional", "smoke"})
	public void GianTest() {
		System.out.println("GianTest");

	}
	
	@Test
	public void anotherBoringMethod() {
		System.out.println("methodFrom groupingTests");

	}
	
	

}
