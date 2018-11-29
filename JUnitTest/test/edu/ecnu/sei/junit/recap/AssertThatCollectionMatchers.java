package edu.ecnu.sei.junit.recap;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;

public class AssertThatCollectionMatchers {

	@Test
	public void verify_collection_values() throws Exception{
		
		List<Double> salary = Arrays.asList(50.00,200.00,500.00);
		
		assertThat(salary, hasItem(50.00));
		assertThat(salary, hasItems(50.00,200.00));
		assertThat(salary, not(hasItem(1.00)));
		
	}
}
