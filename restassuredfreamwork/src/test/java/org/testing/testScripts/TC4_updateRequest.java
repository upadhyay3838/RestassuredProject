package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JSONFileHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.StringReplacment;

public class TC4_updateRequest
{

	public void testcase4() throws IOException 
	
	{
		
		System.out.println("test case 4");
		Properties pr=PropertiesHandle.loadProperties("../restassuredfreamwork/URI.Properties");
		String bodydata =JSONFileHandle.loadjson("../restassuredfreamwork/src/test/java/org/testing/resources/putRequsetPayload.json");
		String	updatebodydata= StringReplacment.replacement(bodydata, "id", TC1_PostRequest.responseidvalue);
		HTTPMethods http=new HTTPMethods(pr);
		http.updatereq(updatebodydata, "QA_URI", TC1_PostRequest.responseidvalue);
		
	}
	
	
}
