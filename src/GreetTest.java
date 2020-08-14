import static org.junit.Assert.assertEquals;

import java.time.LocalTime;

import org.junit.Test;

public class GreetTest {
	
	@Test
	public void testGreet() {
		Greeting g = new Greeting();
		String msg = g.greet("Aayush");
		String exp = "Good evening Aayush";
		assertEquals(exp, msg);
	}
	
	@Test
	public void testGreet1() {
		
		LocalTime time = LocalTime.of(11, 43);
		ModifiedGreeting g = new ModifiedGreeting(time);
		String msg = g.greet("Aayush");
		String exp = "Good morning Aayush";
		assertEquals(exp, msg);
	}
}
