package org.testing.utilities;

import java.util.regex.Pattern;

public class StringReplacment
{
	public static String replacement(String completeData,String keyName,String keyValue) 
	{
		
completeData=completeData.replaceAll(Pattern.quote("{{"+keyName+"}}"), keyValue);
		return completeData;
	}

}
