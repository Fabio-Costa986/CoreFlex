package page;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.StringContains;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetClaro {
	
	Response response;
	
	public Response acessarApi(String uri) {
		
		response = RestAssured.get(uri);
		
		return response;
		
	}
	
	public void deveObterClimaApiChaveGEOGRAFICO() {
		
		given()
			.log().all()
			.queryParam("q", "Fortaleza,BR")
			.queryParam("appid", "050c10d7156c196a31c7d7d82780d816")
			.queryParam("units", "metric")
			.queryParam("lat", "-3.7227")
			.queryParam("lon", "-38.5247")
				
		.when()
			.get("http://api.openweathermap.org/data/2.5/weather")
		.then()
			.log().all()
			.statusCode(200)
			.body("name", is("Fortaleza"))
			.body("coord.lat", is(-3.7227f))
			
			
			
		
		;
	}

	
}
