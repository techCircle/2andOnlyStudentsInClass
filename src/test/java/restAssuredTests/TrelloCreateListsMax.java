package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrelloCreateListsMax {

	public static void main(String[] args) {

		String key = "668538d6077e85d517769b52d4227ed7";
		String token = "ATTA2dbf69ea071af4498fd2adb9ec24781906014ca5c88985b0347e122d9acaec3027AF52D4";
		String boardId = "6513860724fee2f72c834707";
		int numLists = 0;
		// rest assured base url

		RestAssured.baseURI = "https://api.trello.com/1/lists";

		// create request object
		RequestSpecification httpRequest = RestAssured.given();

		httpRequest.header("Content-Type", "application/json");

		// create lists until the maximum limit is reached

		while (true) {
			JSONObject requestBody = new JSONObject();
			requestBody.put("name", "LoneWolf" + (numLists + 1));
			requestBody.put("idBoard", boardId);
			requestBody.put("key", key);
			requestBody.put("token", token);

			Response myResponse = httpRequest.body(requestBody.toString()).post();

			int statusCode = myResponse.getStatusCode();

			if (statusCode == 200) {
				numLists++;
				System.out.println("List " + numLists + " created");
			} else {
				System.out.println("Failed to create list");
				myResponse.prettyPrint(); // print the response for the further inspection
				break; // stop creating lists if an error occurs
			}

		}

		System.out.println("Number of lists created " + numLists);

	}

}
