package API;

import static io.restassured.RestAssured.given;
import java.net.MalformedURLException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SignupAPI extends SignupPostBase {
	
	@Test (priority=0)

	 //creating a get API to Signup page  using valid credentials
	public void api_post01() throws MalformedURLException
{
		  
	RestAssured.baseURI = Base_URI();
	
	
	given().log().all()
	.queryParam("access_token","Zx2EE58K0tyzL8V4Xh7GLYYhQzHcz7Q05jrRXAcfw1").queryParam("captcha_token", "")
	.header("platform", "web").header("user-agent", "wTRGdmtTaDUzdCDD")
	.contentType(ContentType.JSON)
	.body("SignupPostBase.Registeruser()")	
	 .when().post("v3/users/access_student_create").then().log().all().assertThat().statusCode(200);
	 
}

	 //creating a get API to Signup page  using same email 
		public void api_post02() throws MalformedURLException
	{
			  
		RestAssured.baseURI = Base_URI();
		
		
		given().log().all()
		.queryParam("access_token","Zx2EE58K0tyzL8V4Xh7GLYYhQzHcz7Q05jrRXAcfw1").queryParam("captcha_token", "")
		.header("platform", "web").header("user-agent", "wTRGdmtTaDUzdCDD")
		.contentType(ContentType.JSON)
		.body("SignupPostBase.SameEmail()")	
		 .when().post("v3/users/access_student_create").then().log().all().assertThat().statusCode(200);
		 
	}


}
