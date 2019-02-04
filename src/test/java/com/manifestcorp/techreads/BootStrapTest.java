package com.manifestcorp.techreads;

import org.junit.Before;
import org.junit.Test;

import org.junit.After;
import static org.easymock.EasyMock.*;
import com.manifestcorp.techreads.model.Book;
import com.manifestcorp.techreads.repository.BookRepository;

public class BootStrapTest {

	private static final Long LOW_RECORD_COUNT = 0l;
	private BootStrap bootStrap;
	private BookRepository mockRepo;
	private final static String PARAMS = "mock book";
	private final static Book BOOK = new Book(PARAMS);
	
	@Before
	public void before() {
		bootStrap = new BootStrap();
		mockRepo = createNiceMock(BookRepository.class);
		bootStrap.bookRepository = mockRepo;
	}
	
	@After
	public void after() {
		verify(mockRepo);
	}
	
	@Test
	public void testNoBooks() {
		expect(mockRepo.count()).andReturn(LOW_RECORD_COUNT);
		//fails
			//Unexpected method call BookRepository.save(com.manifestcorp.techreads.model.Book@22635ba0):
	    	//BookRepository.save(com.manifestcorp.techreads.model.Book@6293abcc): expected: 3, actual: 0
		expect(mockRepo.save(BOOK)).andReturn(null).times(3);

		replay(mockRepo);
		bootStrap.onApplicationEvent(null);
	}
}
