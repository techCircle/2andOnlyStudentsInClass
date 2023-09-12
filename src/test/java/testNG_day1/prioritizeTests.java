package testNG_day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class prioritizeTests {

	@Test(priority=1, groups = "loadTesting")
	public void loginWithInvalidUsernameInvalidPassword() {
		System.out.println("loginWithInvalidUsernameInvalidPassword");

	}

	@Test(priority=2, groups = "regression")
	public void loginWithValidUsernameValidPassword() {
		System.out.println("loginWithValidUsernameValidPassword");
	}

	@Test(priority=3, groups = {"smoke", "loadTesting"})
	public void loginWithValidUsernameInvalidPassword() {
		System.out.println("loginWithValidUsernameInvalidPassword");

	}

	@Test(priority=4, groups = "regression")
	public void loginWithInvalidEmailFormat() {
		System.out.println("loginWithinvalidemailFormat");

	}

}
