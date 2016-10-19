package opensource;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit {
	private static jmeter jme = new jmeter();
	
	@Test
	public void testGetName(){
		jme.setName();
		assertEquals("hxw",jme.getName());
	}
	
	@Test
	public void testGetFriend(){
		jme.setFriend();
		assertEquals("together",jme.getFriend());
	}
}
