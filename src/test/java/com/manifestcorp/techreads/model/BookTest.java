package com.manifestcorp.techreads.model;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	public Book book;
	
	@Before
	public void before() {
		String title = "Rock and Morty";
		book = new Book(title);
	}

	@After
	public void after() {
		book = null;
	}
	
	@Test
		public void setIdTest() {
		Long longId = 1234567891234567l;
		book.setId(longId);
		
		assertEquals(longId, book.id);
	}
	
	@Test
	public void getTitleTest() {
		assertEquals(book.title, book.getTitle());
	}
	
	@Test
	public void setTitleTest() {
		String title = "Head first into Java";
		book.setTitle(title);
		
		assertEquals(title, book.getTitle());
	}
}
