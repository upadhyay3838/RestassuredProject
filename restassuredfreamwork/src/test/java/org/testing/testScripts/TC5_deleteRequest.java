package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC5_deleteRequest {
	public void testcase5() throws IOException 
	{
		System.out.println("test case 5");
		Properties pr=PropertiesHandle.loadProperties("../restassuredfreamwork/URI.Properties");
		HTTPMethods http= new HTTPMethods(pr);
		http.deleteRequest("QA_URI", TC1_PostRequest.responseidvalue);
		
		
	}

}
