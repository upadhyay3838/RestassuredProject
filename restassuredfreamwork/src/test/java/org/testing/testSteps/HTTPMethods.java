package org.testing.testSteps;
import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
{
	this.pr=pr;
		
			}
	public void GetAll(String urlkey) {
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(urlkey));
		System.out.println("get all method is running");
		System.out.println("status code is");
		System.out.println(res.statusCode());
		 System.out.println("response data");
		System.out.println(res.asString());
		
		
	}

	public void Get(String urlkey,String idValue)  
	{ 
		String uri=pr.getProperty(urlkey)+"/"+idValue; 
		Response res= 
	    given()
	  .contentType(ContentType.JSON) 
	  .when() 
	  .get(uri);
	  System.out.println("status code is test3");
	  System.out.println(res.statusCode()); 
	  System.out.println("response data");
	  System.out.println(res.asString()); 
	  }
	  
	  public Response postRequest(String bodyData,String urikey) { 
      Response res=
	  given() 
	  .contentType(ContentType.JSON) 
	  .body(bodyData) 
	  .when()
	  .post(pr.getProperty(urikey));
	  
	  System.out.println("status code is"+res.statusLine());
	  System.out.println("**********Response data********");
	  System.out.println(res.asString() ); return res; }
	  
	  public void updatereq(String body,String urikey,String idvalue) {
		  String uri= pr.getProperty(urikey)+"/"+idvalue;
		  Response res=
		 
		 given()
		 .contentType(ContentType.JSON)
		 .body(body)
		 .when()
		  .put(uri);
		 System.out.println("status code is");
		 System.out.println(res.statusCode());
		 System.out.println("Response data is");
		 System.out.println(res.asString());
		  
		  
	  }
	  
	  public void deleteRequest(String urikey,String idvalue) {
		  
		  
		  String uri= pr.getProperty(urikey)+"/"+idvalue;
		  Response res=
		  given()
		  .contentType(ContentType.JSON)
		  .when()
		  .delete(uri);
		  
		  System.out.println("status code is ");
		  System.out.println(res.statusCode());
		  
		  
		  
	  }
	 
}
	
