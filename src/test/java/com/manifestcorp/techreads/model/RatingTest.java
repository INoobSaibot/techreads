package com.manifestcorp.techreads.model;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RatingTest {

	@Test
	public void testGetRatingValues() throws Exception {
		assertTrue(Rating.LIKE_IT.value == 1);
		assertTrue(Rating.LOVE_IT.value == 2);
		assertTrue(Rating.GOTTA_HAVE_IT.value == 3);
	}
	
}
