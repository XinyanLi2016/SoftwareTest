package edu.ecnu.sei.junit.recap;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class AssertThatCompareValueMatchers {
     @Test
     public void equalTo_Matcher() throws Exception{
    	 
    	 int age = 30;
    	 assertThat(age, equalTo(30));
    	 
    	 double salary = 5710.23;
    	 //assertThat(salary, equalTo(5710.25));
    	 assertThat(salary, equalTo(5710.23));
    	 
    	 String lessonName = "Software testing";
    	 assertThat(lessonName, equalTo("Software testing"));
    	 
    	 int[] ages = {30,35};
    	 assertThat(ages, equalTo(new int[] {30,35}));
    	 
    	 String[] tools = {"JUnit","PSO","eclEmma"};
    	 assertThat(tools, equalTo(new String[] {"JUnit","PSO","eclEmma"} ));
    	 
     }
     
     @Test
     public void equalTo_Matcher_array_content_same_but_index_not_same() throws Exception{
       
    	 String[] tools =  {"JUnit","PSO","eclEmma"};
    	 assertThat(tools, equalTo(new String[] {"PSO","JUnit","exlEmma"}));
     }
     
     @Test
     public void not_Matcher_test_pass() throws Exception{
    	 int age = 30;
    	 assertThat(age, not(equalTo(33)));
     }
     
     @Test
     public void not_Matcher_test_fail() throws Exception{
    	 
    	 int age = 30;
    	 assertThat(age, not(equalTo(30)));
     }
     }
