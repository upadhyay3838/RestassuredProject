package Runner;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GETRequest;
import org.testing.testScripts.TC4_updateRequest;
import org.testing.testScripts.TC5_deleteRequest;

public class Runner {

	public static void main(String[] args) throws IOException {
	TC1_PostRequest tc1=new TC1_PostRequest();
	tc1.testCase1();
	 TC2_GetAllRequest tc2=new TC2_GetAllRequest();
	 tc2.testCase2();
	TC3_GETRequest tc3=new TC3_GETRequest();
	   tc3.tastcase3();
	   TC4_updateRequest tc4=new TC4_updateRequest();
	  tc4.testcase4();
	  TC5_deleteRequest tc5=new TC5_deleteRequest();
	  tc5.testcase5();
		 
	}

}
 