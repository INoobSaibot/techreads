package com.manifestcorp.techreads.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("/")
	public RedirectView index() {
		return new RedirectView("books");
	}
	
	@RequestMapping("/services")
	public String services() {
		return "Services home page!";
	}
}
