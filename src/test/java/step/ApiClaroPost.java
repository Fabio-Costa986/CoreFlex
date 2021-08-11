package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.PostClaro;

public class ApiClaroPost {
	
	PostClaro  apiclaro = new PostClaro();
	
	@Given("eu eu estja no Claro Flex")
	public void eu_eu_estja_no_claro_flex() {
	  apiclaro.acessarApi("https://reqres.in/api");
		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   apiclaro.testPost();
	}


}
