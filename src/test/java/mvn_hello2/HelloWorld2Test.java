package mvn_hello2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import mvn_hello2.HelloWorld2;
class HelloWorld2Test {

	@Test
	public void testGreetingMessage() {
		assertEquals("Hello Mr Muhammed Shafeeq! Welcome to LYIT", HelloWorld2.getGreetingMessage("Muhammed Shafeeq"));
	}
}
