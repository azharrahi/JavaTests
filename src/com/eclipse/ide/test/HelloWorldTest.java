/**
 * 
 */
package com.eclipse.ide.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author azhar
 *
 */
class HelloWorldTest {
	
	HelloWorld helloWorld;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		helloWorld = new HelloWorld();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.eclipse.ide.test.HelloWorld#Sum(int, int)}.
	 */
	@Test
	final void testSum() {
		int sum = helloWorld.Sum(2, 5);
		assertEquals(3, sum); //fail("Not yet implemented"); // TODO
	}

}
