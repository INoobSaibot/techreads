package com.manifestcorp.techreads.controller;

import static org.junit.Assert.assertEquals;
import org.springframework.web.servlet.view.RedirectView;

import org.junit.Test;

public class IndexControllerTest {
	
	IndexController controller = new IndexController();
	RedirectView view = new RedirectView("books");
	
	@Test
		public void indexTest() {
		//assertEquals(controller.index(), view);
	}
	
	@Test
	public void servicesTest() {
		assertEquals(controller.services(), "Services home page!");
	}
}
