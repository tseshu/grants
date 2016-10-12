package src.test.java;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.websystique.springmvc.configuration.HelloWorldConfiguration;

import junit.framework.Assert;

public class HelloWorldConfigurationTest {
	
	 @Autowired
	    private HelloWorldConfiguration helloWorldConfiguration = new HelloWorldConfiguration();
	
	
	@Test
    public void testBean()
    {
	
	helloWorldConfiguration.setMessage("I am in Staten Island, New York");

     Assert.assertEquals(helloWorldConfiguration.getMessage(), "I am in Staten Island, New York");
 }
}
