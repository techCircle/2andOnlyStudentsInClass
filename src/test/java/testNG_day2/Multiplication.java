package testNG_day2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplication {

	@Parameters({"val1", "val2"})
	@Test
	public void multiply(int value1, int value2) {
		int finalValue = value1 * value2;
		System.out.println(value1 + " * " + value2 + " = " + finalValue);
	}

}
