package restAssuredTests;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

public class RestAssured_listAndVerifyBoardInformation {
	public static void main(String[] args) {

	
				RestAssured.given().param("key", "668538d6077e85d517769b52d4227ed7")
				.param("token", "ATTA2dbf69ea071af4498fd2adb9ec24781906014ca5c88985b0347e122d9acaec3027AF52D4")
				.get("https://api.trello.com/1/members/me/boards").then()
				.statusCode(200)
				.body("id[0]", equalTo("651387b2c1f02b61774c33df")).body("name", hasItems("Alex", "Ever"));
	
	
	
	
	System.out.println("pass");
	
	
	
	
	
	
	
	}

}
