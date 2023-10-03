package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrelloCreateCardsMax {

	public static void main(String[] args) {

		String key = "668538d6077e85d517769b52d4227ed7";
		String token = "ATTA2dbf69ea071af4498fd2adb9ec24781906014ca5c88985b0347e122d9acaec3027AF52D4";
		String listId = "651b57504a86dcf7291b7215";

		// rest assured base url
		RestAssured.baseURI = "https://api.trello.com/1/cards";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");

		int maxCards = 10001;
		int numCards = 0;

		while (numCards < maxCards) {
			JSONObject requestBody = new JSONObject();
			requestBody.put("name", "Cards for LoneWolf - " + (numCards + 1));
			requestBody.put("idList", listId);
			requestBody.put("key", key);
			requestBody.put("token", token);

			Response myResponse = httpRequest.body(requestBody.toString()).post();

			int statusCode = myResponse.getStatusCode();
			if (statusCode == 200) {
				numCards++;
				System.out.println("Cards " + numCards + " created");
			} else {
				System.out.println("Failed to create card");
				myResponse.prettyPrint();
				break;
			}

		}

		System.out.println("Number of cards created: " + numCards);

	}

}
