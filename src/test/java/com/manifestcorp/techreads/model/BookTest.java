package com.manifestcorp.techreads.model;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	public Book book;
	
	@Before
	public void before() throws Exception{
		String title = "Rock and Morty";
		book = new Book(title);
	}

	@After
	public void after() throws Exception {
		book = null;
	}
	
	@Test
		public void testSetId() throws Exception {
		Long longId = 1234567891234567l;
		book.setId(longId);
		
		assertEquals(longId, book.id);
	}
	
	@Test
	public void testGetTitle() throws Exception {
		assertEquals(book.title, book.getTitle());
	}
	
	@Test
	public void testSetTitle() throws Exception {
		String title = "Head first into Java";
		book.setTitle(title);
		
		assertEquals(title, book.getTitle());
	}
	
	@Test
	public void testSetAuthor() throws Exception {
		String author = "Bruce Eckle";
		book.setAuthor(author);
		
		assertEquals(author, book.getAuthor());
	}
	
	@Test
	public void testGetAuthor() throws Exception {
		assertEquals(book.author, book.getAuthor());
	}
	
	@Test
	public void testGetRating() throws Exception {
		Rating rating = Rating.GOTTA_HAVE_IT;
		book.setRating(rating);
		
		assertEquals(rating, book.getRating());
	}
}
