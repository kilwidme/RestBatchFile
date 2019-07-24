package com.amdocs.RestApi;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT,classes=RestApiApplication.class)
public class StepDef {
	
	String url;
	Double result;
	
	@Given("Rest Api {string}")
	public void rest_Api(String serviceUrl) {
		url=serviceUrl;
	    
	}

	@When("I invoking the given rest api")
	public void i_invoking_the_given_rest_api() {
		RestTemplate restTemp = new RestTemplate();
		result = restTemp.getForObject(url, Double.class);
	}

	@Then("the expected sum is {int}")
	public void the_expected_sum_is(Integer expected) {
	   assertEquals(expected, result, 0.01);
	}


}
