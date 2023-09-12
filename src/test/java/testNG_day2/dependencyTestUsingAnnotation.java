package testNG_day2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class dependencyTestUsingAnnotation extends groupingTests {

	@Test(dependsOnMethods = { "environmentTest" })
	public void testPrintMessage() {
		System.out.println("inside testPrintMessage");
	}

	@Test(dependsOnMethods = "anotherBoringMethod")
	public void environmentTest() {
		System.out.println("Testing environment");
		AssertJUnit.assertTrue(true);
	}

}
