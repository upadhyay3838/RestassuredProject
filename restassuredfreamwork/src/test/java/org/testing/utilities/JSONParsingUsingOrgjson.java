package org.testing.utilities;

import org.json.JSONObject;

public class JSONParsingUsingOrgjson {

	public static String Jsonps(String body,String keyName)
	
	{
		
		JSONObject js=new JSONObject(body);
		return js.getString(keyName);
	
		
		
	}
	  
}
