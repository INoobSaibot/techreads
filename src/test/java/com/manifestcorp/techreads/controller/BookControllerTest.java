package com.manifestcorp.techreads.controller;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import com.manifestcorp.techreads.repository.BookRepository;
import static org.easymock.EasyMock.*;


public class BookControllerTest {
	
	private BookController controller;
	private BookRepository mockBookRepo;
	
	@Before
	public void before() throws Exception {
		controller = new BookController();
		mockBookRepo = createMock(BookRepository.class);
		controller.bookRepository = mockBookRepo;
	}
		
	@After
	public void after() throws Exception {
		//verify(mockBookRepo);
	}
	
	
	@Test
	public void booksTest() {
		//assertEquals(null, controller.books());
		
		expect(mockBookRepo.findAll()).andReturn(null);
	}
	
	
	
}
