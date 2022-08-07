package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONFileHandle {
	
	public static String loadjson(String filepath) throws FileNotFoundException 
	{
		File f=new File(filepath); 
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
	     JSONObject j=new JSONObject(js);
		return j.toString();
		
	}
	
	

}
