package API;

import org.json.simple.JSONObject;
//import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.net.MalformedURLException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
//import io.restassured.response.Response;


public class Api_login {
	
@Test (priority=1)

	  public void api_post() throws MalformedURLException
{
		  
	//	Response response=   RestAssured.get("https://sandbox.cialfo.sg");
		  
	
	RestAssured.baseURI = "https://sandbox.cialfo.sg";

//	request.put("email_or_phone", "rabika.iqbal+auto01@cialfo.com.sg");
	//request.put("password", "12345678");	
	
//	String requestBody = 
	
	given().log().all()
			.queryParam("access_token","Zx2EE58K0tyzL8V4Xh7GLYYhQzHcz7Q05jrRXAcfw1").queryParam("locale",
			 "en-US").queryParam("captcha_token", "")
			.header("platform", "web").header("user-agent", "wTRGdmtTaDUzdCDD")
			.contentType(ContentType.JSON)
			.body("{\n"
					+ "    \"user\": {\n"
					+ "        \"email_or_phone\": \"rabika.iqbal+auto@cialfo.com.sg\",\n"
					+ "        \"password\": \"12345678\",\n"
					+ "        \"device_info\": {\n"
					+ "            \"platform\": \"web\"\n"
					+ "        }\n"
					+ "    }\n"
					+ "}")
			 .when().post("v3/sessions").then().log().all().assertThat().statusCode(200);
			 
	/*
	 * RestAssured.baseURI = "https://sandbox.cialfo.sg";
	 * 
	 * given().log().all().queryParam("access_token",
	 * "Zx2EE58K0tyzL8V4Xh7GLYYhQzHcz7Q05jrRXAcfw1") .queryParam("locale",
	 * "en-US").queryParam("captcha_token", "").header("platform", "web")
	 * .body("{\n" + "    \"user\": {\n" + "        \"email\": \"q@1.com\",\n" +
	 * "        \"password\": \"1111111q1\",\n" + "        \"device_info\": {\n" +
	 * "            \"platform\": \"web\"\n" + "        }\n" + "    }")
	 * .when().post("v3/sessions").then().log().all().assertThat().statusCode(200);
	 * 
	 * 
	 * }
	 */
}

	}


