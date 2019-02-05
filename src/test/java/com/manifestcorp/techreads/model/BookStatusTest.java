package com.manifestcorp.techreads.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BookStatusTest {

	
	@Test
	public void testReadStatus() throws Exception {
		assertTrue(BookStatus.Read.value == 0);
	}
	
	@Test
	public void testCurrentlyReadingStatus() throws Exception {
		assertTrue(BookStatus.CURRENTLY_READING.value == 1);
	}
	
	@Test
	public void testWantToReadStatus() throws Exception {
		assertTrue(BookStatus.WANT_TO_READ.value == 2);
	}
	
	@Test
	public void testPrintable() throws Exception {
		String status = BookStatus.Read.toString();
		String zero = Integer.toString(0);
		assertEquals(zero, status);
	}
}
