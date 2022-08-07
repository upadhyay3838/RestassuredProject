package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC2_GetAllRequest {

	
	public void  testCase2() throws IOException {
		System.out.println("test case2");	
		Properties pr=PropertiesHandle.loadProperties("../restassuredfreamwork/URI.Properties");
		HTTPMethods http=new HTTPMethods(pr);
	    http.GetAll("QA_URI"); 
	
	
	}
	
} 
  