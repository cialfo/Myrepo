package API;

import java.util.Random;

public class SignupPostBase {
	
	public static String Base_URI()
	{
		return "https://sandbox.cialfo.sg";
	}
	public static String Register_Api()
	{
		return "access_student_create";
	}
	public static String Registeruser()
	{
		
		String fname = "rabika";
		String lname = "iqbal";
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		String pwd = "12345678";
		String domain = "cialfo.com.sg";
		String randomemail = fname.toLowerCase() + "." + lname.toLowerCase() + "+" + randomNumber + "@" + domain;
		
																					
		return "{\n"
				+ "    \"user\":{\n"
				+ "        \"password\":\"" + pwd +"\",\"has_accepted_conditions\":true,\"first_name\":\"" + fname +"\",\"last_name\":\"" + lname + "\",\"email\":\"" + randomemail +",\"gender\":\"F\",\"gender_preference\":null,\"mobile\":null,\"mobile_country_code\":null,\"onboarded\":true,\n"
				+ "         \"device_info\": {\n"
				+ "            \"platform\": \"web\"\n"
				+ "                         }\n"
				+ "    }\n"
				+ "}\n"
				+ "";
	}
			
	public static String SameEmail()
	{
		
																			
		return "{\n"
				+ "     \"user\":{\n"
				+ "        \"password\":\"12345678\",\"has_accepted_conditions\":true,\"first_name\":\"da\",\"last_name\":\"daa\",\"email\":\"da3@da.com\",\"gender\":\"F\",\"gender_preference\":null,\"mobile\":null,\"mobile_country_code\":null,\"onboarded\":true,\n"
				+ "         \"device_info\": {\n"
				+ "            \"platform\": \"web\"  }\n"
				+ "    }\n"
				+ "}\n"
				+ "";
	}
	
	}