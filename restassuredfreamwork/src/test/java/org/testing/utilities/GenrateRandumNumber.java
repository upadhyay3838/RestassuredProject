package org.testing.utilities;

import java.util.Random;

public class GenrateRandumNumber {
	
  
	public static Integer number() {
		Random r=new Random();
		
		Integer i=r.nextInt();
		System.out.println(i);
		
		return i;
	}
	
	
}
