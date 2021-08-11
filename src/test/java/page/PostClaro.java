package page;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostClaro {

	
	
		
		Response response;
			
			public Response acessarApi(String uri) {
				
				response = RestAssured.get(uri);
				
				return response;
				
			}
			
			
			public void testPost() {
				
				//Map<String, Object> map = new HashMap<String, Object>();
				
				//map.put("name", "Raghav");
				//map.put("job", "Teacher");
				//System.out.println(map);
				
				JSONObject request = new JSONObject();
				request.put("name", "Fabio");
				request.put("job", "QA");
				
				System.out.println(request.toJSONString());
				
				baseURI = "https://reqres.in/api";
				
				given()
					.log().all()
					.header("Content-Type", "application/json")
					.contentType(ContentType.JSON).accept(ContentType.JSON)
					.body(request.toJSONString())
				.when()
					.post("/users")
				.then()
					.log().all()
					.statusCode(201)
					.body("name", is("Fernanda"))
					
					
				
				
				
				
				;
				
			}
	}
	

