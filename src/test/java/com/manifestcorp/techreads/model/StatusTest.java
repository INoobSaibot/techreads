package com.manifestcorp.techreads.model;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StatusTest {

	
	@Test
	public void testCurrentlyReadingStatus() throws Exception {
		assertTrue(Status.CURRENTLY_READING.value == 0);
	}
	
	@Test
	public void testReadStatus() throws Exception {
		assertTrue(Status.Read.value == 0);
	}
	
	@Test
	public void testWantToReadStatus() throws Exception {
		assertTrue(Status.WANT_TO_READ.value == 0);
	}
}
