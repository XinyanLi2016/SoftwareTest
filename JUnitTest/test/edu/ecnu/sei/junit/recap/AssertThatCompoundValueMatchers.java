package edu.ecnu.sei.junit.recap;
import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.allOf;

public class AssertThatCompoundValueMatchers {

	@Test
	public void verify_multiple_values() throws Exception{
		
		double marks = 100.00;
		
		assertThat(marks,either(equalTo(100.00)).or(equalTo(90.9)));
		assertThat(marks,both(not(99.99)).and(not(63.00)));
		assertThat(marks,anyOf(equalTo(100.00),equalTo(1.00),equalTo(55.00),equalTo(55.00),equalTo(65.2)));
		assertThat(marks,not(anyOf(equalTo(0.00),equalTo(200.00))));
		assertThat(marks,not(allOf(equalTo(1.00),equalTo(100.00),equalTo(3.00))));
		
	}
}
