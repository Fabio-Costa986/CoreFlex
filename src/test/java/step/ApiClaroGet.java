package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.GetClaro;

public class ApiClaroGet {
	
	
	GetClaro apiclaro = new GetClaro();
	
	@Given("que eu esteja no Claro Flex")
	public void que_eu_esteja_no_claro_flex() {
		apiclaro.acessarApi("http://api.openweathermap.org/data/2.5/weather");
	   
	}

	
	@Then("validar status code")
	public void validar_status_code() {
		apiclaro.deveObterClimaApiChaveGEOGRAFICO();
		   
	
		
		
	   
	}


}
