package com.manifestcorp.techreads.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndexControllerTest {
	
	IndexController controller = new IndexController();
	
	@Test
		public void indexTest() {
		assertEquals(controller.index(), "Here!!!");
	}
	
	@Test
	public void servicesTest() {
		assertEquals(controller.services(), "Services home page!");
	}
}
