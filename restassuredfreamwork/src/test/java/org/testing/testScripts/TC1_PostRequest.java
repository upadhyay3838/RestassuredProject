 package org.testing.testScripts;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.GenrateRandumNumber;
import org.testing.utilities.JSONFileHandle;
import org.testing.utilities.JSONParsingUsingOrgjson;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.StringReplacment;

import io.restassured.response.Response;

public class TC1_PostRequest {

	
static String responseidvalue;
	public  void testCase1() throws IOException 
	{
       
	Properties pr=PropertiesHandle.loadProperties("../restassuredfreamwork/URI.Properties");
		String bodydata =JSONFileHandle.loadjson("../restassuredfreamwork/src/test/java/org/testing/resources/PostRequestPayload.json");
		Integer i=GenrateRandumNumber.number(); 
 String	updatebodydata= StringReplacment.replacement(bodydata, "id", i.toString());
	System.out.println("test case 1"); 
		HTTPMethods http=new HTTPMethods(pr); 
	Response res= http.postRequest(updatebodydata, "QA_URI");  
     
	 responseidvalue=JSONParsingUsingOrgjson.Jsonps(res.asString(), "id");
	 System.out.println(responseidvalue);

	
	}
}

   