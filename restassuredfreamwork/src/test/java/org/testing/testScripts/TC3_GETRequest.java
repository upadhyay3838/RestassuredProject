package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;

public class TC3_GETRequest {

public void tastcase3 () throws IOException {
	System.out.println("test case3");	
	Properties pr=PropertiesHandle.loadProperties("../restassuredfreamwork/URI.Properties");
	HTTPMethods http=new HTTPMethods(pr);
	http.Get("QA_URI", TC1_PostRequest.responseidvalue);
	
	
	
}


}
