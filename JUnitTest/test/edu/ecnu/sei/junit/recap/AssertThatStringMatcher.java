package edu.ecnu.sei.junit.recap;

import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.containsString;

public class AssertThatStringMatcher {

	@Test
	public void verigy_Strings()throws Exception{
		
		String name = "Li Xin Yan";
		
		assertThat(name,startsWith("Li"));
		assertThat(name,endsWith("an"));
		assertThat(name,containsString(" Xin "));
	}
}
