package src.test.java;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.websystique.springmvc.configuration.HelloWorldConfiguration;
import com.websystique.springmvc.configuration.HelloWorldInitializer;

import junit.framework.Assert;

public class HelloWorldInitializerTest {
	
	 @Autowired
	    private HelloWorldInitializer helloWorldInitializer = new HelloWorldInitializer();
	
	
	@Test
    public void testBean()
    {
	
		helloWorldInitializer.setMessage("I am in Staten Island, New York");

     Assert.assertEquals(helloWorldInitializer.getMessage(), "I am in Staten Island, New York");
 }
}
