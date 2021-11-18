package mvn_hello2;

import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorld2Test2 {
	@Test
	public void testGreetingMessage() {
		assertEquals("Hello MrMuhammed Shafeeq! Welcome to LYIT", HelloWorld2.getGreetingMessage("Muhammed Shafeeq"));
	}
	

}
