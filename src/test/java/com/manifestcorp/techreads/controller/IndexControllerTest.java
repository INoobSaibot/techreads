package com.manifestcorp.techreads.controller;

import static org.junit.Assert.assertEquals;
import org.springframework.web.servlet.view.RedirectView;

import org.junit.Test;

public class IndexControllerTest {
	
	IndexController controller = new IndexController();
	RedirectView view = new RedirectView("books");
	
	@Test
		public void testIndex() throws Exception {
		//assertEquals(controller.index(), view);
	}
	
	@Test
	public void testServices() throws Exception {
		assertEquals(controller.services(), "Services home page!");
	}
}
